package com.kh.oop.method.ex;

public class Person {
	//�ʵ� (�̸�, ����)
	private String 	name;
	private int 	age;
	
	//Person ����� ���� �ʱ� ������
	public Person() {
		
	}
	
	//�ʵ� ��� ���� �����ϰ� �������� setter, getter ����
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//���θ޼���
	//����Ű main, ctrl + space, enter
	public static void main(String[] args) {
		Person person1 = new Person();
		
		//Setter�� Ȱ���ؼ� �Ӽ� �� ����
		person1.setName("ȫ�浿");
		person1.setAge(20);
		
		//Getter�� Ȱ���ؼ� �Ӽ� �� �б�
		System.out.println("�̸� : "+person1.getName());
		System.out.println("���� : "+person1.getAge());
	}
}
