package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//��Ƽ������
public class ClientEx {
	public static void main(String[] args) {
		//������ = c, �޽������ = m
		try {
			//						localhost = 127.0.01�� �� ��ǻ�� �ּҶ�� �ǹ�
			//						�����ϰ��� �ϴ� ��ǻ�� �ּ�, ������ ��Ʈ ��ȣ
			Socket c = new Socket("localhost", 12341);
			
			//�����ڿ� ��ȭ�� �ϱ� ���� ����� ��Ʈ�� ����
			//1. ������(= c).getInputStream() : �����ڰ� �ۼ��� �����͸� �о���� ���� �Է� ��Ʈ���� ������(���ڰ����� ������)
			//2. InputStreamReader() : �ϳ����� �ܾ���� ���ڿ��� ���ڷ� ��ȯ�ϴµ� ���(1���� ���� ���ڰ��� ���ڷ�)
			//3. BufferedReader() : �ϳ����� �����͸� �� ���� �������� ���� �� �ֵ��� ������
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			//�ۼ��� ������ ������ �� �� �ְ� �������� ������ �ϰ�, ������ ���� �� �ְ� ������
			//1. ������.getOutputStream(), true : �����ڰ� �ۼ��� ������ �������� ���� ������
			//							 true�� ��������ν� �������� ���ٴ� �ǹ�
			//								flush() : ������ ����ϴ� ���� <-�� true�� ���ԵǾ� ����
			//2. PrintWriter() : �ؽ�Ʈ�� ����ϴµ� ������ ���� �Ų����� ����� �� �ֵ��� ������
			PrintWriter out = new PrintWriter(c.getOutputStream(), true);
			
			//�����ڷ� �޼��� ����
			out.println(" hi server !");
			
			//�����ڷκ��� ���� �޽��� ���� �� ���
			/* 1. �̰͵� �´� �ڵ����� m�� null�� ������ ������ �ٲ���
			String m = in.readLine();
			System.out.println("send success : " + m);
			*/
			// 2. �̰͵� �´� �ڵ�
			String m;
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
			}
			/* 3. �̰͵� �´� �ڵ�
			//for�� while�� ����ؼ� ����� Ȯ��
			//Ŭ���̾�Ʈ�� ������ ���� �� ���� ������ �޽����� �ٽ� ������ ����� �� �� ����
			for (int i = 0; i < 3; i++) {
				out.print(i);;
				String t = in.readLine();
				System.out.println("send success : " + t);
			}
			*/
			
			//�� �Ҹ��� �ݰ�, �������� �͵� �ݰ�, ������ �ݱ�
			in.close();
			out.close();
			c.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
