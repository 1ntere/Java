package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*
�ڡڡڡڡ� �߿� �ڡڡڡڡ�

	�� �� HashMap		: ���� �˻� �ӵ� (���� ���� ���)
Map �� TreeMap		: ���ĵ� �����͸� �ʿ��� ��� ���
	�� LinkedHashMap	: ������ �����ϸ鼭 �����ϱ� ������ ������ �߿��� ��� ���

Map : Ư�� Ű�� �Է��ϸ� �ش�Ǵ� ���� ���� �� �ִ� Collection ��ü

��뿹��
	key:value
	
	key(����)	= Ű
	value	= ��
	
�޼���
	put(key, value)		 : ������ Ű�� ������ ���� ���� �߰�
	get(key)			 : ������ Ű�� ����� ���� ������
	containsKey(key)	 : ������ Ű�� �����ϴ��� Ȯ��
	containsValue(value) : ������ ���� �����ϴ��� Ȯ��
	remove(key)			 : ������ Ű�� Ű�� ����� ���� ����
	keySet()			 : Ű�� �����ϴ� ������ ��ȯ
	values()			 : ��� ������ �����ϴ� �÷����� ����Ʈ�� ��ȯ
	entrySet()			 : ��� Ű-���� �����ϴ� ������ ��ȯ
*/
public class MapEx {
	public static void main(String[] args) {
		//Map ����
		Map<String, Integer> �л��� = new HashMap<>();
		
		//put(key, value) - �߰��ϱ�
		�л���.put("ö��", 90);
		�л���.put("����", 85);
		�л���.put("�μ�", 88);
		�л���.put("ö��", 90);
		
		//��ü����
		System.out.println(�л���);//{ö��=90, ����=85, �μ�=88}
			//("ö��", 90)�� 2�� �־��µ� 1���� ��
		
		//get() - ��ȸ�ϱ�
		System.out.println("ö���� ���� : " + �л���.get("ö��"));
		
		//remove() - �����ϱ�
		�л���.remove("����");
			//�л��� = {ö��=90, �μ�=88}
		
		//��ü����
		System.out.println("��ü �л��� : "+�л���);//{ö��=90, �μ�=88}
		
		//key�� ���� �ߺ��� �� �� ���� (key�� value�� �����ؾ���)
		//���� �� ������ ������ �������
		�л���.put("ö��", 80);//ö��(key)�� ��(value)�� 80���� �ٲ�
		System.out.println(�л���);//{ö��=80, �μ�=88}
		
		//�л��� ���� ����ϱ�
		//for-each �� : �л��鿡 ����ִ� key�� ��� ������ �ͼ� �迭�س��� keySet()Ȱ��
		for (String �̸� : �л���.keySet()) {
			//�� �л��� ���� ��ȸ
			int ���� = �л���.get(�̸�);
			System.out.println(�̸�+ "�� ������ "+����+"��");
		}
	}
}
