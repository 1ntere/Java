package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
	//������ (�⺻)
	public ArrayListEx2() {
		
	}
	//������ (void)
	public void method1() {
		//���� �ٳ��� ���
		ArrayList<String> list = new ArrayList<>();
		
		//add - ���� �ٳ��� ��� �߰�
		list.add("����");
		list.add("�ٳ���");
		list.add("���");
		
		//get - {0, 1, 2} �� index �ڸ��� �� ����ϱ�
		System.out.println("list.get(0): "+list.get(0));//����
		System.out.println("list.get(1): "+list.get(1));//�ٳ���
		System.out.println("list.get(2): "+list.get(2));//���
		System.out.println("---------------");
		
		//set - "�ٳ���" -> "Ű��" ����
		list.set(1, "Ű��");//{"����", "Ű��", "���"}
		System.out.println(list.get(1));
		System.out.println("---------------");
		
		//size - ũ�� Ȯ�� [index ���ڸ� ���� ����]
		System.out.println("�ٱ��� ũ�� : "+list.size());//3
		System.out.println("---------------");
		
		//remove - Ű�� ����
		list.remove(1);
		System.out.println(list.get(1));//"���"
		//{"����", "Ű��", "���"}���� "Ű��" �������Ƿ�
		//{"����", "���"}�� �Ǿ�
		//index 1�� �ִ� ������ "���"�� �ȴ�
		System.out.println("---------------");
		
		//isEmpty - ����ִ��� Ȯ�� [index ���ڸ� ���� ����]
		System.out.println("��ٱ��� ��� �ֳ���? : "+
					list.isEmpty());//false
		System.out.println("---------------");
		
		//for �� - ��ٱ��� ���� �� �ִ��� Ȯ���ϱ�
		for (int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		/*
		[������ ����� for ��]
		for (���� ������� ���� �� : �ݺ��� ���� ��) {
			System.out.println();
		}
		*/
		for (String ���� : list) {
			System.out.println(����);
		}
		//=> �ξ� �ܼ���
	}

	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		//add - ���� ȣ���� ����� ������
		// ����Ű (�� �� �����ؼ� �ؿ� �ٿ��ֱ�) : ctrl + alt + ��
		animal.add("����");
		animal.add("ȣ����");
		animal.add("�����");
		animal.add("������");
		
		//size - ������ �� ���� �ִ��� Ȯ�� [index ���ڸ� ���� ����]
		System.out.println("�������� �� ���� �� : "+
					animal.size()+" ����");
		System.out.println("----------");
		
		//get - ���� Ȯ��
		System.out.println("���� 0 : "+animal.get(0));
		System.out.println("���� 1 : "+animal.get(1));
		System.out.println("���� 2 : "+animal.get(2));
		System.out.println("���� 3 : "+animal.get(3));
		System.out.println("----------");
		
		//set - ����� -> �䳢
		animal.set(2, "�䳢");
		
		//remove - ������ ����
		animal.remove("������");
		//���� �ڵ� ��ſ� animal.remove(3); �� ����ص� ��
		
		//for �� - get ���
		for(String ���� : animal) {
			System.out.println("���� : "+����);
		}
		System.out.println("----------");
		
		//clear - ��� ���� [index ���ڸ� ���� ����]
		animal.clear();
		
		//isEmpty - ��� ������ �Ǿ����� Ȯ��
		System.out.println("��� �̻��մϴ�.");
		System.out.println("�������� ��� ����ֳ���? : "+
				animal.isEmpty());
	}
	
	public void method3() {
		//���� ����
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== ���� �޴� ===");
		
		//add - ���� �������� ����δ�
		pizza.add("����");
		pizza.add("��������");
		pizza.add("����δ�");
		
		//get - ����ϱ�
		System.out.println("���� 0 : "+pizza.get(0));
		System.out.println("���� 1 : "+pizza.get(1));
		System.out.println("���� 2 : "+pizza.get(2));
		System.out.println("----------");
		
		//set - ����δ� -> ���ξ���
		pizza.set(2, "���ξ���");
		
		//remove - ���ξ��� ����
		pizza.remove("���ξ���");
		
		//for �� - ���
		for (String ���� : pizza) {
			System.out.println("���� : "+����);
		}
		System.out.println("----------");
		
		//�� ��� �޴��� �ѹ��� ����ϴ� ���
		System.out.println("��� �޴� ���� : "+pizza);
		System.out.println("----------");
		
		//clear - �޴� ��� ����
		System.out.println("���� ���԰� ����� �����Դϴ�.");
		pizza.clear();
		
		//isEmpty - �޴� ��� �����ƴ��� Ȯ��
		System.out.println(pizza.isEmpty());
	}
	
	public static void main(String[] args) {
		ArrayListEx2 ale = new ArrayListEx2();
		//ale.method1();
		//ale.method2();
		ale.method3();
	}
}
