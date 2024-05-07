package com.kh.arrays.ex;

import java.util.ArrayList;
import java.util.Arrays;

/*
Arrays
	�迭�� ���õ� �پ��� �۾��� ���� ó���� �� �ֵ��� ������
	����, ����, ��

�޼ҵ�
	sort()	 	: �迭�� ������������ ����(���� �� -> ū �� �������)
	copyOf() 	: �迭�� �����ؼ� �Ȱ��� �迭�� �������
	equals()	: �� �迭�� �Ȱ����� ��
	fill() 		: �迭�� ��� ������ ������ ä���
	toString() 	: ���ڿ��� �����ؼ� ������

24.04.24
	asList() 	: �迭�� �������� �ʰ� ����Ʈ�� ��ȯ�ؼ� �߰�
	
		��뿹��
			String[] �迭 = {"���", "�ٳ���"}; �� ��
		
		ArrayList<String> ����Ʈ = new ArrayList<>(Arrays.asList(�迭));
		ArrayList<String> ����Ʈ = new ArrayList<>(Arrays.asList("���", "�ٳ���"));
*/
public class ArraysEx {
	//���� �޼���
	public static void main(String[] args) {
		//���� �迭�� ����
			//length : 5
			//index  0  1  2  3  4
		int[] num = {5, 8, 2, 4, 3};
			
		//sort - �迭�� ������������ �����ϱ�
		Arrays.sort(num);
		
		//toString - ���ڿ��� �����ؼ� ������
		System.out.println(Arrays.toString(num));
		
		//�Ʒ��� �迭�� ��ġ�� �ּҸ� ����ϴ� �ڵ�
		System.out.println(num);
		
		//copyOf - �迭�� ����
		//�迭�� �� ������ ���� ����
		//int �迭�̸� int �迭�� ����
			//		 ����   �ٿ��ֱ�(����� ����, ������ ������ ���ΰ�);
		int[] abc = Arrays.copyOf(num, num.length);
		//num ������ abc �� �� ���簡 �Ǿ����� Ȯ���ϱ�
		System.out.println(Arrays.toString(abc));
			//������ ������ ���ΰ��� index�� �ƴ϶� �׳� n��° ������
		int[] abc1 = Arrays.copyOf(num, 2);
		System.out.println(Arrays.toString(abc1));
		
		//equals - �� �迭�� �Ȱ��� ������� Ȯ���ϱ�
			//num�� abc�� �Ȱ��� ������� Ȯ�θ� �ϴ� ��
		boolean same = Arrays.equals(num, abc);//���� ��� ����
		System.out.println("num�� abc�� �Ȱ�������? : "+same);
		
		//fill - 0 ~ 4�� �ڸ����� ��� �Ȱ��� ��(3)���� �����ؼ� ���
		int[] �Ȱ������ڵ� = new int[5];
		Arrays.fill(�Ȱ������ڵ�, 3);
		
		//toSting - ���ڿ��� �����ؼ� ������
		System.out.println("���� 3���� ��� ä��� : "+
				Arrays.toString(�Ȱ������ڵ�));
	}
}
