package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		//���� ���� ��ü ����
		DrinkMaker dm1 = new DrinkMaker("���Ƽ", 300, 5);
		//���� ���� ��ü ����
		DrinkStore ds1 = new DrinkStore(dm1, "���� ������",
				"��xĿ��", false);
		ds1.orderDrink();
		
		DrinkMaker dm2 = new DrinkMaker("�Ƹ޸�ī��", 500, 1);
		DrinkStore ds2 = new DrinkStore(dm2, "���� ���ʱ�",
				"��x����x", true);
		ds2.orderDrink();
	}
}
