package com.kh.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// for ���� Ȱ���� �迭 ����ϱ�
		int numbers[] = new int[5];
		
		//1���� 4������ �迭�� ���ڸ� �ֱ�
		//index�� 0���� �����ϱ� ������ i = 0
		//length = ����
		System.out.println("�ִ���� : "+numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers["+i+"] = "+i);
		}
	}
}
