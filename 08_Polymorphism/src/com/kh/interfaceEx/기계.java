package com.kh.interfaceEx;

/*
interface : Ŭ���� ���� ������ ����� �뵵

//�ʵ�
�ʵ忡 �ۼ��ϴ� ��� ������
	public static final�� �ۼ��� ��
	���� �տ� public static final�� ������ �ʾƵ�
	�˾Ƽ� �پ �������

//�޼���
�޼��忡 �ۼ��ϴ� ��� �޼��� �տ�
	public abstract�� �˾Ƽ� �پ �������
	
Question 	: �׷��ٸ� �������̽��� �� public static final�� public abstract�� ������?
Answer 		: �������̽��� �ڹٿ��� �ٸ� Ŭ�������� ������ �޼����� ���� �����ϴ� ������ ��
			  �������̽��� �ۼ��Ǵ� �ʵ�� �޼���� �ٸ� Ŭ�������� ������ ���� ����ϴ� ��
			  '���� �ִ� �ʵ� ���� �����̰� ������ ����������, �޼���� �˾Ƽ� ��������' �� ���� 
*/
public interface ��� {
//���ݱ��� public class ��� {}�� �������
//�����ܵ� �ٲ�
//public interface ��� {}

//�ʵ�
	//(public static final)�� �ڵ����� ������ ����
	int ��Ʈ = 220;
		//public static final int ��Ʈ = 220; �� ����
	
//�޼���
//�������̽��� �߻�޼��常 �ۼ��� ����
	//(public abstract)�� �ڵ����� ������ ����
	public abstract void �����ѱ�();
		//void �����ѱ�(); �� ����
	void ��������();
		//public abstract void ��������(); �� ����
}
