package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	public static void main(String[] args) {
		//1. www.google.com�� ȣ��Ʈ���� IP�ּ� ��������
		try {
			InetAddress ���� = InetAddress.getByName("www.google.com");
			System.out.println("ȣ��Ʈ�� : " + ����.getHostName());//www.google.com
			System.out.println("IP �ּ� : " + ����.getHostAddress());//172.217.24.228
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. ���� ��ǻ���� �̸��� �ڸ���ȣ Ȯ���ϱ�
		try {
			InetAddress ����ǻ���̸� = InetAddress.getLocalHost();
			System.out.println("�����ּ� : " + ����ǻ���̸�);//DESKTOP-DFKSK64/172.27.240.1
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. www.facebook.com ȣ��Ʈ�̸� ȣ��Ʈ�ּ�
		try {
			InetAddress ����ּ� = InetAddress.getByName("www.facebook.com");
			System.out.println("ȣ��Ʈ�� : " + ����ּ�.getHostName());//www.facebook.com
			System.out.println("IP �ּ� : " + ����ּ�.getHostAddress());//157.240.215.35
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4. www.instagram.com ȣ��Ʈ�̸� ȣ��Ʈ�ּ�
		try {
			InetAddress �ν�Ÿ�ּ� = InetAddress.getByName("www.instagram.com");
			System.out.println("ȣ��Ʈ�� : " + �ν�Ÿ�ּ�.getHostName());//www.instagram.com
			System.out.println("IP �ּ� : " + �ν�Ÿ�ּ�.getHostAddress());//157.240.215.174
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}