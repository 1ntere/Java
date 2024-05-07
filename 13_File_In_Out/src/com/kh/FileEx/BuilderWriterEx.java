package com.kh.FileEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
StringBuilder : �ӵ��� ����
*/
public class BuilderWriterEx {
	public static void main(String[] args) {
		//���� ����
		String �����̸� = "��.txt";
		
		//StringBuilder �� ����ؼ� ���Ͽ� �� ���� �ۼ�
		StringBuilder ���� = new StringBuilder();
		//add 		: �߰��ϴ�
		//append 	: �߰��ϴ�
		����.append("ù ��° ���̾��. \n");
		����.append("�� ��° ���̾��. \n");
		����.append("�� ��° ���̾��. \n");
		
		//FileWriter ��ü�� �����ؼ� ���Ͽ� ���� ���� ����
		//BufferedWriter�� ����ؼ� �� ���� ������ �� �ֵ��� ��
		
		try {
			BufferedWriter ���۱۾��� = new BufferedWriter(new FileWriter(�����̸�, true));
			
			/*
			System.nanoTime() : 2024.04.25 14:45:00 ����
			1ms	= 1/1000 ��
			1us	= 1/1000 ms
			1ns	= 1/1000 us	1/10�� ��
			*/
			long ���۽ð� = System.nanoTime();
			
			//���� ���� �ۼ�
			���۱۾���.write(����.toString());
			
			long ����ð� = System.nanoTime();
			System.out.println("�� �ҿ�ð� : "+ (����ð� - ���۽ð�));
			
			//���� �ݱ�
			���۱۾���.close();
			System.out.println("���Ͽ� ������ ���������� �ۼ��߽��ϴ�.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}