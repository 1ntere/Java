package com.kh.interfaceEx;

public class ���л����� implements ����, ��� {
	//��� �������̽�
	@Override
	public void �����ѱ�() {
		System.out.println("���л��� ���⸦ �մϴ�.");
	}
	@Override
	public void ��������() {
		System.out.println("���л��� ���⸦ ���ϴ�.");
	}
	//���� �������̽�
	@Override
	public int �� (int a, int b) {
		return a + b;
	}
	@Override
	public int �� (int a, int b) {
		return a - b;
	}
	@Override
	public int �� (int a, int b) {
		return a * b;
	}
	@Override
	public double �� (int a, int b) {
		return a / b;
	}
	@Override
	public int ������ (int a, int b) {
		return a % b;
	}
}
