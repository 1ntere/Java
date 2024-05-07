package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
�ܺ� ������ �ּҸ� �˾ƺ���

�� �� �ּ� �˾ƺ��� �޼���
InetAddress.getLocalHost() : ���� �� ��ǻ�Ϳ� ������ IP�ּҸ� �������� �޼���

�� IP �ּ� : 172.27.240.1
�⺻���� ó���� ��ǻ�Ͱ� ������ ���ͳݼ����� 1���� ���� 192.168.0.1�� �ο�������
���� ����� ������ ��ҿ��� ������ ��ǻ�� ������ ������ ��Ʈ��ũ�� ������ �ް� �� ��쿡��
�� ������ ��ȣ�� 1���� ���������� �ο��ް� ��

172.27.240.1	= �� ���� �ִ� ȣ���� �����Ѽ� ���
�� ������ 1ȣ

127.0.0.1		= localhost = 172.27.240.1
�� ���ڷ� �츮�� �ּ�
*/

public class AddressEx2 {
	public static void main(String[] args) {
		try {
			InetAddress ����ȣ��Ʈ = InetAddress.getLocalHost();
			System.out.println("�� IP �ּ� : " + ����ȣ��Ʈ.getHostAddress());//172.27.240.1
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}