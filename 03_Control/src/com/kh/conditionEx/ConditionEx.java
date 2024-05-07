package com.kh.conditionEx;
// ��Ű�� : �ۼ��� ������ ���� ��ġ

import java.util.Scanner;

// ���ǹ� ��ɿ� Ŭ����
public class ConditionEx {
	/* 
	if : �־��� ������ ���� �� ����Ǵ� �ڵ� ���
	else : ������ ������ �� ����Ǵ� �ڵ� ���(�ʼ��� �ƴ�)

	�����
	if (���ǹ�) {
	������ ���� ��� ������ �ڵ� �ۼ�
	���࿡ ���ǹ��� ������ ���� �ƴ� ��� �ڵ����� ���� ����
	}
	 */
	
	public static void method1() {//�޼���1 : 19�� �̻��� �����Դϴ�. ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		//���࿡ ���� ���̰� 19�� �̻��̶�� �����Դϴ�. �� ����� ��
		if (age >= 19) {
			System.out.println("�����Դϴ�.");
			// age�� ���� 19 �̻��̸� �����Դϴ�. ��µǰ� �ϱ�
		} else {
			System.out.println("������ �ƴմϴ�.");
			// ���࿡ age ���� ������ �ƴ϶�� ������ �ƴմϴ�. ��µǰ� �ϱ�
		}
	}

	public static void method2() {/*���࿡ num�� ¦���� ��� ¦���Դϴ�. ����ϱ�
		num�� Ȧ���� ��� Ȧ���Դϴ�. ����ϱ�.*/		
		int num = 2;
		
		//(num�� ¦���� ���) = (num % 2 == 0)
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�!!!");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
	
	public static void method3() {
		/* ���࿡ �л��� ���̰� 0���� ũ�� 14���� ���� �� ��̶�� ǥ���ϱ�
			0~13 ���
		1. ���� 
			0���� Ŀ�� ��
			14���� �۾ƾ� ��
		
		14���ʹ� ��̰� �ƴմϴ�.
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if (age > 0 && age < 14) {
			System.out.println("��Դϴ�.");
		} else {
			System.out.println("��̰� �ƴմϴ�.");
		}
		
	}
	
	public static void practice1() {/*���̰� 10�� �̻� 20�� �̸� �� ���� 10��
									�� �ܿ��� 10�밡 �ƴ� ���*/
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� : ");
		int age = sc.nextInt();
	
		if (age >= 10 && age < 20) {
		System.out.println("10�� �Դϴ�.");
		} else {
		System.out.println("10�밡 �ƴմϴ�.");
		}
	}
	
	public static void practice2() {/*���̰� 80�� �̻��̸� 80�� �̻��Դϴ�. ����ϱ�*/	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� : ");
		int age = sc.nextInt();
	
		if (age >= 80) {
		System.out.println("80�� �̻��Դϴ�.");
		} else {
			System.out.println("80�� �̸��Դϴ�.");
		}
	}
	
	// �����޼���
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//practice1();
		practice2();

	}

}
