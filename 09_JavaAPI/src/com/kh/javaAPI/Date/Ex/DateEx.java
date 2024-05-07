package com.kh.javaAPI.Date.Ex;
/*
Date : Ư�� ��¥�� �ð��� ��Ÿ���� Ŭ����
Calendar : ��¥�� �ð��� �����ϴµ� ���Ǵ� �߻� Ŭ����
GregorianCalendar : �׷������� ����ؼ� ��¥�� �ð��� ���
SimpleDateFormat : ��¥�� �ð��� �������� �����ְ� �װ��� ���
LocalDate
KST : Korean Standard Time
	  �ѱ�     ǥ��    �ð�
*/

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateEx {
	public static void main(String[] args) {
		//1. Date
		Date ���絥��Ʈ = new Date();
		System.out.println(���絥��Ʈ);
		//2. Calendar
		Calendar Ķ���� = Calendar.getInstance();
			//Calendar�� ��ü�� ����� ���� ��� Dateó�� ������� ����
		//�� �� ��
		int �� = Ķ����.get(Calendar.YEAR);
		int �� = Ķ����.get(Calendar.MONTH);//0������ �������� ������ +1�� ����
		int �� = Ķ����.get(Calendar.DAY_OF_MONTH);
		System.out.println("���� ��¥ : " + �� + "/" + (�� + 1) + "/" + ��);//2024/3/23
		
		//3. GregorianCalendar
		/*
		�׷����� �޷��� 1�� 1�� 1�� ������ �����Ϸ� ���ǵǾ� ����
		2024, 4, 23�� �ϸ� �ڵ����� 2024�� 5�� 23�Ϸ� �����
		2024�� 5�� 24���� ����� (5)
		*/
		GregorianCalendar �׷�����1 = new GregorianCalendar();
		GregorianCalendar �׷�����2 = new GregorianCalendar(2024, 4, 23);
			//2024 5�� 23�Ϸ� ��
		int ��¥ = �׷�����2.get(Calendar.DAY_OF_WEEK);//��(1)��(2)ȭ(3)��(4)��(5)��(6)��(7)
		System.out.println("��¥ : "+��¥);//5 => 5�� 23���� ������̱� ������ 5��� ������ ��
		
		//4. SimpleDateFormat
		/*
		��  : y year
		��  : M Month (���̶� ù ���ڰ� m �ΰ��� ���� ������ ���� �빮�� M ��)
		��  : d day
		��  : H Hour (H : 0 ~ 23�� / h : ����(am)�� ����(pm)���� ������ ǥ��)
		��  : m minute
		��  : s second
		
		���� : E (E��� ���ڷ� ǥ�����ڶ�� ���� ǥ��ȭ �ⱸ���� ���)
		*/
		SimpleDateFormat ��¥���� = new SimpleDateFormat("yyyy-MM-dd");
		String ��¥ǥ�� = ��¥����.format(new Date());
		System.out.println("��¥���� �����ؼ� ǥ���ϱ� : "+��¥ǥ��);
		
		//5. LocalDate ���� ��¥ ��������
		LocalDate ���糯¥�� = LocalDate.now();
		System.out.println("���� ��¥�� : "+���糯¥��);
	}
}
