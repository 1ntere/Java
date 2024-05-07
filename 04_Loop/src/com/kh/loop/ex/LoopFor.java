package com.kh.loop.ex;

public class LoopFor {
	/*
	for �� : ���� ������ �ݺ��� ������ �� ����ϴ� ���
	Ư�� ������ �����ϴ� ���� {} �ڵ� ����� �ݺ��ؼ� ����
	�ݺ� Ƚ���� �����ϰ� ������ ��� ���� ���
	
	��뿹��
	
	for (�ʱ�� ; ���ǽ� ; ������) {
		������ ���� ��� �ݺ��ؼ� ����� �ڵ� ���
	}
	
	//for������ ������ ���� ������ for���� Ż��
	*/
	
	/*
	for-each ��
	�迭�̳� �ݺ� ������ ��� ���� ���� �ݺ������� �۾��� �� ����ϴ� ���� �ݺ���
	������ �ݺ��� ó������ ������ ��� �ݺ�
	
	��� ����
	
	for(�ڷ��� ������ ���� : �ݺ��ؼ� �����ְ��� �ϴ� ������) {
		//�����ϰ��� �ϴ� �۾� �ۼ�
		System.out.println(������ ������ �ۼ�);
	}
	*/
	
	public static void main(String[] args) {
		/*
		�� ���� �߻� 1
		int i = 1;
		for ( i ; i <= 2 ; i++ ) {
			System.out.println(i);
		}
		-----
		for ( ; ; ) �� ù��°;�� �ʱ���� ���̱� ������ i��� �ۼ��� ���� �� ����
		=====
		�� ���� �ذ� 1
		for (�ڷ��� ������ = ������ �ʱ���� ; ���� ; ������)���� �ۼ������ ��
		*/
		for (int i = 1 ; i <= 2 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("===== for�� 2�� =====");
		for (int a = 1; a <= 3; a++) {
			System.out.println("a�� �� : "+a);
			/*
			���� ��Ŀ����
			1. a = 1
			2. (a = 1) <= 3
			3. println(a);
			4. a++ (a = 2)
			5. (a = 2) <= 3
			6. println(a);
			7. a++ (a = 3)
			8. (a = 3) <= 3
			9. println(a);
			10. a++ (a = 4)
			11. (a = 4) <= 3 => false, ����
			*/
		}
			
		System.out.println("===== for�� 3�� =====");
		//int���� num=1�� �� ��
		//num�� ���� 1���� 5���� �������� ���
		for (int num = 1; num <= 5 ; num++) {
			System.out.println("num�� �� : "+num);
		}
		
		System.out.println("===== for�� 4�� =====");
		//1���� 10���� ¦���� ����غ���
		//int ���� num = 2�� �ֱ�
		for (int num = 2; num <= 10; num+=2) {
			System.out.println("num�� �� : "+num);
		}
		
		System.out.println("===== for�� 5�� =====");
		//for�� ������ 5�� ����ϱ�
		//���� ���� 5 ���� ǥ���ϱ�
		int dan = 5;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+"�� * "+i+" = "+(dan*i));
		}
		
		//�ǽ����� 6��
		System.out.println("===== for�� 6�� =====");
		//�����ܿ��� 3���� 9������ ����ϱ�
		int gugudan = 3;
		for (int i = 1; i<=9; i++) {
			System.out.println(gugudan+" * "+i+" = "+(gugudan*i));
		}

	}

}

