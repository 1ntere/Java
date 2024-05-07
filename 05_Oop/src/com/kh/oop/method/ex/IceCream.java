package com.kh.oop.method.ex;

public class IceCream {
	//�ʵ�
	private String name;
	private int sugar;
	private boolean milk;
	//�޼���(Setter)
	public void setName(String name) {
		this.name = name;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//�޼���(Getter)
	public String getName() {
		return name;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	//�޼���(�⺻)
	public IceCream() {
		
	}
	//�޼���(�ʼ�)
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
	//�޼���(void)
	public void makeIceCream() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+sugar+" g");
		if (milk) {
			System.out.println("���� �߰�");
		} else {
			System.out.println("���� ���߰�");
		}
		System.out.println("---------------");
	}
	/*
	//�޼���(main)
	public static void main(String[] args) {
		System.out.println("=== ���̽�ũ�� ����� ===");
		
		IceCream icecream1 = new IceCream();
		icecream1.setName("�ٴҶ�");
		icecream1.setSugar(10);
		icecream1.setMilk(true);
		icecream1.makeIceCream();
		
		IceCream icecream2 = new IceCream("����", 5, true);
		icecream2.makeIceCream();
	}
	*/
}
