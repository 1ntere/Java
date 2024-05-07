package com.kh.SocketUpgrade;

import java.nio.charset.StandardCharsets;
import java.net.*;
import java.io.*;

public class ClientEx {
	private static boolean isRunning;
	private static Socket clientSocket = null;
	private static final int SERVER_PORT = 12145;
		//������ ������� ��Ʈ ��ȣ
		//���� ��Ʈ ��ȣ�� Ŭ���̾�Ʈ ��Ʈ ��ȣ�� �׻� ���ƾ� ��

	public static void main(String[] args) {
		/*
		String serverHostname = "127.0.0.1";
			//�츮���ּ� = localhost = 127.0.0.1
		*/
		
		InetAddress serverHostname;
		try {
			serverHostname = InetAddress.getLocalHost();
			
			isRunning = true;
			//������ ������ �ȴٸ� �����ϰ�, ������ ����Ǿ� �ִ� �湮�ڴ� �� �� �����ϸ� ���̱� ������ 
			//�������� ������ �����ϰ� �ٽ� �����Ϸ��� �ٽ� ���⸦ Ÿ�� null���� ������
		Thread serverThread = new Thread(() -> {
			
			ServerToClientThread serverToClientThread = null;
				//�������� �湮������ �޽����� ������ ������, ó������ �ƹ� ��ȭ�� ���� ������ null�� ��ȯ
			ClientToServerThread clientToServerThread = null;
				//�湮�ڰ� �������� �޼����� ������ ������ ó������ �ƹ� ��ȭ�� ���� ������ null�� ��ȯ
				//���� �ٸ� �����忡�� �����Ѵ�

			while (isRunning) {
				if (clientSocket == null) {
					try {
						System.out.println("Server finding...");
						clientSocket = new Socket(serverHostname, SERVER_PORT);
						if (clientSocket.isConnected()) {
							System.out.println("Connected to server.");
							serverToClientThread = new ServerToClientThread();
								//������ �����ϸ� ��ȭ�� �����ϱ� ���� �׸��� ����
							serverToClientThread.start();
							clientToServerThread = new ClientToServerThread();
							clientToServerThread.start();
						}
					} catch (IOException e) {
						System.out.println("Failed to connect to server. Retrying...");
						if (serverToClientThread != null) {
							serverToClientThread.setFlag(false);
						}
						if (clientToServerThread != null) {
							clientToServerThread.setFlag(false);
						}
					}
				}
				try {
					Thread.sleep(1000);
						//���࿡ ������ Ŭ���̾�Ʈ ������ �������ٸ� 1�ʸ��� �ٽ� ������ �õ�
				} catch (InterruptedException ignored) {
				}
			}
		});
		serverThread.start();
			
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		

	}

	static class ClientToServerThread extends Thread {
		private boolean flag = true;
		private final OutputStream out;
		private final BufferedReader br;

		ClientToServerThread() throws IOException {
			out = clientSocket.getOutputStream();
			br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
		}

		@Override
		public void run() {
			super.run();
			while (flag) {
				try {
					String input = br.readLine();
					//if (input.equals("exit")) {
						//�������� �����ϰ� �ʹٸ� exit�� �Է� �� ����
					if (input.equals("finish")) {
						System.out.println("Client Off... Goodbye!");
						clientSocket = null;
						isRunning = false;
						break;
					}
					PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8), true);
					writer.println(input);
				} catch (IOException e) {
					System.out.println("Failed to send message.");
				}
			}
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}
	}

	static class ServerToClientThread extends Thread {
		private boolean flag = true;
		private final BufferedReader reader;

		public ServerToClientThread() throws IOException {
			InputStream in = clientSocket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		}

		@Override
		public void run() {
			super.run();
			while (flag) {
				try {
					String response = reader.readLine();
					System.out.println("Response from server: " + response);
				} catch (IOException e) {
					System.out.println("Disconnected from server.");
					clientSocket = null;
					break;
				}
			}
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}
	}

}