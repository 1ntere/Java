package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
StringTokenizer
Token : ���� �ּ� ���� ������ ���� ������ ������ ��ü
*/
public class StringTokenizerEx {
	public static void main(String[] args) {
		//							�Ұ�ȣ �ȿ� ""�� ���𰡸� �־���� ��
		//						�����ڸ� ���� ������ �⺻���� ���⸦ �������� ����
		StringTokenizer ��ū = new StringTokenizer("�ڹ� �� �� �ſ�");//�ڹ�, ��, ��, �ſ�
		while (��ū.hasMoreTokens()) { 
			//hasMoreTokens : ���࿡ ��ū���� �ȿ� ���ڰ� �����̶� ����ִٸ� true
			
			System.out.println(��ū.nextToken());
				//nextToken : ���� ��ū�� ���°� ���� ��ū�� ������ �غ���
		}
		
	//�����ڸ� ,(comma)�� ���� ��ũ�������� �� ��
											//���������������    ","�������� ����
		StringTokenizer ��ū2 = new StringTokenizer("������,���,����", ",");
		while (��ū2.hasMoreTokens()) { 
			System.out.println(��ū2.nextToken());
		}
	}
}
