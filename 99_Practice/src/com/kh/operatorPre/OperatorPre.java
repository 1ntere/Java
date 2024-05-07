package com.kh.operatorPre;

import java.util.Scanner;

// ��Ű�� : ���� ���� Ŭ������ ����ִ� ���� ��ġ

// Ŭ���� : �����ϰ��� �ϴ� �ڵ带 �ۼ��ϴ� ����
public class OperatorPre {
	
	// �⺻ ��� �޼���
	// �������� ����ϴ� �޼��尡 �ƴ�����
	// ��Ȳ�� ���� ���� �޼��忡�� ȣ���� ����� �� �ִ� �޼��� �� �ϳ�
	// static : �޸𸮿��� ����
	public static void practice1() {//��� ����� ������ ���� ��������
		// ��ĳ�ʸ� �̿��ؼ� Ű����� �Է¹��� ������ ��ǻ�Ϳ� ���
		// System.in Ű����� �Է� ���� �� �ְ� ���ִ� ��� �ý���
		// Scanner : Ű����� �Է¹��� ������ ��ǻ�ͷ� ���
		// �⺻���� ������ �ֱ�� ������ ���̺귯������ �����;� �ϱ� ������
		// import�� �̿��ؼ� ������ ��
		// JRE System Library>java.base>java.util>Scanner.class�� ��ġ
		
		Scanner sc = new Scanner(System.in);
		// ��ĳ�ʸ� �ҷ��� ���� �ٷ� sc �� ��ĳ�� ����� �ҷ��͵� �Ǳ� ������
		// System.out.print �� �̿��ؼ� � �ൿ�� �����ϰ� �ִ���
		// Ȯ���ϴ� �۾��� ������ ��
		
		//�ο� �� �Է¹ޱ�
		System.out.print("�ο� ���� �Է��ϼ��� : ");
		int people = sc.nextInt();
		
		//���� ���� �Է¹ޱ�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int candies = sc.nextInt();
		
		//1�δ� �����ϰ� �������� ���� ���� ���ϱ�
		int getCandies = candies/people;
		
		//�����ְ� ���� ���� ���� ���
		int remain = candies % people;
		
		//��� ���
		System.out.println("���� �ο� : "+people);
		System.out.println("���� �� ���� : "+candies);
		System.out.println("�����ϰ� �������� ���� ���� : "+getCandies);
		System.out.println("���� ���� ���� : "+remain);
	}
	
	public static void practice2() {//Ű����� ���� �Է� �ޱ� + ��,�� Ȯ��
		//Scanner Ȱ���ؼ� Ű���� �Է¹޴� â ������ֱ�
		Scanner sc = new Scanner(System.in);
		
		//�̸� �Է¹ޱ�
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		//�г� �Է¹ޱ�
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		//�� �Է¹ޱ�
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		
		//��ȣ �Է¹ޱ�
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		//���� �Է¹ޱ�
		System.out.print("����(M/F) : ");
		//String gender = sc.next();
		//String -> char
		
		char gender = sc.next().charAt(0);
		// Scanner�� char ���� �Է¹ް��� �� ��쿡��
		// charAt�� ����ؼ� ���ڿ� ��ġ�� �о���� �۾��� �����ؾ� ��
		// System���� ���� ���
		// System - out - print()
		// Scanner - next - charAt(���ڸ� ����)
		// 					���� ������ �ϴ� ������ ��ġ
		// ����) T A B L E = 5����
		// ���࿡ �� �� ���� T�� ���� �ʹٸ�
		// charAt(0) : T //�� �ձ���
		// charAt(1) : A //�ι�° ����
		// charAt(2) : B //����° ����
		// charAt(3) : L //�׹�° ����
		// charAt(4) : E //�ټ���° ����
		// TABLE�� �� 5 �����̱� ������
		// charAt������ 0 ~ 4������ �ۼ��� �� ����
		
		
		//���� �Է¹ޱ�
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		double score = sc.nextDouble(); // ��ü �ڸ� �Է� ����
		
		//����ϱ�
		System.out.println("�̸� : "+name);
		System.out.println("�г� : "+grade);
		System.out.println(" �� : "+classNum);
		System.out.println("��ȣ : "+num);
		System.out.println("���� : "+gender);
		
		//System.out.println("���� : "+score);
		System.out.printf("���� : %.2f", score);
		/*
		 * printf()
		1. System.out.print()
			=> �� �ٲ� ���� ���η� ���
		2. System.out.println()
			=> �� ����� ������ ���� �ٿ��� �ۼ��ϱ�(Enter)
		3. System.out.printf()
			=> ������ ������ ���ڿ��� ����� �� ���
		%d : ����
		%f : �Ҽ��� ��
		%s : ���ڿ� ���
		%c : ���� �ϳ� ���
		%b : true���� false���� ���
		%x : 16���� ����
		%o : 8���� ����
		* */
		
		//�Ҽ��� 2��° �ڸ����� ����ϱ� ���� : %.2f
		//printf + ,
		//printf�� %f �� ����� ���� �Ҽ��� �ڸ��� �������൵ �ǰ�
		// ���������� �ʾƵ� �ȴ�.
		// �ٸ� ���࿡ �Ҽ��� �ڸ� ��ġ�� �����ؼ� ����ϱ� ���Ѵٸ�
		// %.����� ���ϴ� �Ҽ�����ġ �ڸ� ��f
		// ���� ��� �Ҽ��� 4��° �ڸ����� ����ϱ� ���� : %.4f
		// ���� ��� �Ҽ��� 5��° �ڸ����� ����ϱ� ���� : %.5f
		
		//������ ���� ��� ���ڿ� ����
		//���� ������ ��� ���ڿ� ����
		
	}
	
