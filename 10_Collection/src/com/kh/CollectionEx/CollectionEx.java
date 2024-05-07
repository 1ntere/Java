package com.kh.CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Collection �������̽� ���ϵ��� ��������ִ� ����
List, Set�� �θ�Ŭ����
���������� ȸ���ϸ鼭 �ڵ带 ��ȸ�ϰų� �ڵ� �ȿ� �ۼ��� ������ ��ȸ�ϰ�,
�߰� ���� �˻� �� �⺻ �۾��� ����

�޼���
sort() = ����Ʈ�� �⺻ ���� ������ ���� ����
	1. ���� : �������� ����, ���� ������ ū �� ������ ����
	2. ���ڿ� : ������ ���� ������ ���� ����
	3. �츮�� ������ ���� ���� ����
		compareTo() �޼��带 Ȱ���ؼ� ���� ������ �ۼ��� �� ����
min, max = �ּҰ�, �ִ밪
binary search (���� Ž��) = ���� Ž���� ����ؼ� ����Ʈ���� ������ ��Ҹ� ã��
		���ĵ� �迭�̳� ����Ʈ���� Ư���� ���� ��ġ�� ã�� �˰���
		�迭 �Ǵ� ����Ʈ�� ������ ������ Ž�� ������ �������鼭 ���� ã�Ƴ��� ��
		��� �̺� (2 ���� ������ ���� �ǹ�)
		��� ���� (2 ���� ������ ���ư��ٴ� ���� �ǹ�)
addAll : ���� �߰��ϰ����ϴ� ��� ���� �߰�
*/
public class CollectionEx {
	public static void main(String[] args) {
		//����
		ArrayList<Integer> ���ڵ� = new ArrayList<>();
		���ڵ�.add(3);
		���ڵ�.add(5);
		���ڵ�.add(4);
		���ڵ�.add(1);
		System.out.println(���ڵ�);//[3, 5, 4, 1]
		
		//Collection.sort - ������������ �����ϱ�
		Collections.sort(���ڵ�);//[1, 3, 4, 5]
			//���� ������ ū �� ������ ���ĵ�
		System.out.println(���ڵ�);
			//���ڵ� = [1, 3, 4, 5]
		
		//ArrayList���� add�� �ϳ��� �߰��ϴ� ���� �ƴ϶� �ѹ��� ���� �߰��ϱ�
										//()�ȿ� Arrays.asList() - �ְ� ���� ��ŭ �߰� ����
		ArrayList<String> ����� = new ArrayList<>(Arrays.asList("Black", "White"));
		System.out.println(�����);
			//����� = [Black, White]
	}
}
