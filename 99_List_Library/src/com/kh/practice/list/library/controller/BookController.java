package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> list = new ArrayList<>();
//�޼���
	//������ (�⺻)
	public BookController() {
		
	}
	//å �߰��ϱ� 
	public void insertBook(Book bk) {
		 list.add(bk);
	}
	//å ��ü����
	public void selectList() {
		//���࿡ å�� ���ٸ� ��ϵ� ������ �����ϴ�.
		if(list.isEmpty()) {
			System.out.println("��ϵ� ������ �����ϴ�.");
		} else {//å�� �ִٸ� å ����� ��������
			//for - each �� : ��ü����
			for(Book b : list) {
				System.out.println(b.toString());
			}
		}
	}
	//Ű����� å �˻��ϱ�
	public void searchBook(String keyword) {
		List<Book> �˻���� = new ArrayList<>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				�˻����.add(b);
			}
		}
		if(�˻����.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(Book bb : �˻����) {
				System.out.println(bb);
			}
		}
	}
	//���� ���� ��� �߰�
	public void deleteBook(String title, String author) {
		//true false�� ���� ������ �ƴ��� �ȵƴ��� Ȯ���� �� �ֵ��� ��
		boolean removed = false;//false
			//boolean�� false���� �⺻�̱� ������ ���� removed = false;
		//å ����� ���ڸ� �˻��ؼ� ������ å ã��
		//��ü��� for-each
		for (Book bbb : list) {
			//���࿡ ���� �����ϰ��� �ϴ� å ����� å ���ڰ� �����Ѵٸ�
			//å����������.���ϱ�(���������ϰ����ϴ�å����) && å���ڰ�������.���ϱ�(���������ϰ����ϴ�å����) 
			if (bbb.getTitle().equals(title) && bbb.getAuthor().equals(author)) {
				list.remove(bbb);
				//������ �Ǿ����� true
				removed = true;
				break;//if�� ������
			}
		}
		//���࿡ ������ �Ǿ��ٸ� �����ƴٸ� true�� false�� �̿��ؼ� ǥ���ϱ�
		if (removed) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�ش��ϴ� ������ ã�� �� �����ϴ�.");
		}
	}
	//�������� ����
	public void ascBook() {
		//1. for���̳� while���� ����Ͽ� short - �������� ������ ���ָ� ��
			//���ڵ尡 �ʹ� ������� ������ 2�� ����� ���
		//2. Collections.sort - ����� �������� �����ϴ�
							// �����ϴ� ����			å���� å����
							     // :: = Book ������ getTitle �����ؼ� ����ϰڴ�.
										//comparing ���ϴ�
		Collections.sort(list, Comparator.comparing(null));
	}
}