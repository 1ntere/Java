package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	public static void main(String[] args) {
	//���� ������ִ� ���� �޼���
	// �޼��� : Ư�� ���³� ����� �����س��� ����
		method1();
	}
	public static void method1() {
	// �������� ����ϴ� �޼���� �ƴ�
	// ���� �ʿ��� �� ������ ����ϴ� �޼���
		
	// public void method1() {
	// ����1) ���� �޼��带 �ּ�ó���ϰ�, ���� �ڵ�"public void method1() {"�� ���� ������ ��
		// �ذ���1) ���� �ڵ带 �ּ�ó���ϰ�, ���� �޼���
		// �ذ���2) ���� �޼��� �Ʒ��� method1(); �ۼ�
	// ����2) static�� ������ �� ������
		// static : ������ �̶�� ���� ������ ����
		// static �� �ٴ� ���� �ڷ����̳� ������ ��Ƽ� ���°��� �ƴ϶�
		// �ܵ����� ���������� �޸𸮿��� ����� �� ������ ��Ÿ���� ǥ��
		// �ذ���) public static void method1() {�� ����
		
		// 1. int num1 = 10, int num2 = 3
		// ���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		int ���ϱ� = num1+num2;
		System.out.println("���ϱ� : "+���ϱ�);
		int ���� = num1-num2;
		System.out.println("���� : "+����);
		int ���ϱ� = num1*num2;
		System.out.println("���ϱ� : "+���ϱ�);
		int ������ = num1/num2;
		System.out.println("������ : "+������);
		//3; �� 3.33333�� �Ǽ��κ� 3
		// ���࿡ num2 = 4�̸�; 2
		// ;10/4�� ���� 2.5�̹Ƿ� �Ǽ��κ� 2
				
		// 2. double num3 = 2.5, double num4 = 3.5
		// ���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		double num3 = 2.5;
		double num4 = 3.5;
		System.out.println("num3 = "+num3);
		System.out.println("num4 = "+num4);
		
		double sum2 = num3+num4;
		System.out.println("���� ��� : "+sum2);
		double sub2 = num3-num4;
		System.out.println("���� ��� : "+sub2);
		double mul2 = num3*num4;
		System.out.println("���� ��� : "+mul2);
		double div2 = num3/num4;
		System.out.println("������ ��� : "+div2);
		// double�� ����ϴϱ� �Ҽ��� �ڸ��� ����� ��
		
		// 3. Scanner�� �̿��ؼ� �Է� ���� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a�� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("b�� ���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		int sum3 = a+b;
		System.out.println("���� ��� sum : "+sum3);
		int sub3 = a-b;
		System.out.println("���� ��� sub : "+sub3);
		int mul3 = a*b;
		System.out.println("���� ��� mul : "+mul3);
		int div3 = a/b;
		System.out.println("������ ��� div : "+div3);		
	}

}
