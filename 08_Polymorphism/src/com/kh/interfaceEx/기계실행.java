package com.kh.interfaceEx;

public class ������ {
	public static void main(String[] args) {
		��ǻ�� ������ = new ��ǻ��();
		������.�����ѱ�();
		������.��������();
		
		��Ź�� ��Ź�� = new ��Ź��();
		��Ź��.�����ѱ�();
		��Ź��.��������();
		
		//��̿� ��� ����
		��̿���� c1 = new ��̿����();
		c1.�����ѱ�();
		
		//��̿� ���� ��� �׽�Ʈ
		int a = 10;
		int b = 5;
		
		System.out.println(a + " + " + b + " = " + c1.��(a, b));
		System.out.println(a + " - " + b + " = " + c1.��(a, b));
		System.out.println(a + " * " + b + " = " + c1.��(a, b));
		System.out.println(a + " / " + b + " = " + c1.��(a, b));
		System.out.println(a + " % " + b + " = " + c1.������(a, b));
		c1.��������();
		
		//���л����� ����
		���л����� m1 = new ���л�����();
		m1.�����ѱ�();
		
		a = 5;
		b = 3;
		/*
		�� ���� �߻�
		int a = 5;
		-----
		������ �̹� a �� b �� �ڷ����� int�� �������־��� ������
		�ٽ� �ڷ����� �� �ʿ䰡 ����.
		=====
		�� ���� �ذ� ���
		a = 5;
		*/
		
		System.out.println(a + " + " + b + " = " + m1.��(a, b));
		System.out.println(a + " - " + b + " = " + m1.��(a, b));
		System.out.println(a + " * " + b + " = " + m1.��(a, b));
		System.out.println(a + " / " + b + " = " + m1.��(a, b));
		System.out.println(a + " % " + b + " = " + m1.������(a, b));
		m1.��������();
	}
}
