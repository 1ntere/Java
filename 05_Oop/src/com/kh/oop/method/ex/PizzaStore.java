package com.kh.oop.method.ex;

public class PizzaStore {
	//�ʵ�
	private String pizzaName; //���ڸ�
	private int pizzaPrice; //���ڰ���
	
	//setter �޼���
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	
	//getter �޼���
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	
	//�⺻ ������ �޼���
	public PizzaStore() {
		
	}
	
	//�ʼ� ������ �޼���
	public PizzaStore(String pizzaName, int pizzaPrice) {
			this.pizzaName = pizzaName;
			this.pizzaPrice = pizzaPrice;
	}
	
	//void �޼���
	public void inforPizza() {
		System.out.println("�����̸� : "+pizzaName);
		System.out.println("���ڰ��� : "+pizzaPrice);
		System.out.println("---------------");
	}
	
	//main �޼���
	public static void main(String[] args) {
		//pizza1
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("����δ� ����");
		pizza1.setPizzaPrice(11000);
		pizza1.inforPizza();
		
		//pizza2 : ���� ���� ���� ����
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("�������� ����");
		pizza2.inforPizza();
		
		//pizza3 : �ʼ� �����ڷ� ���� ����
		PizzaStore pizza3 = new PizzaStore("ġ�� ����", 10000);
		pizza3.inforPizza();
	}
}
