package com.kh.oop.method;
	/*
	Setter
		��ü�� �Ӽ� ���� �����ϴ� �޼���
		��ü �ܺο��� �Ӽ� ���� ������ �� ����
	
	Getter
		��ü�� �Ӽ� ���� ��ȯ�ϴ� �޼���
		��ü �ܺο��� �Ӽ� ���� ���� �� ����
	
	�����
		���콺 ��Ŭ��>Source>Generate Getters and Setters ����
		
	����Ű
		alt + shift + s ���� �� Generate Getters and Setters ����
	 */

public class GetterSetter {
	//�ʵ�
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	Person ���1 = newPerson(2);
	���1�� ���̴� 0���� 2�� ��
	
	Person ���2 = new Person(3);
	���2�� ���̴� 0���� 3�̵�
	*/
	
	/*
	�����ڿ��� ������
	�����ڴ� ��ü�� �ʼ����� �����ؼ� �־��
	getter, setter�� �ϳ��� ���� �����ؼ� ����
	*/

	public static void main(String[] args) {
		
	}
}
