package com.kh.javaAPIEx;
/*
Object : ��� �ڹ� Ŭ������ �ֻ��� Ŭ����
		 ��� Ŭ������ �⺻���� ��ӹ޴� Ŭ����
		 Object Ŭ������ �⺻���� ����Ѵٴ� ������ �ֱ� ������
		 ���� new Object�� �ҷ��ͼ� ������� ����
		 �⺻���� ��� Ŭ������ Object�� �⺻���� �� �� �ְ� �������
		 ��ǥ �޼��� : equals toString
*/
public class ObjectEx {
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Object���� ���� �������� �޼����Դϴ�.";
	}
	
	public static void main(String[] args) {
		//Object�� �⺻�̱� ������ ���� new�� ����ؼ� ���� �������� ����
		//�׷��� �׷��ٰ� �ؼ� ���� �� ���� ���� �ƴ�
		
		//Object ���� ���콺�� �ø��� ����� ȭ�� ���� �ִ� @���� �ִ� ���������� ������
		//Object ���Ϸ� �̵��ؼ� �� �� ����
		Object ������Ʈ = new Object();
		
		System.out.println(������Ʈ);//java.lang.Object@5e91993f
	}
}
