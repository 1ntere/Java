package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		/*
		1 �̸��� ���ڰ� �Էµƴٸ�
		1 �̻��� ���ڸ� �Է����ּ��䰡 ��µǸ鼭
		�ٽ� ����ڰ� ���� �Է��ϵ��� �ϱ�
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
			if (num<1) {
				System.out.println("1 �̻��� ���ڸ� �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		//1 ���� ~ ������ ���ڵ��� ���Դ��� ����� ���� �ʹٸ�
		System.out.println("1���� "+num+"������ ���ڵ� ");
		int i = 1;
		while(i<=num) {
			System.out.print(i + " ");
			++i;
		}
		System.out.println();
	}
	
	public void practice1_1() {
		/*
		����ڷκ��� �� ���� ���� �Է¹޾� 1���� �� ���ڱ����� ���ڵ��� ��� ���
		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �ϰ�, ���� 1 �̸��� ���ڸ� �Է��ߴٸ�
		1 �̻��� ���ڸ� �Է����ּ��� ����ϱ�		
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//�Է¹��� ���ڰ� 1�̸��� ��� ������ֱ�
		if (num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			return;
		}
		
		//�Է¹��� ���ڰ� 1 �̻��̸� 1 ���� �Է¹��� ���ڱ��� ��� ������ֱ�
		for (int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
	}
	
	public void practice3() {
		//����ڷκ��� �� ���� ���� �Է¹޾�
		//1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϱ�
		//�� �Է��� ���� 1���� ũ�ų� ���ƾ� ��
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("**** practice 3 ���� ****");
		
		while (true) {
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
			if (num<1) {
				System.out.println("1 �̻��� ���ڸ� �ٽ� �Է����ּ���.");
			} else {
				break;
			}
		}
		//1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϱ�
		System.out.println(num + " ���� 1������ ���ڵ��� �Ųٷ� ����մϴ�.");
		while(num>=1) {
			System.out.print(num + " ");
			num--;//Ű����� �Է¹��� ���ڿ��� -1�� �ϸ鼭 1�� �� �� ���� ���
		}
		//System.out.println();
	}

	public void practice4() {
		/*
		1 �̸��� ���ڰ� �ԷµǸ� 1 �̻��� ���ڸ� �Է����ּ��� ��µǸ鼭
		����ڰ� ���� �Է��ϵ��� �ϱ�
		���ڸ� �Է¹��� ���ں��� 1���� ����ϱ�
		*/
		
		Scanner sc = new Scanner(System.in);

		int num; //practice4 �ȿ��� ��𿡼��� num�� �� �� �ֵ��� �ٱ����� ȣ��
		//do-while : ������ ���� �ƴϾ ������ ���� 1ȸ�� ����
		//���� �������� ������ �̹��� ������ٰ���
		do {
			System.out.print("���ڸ� �Է����ּ��� : ");
			num = sc.nextInt();
			
			//1 �̸��� ���ڰ� ������
			if (num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");	
			//���ǿ� ������� do �� ���� ������ 1ȸ ����Ǵ� ���̱� ������
			//return�̳� break�� �ۼ������� �ʾƵ� �� ��찡 ����
			}
		} while (num > 1);
		
		//���࿡ 1���� Ŀ�� ������ �����´ٸ�
		for (int i = num; i>=1; i--) {
			System.out.print(i+" ");
		}
		
	}

	public void practice5() {
		/*
		1 ���� ����ڿ��� �Է¹��� �� ������ �������� ���� ����ϱ�
		ex. ������ �ϳ� �Է��ϼ��� : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//�Է� ���� ���� �� ���� �� �ٱ���
		int result = 0;
		
		//���ڰ� ������ �� 1���� �Է¹��� ���ڱ��� ���ؼ� ���� ���ϱ�
		
		for (int i = 1; i <= num; i++) {
			result += i;
			
			//�������� ���� ����ϱ�
			if (i<num) {
				System.out.print(i+" + ");
			} else {
				System.out.print(i +" = "+result);
			}
		}
	}
	
	public void practice6() {
		/*
		����ڷκ��� 2���� ���� �Է� �޾� �� ������ ���� ����ϱ�
		���� 1 �̸��� ���ڰ� �Էµƴٸ� 1 �̻��� ���ڸ� �Է����ּ��� ����ϱ�
		*/
		Scanner sc = new Scanner(System.in);
		while (true) {
			//firstNum <= secondNum
			System.out.print("ù ��° ���� : ");
			int firstNum = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			int secondNum = sc.nextInt();
			
			if (firstNum >= 1 && secondNum >= 1) {			
				
				//�ּҰ� �ִ밪 ���ϱ�
				int �ּҰ� = Math.min(firstNum, secondNum);
				//Math(���� ���Ͽ���) ���� ���� ���� ã�� min�� Ȱ���ؼ�
				//�˾Ƽ� ���ϰ� ���� ���� ���ϰ� �ϱ�
				//( , ) ��ȣ �ȿ� ���ڸ� ���� �� ���� ������ ��� ����
				int �ִ밪 = Math.max(firstNum, secondNum);
				
				for (int i = �ּҰ�; i <= �ִ밪; i++) {
					System.out.print(i+" ");
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
			
			/*
			Math���� random�� ����
			Random VS Math.random
			Math�� �ִ� random���� Random�� �ִ� ���� ����� �� ������
			�� �� ����ϴµ� ū ���̴� ����			
			*/
			
			/* �Ʒ��� �´� �ڵ�
			if (firstNum >= 1 && secondNum >= 1) {
				for (int i = firstNum; i <= secondNum ; i++) {
					System.out.print(i+" ");
				}
			} else {
					System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
			*/
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		// �� ������ �����ȣ�� �޾Ƽ� ����ϴ� �޼���
		//������ ��쿡�� + - * / %
		String operator;
		//char�� ���� ������
		//char operator charAt
		//=> �ٵ� char�� �ҰŸ� operator.equals("exit")�� ��� ���ϱ� �� 
		
		while (true) {
			System.out.println("���α׷� ���Ḧ ���� ��� exit �Է��� ��");
			System.out.print("�����Է� (+ - * / %) : ");
			
			operator = sc.next();
			
			//���࿡ exit�� �Է��ؼ� ���α׷� ���Ḧ ���� ���
			//���ڿ�(String)���� �񱳸� �� ��� equals(==)
			if (operator.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			//����1�� ����2�� �Է¹޾Ƽ� ����ϱ�
			System.out.print("����1 : ");
			int ����1 = sc.nextInt();
			System.out.print("����2 : ");
			int ����2 = sc.nextInt();
			
			//����1�� ����2 ��꿡 ���� ���(=result)
			int ���;
			
			//switch case "+" "-" "*" "/" "%"
			if (operator.equals("+")) {
				��� = ����1+����2;
			} else if (operator.equals("-")) {
				��� = ����1-����2;
			} else if (operator.equals("*")) {
				��� = ����1*����2;
			} else if (operator.equals("/")) {
				//�� ���� ��쿡�� 0���� ���� �� ���� ������ ����2�� 0�� �� �� ����
				if (����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				��� = ����1/����2;
			} else if (operator.equals("%")) {
				//������ ���� ��쿡�� 0���� ���� �� ���� ������ ����2�� 0�� �� �� ����
				if (����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				��� = ����1%����2;
			} else {
				System.out.println("�߸��Է��߽��ϴ�.");
				continue;
			}
			System.out.println(����1+" "+operator+" "+����2+" = "+���);
			//������� ������ ������µ� else���� continue�� �����ϱ� ������ �ذ�� 
			// break; : �߰�ȣ Ż��
			// continue; : ���� �ݺ��� ����
		}
	}
	
	
	//practice12_1()�� ������ �ڵ�
	public void practice12_1() {
		Scanner sc = new Scanner(System.in);
		//�� ������ �����ȣ�� �޾Ƽ� ����ϴ� �޼ҵ�
		//������ ��쿡�� + / * - %
		String operator; //char operator charAt
		
		while(true) {
			System.out.println("���α׷� ���Ḧ ���� ��� exit �Է��� ��");
			System.out.print("�����Է�(+ - * / %) : ");
			
			operator = sc.next();
			
			//���࿡ exit�� �Է��ؼ� ���α׷� ���Ḧ ���� ���
			//���ڿ�(String)���� �񱳸� �� ��� equals ==
			if(operator.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			//����1�� ����2�� �Է� �޾Ƽ� ����ϱ�
			System.out.print("����1 : ");
			int ����1 = sc.nextInt();
			System.out.print("����2 : ");
			int ����2 = sc.nextInt();
			
			//����1�� ����2 ��꿡 ���� ���(=result)
			int ���;
			
			//switch case "+"
			if (operator.equals("+")) {
				��� = ����1 + ����2;
			} else if (operator.equals("-")) {
				��� = ����1 - ����2;
			} else if (operator.equals("*")) {
				��� = ����1 * ����2;
			} else if (operator.equals("/")) {
				//�� ���� ��쿡�� 0���� ���� �� ���� ������ ����2�� 0�� �� �� ����
				if(����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				��� = ����1 / ����2;
			} else if (operator.equals("%")) {
				// ������ ��� 0���� ���� �� ���� ������ ����2�� 0�� �� �� ����
				if(����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					
				}
				��� = ����1 % ����2;
				
			} else {
				System.out.println("�߸��Է��߽��ϴ�.");
				continue;
			}
			System.out.println(����1 + " " + operator + " "+ ����2 + " = " +���);
		}
	}
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int num1;
		
		while (true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num1 = sc.nextInt();
			
			if (num1<1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else {
				break;
			}
		}
		
		System.out.println("1���� "+num1+"������ ���ڵ� ");
		int i = 1;
		while(i<=num1) {
			System.out.print(i + " ");
			++i;
		}
		System.out.println();
	}
	
	//13, 14�� : ���� for�� ����
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void practice13_1() {
		//Ű����� ���ڸ� �Է� �ް� �� ��� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int ������ = 1; ������ <= num; ������++) {
			//�� �� �� ���� ����� �ְ� ����
			//ù��° �� - 1��, �ι�° �� - 2�� ... num��° �� - num��
			for (int �� = 1; �� <= ������; ��++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int i = num; i >= 1 ; i--) {//i = ������, ����
			for (int j = 1; j <= i; j++) {//j = star
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int i = num; i >= 1; i--) {//i = ������
			for (int j = 1; j<=(num-i); j++) {//j = blank
				System.out.print("  ");					
			}
			for (int k = 1; k<=i; k++) {//j = star
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	//������ �ڵ�
	public void practice15_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		//Ű����� �Է� ���� ���� size �ȿ� �־���
		int size = sc.nextInt();
		
		//line�� ���η� �� ���� ��ȣ�� ��Ÿ��
		//index �������� ù ��° �� = 0, �ι�° �� = 1 ...
		for (int line = 0; line < size; line++) {
			
			//blank ������ ����ϱ� ���� for��
			//line ��° �ٿ����� line ���� ������ ���
			for (int blank = 0; blank < line; blank++) {
				System.out.print("  ");					
			}
			
			//star ���� ����ϱ� ���� for��
			//line ��° �ٿ����� size - line ���� ���� ���
			for (int star = size; star > line; star--) {
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	//Greeting : �ȳ��ϼ��� �λ縦 ����ϴ� �޼���
	public void Greeting() {
		System.out.println("�ȳ��ϼ���.");
	}
	
	//Greeting2 : �ݰ����ϴ� �λ縦 ����ϴ� �޼���
	public void Greeting2() {
		System.out.println("�ݰ����ϴ�.");
	}
}
