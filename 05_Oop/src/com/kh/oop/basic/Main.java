package com.kh.oop.basic;

public class Main {
	
	//������ (�ʼ��� ���� �־�� �ϰų� �Ǵ� �ʱ⿡ ���� ������ �����ϴ� �޼���)
	public Main() {
		
	}
	
	//���� ���� ���� �߿��� ���������� ����� ���ϸ� ����
	public static void main(String[] args) {
		
		//practice2();
		/*
		�� �����߻�
		practice2(); �� �ۼ��ϸ� ������ ��
		-----
		static void practice2()�� �ƴ� void practice2()�� �ۼ��߱� ������ �Ͼ ����
		������ �޸� ������ �������� �־�� �ϱ� ����
		=====
		�� �ذ� ��� 1
		public static void practice2() {} �� �ڵ带 �ۼ�������
		���� �޼��� �Ʒ����� practice2(); ��� ���� �� ������ ���� ����
		�� �ذ� ��� 2
		Main main = new Main();
		main.practice2();
		*/
		
		Main main = new Main();
		main.practice2();
		
		//main.practice1();
	}
	
	public void practice1() {
		//��Ű Ŭ������ ��ü ���� => new�� �̿��Ͽ� ������ ����
		��Ű myCookie = new ��Ű();
		
		//��ü�� �Ӽ� ����
		//��Ű�� ũ��� ����� ����
		myCookie.size = "����";
		myCookie.shape = "���׶��";
		
		//��Ű�� ���� ���� ���
		System.out.println("��Ű�� ũ�� : "+myCookie.size);
		System.out.println("��Ű�� ��� : "+myCookie.shape);
		
		��Ű ī���Ǹſ���Ű = new ��Ű();
		ī���Ǹſ���Ű.size = "�ƴ���";
		ī���Ǹſ���Ű.shape = "�����";
		
		System.out.println("��Ű�� ũ�� : "+ī���Ǹſ���Ű.size);
		System.out.println("��Ű�� ��� : "+ī���Ǹſ���Ű.shape);
	}
	
	public void practice2() {
		/*
		Main ���� ���� �޼��忡
		�̸� ���� ���� �ֹι�ȣ�� �Է��ϰ�
		�̸� : ȫ�浿
		���� : 55��
		���� : F
		�ֹι�ȣ : 550101-2345678;		
		����� ����
		speakKorean �޼��� ����ϱ�
		*/
		
		//Nation ��ü ����
		Nation ���� = new Nation();
		
		//��ü�� �Ӽ� ����
		//�̸�, ����, ����, �ֹι�ȣ�� ����
		����.name = "ȫ�浿";
		����.age = 55;
		����.gender = 'M';//char �� '' ���� ����ǥ ����ϱ�
		����.jumin = "550101-2345678";
		
		//����ϱ�
		System.out.println("�̸� : "+����.name);
		System.out.println("���� : "+����.age);
		System.out.println("���� : "+����.gender);
		System.out.println("�ֹι�ȣ : "+����.jumin);
		
		//speakKorean �޼��� ����ϱ�
		����.speakKorean();
		����.welfare();
		
		Nation ����2 = new Nation();
		����2.name = "��¯��";
		����2.age = 5;
		����2.gender = 'F';
		System.out.println("�̸� : "+����2.name);
		System.out.println("���� : "+����2.age);
		System.out.println("���� : "+����2.gender);
		
		//ȫ�浿 ��¯�� ������ �ǹ�
		����.�������ǹ�();
		����2.�������ǹ�();
		
	}
	
	


}
