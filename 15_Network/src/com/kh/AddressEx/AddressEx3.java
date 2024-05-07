package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx3 {
	public static void main(String[] args) {
		try {
			InetAddress �ּ��̸� = InetAddress.getByName("www.google.com");
			
			//getByName() - �����ּҿ� �����ּҸ� �� ���� ������
			System.out.println("getByName���� ������ ������ �̸� : " + �ּ��̸�);//www.google.com/216.58.203.68
			
			//getLocalHost() - �� �� �ּҸ� �������� �� �ּҿ� ���� ������ Ȯ��
			//�� �� �ּҿ� ���� ���� �ּ� �̸�, �� ��ǻ�� ���� �ּ�
			InetAddress �����ּ� = InetAddress.getLocalHost();
			System.out.println("���� �� �ּ� : " + �����ּ�);//DESKTOP-DFKSK64/172.27.240.1
			
			//��Ƽĳ��Ʈ �ּ� ���� Ȯ��
			//�� ��ǻ�Ϳ��� 2�� �̻��� ��ǻ�ͷ� ���ÿ� ������ �����ϴ� ���
			//byte[] �ּҸ� Ȱ���� ��ü ��������
			//������ �ּ� : ���� ��ǻ�� ��ü�� ����Ű�� �ܺ� ������ ���� �ʰ� �� ��ǻ�͸� ���
			byte[] ipAddress = {127, 0, 0, 1};
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);///127.0.0.1
				// /�� 3���ΰ� ��Ÿ�� �ƴ϶� ����� /127.0.0.1�� ����
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}