package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		//Substring �޼��带 ����ؼ� ���ڿ��� Today ����
		String ����1 = "Today is a beautiful day.";
		String ����1 = ����1.substring(0,5);
		System.out.println(����1);
		
		//toUpperCase �޼��带 ����ؼ� ��� �빮�ڷ� ��ȯ
		String ����2 = "Programing is fun and challenging";
		String ����2 = ����2.toUpperCase();
		System.out.println(����2);
		
		//toLowerCase �޼��带 ����ؼ� ��� �ҹ��ڷ� ��ȯ
		String ����3 = "Learning new things is exciting";
		String ����3 = ����3.toLowerCase();
		System.out.println(����3);
		
		//split ����ؼ� ���ڿ��� " "�� �����ϱ�
		String ����4 = "A good medicine tastes bitter";
		String[] ����4 = ����4.split(" ");
		for (String a : ����4) {
			System.out.println(a);
		}
		
		//replace ����ؼ� more�� less �� ��ü
		String ����5 = "the more, the better";
		String ����5 = ����5.replace("more", "less");
		System.out.println(����5);
		
		//charAt ����ؼ� 6��° ���ڸ� ��������
		String ����6 = "Walls have ears";
		char ����6 = ����6.charAt(6);//h
			//charAt���� ������ ���� String�� �ƴ϶� char�̴�.
		System.out.println(����6);
		
		//Substring �޼��带 ����ؼ� his ���� ������ ����
		String ����7 = "Every dog has his day";
		String ����7 = ����7.substring(14,����7.length());
		System.out.println(����7);
	}
}