	public static void practice3() {/* ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է¹ް�,
									�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3)�� ���ϼ���.
									*/
		Scanner sc = new Scanner(System.in);
		
		//���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int korean = sc.nextInt();
		
		//���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int english = sc.nextInt();
		
		//���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = sc.nextInt();
		
		//�Է¹��� ������ �հ� ���
		// ���� �� �� = ���� ���� + ���� ���� + ���� ����
		int total = korean+english+math;
		
		//��� ���� ���
		// ��� = ���� �� �� / ���� ��(3)
		// ������ ������ �Ҽ��� �̿� ������ ���´ٴ� ������ ���� ������
		// total�� �ڷ����� int��(����)���� double��(�Ǽ�)���� ��ȯ�����ֱ�
		double average = (double) total/3.0;
		
		//����ϱ�
		System.out.println("�������� : "+korean);
		System.out.println("�������� : "+english);
		System.out.println("�������� : "+math);
		System.out.println("����+����+���� : "+total);
		System.out.println("���� ���� ���� ������� : "+average);
		
	}
	
	public static void method4() {/* 2���� ���� Ű����� �Է� �޾�
									�Է� ���� ���� ��� ������ true �ƴϸ� false ��� */
		Scanner sc = new Scanner(System.in);
		
		//ù ��° �� �Է¹ޱ�
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		//�� ��° �� �Է¹ޱ�
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		// == : ���ʿ� �ִ� ���� ������ true
		// ex) 5 == 5 : 
		// ex) 3 == 5 : false
		// != : ���ʿ� �ִ� ���� �ٸ��� true
		// ex) 5 != 5 : false
		// ex) 3 != 5 : true
		// true�� false�� ǥ���� �� �� ���� true false�� ǥ���ޱ� ���ؼ���
		// boolean�� ����ؼ� ǥ����
		//��, ������ ��� ���� result ���� (�ڷ��� : boolean)
		
		//����� ��� ���� �����ϱ�
		boolean result = num1 == num2;
		
		//����ϱ�
		System.out.println("num1 �� num2�� ��� : "+result);
	}
		
	public static void practice4() {/* �ǽ����� 4�� ���� : 2���� ���� Ű����� �Է¹޾� �Է� ���� ���� ��� �ٸ��� true, ��� ������ false ��� */
		Scanner sc = new Scanner(System.in);
		
		//ù ��° ���� �Է¹ޱ�
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		//�� ��° ���� �Է¹ޱ�
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
		int num4 = sc.nextInt();
		
		//����� ��� ���� �����ϱ�
		boolean result1 = num3 != num4;
		
		//��� ����ϱ�
		System.out.println("ù ��° ���� �� ��° ���� ��� : "+result1);
	}
 
	public static void practice5() {/* 3���� ���� Ű����� �Է¹޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false ����ϱ� */
		Scanner sc = new Scanner(System.in);
		
		//�Է�1 �Է¹ޱ�
		System.out.print("�Է�1 : ");
		int inPut1 = sc.nextInt();
		
		//�Է�2 �Է¹ޱ�
		System.out.print("�Է�2 : ");
		int inPut2 = sc.nextInt();
		
		//�Է�3 �Է¹ޱ�
		System.out.print("�Է�3 : ");
		int inPut3 = sc.nextInt();
		
		//����� ������ ���������ϱ�
		//                   inPut1�� inPut2�� ���� �� && inPut2�� inPut3�� ���� ��
		//                               ��        true        ��
		boolean compareResult = (inPut1 == inPut2) && (inPut2 == inPut3);
		
		// && : ampersand, and
		//  ����1   &&  ����2
		// (true)  && (true) = true
		// (true)  && (false) = false
		// (false) && (true) = false
		// (false) && (false) = false
		
		// || : vertical bar, or
		//  ����1   or  ����2
		// (true)  or (true) = true
		// (true)  or (false) = true
		// (false) or (true) = true
		// (false) or (false) = false
		// | : Backspace�� Enter ���̿� �ִ� ��ȭ ǥ�ø� shift�� ���� ����
		boolean isOR = (inPut1 == inPut2) || (inPut2 == inPut3);
		
		//����ϱ�
		System.out.println("�Է�1 : "+inPut1+", �Է�2 : "+inPut2+", �Է�3 : "+inPut3);
		System.out.println("result : "+compareResult);
		System.out.println("isOR : "+isOR);
		
		//�Է�1 : 5, �Է�2 :  -8, �Է�3 :  5 �϶�
		//result : false && false�̹Ƿ� false
		//isOR : false || false �̹Ƿ� false
		
		/* ���� �߻�
		boolean compareResult = inPut1 == inPut2 == inPut3;
		   ==�� 1���� �� �� ����*/
		
		/* ���� �߻�
		boolean compareResult = (inPut1 == inPut2) == (inPut2 == inPut3);
		   => && ��� == �� ����ϸ�, �Է�1 : 5, �Է�2 :  -8, �Է�3 :  5 �϶�
		      false == false�̹Ƿ� ��������� true�� ���´�.*/
		
		/* ���� �߻�
		compareResult1 �� false, compareResult2 �� false �̸�
		compareResultTotal�� true�� ���� */
	}
	
	// ���� �޼��� : ���������� �����ϴ� �޼���
	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// method4();
		// practice4();
		practice5();
		
	}

}
