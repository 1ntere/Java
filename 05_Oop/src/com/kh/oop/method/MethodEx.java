package com.kh.oop.method;

public class MethodEx {
	/*
	�޼���
	
	Ŭ���� ���ο� ����
	Ư�� ����� �����ϴ� �ڵ带 ��� ��Ÿ�� ��
	
	1. ���θ޼���
	�ڹ� ���α׷��� ������ �� ����ϴ� �޼���
	�ۼ��� �޼��峪 ������ ȣ���ؼ� �������� �����ϴ� �޼���
	
	��� ����
		public static void main(String[] args) {
			
		}
	main �̹Ƿ� public(�������� ��), static(������), void(��������� ��ȯ x)
	
	2. �����ڸ޼���
	�����ڴ� ���� �޼����� �̸��� �ٿ��� ��������� ������ �޼����� �� ����
	Ŭ���� ��� ���� ��� ������ ���� �����ؾ� ��
	
	3. void �޼���
	��ȯ�ϴ� ���� ���� �޼���
	�޼��尡 ������ ������ ���� �� � ���� ��ȯ���� ����
	
	��뿹��
		1) �Ű������� ���� void �޼���
		public void method1() {
			System.out.println("hi~");
		}
	
		2) �Ű������� �ִ� void �޼���
		public void method(�ڷ��� �Ű�����) {
			System.out.println("�Ű����� : "+�Ű�����);
		}
		
	4. return �޼���
	���� ��ȯ�ϴ� �޼���
	�޼��尡 ����Ǹ� ����� ��ȯ�ϰ�, �޼��带 ȣ���� ���� ��ȯ�� ���� ����
	
	��뿹��
		public �ڷ���	method(int a, int b) {
			return �ڷ����� �ش��ϴ� ���� ��;
		}
		
		1) return ���� String �� ��
		public String method(String str) {
			return str;
		}
		
		2) return ���� int �� ��
		public String method(int num) {
			int abc = num;
			return abc;
		}
		
		3) return ���� �ʵ忡 ���� �ְų� ���� ���� ���� ���� ��
		String str;
		
		public String method() {
			return str;
		}
	*/
	
	//�⺻ ������
	public MethodEx() {
		
	}
	
	//�޼���
	public void ������1(int a, int b) {
		int ���ǰ�� = a + b;
		System.out.println("���� ���� "+���ǰ��+" �Դϴ�.");
	}
		
	
	public int ������2(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		MethodEx met = new MethodEx();
		
		met.������1(5, 3);
		
		
		//������2�� ����� �ϰ� ����� ���� ������ ������ �־
		//���� ��±��� �����ؾ� ��
		int ��� = met.������2(6, 4);
		System.out.println("����� : "+���);
	}
}
