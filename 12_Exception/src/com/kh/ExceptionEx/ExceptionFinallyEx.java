package com.kh.ExceptionEx;
/*
Exception���� try catch finally

try, ctrl + space	catch finally

try {
	���ܰ� �߻��� �� ������ �����Ű�� ���� �ڵ�;
} catch (Exception e) {
	���ܰ� ���ܼ� ����̳� �����ϴ� �ڵ�;
} finally {
	���� �߻��� ������� ������ �����ϴ� �ڵ�;
		�� ex. ��� ��ũ��, ���� �ݱ�, ���� ���� ���
}
*/

public class ExceptionFinallyEx {
	public static void main(String[] args) {
		try {
			int ��� = 10 / 0;
		} catch (Exception e) {
			System.out.println("0���� ������ �����ϴ�.");
		} finally {
			System.out.println("�ý��� ����");
		}
	}
}
