package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public static void practice1() {
		int numbers[] = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static void practice2() {
		int numbers[] = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length-i;
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static void practice3() {
		//���� ������ �Է�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		
		//�Է� ���� ���� ũ���� �迭 ����
		int numbers[] = new int[size];
		
		//numbers.length=size
		for (int i = 0; i < size; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static void practice4() {
						//   0     1     2      3      4
		String fruits[] = {"���", "��", "����", "������", "����"};
		System.out.println(fruits[1]);
	}
	
	public static void practice5() {
		
	}
	
	public static void practice6() {
		//���� �����ϱ�
				//length 7
				//index	  0	    1	 2	  3	    4	 5	  6
		String days[] = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		//0���� 6������ ���� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int dayNum = sc.nextInt();
		
		//�Է��� ���ڰ� 0 ~ 6 ���̿� �ִ��� Ȯ�� �� ���̿� �ִٸ� ���� ��� 
		if (dayNum>=0 && dayNum<=6) {
			System.out.println(days[dayNum]+"����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public static void practice7() {
		
	}
	
	public static void practice8() {
		
	}
	
	public static void practice9() {
		//���̰� 7�� �迭�� ����
			// index [0 1 2 3 4 5 6]
			// length = 7
		int num[] = new int[7];
		
		//�������� ���� ����ϱ�
		/*
		1. Random ��ü ���
			���� �� ���� ������ ������ ���
		2. Math��ü���� Random() �޼��� ��� 
			�� Random ��ü���� ���� �������� ���
		*/
				//num�� ���� ���̸� �˱� ���ؼ� num.length ���
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random()*45 + 1);
			//0 ~ 44 ���� �����Ƿ� �ڿ� + 1�� �ٿ���
			//0 ~ 44 => 1 ~ 45
			System.out.println("num["+i+"] = "+num[i]);
		}
	}
	
	public static void practice10() {
		
	}
	
	public static void method1() {
		//���� 0 1 2 10 20 30 ����ϱ�
		int num[] = new int[6];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 10;
		num[4] = 20;
		num[5] = 30;
		System.out.println(num[2]);
		
		//ó������ ���ڿ��� �� �ڸ��� �� ȭ �� �� �� �� ��
		//�� �ڸ��� � ������ �� �ִ��� ����ϱ�
		String str[] = {"��", "ȭ", "��", "��",
				"��", "��", "��"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]+" ");
		}
		//�Ǽ� index 2���� ������ְ� ���, �Ǽ� ����
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for (int i = 0; i <dbl.length; i++) {
			System.out.println(dbl[i]+" ");
		}
		
		//���ڴ� 'A', 'B', 'C' �־��� ���� �� �ڸ� ����غ���
		char chr[] = {'A', 'B', 'C'};
		for (int i = 0; i <chr.length; i++) {
			System.out.println(chr[i]+" ");
		}
	}
	
	public static void practice17() {
		//�Է��� ���� �迭�� �ִ��� �˻�
		//������ ġŲ ��� ����, ������ ���� �޴��Դϴ�. ���
		
		String[] chickenMenu = {"���ġŲ","�Ķ��̵�ġŲ","����ġŲ"};
		
		//����ڷκ��� ġŲ �̸� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String inputChic = sc.next();
		
		//�迭�� ����ڰ� �Է��� ġŲ�� �ִ��� �˻�
		boolean found = false;
		
		//for-each���� ����ؼ� ġŲ�� �ִ��� Ȯ���ϴ� �۾�
		//���࿡ ġŲ�� �����Ѵٸ� found = true; break;
		for (String ġŲ : chickenMenu) {
			if(ġŲ.equals(inputChic)) {
				found = true;
				break;
			}
		}
		
		//���࿡ ġŲ�� �����Ѵٸ� ��� ���� ���
		//�������� �ʴ´ٸ� ���� ġŲ�� ���� �޴��Դϴ�. ���
		if (found) {
			System.out.println(inputChic+" ��(��) ��� ���� �մϴ�.");
		} else {
			System.out.println(inputChic+" ��(��) ���� �޴� �Դϴ�.");
		}
	}
	
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice6();
		//practice9();
		//method1();
		//practice17();
	}
}
