package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	//4�ڸ� ��й�ȣ �����
	public void practice11() {
		/*
		������ �̿��ؼ� 4�ڸ� ��й�ȣ�� ������� �Ѵ�.
		4�ڸ� ������ �Է¹޾� �� �ڸ� ���� �ߺ��Ǵ� ���� ���� ��� ����
		�ߺ� ���� ������ '�ߺ� �� ����'
		�ڸ����� �� ������ '�ڸ� �� �� ����' ���
		��, ���� �� ���ڸ� ���� ���� 1 ~ 9������ ���� (0 �ȵ�)
		*/
		
		//��й�ȣ�� �������� �ƴ϶� �Է��ؼ� ���ؾ� ��
		Scanner sc = new Scanner(System.in);
		
		//��й�ȣ�� �츮�� ������ ������ ��� (�ݺ��Ѵٴ� �ǹ�)
		while (true) {
			System.out.print("��й�ȣ �Է� (1000~9999) : ");
			int password = sc.nextInt();
			
			//�ڸ� �� �� ����
			if (password<1000 || password>9999) {
				System.out.println("4�ڸ� ��й�ȣ�� �ƴմϴ�.");
				System.out.println("�ڸ� �� �� ����");
				continue;
			}
			
			//�ڸ���
			int[] digits = new int[4]; //4�ڸ��� ��� (0 ~ 3)
			digits[0] = password/1000; //õ���ڸ�
			digits[1] = (password/100) % 10; //�����ڸ�
			digits[2] = (password/10) % 10; //�����ڸ�
			digits[3] = password % 10; //�����ڸ�
			
			
			//�ߺ� �� ����
			boolean isTrue = true;
			
			//�ڡڡڡڡ� length : ũ��
			for (int i = 0; i < digits.length; i++) {
				for (int j = i + 1; j < digits.length; j++) {
					if (digits[i] == digits[j]) {
						isTrue = false;
						break;
						//���࿡ i �ڸ� ���ڿ� j �ڸ� ���� �� ���ٸ� isTrue �� false�� �����ض� 
					}
				}
			}
			
			//�ߺ� �� ����
			if (!isTrue) {
				System.out.println("�ߺ����� ����");
			} else {
				System.out.println("��й�ȣ ���� ����");
				break;//��й�ȣ�� ���������� �� �����ϸ� ��� ����
			}
			
			/*
			�� ���� �߻�
			�ߺ��Ǵ� ���� �Է��ϸ� ��¿��� �ƹ��͵� �ȳ����� �׳� ���� 
			//�ڡڡڡڡ� length : ũ��
			for (int i = 0; i < digits.length; i++) {
				for (int j = i + 1; j < digits.length; j++) {
					if (digits[i] == digits[j]) {
						isTrue = false;
						break;
						//���࿡ i �ڸ� ���ڿ� j �ڸ� ���� �� ���ٸ� isTrue �� false�� �����ض� 
					}
				}
				if (!isTrue) {
					break;
					//isTrue�� false�� break
				}
				//�ߺ� �� ����
				if (!isTrue) {
					System.out.println("�ߺ����� ����");
				} else {
					System.out.println("��й�ȣ ���� ����");
					break;//��й�ȣ�� ���������� �� �����ϸ� ��� ����
				}
			}
			-----
			�� ���� �ذ� ���
			if (isTrue) {
				break;
			}
			�� for �� �ȿ� �־ �׷�
			for �� �ٱ����� �ű��			
			*/
		}
	}
}
