package com.kh.oop.basic;

//����
public class Nation {
	/*�Ӽ� ��*/
	
	//�̸�; String name;
	//����; String age;
	//����; char gender;
	//�ֹι�ȣ; String jumin;
	
	public String name;
	public int age;
	public char gender;
	public String jumin;
	
	/*
	public�� ���� ������ �ڵ����� default
	ex) (default) String name;	
	=>
	String name;
	String age;
	char gender;
	String jumin;
	*/
	
	/* �޼��� ��� */
	public void speakKorean() {
		System.out.println("�����ٶ� �ѱ��� ����");
	}
	
	public void welfare() {
		System.out.println("���ѹα� ���� ������ ����");
	}
	
	//�� 19�� �̻� ���θ� ������ ���� ���
	public void �������ǹ�() {
		if (age>=19) {
			System.out.println(name + " ���� ���� ���� ������Դϴ�.");
		} else {
			System.out.println(name + " ���� �̼����ڷ� ���� ���� ����ڰ� �ƴմϴ�.");
			
		}
	}
}
