package com.kh.SetEx;

import java.util.HashSet;

/*
set : ����, �ָӴ�
	������ �������� ����(�ڸ� ���� ����)
		index�� �̿��ؼ� �ҷ����� �Ұ���(set �Ұ���)
	�ߺ� ������ ����x(������ ������ �����)
		List�� ��쿡�� ���� ���� add�ص� ������ ��������
	
	�� HashSet(��ǥ)  : ó�� �ӵ��� ���� set
set �� LinkedHashSet : ������ �����ϴ� set
	�� TreeSet       : �ڵ����ĵǴ� set
	
	HashSet ��� ����
		��� ���� 1 : ��ü�� equals() �����ε� �Ǿ� �־����
		��� ���� 2 : ��ü�� hashCode() �����ε� �Ǿ� �־�� ��
	
			Set<�ڷ���> �� = new HashSet<>();
			HashSet<�ڷ���> �ؽü� = new HashSet<>();

Set�� ���Ǵ� �޼���
add()		������ �߰�
get()		�ڸ� ������ Ȯ��
remove()	������ ����
size()		������ ũ�� Ȯ��
clear()		������ ��� ����
contains()	Ư�� �����Ͱ� �����ϴ��� Ȯ��
---
�� set()�� get()�� ��� �Ұ�
	get()�� ���� Ư�� index���� �����͸� ������ �� ���Ǹ�
		get(index��);���� ���ǰ�,
	set()�� ���� �����͸� ������ �� ���Ǹ�
		set(index��, ��ǥ��);���� ���Ǵµ�
	Set�� ������ ��� index���� �������� �����Ƿ�
	�����Ǵ� �ڸ���(index)�� ��� ��� �Ұ�
*/

public class SetEx {

	public static void main(String[] args) {
		// Set �� �ߺ��� ������� �ʰ� add�� �߰����� ������ �����͸� �������� ����
		// List�� �޸� index ������ ��� get()�� set() ��� �Ұ���
		// ������ �ߺ� Ȯ�ο� ���� ���
		HashSet<String> set = new HashSet<>();
		
		//add - ������ �߰�
		set.add("�θǽ�");
		set.add("����");
		set.add("�׼�");
		set.add("������");
		System.out.println(set);//[����, �θǽ�, ������, �׼�]
		
		//remove - ������ ����
		set.remove("�θǽ�");
		System.out.println(set);//[����, ������, �׼�]

		//size - ������ ũ�� Ȯ��
		System.out.println(set.size());//3
			//set[] = [����, ������, �׼�] �̹Ƿ� 3

		//clear - ������ ��� ����
		set.clear();
			//set[] = []

		//contains - Ư�� �����Ͱ� �����ϴ��� Ȯ��
		System.out.println(set.contains("������"));//false
			//set[] = [] �̹Ƿ� "������"�� set�� �������� �ʾƼ� false
		
		/*get() - �ڸ� ������ Ȯ�� / set() - ������ ����*/
		/*
		�� ���� �߻�
		System.out.println(set.get(1));
		-----
		set�� �ڸ��� �����̾ Ư���� index��ȣ�� ������ �����Ͱ� ����
		=====
		get() ��� �Ұ�
		���������� ������ set()�� ��� �Ұ�
		 */
	}
}