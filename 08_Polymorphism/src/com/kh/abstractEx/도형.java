package com.kh.abstractEx;
/*
abstract class (�߻� Ŭ����)
�߻� (abstract) : ���� ���� �� �� ��
�߻� �޼��带 �����ϰ� �ִ� Ŭ����
�̿ϼ� Ŭ�����̱� ������
��ǻ�Ϳ� �߻� Ŭ������ ���� ������ ��ü ������ ����� ���� �Ұ���

��뿹��
	//[����������] = public / private / protected / default
	[����������] abstract class ���ϸ� {
		//�ʵ� & �޼���
		//�̿ϼ� �޼����̱� ������ �ʵ尡 �ʼ��� �ƴ�
		[����������] abstract �ڷ��� ������();
	}
*/
public abstract class ���� {//�߻�Ŭ����(�θ� Ŭ����)
//������ public class ����{}
//�ʵ�
	private String ����;
	//�̿ϼ� �޼����̱� ������ �ʵ尡 �ʼ��� �ƴ�
	
//�޼���
//Setter�� Getter �����ϰ� ������ �̿ϼ� (abstract)
//���߿� ���赵�� �ϼ��� ����(�ڽ� Ŭ����)���� �ʼ��� �ҷ�����ϴ� �޼����
	//Setter
	public void set����(String ����) {
		this.���� = ����;
	}
	//Getter
	public String get����() {
		return ����;
	}
	//������ (�ʼ�)
	public ���� (String ����) {
		this.���� = ����;
	}
	//abstract
	/*
	abstract �޼���� �̿ϼ� �޼����̱� ������
	�ڽ�Ŭ�������� �̿ϼ��� �θ�Ŭ������ �ϼ������ֱ� ���ؼ�
	�ڽ��� �θ� �ҷ��� �� abstract�� ��쿡��
	�ڽĿ��� �ʼ��� �ҷ��� ���� �޼��� ����� �ϼ��ؾ� ��
	*/
	public abstract double ��������();
	
	public abstract double �����ѷ�();
	
	public void �������() {
		System.out.println("�� ������ ���̰� " + ��������()
			+ "�̰� �ѷ��� " + �����ѷ�() + "�Դϴ�.");
	}
}
