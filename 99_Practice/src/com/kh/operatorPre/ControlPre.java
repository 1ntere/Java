package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {

	
	
	//�ǽ����� 1�� Ȧ��, ¦�� ��Ÿ����
	public static void practice1() {//Ű����� �Է¹��� ������ ����̸鼭 ¦���� ���� ¦���Դϴ� ���
	Scanner sc = new Scanner(System.in);
	
	System.out.print("������ �Է��ϼ��� : ");
	int number = sc.nextInt();
	
	//����̸鼭 ¦�� �϶��� ¦���Դϴ�.
	//���࿡ ���ڰ� 2�� �������� �� �������� 0�̶�� ¦���̴�.
	if (number > 0) {
		if (number % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	} else {
		System.out.println("����� �Է����ּ���.");
	}
	}
	
	public static void practice2() {//�� ������ ������ �Է� �޾� �հ� ���� �Ǻ��ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int korean = sc.nextInt();
		
		System.out.print("�������� : ");
		int english = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		//�հ�� ��� ���
		int totalScore = korean + english + math;
		double averageScore = (double) totalScore / 3.0;
		
		//�հ� ���� �Ǻ�
		if (korean >= 40 && english >= 40 && math >= 40 && averageScore >= 60) {
				System.out.println("���� ���� : "+korean);
				System.out.println("���� ���� : "+english);
				System.out.println("���� ���� : "+math);
				System.out.println("��    �� : "+totalScore);
				System.out.println("��    �� : "+averageScore);
				
				System.out.println("�����մϴ�, �հ��Դϴ�!");
			} else {
			System.out.println("���հ��Դϴ�.");
		}		
}
	
	public static void practice3() {// 1 ~ 12 ������ ���� �Է� �޾� �ش� ���� �ϼ��� ����ϱ�
		/*
		2�� ������ �������� �ʽ��ϴ�
		OO���� �߸� �Է��� ���Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ���� ���� �Է� : ");
		int month = sc.nextInt();
		
		/* switch (month) {
		case 2:
			System.out.println(month+"���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		default :
			System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
		}
		*/
		int daysMonth = 0;
		
		switch (month) {
		case 2:
			daysMonth = 28;
			break;
		case 4: case 6: case 9: case 11: 
			daysMonth = 30;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			daysMonth = 31;
			break;
		default :
			System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
			daysMonth = 0;
			//return;			
		}
		System.out.println(month+"���� "+daysMonth+"�ϱ��� �ֽ��ϴ�.");
		
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi < 23) {
			System.out.println("����ü��");
		} else if (bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi < 30) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ���� : ");
		double mid = sc.nextDouble();
		System.out.print("�⸻ ���� : ");
		double fin = sc.nextDouble();
		System.out.print("���� ���� : ");
		double assig = sc.nextDouble();
		System.out.print("�⼮ Ƚ�� : ");
		int attend = sc.nextInt();
		
		//�⼮���� ���
		double attendPer = (double) attend / 20 * 100;
		
		//�� ������ ���� ���� ���
		// �߰� 20 �⸻ 30 ���� 30 �⼮ 20 = 100�� ����
		double midScore = mid * 0.2;
		double finScore = fin * 0.3;
		double assigScore = assig * 0.3;
		double attendScore = attendPer * 0.2;
				
		double totalScore = midScore + finScore + assigScore + attendScore;

		//
		if (attendPer > 70) {
			System.out.println("==========���==========");
			System.out.println("�߰� ��� ����(20) : "+midScore);
			System.out.println("�⸻ ��� ����(30) : "+finScore);
			System.out.println("���� ����       (30): "+assigScore);
			System.out.println("�⼮ ����       (20): "+attendScore);
			System.out.println("���� : "+totalScore);
			
			if (totalScore >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [���� �̴�]");
			}
			
		} else {
			System.out.println("==========���==========");
			System.out.println("Fail [�⼮ Ƚ�� ���� ("+attend+"/20)]");
		}
	}
	
	public static void main(String[] args) {
		// practice1();
		// practice2();
		practice3();
		// practice4();
		// practice5();

	}

}
