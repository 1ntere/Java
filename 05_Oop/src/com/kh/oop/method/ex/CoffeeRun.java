package com.kh.oop.method.ex;

public class CoffeeRun {

	public static void main(String[] args) {
		//Ŀ�ǘ� ��ü ����
		//�⺻ ������
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("�Ƹ޸�ī��");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		coffee1.makeCoffee();
		
		//�ʼ� ������
		CoffeeMaker coffee2 = new CoffeeMaker("��ī���ξƸ޸�ī��", 2,
				true);
		coffee2.makeCoffee();
	}
}
