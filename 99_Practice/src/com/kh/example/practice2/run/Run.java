package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {
	//���� �޼���
	public static void main(String[] args) {
		//product ��ü ����
		Product product = new Product();
		
		//���� ���� : ���, ��� ����, ��� �귣��
		//product.pName = "���";
		product.setpName("���");
		product.setPrice(2000);
		product.setBrand("�������");
		product.information();
	}
}
