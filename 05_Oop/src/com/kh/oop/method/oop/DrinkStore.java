package com.kh.oop.method.oop;

public class DrinkStore {
	//�ʵ�
	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeout;
	//�޼���(Setter)
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLoaction(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	//�޼���(Getter)
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}
	//�޼���(�⺻)
	public DrinkStore() {
		
	}
	//�޼���(�ʼ�)
	public DrinkStore(DrinkMaker maker, String location,
			String name, boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this.takeout = takeout;
	}
	//�޼���(void)
	public void orderDrink() {
		System.out.println("=== ���� �ֹ��� ===");
		System.out.println(location+"�� "+name+"���� �ֹ��� ����");
		if (takeout) {
			System.out.println("����ũ �ƿ� �ֹ�");
		} else {
			System.out.println("���� �� ����");
		}
		maker.makeDrink();
	}
}
