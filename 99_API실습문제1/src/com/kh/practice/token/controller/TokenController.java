package com.kh.practice.token.controller;

public class TokenController {
//�޼���
	//������(�⺻)
	public TokenController() {
		
	}
	//void - �Էµ� ���ڿ��� ù ���ڸ� �빮�ڷ� ��ȯ �� ��ȯ
	//���� ��� "java"��� ���ڿ��� �ԷµǸ� �ڵ����� Java�� ����ǰ� �������
	//subString(ó�������ϴ��ε�����,�������ε�����)
	//subString(ó�������ϴ��ε�����) -> ���� ���ϴ� ���ں��� ������ ����
	//toUpperCase -> ���ڸ� ��� �빮�ڷ� �����ϴ� ��
	
	
	public String firstCap(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(1);
		//ù��° ���ڴ� �빮�ڷ� ������ְ�, 2��° ���ں��ʹ� �ٿ��� return
	}
	public int firstChar(String input, char one) {
		
	}
}
