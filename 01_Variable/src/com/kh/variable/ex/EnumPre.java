package com.kh.variable.ex;

public class EnumPre {
//�ʵ�
	//enum ������ (������~�����)
	enum ������ {��,��,��,��,��,��,��}
	
	//enum �Һ��� {�л�, ������, ������}
	enum �Һ��� {
		�л�, ������, ������
	}
	
	//enum �Ǹ��� {�Ҹž�, ���ž�, �߸ž�}
	enum �Ǹ��� {
		�Ҹž�, ���ž�, �߸ž�
	}
	
//�޼���
	//������ (�ʼ�)
	public EnumPre() {
		
	}
	
	//void �޼���1 - (������~�����) ���
	public void �޼���1() {
		//�׳� sysout �̿��ؼ� ����ϱ�
		System.out.println(������.��);
		System.out.println(������.��);
		System.out.println(������.��);
		System.out.println(������.��);
		System.out.println(������.��);
		System.out.println(������.��);
		System.out.println(������.��);
		System.out.println("==========");
		
		//�迭�� ��Ƽ� ����ϱ�
		//values() - enum �ؿ� �ִ� �޼���
		������[] �迭 = ������.values();
			//enum���� �ۼ��� ���� ������ ��
		//for-each
		for (������ �� : �迭) {
			System.out.println(��);
		}
	}
	
	public void �޼���2() {
		//void �޼���2�� ���� �Һ��ڿ� �Ǹ��ڸ� for-each ����ؼ� ���� ���
		//�Һ��� for-each
		System.out.println("===== �Һ��� =====");
		�Һ���[] �Һ��ڵ� = �Һ���.values();
		for (�Һ��� �� : �Һ��ڵ�) {
			System.out.println(��);
		}
		//�Ǹ��� for-each		
		System.out.println("===== �Ǹ��� =====");
		�Ǹ���[] �Ǹ��ڵ� = �Ǹ���.values();
		for (�Ǹ��� �� : �Ǹ��ڵ�) {
			System.out.println(��);
		}
		System.out.println("================");
		
		//�Һ��� �л�, �Ǹ��� �Ҹž� ordianl() if�� ����ؼ� ���ϴ� ������ �޼���2 �ۼ�
		�Һ��� c = �Һ���.�л�;
		System.out.println("�л��� ��� : "+c.ordinal());
		�Ǹ��� s = �Ǹ���.�Ҹž�;
		System.out.println("�Ҹž��� ��� : "+s.ordinal());
		
		if (c.ordinal() > s.ordinal()) {
			//sysout �Һ����� ����� �� �����ϴ�.
			System.out.println("�Һ����� ����� �� �����ϴ�.");
		} else if (c.ordinal() == s.ordinal()) {
			System.out.println("�Һ��ڿ� �Ǹ����� ����� �����ϴ�.");
		} else {
			System.out.println("�Ǹ����� ����� �� �����ϴ�.");
		}
	}
	
	//main 
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		ep.�޼���1();
		//ep.�޼���2();
	}
}