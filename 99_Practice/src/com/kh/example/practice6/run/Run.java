package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		//book1 å ���� �Է� �� ���
		Book book1 = new Book();
		book1.title = "�װ��� �˰� �ʹ�.";
		book1.publisher = "SB��";
		book1.author = "������";
		book1.inform();
		
		//book2 å ���� �ʼ� �����ڿ��� title, publisher, author ���
		Book book2 = new Book("�ظ�����", "���Ф���", "J.K.�Ѹ�");
		book2.inform();
		
		//book3 ��� �ԷµǾ��ִ� �ʼ� ������ �̿��ؼ� ���
		Book book3 = new Book("���ΰ� �ٴ�", "���ӴϽ���",
				"��ֿ���", 11250, 0.1);
		book3.inform();
	}
}
