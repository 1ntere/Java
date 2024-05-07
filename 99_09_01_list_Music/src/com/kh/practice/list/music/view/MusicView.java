package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;

public class MusicView {
	//��ĳ�ʷ� ���ϴ� ���� ���� ��ȣ�� �Է��ϱ�
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("=== ���� ���� ���α׷� ===");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			//��ȣ�� �Է¹��� ���� ������ֱ�
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				//������ ��ġ�� ���� �߰�
				addList();
				break;
			case 2:
				//ù��° ��ġ�� ���� �߰�
				addAtZero();
				break;
			case 3:
				//��ü �� ��� ���
				printAll();
				break;
			case 4:
				//Ư�� �� �˻�
				searchMusic();
				break;
			case 5:
				//Ư�� �� ����
				removeMusic();
				break;
			case 6:
				//Ư�� �� ���� (����) ����
				setMusic();
				break;
			case 7:
				//��� �������� ����
				//ascTitle();
				break;
			case 8:
				//������ �������� ����
				//descSinger();
				break;
			case 9:
				//���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �޴� �����Դϴ�.");
			}
		}
		
	}
	
	//���� �߰�
	public void addList() {
		System.out.print("��� �Է� : ");
		String title = sc.nextLine();
		
		System.out.print("������ �Է� : ");
		String singer = sc.nextLine();
		
		//��� ���� �����ϱ�
		mc.addList(title, singer);
	}
	
	//ù ��° ��ġ�� �ٷ� ���� �߰��ϱ�
	public void addAtZero() {
		System.out.println("��� �Է� : ");
		String title = sc.nextLine();
		
		System.out.println("������ �Է� : ");
		String singer = sc.nextLine();
		
		//������ �߰��ϴµ� �� �տ� �߰�
		mc.addAtZero(title, singer);
	}
	
	//��� ���� ��� ����ϱ�
	public void printAll() {
		System.out.println(mc.printAll());
	}
	
	//Ư�� �� �˻�
	public void searchMusic() {
		System.out.print("�˻��� ��� �Է� : ");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title));
	}
	
	//Ư�� �� ����
	public void removeMusic() {
		System.out.print("������ ��� �Է� : ");
		String title = sc.nextLine();
		System.out.println(mc.removeMusic(title));
	}
	
	//Ư�� �� ���� (����) ����
	public void setMusic() {
		System.out.print("������ ��� �Է� : ");
		String title = sc.nextLine();
		System.out.print("���ο� ������ �Է� : ");
		String singer = sc.nextLine();
		System.out.println(mc.setMusic(title, singer));
	}
	
	//�������� ����
	public void ascTitle() {
		mc.ascTitle();
		System.out.println("����� ������������ �����Ͽ����ϴ�.");
	}
	
	//�������� ����
	public void descSinger() {
		mc.descSinger();
		System.out.println("�������� ������������ �����Ͽ����ϴ�.");
	}
}