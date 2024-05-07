package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();

		//add - ��� �ٳ��� ������
		a.add("���");
		a.add("�ٳ���");
		a.add("�ٳ���");
		System.out.println(a);//[���, �ٳ���, �ٳ���]

		//get(1)�� ����ؼ� index 1�� ����ִ� �� ��ȯ
		System.out.println(a.get(1));

		//set(1, "����")�� ����ؼ� �ٳ����� ������ ����
		a.set(1, "����");//�ٳ��� -> ����
			//index   0    1     2
			//a[] = [���, ����, �ٳ���]
		System.out.println(a.get(1));//����

		//size - ũ�� ��ȯ
		System.out.println(a.size());//3
			//a[] = [���, ����, �ٳ���]�̹Ƿ� a�� size�� 3

		//isEmpty() - ����Ʈ�� ����ִ��� Ȯ��
		System.out.println(a.isEmpty());//false
		//a[] = [���, ����, �ٳ���]�̹Ƿ� false

		//remove(2) - ������ �ڸ� ����
		a.remove(2);//�ٳ��� ����
		System.out.println(a);//[���, ����]
			//a[] = [���, ����]

		//remove("���") - ��� ����
		a.remove("���");
		System.out.println(a);//[����]
			//a[] = [����]

		//clear() - �������
		a.clear();
		System.out.println(a);//[]
			//a[] = []
		
		//isEmpty() - ����Ʈ�� ����ִ��� Ȯ��
		System.out.println(a.isEmpty());//true
			//a[] = []�̹Ƿ� true
	}
}