package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {
//�޼���
	//�⺻ ������
	public FilePre() {
		
	}
	//void
	public void �޼���1() {
		File �ؽ�Ʈ���� = new File("C:/Users/user1/Desktop/newFFF/���ϻ���.txt");
		
		if (�ؽ�Ʈ����.exists()) {
			System.out.println("������ �����մϴ�.");
		} else {//�������� �ʴ´ٸ� ���ο� ���� �����
			//���࿡ ���� ����� ����!
			try {
				�ؽ�Ʈ����.createNewFile();
				System.out.println(�ؽ�Ʈ����.getName() + "������ �����Ǿ����ϴ�.");
			} catch (IOException e) {
				System.out.println("���� ����� �����߽��ϴ�.");
				e.printStackTrace();
			}
		}
	}
	//void
	public void �޼���2() {
		//����ȭ�鿡 ��������� ���� �����ϰ� ������ �ȿ� ���ϻ���.txt ���� �����
		//����ȭ�� ��θ� �����ϴ� ���
		//								 "C:/Users/user1" + "/Desktop"
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		System.out.println(����ȭ����);
		
		String ������� = "C:/Users/user1/Desktop/������";
		File ���ο���������� = new File(�������);
		File ���ο��ؽ�Ʈ���� = new File(�������+"/���ϻ���.txt");
		
		if (���ο����������.exists()) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
			���ο����������.mkdir();
			System.out.println("���� ���� ����� ����!");
			System.out.println(���ο����������.getName());
			System.out.println(���ο����������.getPath());
			
			
			if (���ο��ؽ�Ʈ����.exists()) {
				System.out.println("������ �����մϴ�.");
			} else {
				try {
					���ο��ؽ�Ʈ����.createNewFile();
					System.out.println(���ο��ؽ�Ʈ����.getName() + " ������ �����Ǿ����ϴ�.");
				} catch (IOException e) {
					System.out.println("���� ������ �����߽��ϴ�.");
					e.printStackTrace();
				}
			}
		}
	}
	
	public void �޼���3() {
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		
		//��� ���� ����
		File ������ = new File(����ȭ���� + "/��1/��2/��3");
		
		������.mkdirs();
		
		//���� ����
		File ���� = new File(������ + "/���ο�����.txt");
		
		try {
			boolean ���ϻ���Ȯ�� = ����.createNewFile();
			System.out.println("������ ���� �Ǿ�����? : "+���ϻ���Ȯ��);
			
			//���� ũ�� Ȯ��
			System.out.println(����.length());//0
				//���Ͽ� �ƹ��͵� �Ⱦ����ֱ� ����
			
			//���� ������ ������ Ȯ��
			System.out.println(����.lastModified());
			
			//���� ����
			����.delete();
				//������ ���� ����(���ο�����.txt)�� ������
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void �޼���4() {
		//���� �̸� �����ϱ�
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		File �ؽ�Ʈ���� = new File(����ȭ���� + "/newFFF/���ϻ����̸��ٲٱ�.txt");
		try {
			�ؽ�Ʈ����.createNewFile();
			System.out.println("������ �����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void �޼���5() {
		//���� �̸� �����ϱ�
		String ����ȭ���� = System.getProperty("user.home") + "/Desktop";
		File �ؽ�Ʈ���� = new File(����ȭ���� + "/newFFF/���ϻ����̸��ٲٱ�.txt");
		File ���ο��̸� = new File(����ȭ���� + "/newFFF/������̸�.txt");
		
		//���� �̸� �����ϱ�
		//���࿡ ������ ������ �Ϳ� -> ���� �̸� ���� �������� ������ ���� x
		if (�ؽ�Ʈ����.exists()) {
			//���࿡ ���� �̸��� ���������� �����ߴٸ�
			if (�ؽ�Ʈ����.renameTo(���ο��̸�)) {
				System.out.println("���� �̸��� ���������� ����Ǿ����ϴ�.");
			} else {
				System.out.println("���� �̸� ���濡 �����߽��ϴ�.");
			}
		} else {
			System.out.println("���� �̸��� �������� �ʽ��ϴ�. ������ּ���^^.");
		}
	}
	
	//���� �޼���
	public static void main(String[] args) {
		FilePre ���� = new FilePre();
		//����.�޼���1();
		//����.�޼���2();
		//����.�޼���3();
		//����.�޼���4();
		����.�޼���5();
	}
}