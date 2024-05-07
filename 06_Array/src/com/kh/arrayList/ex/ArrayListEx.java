package com.kh.arrayList.ex;

import java.util.ArrayList;

/*
�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
ArrayList
����Ʈ�� �迭�� ��������� ũ�Ⱑ ������ �Ǿ����� �ʴٴ� ������ �ٸ�
���ϴ� ��ŭ ���� �� ����

�� ArrayList�� Class ������ ������� �� ��!
���� Class ���� ArrayList������
ArrayListEx�� �̸��� Refactor > Rename ����

��� ����
ArrayList<�ڷ���> ������ = new ArrayList<�ڷ���>();

	+ <�ڷ���>�� �� ��
	int		 	-> Integer
	String	 	-> String
	double	 	-> Double
	char		-> Character
	
	+ �ܿ��
	add 		�߰�
	get 		��ȯ
	set 		����
	remove 		����
	size 		���� Ȯ��
	isEmpty 	����ִ��� Ȯ��
	clear 		��� ����
*/
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		//index�� �ڸ� ��ġ 0
		
		//isEmpty - ����ִ��� Ȯ���ϱ�
		System.out.println(num.isEmpty());//true
		//�ڸ��� ����ֱ� ������ true��� ����
		
		//add - �����ϱ�
		num.add(10); //index 0�� �ڸ��� 10�� ������
		
		//get - ��ȯ�ϱ�
		System.out.println("�߰� Ȯ�� : "+num.get(0));
		//���� index 0 �� ����� �� : 10
		
		//isEmpty - ����ִ��� Ȯ���ϱ�
		System.out.println(num.isEmpty());//false
		//num.add(10);���� index 0�� �ڸ��� 10�� ������
		//�ڸ��� ������� �ʱ� ������ false��� ����
		
		//size - ũ�� Ȯ�� [size�� ��� o, length ��� x]
		System.out.println(num.size());
		
		//set - �����ϱ�(�����ϴ� ��ġ(�ڸ���), �����ϰ��� �ϴ� ��)
		num.set(0, 20);//index 0�� �ڸ��� 20���� ������
		
		//get - ��ȯ�ϱ�
		System.out.println(num.get(0));
		//���� index 0 �� ����� �� : 20
		
		//remove - �����ϱ�
		num.remove(0);
		
		//�����߱� ������ �ƹ��͵� �����Ƿ� get�� �ƴ϶� isEmpty ���
		//isEmpty - ����ִ��� Ȯ���ϱ�
		System.out.println(num.isEmpty());//true
	}
}
