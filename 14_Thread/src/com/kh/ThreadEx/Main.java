package com.kh.ThreadEx;

public class Main {

	public static void main(String[] args) {
		ThreadEx ������ = new ThreadEx();
		������.start();
		
		System.out.println("1�� ������ ��, Ex ������ ����");
		
		//for �� - �� 3���� �����带 �����ؼ� ����
		for (int i = 0; i < 3; i++) {
			Thread t = new ThreadEx2(i);
				//������ ��� ThreadEx t = new ThreadEx2(i);�� ����ؾ�������
				//Thread�� ThreadEx2�� �θ�Ŭ�����̱� ������ Thread�� ThreadEx2 ��� ��� ����
			t.start();
		}
		System.out.println("���� ��~~~!");
	}
}