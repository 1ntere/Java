package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
	
	/* public static void method1()
	Scanner�� �̿��� num1�� num2�� ���� �Է¹ް�
	<�� > �� ����ؼ� �Է� ���� ���� <�� > �� � ������ true�� �������� Ȯ���ϱ� */
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1�� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2�� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		boolean result1 = num1 > num2;
		boolean result2 = num1 >= num2;
		boolean result3 = num1 < num2;
		boolean result4 = num1 <= num2;
		
		System.out.println("num1 > num2 : "+result1);
		System.out.println("num1 >= num2 : "+result2);
		System.out.println("num1 < num2 : "+result3);
		System.out.println("num1 <= num2 : "+result4);		
	}
	
	/* ������
	public static void method2()
	num1, num2, num3�� �ް�
	&&�� ||�� ����ؼ� ũ�� ���� �� Ȯ���ϱ�
	boolean result = (num1<num2) && (num2==num3)�� ���� �Ǵ°�? */
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù �� ° �� �� : ");
		int num1 = sc.nextInt();
		System.out.print("�� �� ° �� �� : ");
		int num2 = sc.nextInt();
		System.out.print("�� �� ° �� �� : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1<num2) && (num2==num3);
		System.out.println("(num1<num2) && (num2==num3) �����? : "+result);
	}

	public static void main(String[] args) {
		// method1();
		method2();
	}

}
