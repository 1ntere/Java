package com.kh.Inheritance.OverrideEx;

public class ���� {
	//�ʵ�
	String �̸�;
	//�޼��� (Setter)
	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}
	//�޼��� (Getter)
	public String get�̸�() {
		return �̸�;
	}
	//������ (�⺻)
	public ����() {
		
	}
	//������ (�ʼ�)
	public ����(String �̸�) {
		this.�̸� = �̸�;
	}
	//������ (void) - void : ��ȯ�ϴ� �� ���� ��¸� ����
	public void  �Ҹ�() {
		System.out.println("������ �Ҹ��� ���ϴ�.");
	}
}
