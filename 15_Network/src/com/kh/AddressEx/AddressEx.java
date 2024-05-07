package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
IP �ּ� : ��ǻ�Ϳ��� ��Ʈ��ũ�� Ư�� ��ġ�� Ȯ���ϴµ� ����ϴ� ����

���� �⺻ �ּ�
�츮�� �ּ�	 = 192.168.0.1	= localhost	= 127.0.0.1

���߿� �� ��ǻ���� ���� �ּҸ� �˰� �ʹٸ� ���̹� �˻�â�� "IP�ּ� Ȯ��"�� �˻�����
	//1.221.88.20

port = ��Ʈ��ũ���� �����͸� �ְ� ���� �� �ִ� ���
Ÿ���� ��ǻ�ͳ� ������, �Ǵ� Ư����ġ�� �� �� �ִ� ��ȣ (2�ڸ� or 4�ڸ�)

InetAddress : Java���� IP �ּҸ� ��Ÿ���µ� ���
	ȣ��Ʈ���� IP�ּҰ��� ��ȯ, �����ο� ���� ���� �˻� ���� �����ϰ� ����

�޼���
	getByName(String host)	: host���� ���� ������ ��ȯ
	getHostName()			: host���� ������
	getHostAddress()		: IP�ּҸ� ������
*/

/*
ȣ��Ʈ�� : www.google.com
���� �ּ� : 172.217.24.228

����� �� �̸� �ּ�(ȣ��Ʈ��)�� �˻��� ������ ���ڷ� �� IP �ּҰ�
�ٸ� ����� �˻����� ���� ���� �˻����� �� ���� �ּ�(IP �ּ�)�� �ٸ��� ������ ���� : 
����� �� �̸� �ּ�(ȣ��Ʈ��) ������ ������ ���� ���� �ּ�(���� IP �ּ�)�� ��ȣ�ϱ� ����
���θ��� �ٸ��� �ӽ÷� ���� �ּҸ� �����ֱ� ����.
*/

public class AddressEx {
	//���� ���� main �޼���
	public static void main(String[] args) {
		//1. naver�� ���� �˾ƺ���
		try {//������ �������� �𸣳� �ϴ� �õ��غ��� ���� try
			InetAddress �ּ� = InetAddress.getByName("www.naver.com");
			System.out.println("ȣ��Ʈ�� : " + �ּ�.getHostName());//www.naver.com
				//ȣ��Ʈ�� : www.naver.com
			System.out.println("IP �ּ� : " + �ּ�.getHostAddress());//223.130.200.236
				//www.naver.com�� IP �ּ�
				//��ǻ�͸��� �޶���
	
		} catch (UnknownHostException e) {//�õ����� �� ���ܰ� �߻��ϸ� ���� ����
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. daum �� ���� �˾ƺ���
		try {
			InetAddress �����ּ� = InetAddress.getByName("www.daum.net");
			System.out.println("ȣ��Ʈ�� : " + �����ּ�.getHostName());//www.daum.net
				//ȣ��Ʈ�� : www.daum.net
			System.out.println("IP �ּ� : " + �����ּ�.getHostAddress());//211.249.220.24
				//www.daum.net�� IP �ּ�
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. IP�ּҷ� daum.net �˻��ϱ�
		try {
			InetAddress ����IP = InetAddress.getByName("211.249.220.24");
			System.out.println("ȣ��Ʈ�� : " + ����IP.getHostName());//211.249.220.24
				//ȣ��Ʈ���� www.daum.net�� �ƴ϶� 211.249.220.24�� ��� ������
				//211.249.220.24�� ����
			System.out.println("IP �ּ� : " + ����IP.getHostAddress());//211.249.220.24
				//211.249.220.24�� IP�ּҴ� �Ȱ��� 211.249.220.24��
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}