package com.kh.inheritance.ex;

public class ������ extends ����Ʈ�� {
//�ʵ�
	private int �ȵ���̵�;
//�޼���
	//Setter
	public void set�ȵ���̵�(int �ȵ���̵�) {
		this.�ȵ���̵� = �ȵ���̵�;
	}
	//Getter
	public int get�ȵ���̵�() {
		return �ȵ���̵�;
	}
	//������ (�⺻)
	public ������() {
		
	}
	//������ (�ʼ�)
	public ������(String ȭ��, String ��Ż�, String ����, int �ȵ���̵�) {
		super(ȭ��, ��Ż�, ����);
		this.�ȵ���̵� = �ȵ���̵�;
	}
	//toString : alt + shift + s -> s
	@Override
	public String toString() {
		return "������ ���� : " + �ȵ���̵� + " / " + super.toString();
	}
}
