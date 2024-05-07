package com.kh.op;

public class OperatorEx5 {

	public static void main(String[] args) {
		/*
		 �� ������ (==, !=)
		 	== : ���� ������ true
		 	ex) 5 == 5 : true
		     	3 == 5 : false
		     	5 == 3 : false
		 	!= : ���� �ٸ��� true
		 	ex) 5 != 5 : false
		     	3 != 5 : true
		     	5 != 3 : true
		 
		 �� ������ (&&, ||)
		 	&& : ����, ������ �� ���� ������ ��� ���϶��� ��ü ǥ���� ��
		 	ex) (5==5) && (3==3) : true
		       	 true      true
		     	(5!=3) && (3==3) : true
		      	 true      true
		     	(5==5) && (5==3) : false
		      	 true     false
		     	(3==5) && (5==5) : false
		     	false      true
		 	|| : ����, ������ �� �� �ϳ��� ���̸� ��
		 	ex) (5==5) || (3==3) : true
		      	 true      true
		     	(5!=3) || (3==3) : true
		      	 true      true
		     	(5==5) || (5==3) : true
		      	 true     false
		     	(3==5) || (5==5) : true
		     	false      true
		     	(3==5) || (5!=5) : false
		     	false     false
		 
		 �� ������ (>, <, >=, <=)
		 ���� > ������ : �������� ������ ������ ũ�� true
		 ���� < ������ : ������ ������ �������� ũ�� true
		 ���� >= ������ : �������� ������ ������ ũ�ų� ������ true
		 ���� <= ������ : ������ ������ �������� ũ�ų� ������ true
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		// num1 �� num2 ���� 1. ������, 2. �ٸ���, 3. � ���� �� ū��
		
		boolean result1 = num1 == num2;
		//num1, num2 ���ٸ� ��
		boolean result2 = num1 != num2;
		//num1, num2 �ٸ��ٸ� ��
		boolean result3 = num1 < num2;
		//num2�� num1���� ũ�ٸ� ��
		
		System.out.println("num1 �� num2�� ������? : "+result1);
		System.out.println("num1 �� num2�� �ٸ���? : "+result2);
		System.out.println("num2 �� num1 ���� ū��? : "+result3);
	}

}
