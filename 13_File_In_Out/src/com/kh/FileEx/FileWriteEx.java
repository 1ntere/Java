package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter : ���Ͽ� ���ڸ� ���� ���� ��ü
	������ ���ٸ� ������ �����ϰ� ���Ͽ� �����͸� �ٷ� �� �� ����

�޼���
	write() : �ۼ��ϰ� ���� ������ ���� �ȿ� �ۼ�
	flush() : ��Ʈ���� ���� ��� �����͸� ��� (��� �ۼ��� ������)
	�ڡڡڡڡڡ�
*/
public class FileWriteEx {
	public static void main(String[] args) {
		try {
			//���� �̸� �տ� �ּҰ� ������ ���� �ڹ� �ڵ带 �ۼ��ϴ� ������Ʈ �ٷ� �Ʒ��� ������
			//�ڵ� ���� �Ŀ� �ٷ� ������ ���� �ʹٸ� ������Ʈ ��Ŭ�� refresh 
										//   "���ϸ�.Ȯ����"
											//			, true�� ���̸� �̾ �ۼ�
			FileWriter �۾��� = new FileWriter("��������.txt"/*,true*/);
			
			//���Ͽ� ���ھ���
			�۾���.write("�ȳ��ϼ���. ȯ���մϴ�.");
			
			�۾���.close();
			
			System.out.println("�۾���Ϸ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}