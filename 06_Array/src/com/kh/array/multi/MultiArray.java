package com.kh.array.multi;
/*
������ �迭
	2���� �̻��� �迪
	�迭 ��ҷ� �ٸ� �迭�� ������ �迭

��� ����
	(2���� �迭 ����)
	�ڷ���[][] �迭��;
	�ڷ��� �迭��[][];
	�ڷ���[] �迭��[];
	
	�ڷ���[][] �迭�� = new �ڷ���[���ڰ�][���ڰ�];
	int[][] arr = {
					{10, 20, 30},
					{40, 50, 60}
									};
 */
public class MultiArray {
	public static void main(String[] args) {
		//2���� �迭 �����
		int[][] numbers = {
				{1, 2, 3},//[0][0] [0][1] [0][2]
				{4, 5, 6},//[1][0] [1][1] [1][2]
				{7, 8, 9} //[2][0] [2][1] 21][2]
							};
		
		//numbers[0][0] = 1;
		
		//����ϱ�
		System.out.println("2���� �迭 ����ϱ�");
		System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[1][2]);
		System.out.println(numbers[2][0]);
		System.out.println(numbers[2][1]);
		System.out.println(numbers[2][2]);
		
		System.out.println("----------");
		
		//for ������ ����ϱ�
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}
}
