package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {
	
	public static void method1() {
		// ��ĳ�ʷ� �Է��� ���� true���� false���� �غ� ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a�� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		System.out.print("b�� ���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		System.out.println("a : "+a+", b : "+b);
		System.out.println("a �� b �� ������ == true�� ���� ��");
		System.out.println(" a == b : "+(a == b));
		System.out.println("a �� b �� ������ != false�� ���� ��");
		System.out.println(" a != b : "+(a != b));
				
	}
	
	//method2 �� ���� ���� �����ڸ� ����� ����
	//�񱳿����ڸ� ����ؼ� ���� ������ Ʋ���� Ȯ���� �� ��	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("c�� ���� �Է��ϼ��� : ");
		int c = sc.nextInt();
		
		System.out.println("c�� �� : "+c);
		//��) ���࿡ c�� 10�� �Է��ߴٸ� c = 10
		
		System.out.print("d�� ���� �Է��ϼ��� : ");
		int d = sc.nextInt();
		
		int e = ++c;
		
		System.out.println("c�� �� : "+c);
		//��) ���࿡ c�� 10�� �Է��ߴٸ� c = c+1 = 11
		
		System.out.println("c : "+c+", d : "+d+", e : "+e);
		System.out.println("c == d : "+(c==d));
		System.out.println("c == e : "+(c==e));
		
		// int f = ++c; �� �Ѵٸ� f�� ���� ��� ��������
		// System.out.println("f : "+f);�� ���� f �� ����غ���
		int f = ++c;
		
		System.out.println("c�� �� : "+c);
		//��) ���࿡ c�� 10�� �Է��ߴٸ� c = c+1+1 = 12
		//��) c�� ���� 11, 1.c=c+1=12, 2.f=c+1=12
		
		System.out.println("f : "+f);
		System.out.println("c == f : "+(c==f));
	}
	
	// methhod3 ���� ����ϱ�
	public static void method3() {
		// ��� ����� ������ ���� ������������ �Ѵ�.
		// �ο����� ���� ������ Ű����� �Է¹ޱ�
		// 1�δ� �����ϰ� �������� ������ ������
		// �����ְ� ���� ������ ������ ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� ���� �Է��ϼ��� : ");
		int people = sc.nextInt();//�ο� �� ���ϱ�
		System.out.println("���� ��Ƽ�� "+people+"���� �����߽��ϴ�.");
		
		System.out.println("���� �����ϰ� �ִ� �� ������ ������ �Է��ϼ��� : ");
		int candies = sc.nextInt();//���� ���� ���ϱ�
		System.out.println("���� ������ �ִ� ������ "+candies+"�� �Դϴ�.");
		
		System.out.println("�׷�����, �׷��ٸ� �����ϰ� �������� ������ ������ �� �� �Դϱ�?");
		int perPerson = candies/people;
		//�� ����� �����ϰ� �������� ������ ���� = �� ������ ���� / �� �ο� ��
		System.out.println("1�δ� �����ϰ� �������� ���� ���� : "+perPerson);
		
		//�����ְ� ���� ������ ���� ����ϱ�
		int remain = candies % people;
		//���� ������ ���� = �� ������ ���� % �� �ο� ��
		System.out.println("�������� ���� ������ ���� : "+remain);
		//��) int remain = candies-(people*perPerson);
		//��) System.out.println("��� �����ϰ� ������ ���� ���� �� ���� ������ "+remain+"�� �Դϴ�.");
		// / : ��, % : ������
	}
	
	
	public static void main(String[] args) {
		// �������� ����� �޼��常 �ۼ�
		//method1();
		//method2();
		method3();
	}

}
