package com.kh.oop.constructor;

public class ConstructorEx {
	/*
	������
	
	������ ���ϴ� ������ �ʱ�ȭ�� ������ �� ����
	
	�ʱⰪ = 0; ���� �Ǿ� ���� �� �ʱⰪ�� 1�� �־��ָ�
	�ʱⰪ�� 1�� �ʱ�ȭ��
	
	1. ��ȯ���� ����(return ��� x, void�� ���������� ����)
	2. ��ü(Ŭ����)�� �ʱ�ȭ�ϴ� ����� ���� ��� ��� ��� ����
		���� ����
			1. �⺻ ������(�ʱ� ������) - �ƹ��� ���� �ʼ��� �ƴ�
				public Ŭ�����̸�() {
			
				}
			2. �ʼ� ������ - �ʼ��� �޾ƾ��ϴ� ���� ����
						- �ʼ��� �޾ƾ��ϴ� ���� �ʵ忡 ���� ���� ����
				public Ŭ�����̸�(String ����, int ����, char ����) {
					//���⼭ ������� �ʵ尪�� ����
					this.�ʵ尪1 = ����;
					this.�ʵ尪2 = ����;
					this.�ʵ尪3 = ����;
				}
			3. ���� ������ ������
				�ʵ峪 �����ڿ��� ���� �������� ������
	*/
	
	//�ʵ� ������ ����
	public String name;//������� (null)
	public String phone;//������� (null)
	public int idNo;//������� (0)
	public int money;//������� (0)
	
	/*1. �⺻ ������, 2. �ʼ� ������, 3. ���� ������ ������*/
	
	//1. �⺻ ������ : �ʼ��� �ƹ��͵� ���� ���� ������
	public ConstructorEx() {
		
	}
	
	//2. �ʼ� ������ : ��ȣ �ȿ� �Ű������� �ʼ��� ���� �ϴ� ������
	//�Ű����� : �� �� (�߸�) ˿ �� (����) ܨ �� (����) � �� (����)
	//�Ű������� �̸��� �߿������� ����
	//�Ű������� �ڷ����� �߿���
	//                  ( ��   ��   ��   �� )
	//					�ʼ� : �̸�
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	/* ���� �߻�
	//					�ʼ� : �ڵ��� ��ȣ	
	public ConstructorEx(String inputPhone) {
		this.phone = inputPhone;
	}
	*/
	//					�ʼ� : �̸�, �ڵ��� ��ȣ	
	public ConstructorEx(String inputName, String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
	}
	//					�ʼ� : �̸�, �ڵ��� ��ȣ, ���̵� ��ȣ
	public ConstructorEx(String inputName, String inputPhone, 
			int inputIdNo) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	//					�ʼ� : �̸�, �ڵ��� ��ȣ, ���̵� ��ȣ
	public ConstructorEx(String inputName, int inputIdNo, 
			String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	//					�ʼ� : �̸�, �ڵ��� ��ȣ, ���̵� ��ȣ
	public ConstructorEx(int inputIdNo, String inputName,
			String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	/* ���� �߻�
	//					�ʼ� : �̸�, �ڵ��� ��ȣ, ���̵� ��ȣ
	public ConstructorEx(String inputPhone, String inputName, 
			int inputIdNo) {
		this.phone = inputPhone;
		this.name = inputName;
		this.idNo = inputIdNo;
	}
	*/
	//					�ʼ� : �̸�, �ڵ��� ��ȣ, ���̵� ��ȣ, ��
	public ConstructorEx(String inputName, String inputPhone,
			int inputIdNo, int inputMoney) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
		this.money = inputMoney;
	}
	
	//3. ���� ������ ������
	/*
	���� ������ �����ڴ� �ʱ��� ���� �������ֱ� ������
	�Ű������� �ʼ��� �־����� �ʾƵ� ������
	�ʱ� �����ڿ� ������� �Ȱ��Ƽ� ���� ���� ���� ������(������ ���� ������)
	����� ���Ƿ� �Ű������� �־���
	������ �ʱ� ������ó�� public ConstructorEx() {} ����� �� ����
	=> ������ ���� ��������� ����
	*/
	
	public ConstructorEx(int a) {
		//�⺻���� ���� �����ؼ� �����ϴ� ������
		//������ ������ ���� �������ְ� ���� ���� ������ �� �ֵ��� ����
		name = "�̸��� �Է����ּ���.";
		//name�� String�̱� ������ ���ڿ��� �־�� ��
		phone = "��ȣ�� �Է����ּ���.";
		//phone�� String�̱� ������ ���ڿ��� �־�� ��
		idNo = 1;
		//idNO�� int�̱� ������ ���ڰ��� �־�� ��
		money = 0;
		//money�� int�̱� ������ ���ڰ��� �־�� ��
	}
	
	public static void main(String[] args) {

	}
}
