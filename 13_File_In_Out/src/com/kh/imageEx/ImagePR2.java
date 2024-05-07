package com.kh.imageEx;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class ImagePR2 {
//����ȭ�鿡 �̹�������/�����̸�.txt ���� ������� ��
	//�����̸� �� ������ ���� �䳢 ȣ���� �̸��� \n �̿��ؼ� ������ְ�
	//�����̸�.txt ����� �� ������
	//�����ϴµ����̸�.txt �� ���� �̸� ������ ���� �����ϱ�
	public static void main(String[] args) throws Exception {
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		
		//���� �����
		File ���� = new File(����ȭ���� + "/�̹�������");
		����.mkdirs();
		System.out.println(����.getName() + " ���� ���� �Ϸ�!");
		
		//���� �����
		File ���� = new File(���� + "/�����̸�.txt");
		����.createNewFile();
		System.out.println(����.getName() + " ���� ���� �Ϸ�!");
		
		//animal List�����
		ArrayList<String> animal = new ArrayList<>(Arrays.asList("��", "������", "����", "�䳢", "ȣ����"));
		
		//write �ϱ�
		for (int i = 0; i < animal.size(); i++) {
			if (i == 0) {
				FileWriter �۾��� = new FileWriter(����);
				�۾���.write(animal.get(i) + "\n");
				�۾���.close();
				System.out.println(i + "�� ���� �ۼ� �Ϸ�");
			} else if (i > 0 && i < animal.size()) {
				FileWriter �۾��� = new FileWriter(����, true);
				�۾���.write(animal.get(i) + "\n");
				�۾���.close();
				System.out.println(i + "�� ���� �ۼ� �Ϸ�");
			}
		}
		System.out.println("��� ���� �ۼ� �Ϸ�");
		
		//���� �̸� �����ϱ�
		File ���ο��̸� = new File(����ȭ���� + "/�����ϴµ����̸�.txt");
		if (����.exists()) {
			//���࿡ ���� �̸��� ���������� �����ߴٸ�
			if (����.renameTo(���ο��̸�)) {
				System.out.println("���� �̸��� ���������� ����Ǿ����ϴ�.");
			} else {
				System.out.println("���� �̸� ���濡 �����߽��ϴ�.");
			}
		} else {
			System.out.println("���� �̸��� �������� �ʽ��ϴ�. ������ּ���^^.");
		}
		
		
		//�����ϱ�
			//��Ŀ���� : ���� �����ϰ� ���� ����
			//���� : ���� ������ �� �� �����ȿ� ������ �����Ѵٸ� ������ ���� ���� ����
		//�׻� ���� �ȿ� ������ �����ϴ��� Ȯ���ϰ� ���� �ȿ� ������ �ϳ��� �������� �ʴ´ٸ� �����ؾ���
		//�迭�� �̿��ؼ� ���� ����� �ް� ���� ����� ���ٸ� ����
		File[] ���ϸ�� = ����.listFiles();
		System.out.println("���� �ȿ� �ִ� ���� ��� : " + ���ϸ��);
		for (File f : ���ϸ��) {
			System.out.println(f.getName());
		}
		
		���ο��̸�.delete();
		System.out.println("������ ���������� �����Ͽ����ϴ�.");
		
		if (����.delete()) {
			System.out.println("������ ���������� �����Ͽ����ϴ�.");
		} else {
			//���࿡ ������ �����ְų� ������̸� ������ �� ��
			//���� �ȿ� ������ ������ ���� ��� - ���� ���� ����
			System.out.println("���� ������ �����߽��ϴ�.");
		}
	}
}