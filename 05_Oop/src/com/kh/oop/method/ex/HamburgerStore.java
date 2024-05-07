package com.kh.oop.method.ex;

public class HamburgerStore {
	//�ʵ� (�̸�, ����)
	private String name;
	private int price;
	//�޼��� (Setter)
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//�޼��� (Getter)
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	//�޼��� (�⺻)
	public HamburgerStore() {
		
	}
	//�޼��� (�ʼ�)
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//�޼��� (void)
	public void info() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+price);
		System.out.println("---------------");
	}
	//�޼��� (����)
	public static void main(String[] args) {
		//1. �⺻������ �Ұ����� 2000
		HamburgerStore hs1 = new HamburgerStore();
		hs1.setName("�Ұ�����");
		hs1.setPrice(2000);
		hs1.info();
		//2. �ʼ������� ġ����� 3000
		HamburgerStore hs2 = new HamburgerStore("ġ�����", 3000);
		hs2.info();
	}
}

