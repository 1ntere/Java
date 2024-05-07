package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		//SimpleDateFormat Ȱ���ؼ� ��¥ �����
		Date date = new Date();

		//1. ��¥ : yyyy-MM-dd
		SimpleDateFormat ��¥1 = new SimpleDateFormat("yyyy-MM-dd");
		String ��¥ǥ��1 = ��¥1.format(date);
		System.out.println("���� ��¥ : "+��¥ǥ��1);
		
		//2. �ð� : HH:mm:ss
		SimpleDateFormat ��¥2 = new SimpleDateFormat("HH:mm:ss");
		String ��¥ǥ��2 = ��¥2.format(date);
		System.out.println("���� �ð� : "+��¥ǥ��2);
		
		// 3. ��¥�� �ð� : yyyy-MM-dd HH:mm:ss
		SimpleDateFormat ��¥3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ��¥ǥ��3 = ��¥3.format(date);
		System.out.println("���� ��¥�� �ð� : "+��¥ǥ��3);
		
		// 4. ���� : E
		SimpleDateFormat ��¥4 = new SimpleDateFormat("E");
		String ��¥ǥ��4 = ��¥4.format(date);
		System.out.println("���� ���� : "+��¥ǥ��4);
	}
}
