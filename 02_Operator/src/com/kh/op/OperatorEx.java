package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
	// ���� �޼��� ȣ��
	public static void main(String[] args) {
		
		//int a = 1;
		//int b = 3;
		
		// a�� b�� ��� �ּ�ó���ϰ�
		// ���� ��ĳ�ʷ� �Է¹��� ���� ��µǰ� �غ��ô�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��ϼ���. �����Դϴ�.");
		// a = ū ���� ���, b = a ���� ���� �� ���
		System.out.print("a���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("b���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		// Scanner�� ����ؼ� �ڵ常 3�� �߰�������� ���Ⱑ �Ǿ���
		
		//����
		int sum = a+b;
		System.out.println("���� ��� sum : "+sum);
		//����
		int sub = a-b;
		System.out.println("���� ��� sub : "+sub);
		//���� 
		int mul = a*b;
		System.out.println("���� ��� mul : "+mul);
		//������
		int div = b/a;
		System.out.println("������ ��� div : "+div);
		}

}
