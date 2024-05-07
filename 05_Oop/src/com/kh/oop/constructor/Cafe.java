package com.kh.oop.constructor;

public class Cafe {
	//�ʵ� ����
	public String 	name;
	public String 	location;
	public int 		tableNum;
	
	//�⺻ ������
	public Cafe() {
		
	}
	
	//�ʼ� ������
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	//void �޼��� �����
	public void cafeInfo() {
		//ī�� �̸� ���� ���̺� �� ����ϱ�
		System.out.println("ī�� �̸� : "+name);
		System.out.println("ī�� ���� : "+location);
		System.out.println("���̺� �� : "+tableNum);
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���. ������ �Τ��Դϴ�.");
		System.out.println("=== ī�� ��ȸ�ϱ� ===");
		
		/*Cafe ��ü�� ����ؼ�
		//1. �⺻�����ڷ� cafe1 : �̸�, ���̺� �ۼ��ϰ� ����ϱ�
		//2. �⺻�����ڷ� cafe2 : ����, ���̺� �ۼ��ϰ� ����ϱ�
		//3. �ʼ������ڷ� cafe3 : �ʼ��� ������ ���� ����ϱ�*/
		Cafe cafe1 = new Cafe();
		cafe1.name = "��Ÿ����";
		cafe1.tableNum = 10;
		cafe1.cafeInfo();

		Cafe cafe2 = new Cafe();
		cafe2.location = "����� ������";
		cafe2.tableNum = 15;
		cafe2.cafeInfo();
		
		Cafe cafe3 = new Cafe("�����÷��̤�", "����� ������", 20);
		cafe3.cafeInfo();
	}
}
