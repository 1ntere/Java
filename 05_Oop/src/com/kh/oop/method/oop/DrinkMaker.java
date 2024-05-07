package com.kh.oop.method.oop;

public class DrinkMaker {
	//�ʵ�
	private String 	drinkType;	//���� ����
	private int 	quantity;	//���� ��
	private int 	temp;		//�µ�
	//�޼���(Setter)
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	//�޼���(Getter)
	public String getDrinkType() {
		return drinkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTemp() {
		return temp;
	}
	//�޼���(�⺻)
	public DrinkMaker() {
		
	}
	//�޼���(�ʼ�)
	public DrinkMaker(String drinkType, int quantity,
			int temp) {
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}
	//�޼���(void)
	public void makeDrink() {
		System.out.println("���� ���� : "+drinkType);
		System.out.println("����  �� : "+quantity+"ml");
		System.out.println("---------------");
		if (temp < 5) {
			System.out.print("������ ");
		} else if (temp >= 5 && temp <= 10) {
			System.out.print("�������� ");
		} else {
			System.out.print("�߰ſ� ");
		}
		System.out.println("���� ���� �Ϸ�");
		System.out.println("===============");
	}
}
