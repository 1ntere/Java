package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {
	
	/*
	public static void method1()
	//if �� Ȱ�� : ���� �� 2���� �޾Ƽ� ���� 2���� ��ġ�ϴ��� Ȯ��
	���ٸ� �����ϴ�. ����ϰ�, ���� �ʴٸ� ���� �ʽ��ϴ�. ����ϱ�	
	
	public static void method2()
	//if �� Ȱ�� : ���� �� 2���� �޾Ƽ� ���� 2���� ��ġ�ϴ��� Ȯ��
	
	public static void method3()
	//if �� Ȱ�� : double�� �Ǽ� �� 2���� �޾Ƽ� �Ǽ� 2���� ��ġ�ϴ��� Ȯ��
	
	*/
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1+" �� "+num2+" �� �����ϴ�.");
		} else {
			System.out.println(num1+" �� "+num2+" �� ���� �ʽ��ϴ�.");
		}
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 : ");
		String str1 = sc.nextLine();
		System.out.print("���� 2 : ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println(str1+" �� "+str2+" �� �����ϴ�.");
		} else {
			System.out.println(str1+" �� "+str2+" �� ���� �ʽ��ϴ�.");
		}
	}

	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ� 1 : ");
		double double1 = sc.nextDouble();
		System.out.print("�Ǽ� 2 : ");
		double double2 = sc.nextDouble();
		
		if (double1 == double2) {
			System.out.println(double1+" �� "+double2+ " �� ��ġ�մϴ�.");
		} else {
			System.out.println(double1+" �� "+double2+ " �� ��ġ���� �ʽ��ϴ�.");
		}
	}
	
	
	//�������� ������ ���� �޼���
	public static void main(String[] args) {
		// method1();
		// method2();
		method3();
		
	}

}

