package com.kh.conditionEx;

public class ControlSwitch {
	/*
	switch / case
		if ���� ��������� ������ �����ϰ� �ִ� ���� �Ǵܹ�
		
		�ڻ�� ��� 1
		switch (�Էº���) {
		case �Է°�1:
			������ �ڵ�;
			break; //case�� ���������� ���� ���� ��ġ
		case �Է°�2:
			������ �ڵ�; //���࿡ break�� ���ٸ� ���� case�� ������ ��.
			break;
		...
		default: //�Էº����� ��ġ�ϴ� ���� ���� �� ����Ǵ� �ɼ�
				 //���û����̸� �ʿ信 ���� ������ �� ����
				 //else�� ����� ������ ������
			������ �ڵ�;
		}
		
		�ڻ�� ��� 2
		case�� ���) �ٸ� ��ȣ�� ������ ����� ���� ���Ѵٸ�
		case�� �̾ �ۼ��� �� ����
			case 1: case 2: case 3:
			  System.out.println("���̽� 1 2 3�� ���� ���");
			 default :
			  System.out.println(1 2 3 �̿��� ���");
		
		break; �� ���ϴ� case�� ������ case�� �´� ������ ������ ��
		       ���α׷��� �����ϱ� ���� �� ���
		       case�� ���õ� ����� �����ϱ� ���� break�� ȣ���ϸ� ������ �߻���
		
		break �� return�� ������
		break�� ��� : switch�� for�� while������ ���
					�ش��ϴ� case �ܸ̿� ������
					if������ ��� �Ұ�
		return�� ��� : ��𼭵��� ��� ���� (���� �� ������ ����)
					���� ��ȯ�� �� �ְ�, �޼��峪 �Լ��� ������ �ߴ��ϰ� ȣ���� ������ ���� ����
					�޼��峪 �Լ������� return���� ����Ǹ� �� ���Ŀ� �ڵ�� ������� ����.
	*/
	
	public static void main(String[] args) {
		int day = 3;
		String dayString;
		
		switch (day) {
		//���ǿ� �ش��ϴ� case�� �ۼ�		
		case 1:
			dayString = "�Ͽ���";
		case 2:
			dayString = "������";
		case 3:
			dayString = "ȭ����";
			break;
		case 4:
			dayString = "������";
		default :
			dayString = "�߸��� �Է�";

		}
		System.out.println("�Է��� ���ڴ� "+dayString+"�Դϴ�.");

	}

}

/*case 5:
dayString = "�����";
case 6:
dayString = "�ݿ���";
case 7:
dayString = "�����";*/
