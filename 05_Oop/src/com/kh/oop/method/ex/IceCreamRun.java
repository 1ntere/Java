package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		System.out.println("=== ���̽�ũ�� ����� ===");
		
		IceCream icecream1 = new IceCream();
		icecream1.setName("��x��");
		icecream1.setSugar(13);
		icecream1.setMilk(true);
		icecream1.makeIceCream();
		
		IceCream icecream2 = new IceCream("��x��", 11, true);
		icecream2.makeIceCream();
	}
}