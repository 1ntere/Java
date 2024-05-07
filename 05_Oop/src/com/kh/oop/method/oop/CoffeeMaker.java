package com.kh.oop.method.oop;

//Ŀ�� �����
public class CoffeeMaker {
	//�ʵ�
	private String coffeeType; //Ŀ�� ����
	private int sugar; //���� ��
	private boolean milk; //���� ����
	
	//�޼���(Setter)
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//�޼���(Getter)
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		//getter : getMilk�� �ƴ϶� isMilk�� �ٲ�
		return milk;
	}
	//�޼���(�⺻)
	public CoffeeMaker() {
		
	}
	//�޼���(�ʼ�)
	public CoffeeMaker(String coffeeType, int sugar,
			boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	//�޼���(void)
	public void makeCoffee() {
		System.out.println("Ŀ�Ǹ� �����մϴ�.");
		System.out.println("���� : "+coffeeType);
		System.out.println("���� : "+sugar+" g");
		//���࿡ ������ �߰� �ƴٸ�
		if (milk) {
			System.out.println("���� �߰�");
		} else {
			System.out.println("���� ���߰�");
		}
		System.out.println("Ŀ�ǰ� �غ�Ǿ����ϴ�.");
		System.out.println("---------------");
	}
	/*
	//�޼���(main) - �������� �����ϰų� ����� �ڵ� �ۼ�
	public static void main(String[] args) {
		//�⺻ ������
		CoffeeShop coffee1 = new CoffeeShop();
		coffee1.setCoffeeType("�Ƹ޸�ī��");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		coffee1.makeCoffee();
		
		//�ʼ� ������
		CoffeeShop coffee2 = new CoffeeShop("��ī���ξƸ޸�ī��", 2,
			true);
		coffee2.makeCoffee();
	}
	*/
}
