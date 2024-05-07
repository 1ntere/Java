package com.kh.ThreadEx;
/*
process(���μ���) 	: program + success = ���α׷� ���� ���� => ���α׷� ���� ��
Thread(������) 	: ��
������� ��ǻ�Ϳ��� ������ �۾��� �����ϴ� ���� �ǹ�

2�� �̻��� �����带 ������ ���μ����� ��Ƽ������

�����带 �����ϴ� ���

1. Runnable �������̽� ���	: Ŭ���� �� ���� implements Runnable

2. Thread Ŭ���� ��ӹޱ�	: Ŭ���� �� ���� extends Thread
	�޼���� ������� �����带 ������ ���� start() ����ؾ� ������ �� ����
	�����忡�� ������ ��ǻ�� �ȿ��� �����尡 �����ǰ� ���۵Ǵ� ������ ���� �޶���
*/
public class ThreadEx extends Thread {
	public void run() {
		System.out.println("������ ���� ��");
		
		try {
			Thread.sleep(1000);
				//1�� ���� ���� (1000ms)
			
			System.out.println("1�� ��!");//1�� �Ŀ� "1�� ��!" ��� ��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}