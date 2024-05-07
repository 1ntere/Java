package com.kh.IteratorEx;

import java.util.*;

/*
ListIterator

next�� �տ������� ���������� ���
hasNext()		: ���� ���� �����ϴ��� true, false�� Ȯ��
Next()			: ���� �� ��������

previous�� �ڿ������� ���������� ���
hasPrevious()	: ���� ���� �����ϴ��� true, false�� Ȯ��
previous()		: ���� �� ��������

���� �߰��ϰų� ������ �� ����
add()			: �߰�
remove()			: ����
*/
public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList<String> ����� = new ArrayList<>();
		�����.add("����");
		�����.add("ȭ��Ʈ");
		�����.add("�ʷ�");
		
		//����Ʈ���ͷ����� ����
		ListIterator<String> �ݺ��ϱ� = �����.listIterator();
		
		//hasNext(), next()
		System.out.println("�տ������� ���");
		while (�ݺ��ϱ�.hasNext()) {
			String ���� = �ݺ��ϱ�.next();
			System.out.println(����);
		}
			//����鿡�� ����, ȭ��Ʈ, �ʷ� ������� ��µ�
		System.out.println("===============");
		
		//hasPrevious(), previous()
		System.out.println("�ڿ������� ���");
		while (�ݺ��ϱ�.hasPrevious()) {
			String ���� = �ݺ��ϱ�.previous();
			System.out.println(����);
		}
			//����鿡�� �ݴ�� �ʷ�, ȭ��Ʈ, ���� �������� ��µ�
		System.out.println("===============");
		
		System.out.println(�����);
			//����� = [����, ȭ��Ʈ, �ʷ�]
		System.out.println("===============");
		
		System.out.println("add�� ����ؼ� ���� �߰��ϱ�");
		�ݺ��ϱ�.add("�Ķ�");
		
		System.out.println(�����);//[�Ķ�, ����, ȭ��Ʈ, �ʷ�]
			//�� add�� �ؼ� �߰��� ������ �տ� �߰��� ��
			//����� = [�Ķ�, ����, ȭ��Ʈ, �ʷ�]
		
		/* �ٷ� �ݺ��ϱ�.remove();�� ����ϸ� ������ �߻��� */
		//�ݺ��ϱ�.remove();
		/*
		�� exception ���� �߻�
		Exception in thread "main" java.lang.IllegalStateException
			at java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980)
			at com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:55)
		-----
		add ���� �߰��ϸ� �߰��� ���� �迭�� �� ������ �̵���
		������ ����Ʈ�� ���� ��ġ
		�� �̻� ���� ���� ���� ������ ������ �� �ִ� ���� �������� ����.
		=====
		�� ���� �ذ� ���
		�ݺ��ϱ�.previous();
		�ݺ��ϱ�.remove();
			next()�� ȣ���ؼ� ���� ��ġ�� ������ ������ remove()�� ȣ���ϰų�
			previous()�� ȣ���ؼ� ���� ��ġ�� ������ ������ remove()�� ȣ��
		*/
		
		//next() �� previous()�� ����ؼ� ���� ��ġ�� �Ķ��� ��ġ�� �̵�
		�ݺ��ϱ�.previous();
		�ݺ��ϱ�.remove();
	}
}
