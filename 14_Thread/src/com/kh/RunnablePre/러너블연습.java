package com.kh.RunnablePre;

public class ���ʺ��� implements Runnable {
//�ʵ�
	int ��;
//�޼���
	//������ - �ʼ�
	public ���ʺ���(int ��) {
		super();
		this.�� = ��;
	}
	//void run() - sleep 1�� try-catch this.�� "������ ����" "������ ����"
	@Override
	//Runnable �������̽����� run() �� �ݵ�� �ۼ������ �ϴ� �޼���
	public void run() {
		System.out.println(this.�� + " ������ ����");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.�� + " ������ ����");
	}
}
