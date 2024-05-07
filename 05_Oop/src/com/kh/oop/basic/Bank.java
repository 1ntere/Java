package com.kh.oop.basic;

public class Bank {
	//�̸� ���¹�ȣ �ܾ� ��й�ȣ �����ü��ŵ���
	public String 	name;
	public String 	accountNumber;
	public int 		balance ;
	public String 	password;
	public boolean 	agree;
	
	//������ �޼���
	//1. �ʼ��� �ƴ� ������ = Ŭ���� ��� ���ƾ� ��
	public Bank() {
		
	}
	
	//2. �ʼ��� ������(�̸�, ���¹�ȣ, �ܾ�, ��й�ȣ)
	public Bank(String inputName, String inputAccountnumber, 
			int inputBalance, String inputPassword) {
		this.name = inputName;
		this.accountNumber = inputAccountnumber;
		this.balance = inputBalance;
		this.password = inputPassword;
	}
	
	//��� ������
	public void info() {
		System.out.println("�̸� : "+name);
		System.out.println("���¹�ȣ : "+accountNumber);
		System.out.println("�ܾ� : "+balance);
		System.out.println("��й�ȣ : "+password);
		System.out.println("�����ü��ŵ��� : "+agree);
	}
	
	public static void main(String[] args) {
		//1.���� ���� ����, ���ŵ��� ok
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-123123";
		customer1.balance = 123;
		customer1.password = "0000";
		customer1.agree = true;
		
		customer1.info();
		System.out.println();

		//2. ���� ���� ����, ���ŵ��Ǹ� �Ǽ��� ����
		Bank customer2 = new Bank();
		customer2.name = "Dun";
		customer2.accountNumber = "111-333-123123";
		customer2.balance = 456;
		customer2.password = "1234";
		customer2.agree = false;//���� boolean�� �⺻���� false
		
		customer2.info();
		System.out.println();
		
		//3. �ʼ� �����ڸ� Ȱ���ؼ� ����Ŭ ���� ��������
		//�̸�, ���¹�ȣ, �ܾ�, ��й�ȣ�� �Է��ϰ�
		//������ ���ŵ��Ǹ� true�� �����ؼ� ����ϱ�
		Bank customer3 = new Bank("Michael", "111-123-123123", 789, "2580");
		customer3.agree = true;
		//�� �ڵ尡 ������ ������ ���� ���ǰ� false�� ����
		
		customer3.info();
		System.out.println();
	}
}
