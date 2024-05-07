package com.kh.oop.method.ex;

public class Circle {
	//�ʵ�
	
	private double pi = 3.14;
	private int radius = 1;//radius = ������
	
	//Setter Getter
	public void setPi(double pi) {
		this.pi = pi;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getPi() {
		return pi;
	}
	public int getRadius() {
		return radius;
	}
	
	//�⺻ ������
	public Circle() {
		
	}
	
	//�޼���
	//1. incrementRadius()	//�������� 1�� �����ϱ�
	//2. getAreaOfCircle()	//���� ���� ���ϱ�
	//3. getSizeOfCircle()	//���� �ѷ� ���ϱ�
	
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		//������ �Ҽ��ڸ��� ������ ������ double
		double area = pi*radius*radius;
		System.out.println("���� ���� : "+area);
		/*sysout�� ���� ������ �ؿ��� ��.getAreaOfCircle();�� �Է��ص�
		���� ���̰� ����� �ȵ�*/
	}
	public void getSizeOfCircle() {
		//pi�� 3.14�̹Ƿ� �Ҽ��ڸ��� ������ ������ double
		double size = 2*pi*radius;
		System.out.println("���� �ѷ� : "+size);
		/*sysout�� ���� ������ �ؿ��� ��.getSizeOfCircle();�� �Է��ص�
		���� �ѷ��� ����� �ȵ�*/
	}
	
	//���� �޼��� ctrl + space
	public static void main(String[] args) {
		//�� ��ü ����
		Circle �� = new Circle();
		
		//1�� �����ϱ� ���� ���� �ѷ��� ���� ����ϱ�
		System.out.println("���� �ʱ� �ѷ��� ����");
		��.getSizeOfCircle();
		��.getAreaOfCircle();
		System.out.println("---------------");
		
		//���� �������� 1�� �����Ѵٸ� ?!
		��.incrementRadius(); //1�� ���� ũ�⸦ ������Ų��
		
		//������ �������� ���� �ѷ��� ���� ���
		System.out.println("������ 1 ���� �� ���� �ѷ��� ����");
		��.getSizeOfCircle();
		��.getAreaOfCircle();
		System.out.println("---------------");
	}
}
