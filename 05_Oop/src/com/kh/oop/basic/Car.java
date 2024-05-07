package com.kh.oop.basic;

public class Car {
	// �ʵ�
	//-> ������ ������ �� ����ؾ� �� �ɼ�
	public String color; //���� ����
	public int speed; //���� �ӵ�
	public String door; //���� ����
	public String window; //â�� ����
	public String sunRoof; //������
	public String insurance; //����
	
	// ������ (�ʼ� �ɼ�)
	//-> ������ ������ �� �ʼ� �ɼ�
	/*
	�޼ҵ带 ��ų� �ʱ�ȭ�� ���� ���
	�����ڴ� Ŭ���� �̸��� �Ȱ��ƾ���
	������ �̸� = Ŭ���� �̸� = ���� ��
	*/
	
	public Car() {
		
	}
	
	/*
	public Car(���ڷ� ���� �� ����, ���ڷ� ���� �� �ӵ�) {
			
	}
	=> ����� �ӵ��� �ʼ��� ��
	=> this�� ���� color�� inputColor, speed�� inputSpeed�� �̾���
	=> �ʵ忡�� speed�� int�� ������������ inputSpeed�� int���� ��
	*/
	
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	
	// �޼���
	public void displayInfo() {
		System.out.println("�� ���� : ");
		System.out.println("Color : "+color);
		System.out.println("Speed : "+speed);
	}
	
	//���� �޼���
	public static void main(String[] args) {
		//Car�� �ִ� ������ �������ֱ�
		Car myCar = new Car();
		myCar.color = "������";
		System.out.println("���� �� ���� : "+myCar.color);
		
		//orderCar : ���忡�� ���� ������ �ϰ� �����̶� ���ǵ尡 ������ �� ��Ȳ
		Car orderCar = new Car("black", 60);
		orderCar.displayInfo();
		
		//storeCar : �ֹ� ���� white, ���ǵ� 100
		Car storeCar = new Car("white", 100);
		storeCar.displayInfo();
	}
}
