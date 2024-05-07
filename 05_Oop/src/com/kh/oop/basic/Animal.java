package com.kh.oop.basic;

public class Animal {
	//1. �ʵ� (�̸� name, ���� age)
	public String name;
	public int age;
	
	//2. �ʱ������
	public Animal() {
		
	}
	
	//3. �ʼ� ������
	public Animal(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	//4. ��¸޼���
	public void info() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
	
	//5. ���θ޼���
	public static void main(String[] args) {
		//1)�ʱ������
		//�������� �̸�, ����
		//������ ���� ���
		Animal dog = new Animal();
		dog.name = "�۸���";
		dog.age = 2;
		dog.info();
		
		//2)�ʼ�������
		//�����, 3
		//����� ���� ���
		Animal cat = new Animal("�����", 3);
		cat.info();
	}
}
