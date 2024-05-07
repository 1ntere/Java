package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
//�޼���
	//������ (�⺻)
	public ArrayPre() {
		
	}
	
	//�޼��� (void)
	public void practice1() {
		//�迭�� ����ؼ� ��ü �� ���ϱ�
		//�迭�� ����� �� ���� ����
		//�������� ���ڿ����� �������� �Ǽ����� ������ ���� �� [] ǥ�� �ۼ�
		
		// length = 5
		// index     0  1  2  3  4
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;//ó�� ����� 0
		
		// for-each �� : ó������ ������ �ݺ��ؼ� ���𰡸� ������ �� ���
		// ========  ��  ��  ��  Ȳ  ========
		//        1   {1, 2, 3, 4, 5}
		//        2   {1, 2, 3, 4, 5}
		//        3   {1, 2, 3, 4, 5}
		//        4   {1, 2, 3, 4, 5}
		//        5   {1, 2, 3, 4, 5}
		for (int ���� : num) {
			// num �ȿ� �ִ� ��� ���ڰ� �ϳ��� ���� �ȿ� ����
			// ���ڵ��� ��
			result += ����; //result = 1 + 2 + 3 + 4 + 5
		}
		System.out.println("���ڵ��� �� : "+result);
	}
	
	public void practice2() {
		//ArrayList ����ؼ� ���� �߰��ϱ�
		
		//new ArrayList<>() : <>�ȿ� String�� �־ �ǰ� �� �־ ��
		ArrayList<String> goods = new ArrayList<>();
		
		//add - ��ǰ �߰�
		goods.add("��ǻ��");
		goods.add("�����");
		goods.add("T  V");
		goods.add("������");
		
		//println(goods) - ��� ���� 1
		System.out.println(goods);//[��ǻ��, �����, T  V, ������]
		
		//
		//for-each �� - ��� ���� 2
		for (String a : goods) {
			System.out.print(a+" ");
		}//��ǻ�� ����� T  V ������
	}
	
	public void practice3() {
		//�迭�� ����ؼ� �ִ� �� ã��
		int[] numbers = {3, 7, 2, 9, 1};
		int max = numbers[0];
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("�ִ밪 : "+max);
	}
	
	public void practice3_1() {
		//ArrayList�� ����ؼ� �ִ� �� ã��
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(1);
		
		
		
		//int max = numbers[numbers.length-1];
		//System.out.println("�ִ밪 : "+max);
	}
	
	public void practice4() {
		//ã�� , �� ã��
		// ���ϰ��� ��� �ٳ��� ���� ������
		String[] fruits = {"���", "�ٳ���", "����", "������"};
		
		String search = "�ٳ���";
		boolean found = false;//������ ã�Ҵ��� �� ã�Ҵ��� �𸣱� ����
		
		//for-each �� Ȱ���ؼ� �ٳ��� ã��
		// 				{"���", "�ٳ���", "����", "������"}
		for (String f : fruits) {
			//���࿡ ���� ã�� ���ϰ� �̸��� �Ȱ��ٸ� ã�Ҵ�~! ���ֱ�
			if (f.equals(search)) {
				found = true;
				break;//ã�ұ� ������ if �� Ż��
			}
		}
		System.out.println(search+ " ã��? : "+
				(found ? "ã��" : "�� ã��"));
				//(found ? "A" : "B")
				//true �� A, false �� B
	}
	
	public void practice5() {
		//��ĳ�� Ȱ�� ���� �Է��ϰ� �迭�� ������ �ִ��� Ȯ���� ��
		//practice4�� search�� ��ĳ�ʷ� ����
		String[] zoo = {"�ڳ���", "������",
				"Ǫ�ٿ�", "�䳢", "����"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ������ ������ �Դϴ�. ===");
		System.out.print("� ������ ã����? : ");
		String search = sc.next();
		boolean found = false;
		
		for (String animal : zoo) {
			if (animal.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search+" ����? : "+
				(found ? "����" : "����"));
	}
	
	
	
}

