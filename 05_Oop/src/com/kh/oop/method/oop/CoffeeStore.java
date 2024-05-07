package com.kh.oop.method.oop;
//Ŀ�� ���� Ŭ����
//Ŀ�� ����� ������ �����ͼ� ������ ���Կ� Ŀ�� ����� ����� �ٸ��� �ۼ�
public class CoffeeStore {
	//�ʵ�
	private CoffeeMaker maker;//CoffeeMaker Ŭ������ ������
	private String storeName;//���� �̸�
	private String location;//���� ��ġ
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	//�޼���(Setter)
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//�޼���(Getter)
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	//�޼���(�⺻)
	public CoffeeStore() {
		
	}
	//�޼���(�ʼ�)
	public CoffeeStore(CoffeeMaker maker, String storeName,
			String location) {
		this.maker = maker;
		this.storeName = storeName;
		this.location = location;
	}
	//�޼���(void) - Ŀ�� �ֹ� �޼���
	public void orderCoffee() {
		System.out.println("���� : "+location);
		System.out.println(storeName + "�� �ֹ��� Ŀ�� ����");
		maker.makeCoffee();
	}
}
