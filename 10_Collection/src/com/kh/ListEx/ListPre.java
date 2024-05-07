package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
	 �� Vector     : Java1 ����(Java �ʱ����)���� ���� ���� �����ؼ� ���� ��
List �� ArrayList  : �˻��� ������, ������ ���԰� ������ ����� ��� ������
	 �� LinkedList : �˻��� ������, ������ ���԰� �������� ����

	List
	 �� Vector
	 �� ArrayList
	 �� LinkedList
*/
public class ListPre {
//�޼���
	//������(�⺻)
	public ListPre() {

	}
	//void - Vector
	public void VectorEx() {
		Vector<String> ���� = new Vector<>();
		����.add("�ڹ�");
		����.add("���̽�");
		����.add("C");
		System.out.println(����);//[�ڹ�, ���̽�, C]
	}
	//void - LinkedList
	public void LinkedEx() {
		LinkedList<String> ��ũ�帮��Ʈ = new LinkedList<>();
		��ũ�帮��Ʈ.add("��");
		��ũ�帮��Ʈ.add("ȣ����");
		��ũ�帮��Ʈ.add("�۾���");
		System.out.println(��ũ�帮��Ʈ);//[��, ȣ����, �۾���]
	}
	//void - ArrayList	
	public void ArrayEx() {
		ArrayList<String> ��̸���Ʈ = new ArrayList<>();
		��̸���Ʈ.add("���");
		��̸���Ʈ.add("�ٳ���");
		��̸���Ʈ.add("����");
		System.out.println(��̸���Ʈ);//[���, �ٳ���, ����]
	}

	//main
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();
	}
}