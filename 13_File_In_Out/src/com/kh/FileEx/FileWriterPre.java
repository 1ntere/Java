package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre {
	public static void main(String[] args) {
		//Hello World.txt ���Ͽ� ���� �ڹٰ� �ʹ� ��մ� ��� ������ �ۼ��ϰ�
		//������ �����ϱ�
		//��ο���忡 �ڹٴ� �������� ��մ�. ��� ���� �̾��
		String ��ο���� = "Hello World.txt";
		try {
			FileWriter �۾��� = new FileWriter(��ο����, true);
				//���� �ڵ� ���� ���� ,true�� �߰����ְ� "����"�� �ٲ� ����
				//�ٽ� �������ָ� �ش� ���Ͽ� �ٷ� �̾ �ۼ�����
				//��� �����ϸ� ������ ��ŭ �ۼ�����
			String ���� = "\n���� �ڹٰ� �ʹ� ��մ�.";
			�۾���.write(����);
			�۾���.close();
			System.out.println("�۾��� �Ϸ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}