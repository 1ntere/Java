package com.kh.ThreadEx;

//Thread Ŭ���� �������� �۾� ����
/*�����ܰ�����*/
public class ThreadEx2 extends Thread {
//�ʵ�
	int ��;
//�޼���
	//�ʼ� ������ : alt + shift + s -> o
	public ThreadEx2(int ��) {
		this.�� = ��;
	}
	//void run
	public void run() {
		System.out.println(this.�� + " ������ ���� ��~~");
		
		try {
			Thread.sleep(1000);
				//1�� ����̱� ������ ����ϴ� ���̿� ��ǻ�Ϳ��� ������ �߻��� �� �ֱ� ������
				//1�� ��⿡ try - catch ������ ���ܸ� �ɾ���
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.�� + " ������ ���� ��");
	}
}