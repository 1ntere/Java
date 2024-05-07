package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
Collection(List, Set, Map)�� �ݺ��ϴµ� ���

Enumeration (����)	: �� �̻� ������� ����, Vector�� ���� ������ ���� Ŭ���������� ����
Iterator (�ݺ���)		: �ݺ��ϴµ� ��� (���������� ȸ��)
					  �б⸸ ����, �߰��ϰų� ������ �� ����
ListIterator		: Iterator ���׷��̵� ����
					  List(Vector, ArrayList, LinkedList) ������ ���
					  ��������� ������ ȸ��(���� : ���鼭 ���ư���) ����
					  	= �յڷ� �̵� ����
					  �߰��ϰų� ���� ����
					  
Iterator �ؿ� �ִ� �޼���
	hasNext()	: ������ �ִ��� ������ Ȯ��
				  ���࿡ �����Ѵٸ� true, �������� �ʴ´ٸ� false
	Next()		: ���� ���� ������ ���µ� ���
				  next()�� ����ϱ� ���� hasNext()�� ����ؼ� �� ������ �ִ��� �������� Ȯ���ϰ�
				  	next()�� ����ϴ� ���� ���� (exception ���� �߻�)
*/
public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String> ���ϵ� = new ArrayList<>();
		���ϵ�.add("���");
		���ϵ�.add("��纣��");
		���ϵ�.add("�м��ĸ���");
		���ϵ�.add("����");
		
		//Iterator ����
		Iterator<String> �ݺ� = ���ϵ�.iterator();
		
		//hasNext() - ���� ���� �ִ��� Ȯ�� / true, false
		while (�ݺ�.hasNext()) {
			//next() - ���� �� ������ ����
			String ���� = �ݺ�.next();
			System.out.println(����);
		}
			//���� ���Ŀ��� ���� �����Ƿ� �ݺ�.hasNext()�� false�� �ȴ�.
			//���� while ���� ������ ��
	}
}
