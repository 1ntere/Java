package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	public static void main(String[] args) {
		Stack<Integer> ���� = new Stack<>();
		
		//push() - ���ÿ� ���� �߰�
		����.push(10);
		����.push(30);
		����.push(50);
		����.push(40);
		����.push(20);
		
		//pop() - ���� ������ �� ���� �ִ� �� ��ȯ�ϰ� ����
		int ž = ����.pop();
		System.out.println(ž);//20
			//20�� ��ȯ�Ǿ� ��µǰ� �����
		
		//peek() - ���� ������ �� ���� �ִ� �� ��ȯ
		int ������Ȯ�� = ����.peek();
		System.out.println(������Ȯ��);//40
			//���� ������ �� ���� �ִ� �� : 40
		
		//isEmpty() - ���ÿ� ���� �����ϴ��� Ȯ��
		boolean ����ֳ��� = ����.isEmpty();
		System.out.println(����ֳ���);//false
			//���� ���ÿ��� 10 30 50 40, �� 4���� ���� ����
		
		//size() - ������ ũ�� Ȯ��
		System.out.println(����.size());//4
			//���� ���ÿ��� 10 30 50 40, �� 4���� ���� ����
	}
}
