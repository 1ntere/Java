package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {

	/*
	LoopForEx���� ����ϱ� ���Ѵٸ�
	public static gugudan ����
	public static void gugudan���� static�� �߰����� ������	
	//�����޼���
	public static void main(String[] args) {
		gugudan();
	}	
	
	static�� ������ �ʰ� ����ϱ� ���Ѵٸ�
	��¿� Ŭ������ ���� ����ϱ� LoopForRun
	*/
	
	//����ڷκ��� ���ڸ� �Է¹ް� ���ڿ� �ش��ϴ� �������� ����ϱ�
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ���� ���� ȯ���մϴ�.");
		System.out.print("���ϴ� ���� �Է����ּ���. : ");
		int dan = sc.nextInt();
		
		//�Է¹��� ���� for �� �̿��ؼ� ���
		for (int i = 1; i<=9; i++) {
			System.out.println(dan+" * "+i+" = "+(dan * i));
		}

	}
	
	//0�� �Է��Ͽ� ���Ḧ �ϱ� ������ �ݺ��ؼ� ���
	public void muhangugudan() {
		//����ڷκ��� ���ڸ� �Է¹ް� ���ڿ� �ش��ϴ� �������� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ ����� ���� ���� ȯ���մϴ�.");
			System.out.println("���Ḧ ���ϸ� 0 �Է��ϱ�");
			System.out.print("���ϴ� ���� �Է����ּ���. : ");
			
			int dan = sc.nextInt();
			
			//���࿡ ���� 0�� ������ ���α׷� �����ϱ�
			if (dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			//�Է¹��� ���� for �� �̿��ؼ� ���
			for (int i = 1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = "+(dan * i));
			}
		}
	}
	
	//������ �Է¹޾� �Ųٷ� ����ϱ�
	public void gugudan2() {
		//1. ��ĳ�ʷ� ������ �� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		//2. int dan = sc.nextInt();
		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		//3. for���� Ȱ���ؼ� 9������ 1������ ����ϱ�
		// for (int a = 1; ���� ; a--)
		for (int a = 9; a>=1; a--) {
			System.out.println(dan+" * "+a+" = "+(dan * a));
		}
	}
	
	public void muhangugudan2() {
		Scanner sc = new Scanner(System.in);
		
		//while���� �߰��Ͽ� �������� �������� ����
		while (true) {
			System.out.print("���ϴ� ���� �Է��ϼ��� : ");
			int dan = sc.nextInt();
			
			//���Ḧ ���� ��� 0�� �Է����ָ� �����ϱ�
			if (dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;//for while switch ��밡��, if������ �ܵ����� ��� �Ұ���
			}
						
			//continue ���� ������ ����
			// if dan�� 1~9������ �Է� �����ϵ��� ����
			if (dan<1 || dan>9 ) {
				System.out.println("1���� 9������ ���ڸ� �Է����ּ���.");
				continue;
				//1~9������ ���ڸ� �Է����� ������
				//if���� Ż���ϰ� while�� ��� �����
			}
			
			for (int a = 9; a>=1; a--) {
				System.out.println(dan+" * "+a+" = "+(dan * a));
			}
		}
	}
	
	//�������� 1�ܺ��� 9�ܱ��� ��� ����ϱ�
	public void gugudanall() {		
		
		//1�ܺ��� 9�ܱ��� ���
		for (int dan = 1; dan<=9; dan++) {
			
			System.out.println("====="+dan+"��"+"=====");
			//1�ܿ������� 1 ~ 9�� ������ ���� ���
			for (int i = 1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = "+(dan * i));
			}
		}
	}
	
	//�������� 2�ܺ��� 9�ܱ��� ���
	public void gugudanall2() {
		for (int dan = 2;dan<=9; dan++) {
		//2�ܺ��� �����ϹǷ� ���۽Ŀ��� dan = 2;
			System.out.println("====="+dan+"��=====");
			for (int i =1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = "+(dan*i));
			}
		}
	}

	//�������� ���� ����ϱ�
	public void randomNumber() {
		
		//�������� �ҷ��� ���� ������ �������� ���ڸ� �������� ����ϱ�
		Random ���� = new Random(); //�ζ� ��ȣ ����
		
		//nextInt() �ȿ� ���ڸ� �־
		//��𼭺��� �����̿��� �������� ���ڰ� ���;��ϴ��� ���� ��������
		int �������� = ����.nextInt(5); //0 ~ 4 ������ ���ڰ� ����
		//����(����)�� �� �� �ڵ� �ȿ����� ��� 0���� �����ϹǷ�
		//�������� ��ȣ�� ������ ���� -1�� �ִ밪
		System.out.println("�������� : "+��������);
	}
	
	//�������� 3�� ���
	public void randomFor() {
		//���� ȣ���ϱ�
		Random ran = new Random();
		
		//�������� 3�� ��� (1 ~ 10������ ����)
		for (int num=1; num <= 3;num++) {
			//�������� ���ڸ� ������ֱ�
			// 1 ~ 10�� �������
			// 0 ~ 9���� ���� + 1;
			// ran.nextInt(10) + 1
			int randomNumber = ran.nextInt(10) + 1;
			System.out.println("�������� "+num+" : "+ randomNumber);
		}
	}
	
	//�������� 1 ~ 45 ��ȣ 6�ڸ��� for������ ���
	public void lotto() {
		Random ran = new Random();
		
		for (int lottoNumIdx = 1; lottoNumIdx <= 6 ; lottoNumIdx++) {
			int lottoNum = ran.nextInt(45) + 1;
			
			//if ���� ���ڰ� ���ٸ� ��ȣ�� �����ϰ� ����ϱ�
			System.out.print(lottoNum+" ");
		}
	}

	//1���� 10������ ���� �߿��� Ȧ���� ����ϱ�
	//Ȧ�� = odd
	public void oddNum() {
		for (int num =1; num<=10; num++) {
			//�ϴ� 1~10������ ���ڸ� ������ �־�� �ϴϱ� num+=2�� �ƴ϶� num++
			
			if (num % 2 != 0) {
				System.out.print(num+" ");//Ȧ���� ��µ�
			}
		}
	}
	
	//1���� 10������ ���� �߿��� ¦���� ����ϱ�
	//¦�� = even
	public void evenNum() {
		for (int num =1; num<=10; num++) {			
			if (num % 2 == 0) {
				System.out.print(num+" ");//¦���� ��µ�
			}
		}
	}
	
	//���簢�� ����� �� ���, ���� ���� 3����
	public void squareStar() {
		int star = 3;
		
		for (int i = 0; i < star; i++) { 
			//�� �� ���
			
			for (int j = 0; j < star; j++) {
				System.out.print("�� ");//"* "�� ����
			}
			
			System.out.println();//���η� ���� ����� ���� �ٹٲ�
		}
	}
	
	//���簢�� ����� �� ���, ���� ���� 5����
	public void fivestar() {
		int star = 5;
		
		for (int i = 0;i<star;i++) {
			for (int j=0;j<star;j++) {
				System.out.print("�� ");
			}
			System.out.println();
		}
	}
	
	//LoopForEx.java
	//�������� ������� ���ڰ� �������� Ű����� ���ߴ� ����
	public void numberGame() {
		//���ڸ� ���� �� ���� ��� ������ Ǯ���� �ϱ� while (true) ���
		//for ��ȸ�� 2�� �ֱ�
		//if ���� �����ؼ� ���ڰ��� ���亸�� ������ ���ڰ� �۽��ϴ�.
		//hint ���ڰ��� ���亸�� ������ ���ڰ� Ů�ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		//�������� ���� �����
		Random random = new Random();
		
		while (true) {
			int randomNumber = random.nextInt(3) + 1; // 1 ~ 3			
			System.out.println("���ڸ� ���纸����!!!!");
			
			//for �� �ȿ� ������ �� �� ���� ����� ���ΰ�? ������ 2���� ����ϰڴ�.
			
			for (int attack = 1; attack <= 2; attack++) {
				System.out.print("������ "+attack+" ȸ �õ��մϴ� (��������) : ");
				int guest = sc.nextInt();//�Խ�Ʈ�� �Է��� ���� ��������
				
				if (guest == randomNumber) {
					System.out.println("�����մϴ�!! ���ڸ� ������ϴ�!");
					//���ڸ� ����ٸ� ���ڸ� ������ϴ�.
					break;//����ٸ� Ż���� �ۼ��ϱ�
				} else if (guest > randomNumber) {
					System.out.println("���ڸ� Ʋ�Ƚ��ϴ�.");
					System.out.println("���ڰ� Ů�ϴ�.");
					continue;
				} else {
					System.out.println("���ڸ� Ʋ�Ƚ��ϴ�.");
					System.out.println("���ڰ� �۽��ϴ�.");
					continue;
				}
			}
			System.out.println("������ "+randomNumber+" �Դϴ�.");
			System.out.println("������ �ٽ� �����ϰڽ��ϱ�? (1�� yes / 2�� no)");
			int playAgain = sc.nextInt();
			
			if (playAgain == 2) {
				System.out.println("������ �����մϴ�.");
				break;
			} else {
				continue;
			}
		}
		
		/*
		�� ���� �߻�
		while (true) {
			int randomNumber = random.nextInt(3) + 1; // 1 ~ 3
			
			System.out.print("���ڸ� ���纸���� : ");
			int guest = sc.nextInt();//�Խ�Ʈ�� �Է��� ���� ��������
			
			for (int attack = 1; attack <= 2; attack++) {
				if (guest == randomNumber) {
					System.out.println("�����մϴ�!! ���ڸ� ������ϴ�!");
					//���ڸ� ����ٸ� ���ڸ� ������ϴ�.
					break;
				} else if (guest > randomNumber) {
					System.out.println("���ڸ� Ʋ�Ƚ��ϴ�.");
					System.out.println("���ڰ� Ů�ϴ�.");
					continue;
				} else {
					System.out.println("���ڸ� Ʋ�Ƚ��ϴ�.");
					System.out.println("���ڰ� �۽��ϴ�.");
					continue;
				}
			}
			break;
		}
		-----
		int guest = sc.nextInt();
		�� for �� �ٱ��� �־ �Խ�Ʈ�� �Է��� ���ڸ� 1���� �޾ƿԱ� ������
		�޾ƿ� ���ڰ� �Ȱ���, �� ��� �Ȱ��� ����� �ٷ� 2�� �������
		=====
		���� �ذ� ���
		int guest = sc.nextInt();
		�� for �� ������ ���� ������ 1��° �õ��� Ʋ���� �� �ѹ� �� �Է��� �޴´�.
		*/
		
	}
	
}
