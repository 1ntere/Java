package com.kh.FileEx;

import java.io.File;

/*
File
	�����̳� / ����(���丮)�� �����ϴ� Ŭ����
	���� ����, ����, �̸�, ũ��, ������ ������, ���翩�� ���� ����� ����
�޼���
	boolean mkdir()			: ���� ����
	boolean mkdirs()		: ��η� �������� ��� ���� ����
							  ex) com.khc.FileEx�ϸ� �ѹ��� ���� ���� ������ ������
	boolean createNewFile()	: ���� ����
	boolean delete			: �����̳� ���� ����
	String getName()		: ���� �̸��� �����ͼ� ������
	String parent()			: ������ ����� ������ �˷���
	String getPath()		: ���� ��ü ��� Ȯ��
	boolean isFile()		: ���� File ��ü�� �����ϴ°� �����̸� true
	boolean isDirectory()	: ���� File ��ü�� �����ϴ°� �����̸� true
	boolean exists()		: �����̳� ������ �����Ѵٸ� true, ���ٸ� false
	long length() 			: ���� ũ�� �˷���
	long lastModified()		: ���� ������ ������ �˷���
	String[] list			: ���� �� ���� ����� String[] �迭�� ������
	File[] listFiles()		: ���� �� ���� ����� File[] �迭�� ������

�� �߿��� �߿��� ��
	write(), close(), exists(), mkdir()
*/

/*
[������ ���]

OS : ��ǻ�Ͱ� ���������� �ƺ����� ���������� ��Ÿ���� �ü��

OS�� ���� ������ �θ��� �̸��� �ٸ�
	������	��	������ �ƺ�
	����		��	���丮
			��
- ��� ǥ�� ���(���� ��ġ ǥ�õ� �ణ �ٸ�
	\		��	/
- java ���� /, \ ���� ���� ��� ��η� ǥ�� �����ϰ� ������ �Ǿ� ����

	�� ���� ��� : "C:/" ���� �����ؼ� ��� �ۼ����ִ� ���
	��
�ڰ��	�� 
	��
	�� ��� ��� : ���� ��ġ�� ������ ���� �������� ������ �ۼ����ִ� ��
				./	: ���� �� ���� ��ġ�� ��Ÿ��
				../	: ���� �� �������� �� �ܰ� �� ���������� �̵��ϴ� ���� �ǹ�
*/

public class FileEx {
	public static void main(String[] args) {
		//		C:/Users/user1/Desktop ����ȭ�鿡 ���� �����
		
		File ��������� = new File("C:/Users/user1/Desktop/newFFF");
		
		//����ȭ�鿡 newFFF ��� ������ �����ϴ��� Ȯ��
		System.out.println("�����մϱ�? : " + ���������.exists());
		
		//���࿡ ������ �����Ѵٸ� ������ �̹� ����ȭ�鿡 �����մϴ�. ��� ����ϰ�
		//�������� �ʴ´ٸ� ������ �������� �ʽ��ϴ�. ����ϰ� ���� ������ֱ�
		if (���������.exists()) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			//���� ����
			System.out.println("������ �������� �ʽ��ϴ�.");
			���������.mkdir();
			System.out.println("���� ���� ����� ����!");
			System.out.println(���������.getName());//���� �̸� Ȯ��
			System.out.println(���������.getPath());//���� �ּ� Ȯ��
		}
	}
}