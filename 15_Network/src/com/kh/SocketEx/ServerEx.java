package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//��ȭ �����ϴ� ��ȭ ��ü��
public class ServerEx {
	public static void main(String[] args) {
		//��ȭ ��ü�ڴ� ���� �� �ּҿ� �츮 ���� ��� ���� �� �ִ��� ���(��Ʈ��ȣ) ����
		
		//���� ���� ��Ʈ ��ȣ�� �����ؼ� ServerSocket ����
		//������ = s, �湮�� = b
		try {
			ServerSocket s = new ServerSocket(12341);
			//System.out.println("(������ = s) �� ��ȣ�� ���Ƚ��ϴ�.");
			System.out.println("party chat open");
			
			//�츮 ���� �湮�ϴ� �մ�(�湮�� = b)�� ������ ����
			Socket b = s.accept();
			System.out.println("client success");
				//�� �� �������� Ȯ��
			
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			//�����ڿ��� ���� �޽��� ���� �� ���
			String m;
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				out.println("ccccc hhhhh eeeee ccccc kkkkk");
			}
			
			b.close();
			s.close();
				//�湮��(= b)�� ���� �������� ������(= s)�� ����
			
			/*
			�� ���� �߻�
			java.net.BindException: Address already in use: bind
				at java.base/sun.nio.ch.Net.bind0(Native Method)
				at java.base/sun.nio.ch.Net.bind(Net.java:555)
				at java.base/sun.nio.ch.Net.bind(Net.java:544)
				at java.base/sun.nio.ch.NioSocketImpl.bind(NioSocketImpl.java:643)
				at java.base/java.net.ServerSocket.bind(ServerSocket.java:388)
				at java.base/java.net.ServerSocket.<init>(ServerSocket.java:274)
				at java.base/java.net.ServerSocket.<init>(ServerSocket.java:167)
				at com.kh.SocketEx.ServerEx.main(ServerEx.java:14)
			-----
			�� ����
			�ش� ��Ʈ��ȣ�� ������ ������̹Ƿ� �ٽ� ����(ctrl + f11)�ص� �ش� ������ �������� ����
			=====
			�� ���� �ذ� ���
			������ ���ο� ��Ʈ��ȣ�� �����ؼ� �ٽ� �������ָ� �ȴ�.
			ServerSocket s = new ServerSocket(12341);
			ServerSocket s = new ServerSocket(12340);
			ServerSocket s = new ServerSocket(12348); ���
			*/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}