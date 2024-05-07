package com.kh.oop.basic;

public class Student {
	//�ʵ�
	public String name;
	public int age;
	public int grade;
	
	//�л��ε� �л��� �̸��� ���̿� �г�
	public Student() {
		
	}

	//������ �޼��� (�ʼ��� �ۼ��ؾ��ϴ� ������ �޼��� �����)
	//�ʼ��� �Է��ؾ� �ϴ� �� : �̸�, ����, �г�
	public Student(String inputName, int inputAge, int inputGrade) {
		this.name = inputName;
		this.age = inputAge;
		this.grade = inputGrade;
	}
	
	//��� �޼���(���� ��� �޼���)
	public void info() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�г� : "+grade);
	}
	
	//���� ���� �޼���
	//�л� ��ü �����ϱ�
	//Student student1 ��ö��, 18, 3
	//Student student2 �迵��, 20, 2
	public static void main(String[] args) {
		Student student1 = new Student("��ö��",18,3);
		Student student2 = new Student("�迵��",20,2);
		student1.info();
		student2.info();
		
		/* �Ʒ��� �´� �ڵ�
		Student student1 = new Student();
		
		student1.name = "��ö��";
		student1.age = 18;
		student1.grade = 3;
		Student student2 = new Student();
		student2.name = "�迵��";
		student2.age = 20;
		student2.grade = 2;
		
		student1.info();
		student2.info();
		*/
	}
	
}
