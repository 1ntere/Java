package com.kh.op;

import java.util.Scanner;

// class �ٱ����� package�� import �� �ۼ��� �� ����
// �� �� �����ڰ� �����ϰ��� �ϴ� ������ class ���ο� �ۼ��������

public class OperatorEx2 {
	// �޼��� : Ư�� ���³� ����� �����س��� ����
	
	// �޼���1() : Scanner�� ������� �ʴ� �޼���
	public static void �޼���1() {
		int num1 = 20;
		int num2 = 5;
		int ���ϱ� = num1+num2;
		int ���� = num1-num2;
		int ���ϱ� = num1*num2;
		int ������ = num1/num2;
		System.out.println("���ϱ� : "+���ϱ�);
		System.out.println("����  : "+����);
		System.out.println("���ϱ� : "+���ϱ�);
		System.out.println("������ : "+������);
	}
	
	// �޼���2() : double
	public static void �޼���2() {
		double num3 = 1.4;
		double num4 = 2.5;
		
		// double ���ϱ� ���� ���ϱ� ������ ����
		double sum = num3+num4;
		double sub = num3-num4;
		double mul = num3*num4;
		double div = num3/num4;
		
		System.out.println("sum : "+sum);
		System.out.println("sub : "+sub);
		System.out.println("mul : "+mul);
		System.out.println("div : "+div);
	}
	
	// �޼���3() -> Scanner ��� �޼���
	// �޼��� ���� �ִ� ()�� ���߿� � ���� ���� �� ���
	// ���� ���� ���� ������ ()�� �� �������� ����
	public static void �޼���3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("num5 ���ڸ� �Է��ϼ��� : ");
		int num5 = sc.nextInt();
		//Ű����� �ۼ��� ���ڰ� num5�� ���� �� �ְ� ���� ����
		System.out.print("num6 ���ڸ� �Է��ϼ��� : ");
		int num6 = sc.nextInt();
		//Ű����� �ۼ��� ���ڰ� num6�� ���� �� �ְ� ���� ����
		
		//Ű����� ���޹��� ���ڸ� ���ϱ� ���� ���ϱ� ������
		int sum1 = num5+num6;
		int sub1 = num5-num6;
		int mul1 = num5*num6;
		int div1 = num5/num6;
		
		System.out.println("sum1 : "+sum1);
		System.out.println("sub1 : "+sub1);
		System.out.println("mul1 : "+mul1);
		System.out.println("div1 : "+div1);
		
		//sc.close();
	}
	
	// �޼��� 4�� ���� ��ĳ�ʷ� double ���ϱ� ���� ���ϱ� ������ ���
	// double num7 = sc.nextDouble();
	// double num8 = sc.nextDouble();
	// ���ϱ� double sum2
	// ���� double sub2
	// ���ϱ� double mul2
	// ������ double div2	
	public static void �޼���4() {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��غ��� ��");		
		System.out.print("num7 ���ڸ� �Է��ϼ��� : ");
		double num7 = sc1.nextDouble();
		System.out.print("num8 ���ڸ� �Է��ϼ��� : ");
		double num8 = sc1.nextDouble();
		
		double sum2 = num7+num8;
		double sub2 = num7-num8;
		double mul2 = num7*num8;
		double div2 = num7/num8;
		
		System.out.println("���ϱ� : "+sum2);
		System.out.println("����  : "+sub2);
		System.out.println("���ϱ� : "+mul2);
		System.out.println("������ : "+div2);
		
		//sc1.close();
	}
	
	// ���� ���� ���� �޼���
	public static void main(String[] args) {
		// �����δ� ���� �޼��� �߿���
		// ����ϰ� ���� �޼��常 �ۼ��� ��
		
		�޼���1();
		// ���࿡ �޼���1() �ȿ� �ۼ��� ������ ����ϰ� �ʹٸ�
		// ���� ���� ���� �޼��� �ؿ� �޼���1(); �̶�� �ۼ� �� ����ϸ� ����
		
		�޼���2();
		// �޼���2(); �� �ּ�ó���ϰ� �����ϸ� �޼���1()�� ��µ�
		
		�޼���3();
		
		�޼���4();		
		// ������ : �� �޼���3() �������� sc.close();�ϸ� �޼���3()�� �ּ�ó�� ���� �ʾ��� �� �޼���4()���� ������ ������?
		// ���� ã�� �ذ���1 : �޼���3()�� �ּ� ó��
		// ���� ã�� �ذ���2 : �޼���3() �������� sc.close();�� �ּ� ó�� �ϸ� �޼���3()�� �ּ�ó�� ���ص� ������ ���� ����
		// ���� : �޼���4()�� ���۵Ǳ⵵ ���� �޼���1~4()�� ��� �� �ݾƹ����� �޼���4()�� ������ �ȵ�
	}

}