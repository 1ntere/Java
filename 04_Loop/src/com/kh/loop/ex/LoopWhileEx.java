package com.kh.loop.ex;

import java.util.Scanner;

/*
���²� public static void�� ���� �Լ�ó�� ����� �ؿ���

��public : ��𼭵� ���� ������
protected : ���� ���� �ȿ����� ���� ����
default : ���� ���� �ȿ��� ���� ����
		  protected���� ���ѵǰ� ���� ����
��private : �� class �ȿ����� ���� ����
		   �ۼ��� ���� �ȿ����� ���� ����
---
void : ��ȯ�ϴ� �� ���� �ٷ� ����� �� �� ���
*/


public class LoopWhileEx {
	/*
	while ���� ����ؼ� 4���� ������ ���α׷��� �����ϴ� �ڵ带 �ۼ��ϱ�
	*/	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
	
		while (true) {	
			System.out.println("1. �����ϱ� 2. �����ϱ� 3. ���ڱ� 4. ���α׷� ����");
			System.out.print("���ϴ� ���α׷� ��ȣ�� �Է��ϼ��� : ");
				
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("�����ϱ�");
				break;
			case 2:
				System.out.println("�����ϱ�");
				break;
			case 3:
				System.out.println("���ڱ�");
				break;
			case 4:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
			}
		}		
	}
	
	/*
	�� ���� �߻� 1
	default:
		System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
		System.out.print("���ϴ� ���α׷� ��ȣ�� �Է��ϼ��� : ");
		
	���� �ڵ� ��� �ϴٺ��� �߸��� ��ȣ�� �Է����� ��
	"�߸��� ��ȣ�Դϴ�.
	���ϴ� ���α׷� ��ȣ�� �Է��ϼ��� : 
	1. �����ϱ� 2. �����ϱ� 3. ���ڱ� 4. ���α׷� ����
	���ϴ� ���α׷� ��ȣ�� �Է��ϼ��� : "
	�� ��� �ݺ���.
	
	=> �� �ؿ� 2�ٸ� �ݺ��Ǿ����� �ؼ�
	System.out.println("���α׷� �ۼ�");
	System.out.print("���ϴ� ���α׷� ��ȣ�� �Է��ϼ��� : ");
	�ڵ� 2���� while �� �����ٰ� ��ġ�ߴµ��� ��� �ݺ���
	=====
	�� �ذ� ��� 1
	default:
		System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
	
	=> �ߺ��Ǵ� �ڵ� �� ���� ����
	=====
	�� �ذ� ��� 1-1
	�ߺ��Ǵ� �ڵ带 ������ ����
	int menu = sc.nextInt();
	�ٷ� ����
	while (true) { �� �Է��ϸ� ��
	*/
	
	/*
	�� ���� �߻� 2
	while (true) { �� ����ġ �ٷ� ���� ���� �߸��� �Է�(5)�� �Է��ϸ�
	
	��ȣ�� �߸� �Է��߽��ϴ�.
	��ȣ�� �߸� �Է��߽��ϴ�.
	...
	��ȣ�� �߸� �Է��߽��ϴ�.
	
	�������� �ݺ���
	
	�� ���� �߻� 2-1
	����� �� �Է�(1,2,3)�� ������ �������� �ݺ��� 
	
	�� ���� �߻� 2-2
	���α׷� ����(4)�� ������ �ٷ� �����
	=====
	�� �ذ� ��� 2
	while (true) { �� int menu = sc.nextInt(); ���� ������ ��	
	 */
	
	public static void khī��() {
		Scanner sc = new Scanner(System.in);
		System.out.println("khī�信 ���� �� ȯ���մϴ�. ^^* \n"
				+ "���ϴ� �޴��� �Է����ּ���. \n"
				+ "1 �Ƹ޸�ī�� 2 ī��� 3 ���� 4 ������Ƽ 5 �ֹ����");
		
		while (true) {
			String menu = sc.next();
		
			switch (menu) {
			case "1": case "�Ƹ޸�ī��":
				System.out.println("�Ƹ޸�ī�� �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "2": case "ī���":
				System.out.println("ī��� �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "3": case "����":
				System.out.println("���� �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "4": case "������Ƽ":
				System.out.println("������Ƽ �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "5": case "�ֹ����":
				System.out.println("�ֹ��� ��ҵǾ����ϴ�. ������ �湮���ּ���.");
				return;
			default:
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}				
		}
	}
	
	
	public static void getMoney() {
		//Ŀ�Ǵ� �� 10�� ����, ���� ���� 300��
		int coffee = 10;
		int money =300;
		
		//���࿡ ���� 0���� ���ٸ� Ŀ�Ǹ� �����ϰ�
		//Ŀ�ǰ� �� �����Ǹ� �ǸŸ� �����Ѵ�.
		
		while (money>0) {
			System.out.println("���� �޾����� Ŀ�Ǹ� ����");
			
			//Ŀ�ǰ� 10���ε� 1���� ���� �ߴٸ� -1
			coffee--;
			System.out.println("���� Ŀ���� ���� "+coffee+" �� �Դϴ�.");
			
			//Ŀ�ǰ� ��� �����Ǿ��ٸ� �ǸŸ� ��������
			if (coffee == 0) {
				System.out.println("Ŀ�ǰ� �� �����Ǿ����ϴ�. �ǸŸ� �����մϴ�.");
				return;
			}
		}
	}
	
	//1���� 5������ ���ڸ� ���
	public static void allNumber() {
		int num = 1;
		while (num <= 5) {
			System.out.println(num);
			num++; // num = num+1;
		}
	}
	
	
	//10�� �� �� �Ѿ�� ���� �����ϴ�.
	//������ 10�������� ���� �ѱ��
	public static void tree() {
		int hit = 0;
		while (hit < 10) {
			hit++;
			//������ �� �� ������� Ȯ��
			System.out.println("������ "+hit+"�� ������ϴ�.");
			
			if (hit == 10) {
				//���࿡ ������ ���� Ƚ���� 10���� �Ǹ� ������ �Ѿ�ϴ� ǥ��
				System.out.println("������ �Ѿ�ϴ�~~!!!!! ����");
			}
		}
	}
	
	/*
	����ڷκ��� 1���� ���� �Է¹޾� 1���� �� ���ڱ����� ��� ���ڸ� ���
	�� �Է��� ���� 1���� ũ�ų� ���ƾ� ��
	���࿡ 1 �̸��� ���ڰ� �ԷµǾ��ٸ� 1 �̻��� ���ڸ� �Է����ּ��� ����ϱ�
	*/
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		
		if (num < 1) { 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			System.out.println("1���� "+num+" ������ ���ڵ�");
			int abc = 1;
						
			while (abc <= num) {
				System.out.println(abc);
				abc++; //abc = abc+1;
			}
		}
	}
	
	//Ŀ�ǰ� 100���̰�, ���� ������ Ŀ�Ǹ� �������� ���ϴ� ���
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ī�信 ���Ű� ȯ���մϴ�.");
		System.out.print("���� ���� ���� �Է����ּ��� : ");
		
		//Ŀ�ǰ��� coffeePrice
		int coffeePrice = 100;
		
		//���� ������ �ִ� �ݾ� �Է�
		int money = sc.nextInt();
		
		//���࿡ ���� �����ϴٸ� �޽����� ���� �ٽ� ���� ������ �ִ� �ݾ� �Է� �ޱ�
		while (money < coffeePrice) {
			System.out.print("���� �����մϴ�. Ŀ�Ǹ� �����ϱ� ���� �� ���� ���� �־��ּ��� \n"
					+ "���� ���� ���� �Է����ּ��� : ");
			money = sc.nextInt();		
		} 
		int change = money-coffeePrice;
		System.out.println("Ŀ�Ǹ� �����߽��ϴ�. \n"
				+ "�Ž������� "+change+" �Դϴ�.");		
	}
	
	/*
	�� ���� �߻� 1
	while (money < coffeePrice) {
			System.out.println("���� �����մϴ�. Ŀ�Ǹ� �����ϱ� ���� �� ���� ���� �־��ּ��� \n"
					+ "���� ���� ���� �Է����ּ��� : ");
			int money = sc.nextInt();
	�� �ϴ� ������ ��
	=====
	�� �ذ� ��� 1
	int money = sc.nextInt(); ��
	money = sc.nextInt(); �� �ٲ���
	*/
	
	//���߿� 10000�� �̻��� ���� ���� ��� �������� ��Ű�� ���ϴ� ����
	public static void ilovePork() {
		Scanner sc = new Scanner(System.in);
		
		int tangsuyuk = 10000;
		System.out.print("���� ���� �ݾ��� �Է����ּ��� : ");
		int myMoney = sc.nextInt();
		
		while (myMoney<tangsuyuk) {
			System.out.print("�ܾ��� �����մϴ�. �ٽ� �Ա����ּ���.\n"
					+ "�ٽ� �����ϰ� �ִ� �ݾ��� �Է� : ");
			myMoney = sc.nextInt();						
		}
		int change = myMoney-tangsuyuk;
		System.out.println("������ �ֹ��� �Ϸ�Ǿ����ϴ�.\n���� �ܾ��� "+change+" �� �Դϴ�.");		
	}
	
	public static void main(String[] args) {
		//method1();
		//khī��();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		ilovePork();

	}

}
