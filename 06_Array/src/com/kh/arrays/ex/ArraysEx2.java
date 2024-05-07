package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {
	//������ (�⺻)
	public ArraysEx2() { 
		
	}
	//������ (void)
	public void method1() {
		//���� �迭 �����ϱ�
		int[] num = {6, 4, 2, 3, 5, 7, 9};
		
		//Arrays.sort() - ���� �����ϱ�
		Arrays.sort(num);
		
		//Arrays.toString() - ���ĵ� ���� ����ϱ�
		System.out.println("num : "+Arrays.toString(num));
		
		//Arrays.copyOf() - num �迭 �����ϱ� abc
		int[] abc = Arrays.copyOf(num, num.length);
		
		//Arrays.toString() - ���ĵ� ���� ����ϱ�
		System.out.println("abc : "+Arrays.toString(abc));
		
		//Arrays.equals() - num�� abc�� ������ ���ϱ�
		boolean same = Arrays.equals(num, abc);
		System.out.println("num�� abc�� ��ġ�ϳ��� : "+same);
		
		//Arrays.fill() - ���� 6���� ��� ä���
		int[] ä��� = new int[3];
		Arrays.fill(ä���, 6);
		
		//Arrays.toString() - ä���� ä��� ������ ���
		System.out.println(Arrays.toString(ä���));
	}
	//�޼��� (����)
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
	}
}
