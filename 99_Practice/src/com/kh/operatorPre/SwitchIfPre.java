package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {
	
	/*
	ǥ���
	�ڵ带 �ۼ��� �� ������ ���̿� �ڵ带 ���� ���ϰ� �ϱ� ���ؼ� �ۼ��ϴ� ǥ���

	1. ������ũ ���̽�
	������ �����(_)�� ����ִ� ǥ�����
	snake_case
	one_two_three
	id_number

	2. �Ľ�Į ���̽�
	ù ���ڿ� �߰� ������ ������ �빮�ڷ� ����ϴ� ǥ�����
	PascalCase
	OneTwoThree
	IdNumber

	3. ī�� ���̽�
	�߰� ������ ���۸� �빮�ڷ� ����ϴ� ǥ�����
	camelCase
	oneTwoThree
	idNumber

	4. �ɹ� ���̽�
	�߰��� ���(-)�� �����ؼ� ����ϴ� ǥ�����
	kebab-case
	one-two-three
	id-number
	*/
	
	public static void practice8() {
		//�ֹι�ȣ�� �̿��ؼ� �������� �������� �����ؼ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String idNumber = sc.next();
		
		//YYMMDD-M/F+______
		//�ֹι�ȣ ���ڸ��� ù ��° ���ڸ� ������ ��
		//charAt 7��° �ڸ��� �ִ� ���� ������ �ͼ� �������� �������� �����ؼ� ���
		char genderCode = idNumber.charAt(7);
		// �߰��� -�� �־ 7��
		// ���ڸ� �޾����� 6��
		
		//�ֹι�ȣ ���ڸ� ù ��° ���ڷ� ������ �Ǻ�
		String gender = null;// ���߿� �������� �������� Ȯ�����ִ� ��� �����ֱ�
		
		if (genderCode == '1' || genderCode == '3') {
			// String �� ��쿡�� "", char �� ��쿡�� ''
			// char�� �̿��ؼ� ���� ���� �������� ������ '' ���
			System.out.println("����");
		} else if (genderCode == '2' || genderCode == '4') {
			System.out.println("����");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
			//1. gender = "�ùٸ� �ֹι�ȣ�� �ƴմϴ�.";
			//2. return;
		}
		
		//��� ����ϱ�
		System.out.println("�Է��� �ֹι�ȣ�� ������ "+gender+"�Դϴ�.");
	}
	
	public static void castingPractice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char inputChar = sc.next().charAt(0);
		
		//�����ڵ� ����ϱ�
		// �����ڵ� : �� ������ ��� ���ڳ� ���ڸ� ��ǻ�Ϳ��� �ϰ��ǰ� ǥ���ϱ� ���� ���
		// ���ڿ� ���ڸ� �ٿ��� ��ǻ�Ͱ� ���� �� �ֵ��� ���ִ� ���
		int unicode = (int) inputChar;
		//char�� 2byte, int�� 8byte �̹Ƿ� �ڵ����� �� ��ȯ �Ǳ� ������
		//(int)�� �����ص� �ȴ�
		
		System.out.println("�Է��� ���� "+inputChar+" �� �����ڵ�� "+unicode+" �Դϴ�.");
	}

	public static void castingpractice3() {
		//�־��� �ڵ��� ��ĭ�� ä�� ��� ����� �������� ���� ��
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;//�⺻���� double�̱� ������ float���� �������ִ� f �ٿ���
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1/iNum2); //2 //int�̱� ������ ��(2)�� ����
		System.out.println((int) dNum); //2 //double�Ǽ��� �Ǿ� �ִ� ���� int������ ����
		//double 8byte => int 4byte ���� ����ȯ�� �ϰڴٴ� ǥ�ø� �ۼ� �� ������ ��
		
		System.out.println((double) iNum2*dNum); //10.0
		//���� ���� ū ���� ������ �ڵ����� ū ������ ����Ǳ� ������ (double)�� �ʼ��� �ƴ�
		System.out.println((double) iNum1); //10.0
		
		System.out.println((double) iNum1/iNum2); //2.5 //���������� �Ǽ������� �ٲ������Ƿ� 2.5�� ����
		System.out.println(dNum); //2.5
		
		System.out.println((int) fNum); //3 //�Ǽ����� ���������� ��Ÿ����
		System.out.println((int) (iNum1/fNum)); //3 //�����⸦ �ؼ� ���� 3�� ��������
		//int�� float�� ���� ũ�� (4byte), ���� �������� �Ǽ����� ǥ���ϱ�
		
		System.out.println(iNum1/fNum); //3.3333333
		//float�� �⺻������ �Ҽ��� ���� 6�ڸ� ������ ������
		System.out.println((double) iNum1/fNum); //3.3333333333333335
		
		System.out.println(ch); //'A'
		System.out.println((int) ch); //65
		
		System.out.println(ch+iNum1); //75
		//�ڵ� ����ȯ : ū byte�� �ڷ����� ���� byte�� �ڷ����� ������ ���� byte�� �ڷ����� �ڵ����� ū byte�� �ڷ������� ��ȯ��
		//(int)�� ���� �Ⱥٿ��� ch�� int���� 65���� ������ �ֱ� ������
		//(int) ch (= 65) + iNum1 (= 10) = 75
		System.out.println((char) (ch + iNum1)); //'K'
	}
	
	public static void controlPractice1() {
		//Ű����� �Է¹ް� �Է� ���� ��ȸ ���� ���� ��ư ������ �����ϱ�
		Scanner sc = new Scanner(System.in);
		
		//�޴� ����ϱ�
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		//�޴� ��ȣ �Է� �ޱ�
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menuNumber = sc.nextInt();
		
		//���õ� �޴��� ���� ���� ����
		switch (menuNumber) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���� �޴��Դϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է� �Դϴ�.");
			break;
		}
		
		
	}
	
	public static void controlPractice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �� �Է��ϼ��� : ");
		int number = sc.nextInt();
		
		if (number > 0) {
			if (number % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		}  else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}
	
	public static void controlPractice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		double korean = sc.nextDouble();
		System.out.print("�������� : ");
		double math = sc.nextDouble();
		System.out.print("�������� : ");
		double english = sc.nextDouble();
		
		double totalScore = korean+math+english;
		double averageScore = totalScore/3.0;
		
		if (korean>=40 && math>=40 && english>=40 &&averageScore>=40) {
			System.out.println("���� : "+korean);
			System.out.println("���� : "+math);
			System.out.println("���� : "+english);
			System.out.println("�հ� : "+totalScore);
			System.out.println("��� : "+averageScore);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public static void controlPractice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int monthNum = sc.nextInt();
		
		switch (monthNum) {
		case 1: case 2: case 12:
			System.out.println(monthNum+"���� �ܿ��Դϴ�.");
			break;
		case 3: case 4: case 5:
			System.out.println(monthNum+"���� ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println(monthNum+"���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println(monthNum+"���� �����Դϴ�.");
			break;
		default :
			System.out.println(monthNum+"���� �߸� �Էµ� ���Դϴ�.");
			break;
		}
	}
	
	public static void controlPractice5() {
		Scanner sc = new Scanner(System.in);
		
		String userId = "myId";
		String userPw = "myPassword12";
		
		System.out.print("���̵� : ");
		String inputId = sc.next();
		System.out.print("��й�ȣ : ");
		String inputPw = sc.next();
		
		if (inputId.equals(userId)) {
			if (inputPw.equals(userPw)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
		/*
		�� �̰͵� ����		
		// inputId.equals(userId) : inputId�� userId ���� ���ƾ� ��
		// !inputId.equals(userId) : inputId�� userId ���� �޶�� ��
									! �� ������ ���̵� Ʋ���� �� ���� �ȴ�.
		
		if (inputId.equals(userId) && inputPw.equals(userPw)) {
			System.out.println("�α��� ����");
		} else if (!inputId.equals(userId)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else if (!inputPw.equals(userPw)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("�߸� �Էµ� �� �Դϴ�.");
		}
		*/
	}
	
	public static void controlPractice6() {
		//����ڷκ��� ȸ�� ��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���");
		
		//�����̳� ��Ģ�� ������ �� ���� ����ϴ� ���� �� : Role
		
		System.out.print("�ش� ȸ�� ����� ���� : ");
		String userRole = sc.next();
		
		switch (userRole) {
		case "������" :
			System.out.println("-ȸ������ \n -�Խñ� ���� \n -�Խñ� �ۼ� \n �Խñ� ��ȸ \n -��� �ۼ�");
			break;
		case "ȸ��" :
			System.out.println("-�Խñ� �ۼ� \n �Խñ� ��ȸ \n -��� �ۼ�");
			break;
		case "��ȸ��" :
			System.out.println("�Խñ� ��ȸ");
			break;
		default : 
			System.out.println("�ش��ϴ� ȸ�� ����� �������� �ʽ��ϴ�.");
			break;
		}
	}
	
	public static void controlPractice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		
		System.out.println("BMI ���� : "+bmi);
		
		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("����ü��");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
		
	}
	
	public static void controlPractice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String operator = sc.next();
		
		double result;
		switch (operator) {
		case "+":
			result = num1 + num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
			
			/*
			�ڡڡڡڡ� / �� % �� 0���� ���� �� ���� ������ if������ ���� 0�� �� ��� ó���� ����� �� �ڡڡڡڡ�
			 */
		case "/":
			if (num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			result = (double) num1 / num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
		case "%":
			if (num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			result = num1 % num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			return;
		}
	
		
		/* �´� �ڵ�
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
				
		float result;
		
		if (num1>0 && num2>0) {
			if (operator == '+') {
				result = num1+num2;
			} else if (operator == '-') {
				result = num1-num2;
			} else if (operator == '*') {
				result = num1*num2;
			} else if (operator == '/') {
				if (num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
					return;
			}
				result = (double) num1/num2;
			} else if (operator == '%') {
				if (num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
					return;
			}
				result = num1%num2;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			System.out.println(num1+" "+operator+" "+num2+" = "+ result);
			}
		}
		
		/*
		�� ���� �߻� 1
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String operator = sc.next();
		
		double result;
		
		if (num1>0 && num2>0) {
			if (operator == "+") {
				result = num1 + num2;
			} else if (operator == "-") {
				result = num1 - num2;
			} else if (operator == "*") {
				result = num1 * num2;
			} else if (operator == "/") {
				result = num1 / num2;
			} else if (operator == "%") {
				result = num1 % num2;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			}
		}
		=====
		�� �ذ� ��� 1
		operator�� �ڷ����� char�� �޾Ƽ� charAt(0) ���
		 */
	
		/* ���� �߻� 2
		else if (operator == '/') {
			result = (double) (num1/num2);
		=> result�� 3.0�� ����
		=====
		�� �ذ� ��� 2
		else if (operator == '/') {
				result = (double) num1/num2;
		=> result�� 3.75�� ����
		 */
	
		/* ���� �߻� 3
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String operator = sc.next();
	
		double result;
	
		if (num1>0 && num2>0) {
			switch (operator) {
			case "+":
				result = num1 + num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			case "/":
				result = num1 / num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			case "%":
				result = num1 % num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			}
		}
	 	*/
		}
		
	public static void controlPractice8_1() {
		int num1 = 15;
		int num2 = 4;
		float fnum1 = (float) num1;
		float fnum2 = (float) num2;
		System.out.println(fnum1);
		System.out.println(fnum2);
		
		float result1 = (float) (num1 / num2);
		System.out.println(result1);
		float result2 = (float) num1 / num2;
		System.out.println(result2);
		float result3 = fnum1 / fnum2;
		System.out.println(result3);
		float result4 = fnum1 / fnum2;
		System.out.println(result4);
	}
	
	public static void controlPractice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int fin = sc.nextInt();
		System.out.print("����   ���� : ");
		int homework = sc.nextInt();
		System.out.print("�⼮   Ƚ�� : ");
		int attend = sc.nextInt();
		
		double attendPer = (double) attend/20*100;
		/*
		�� ���� �߻� 1
		double attendPer = attend/20*100; �ϸ� attendPer�� 0�� ����
		=====
		attend�� �ڷ����� int��
		int������ / �ϸ� attend�� 20�� �ƴ� �̻� ���� 0���� ���´�.
		���� 0*100 = 0�̵�.
		=====
		�� �ذ� ��� 1-1
		double attendPer = (double) attend/20*100;
		�� �ذ� ��� 1-2
		double attendPer = attend*5;
		*/
		
		double midScore = mid*0.2;
		double finScore = fin*0.3;
		double homeworkScore = homework*0.3;
		double attendScore = attendPer*0.2;
		
		double totalScore = midScore+finScore+homeworkScore+attendScore;
		
		if (attendPer>=70) {
			System.out.println("�߰� ��� ����(20) : "+midScore);
			System.out.println("�⸻ ��� ����(30) : "+finScore);
			System.out.println("���� ����     (30) : "+homeworkScore);
			System.out.println("�⼮ ����     (20) : "+attendScore);
			System.out.println("���� : "+totalScore);
			
			if (totalScore>=70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [���� �̴�]");
			}
		} else {
			System.out.println("Fail [�⼮ Ƚ�� ���� ("+attend+"/20)");
		}		
	}
	
	public static void controlPractice10() {
		//�տ��� ������ �ǽ�����(1~9)�� �����Ͽ� ������ �� �ִ� �޴�ȭ���� �����ϼ���
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print���� ����� ������ �������
		�ٹٲ����� ���� �ۼ��ϰ� �ʹٸ� \n �� �̿��ؼ� �ٹٲ��ؼ� ����ϱ�
		\n : ���η� �ٹٲ��ؼ� ���
		\r : Ű���� �Է��ϴ� ��ġ�� ���� ���� ó������ �̵�
		System.out.print();
		 + ); : ������ �ʴ� �� ���� �ٲ㼭 ��� �̾ �ۼ��� �� ����
		*/
		
		System.out.println("������ ����� �����ϼ���.");
		
		//System.out.print("1. �޴� ���\r\n2. ¦��/Ȧ��\r\n3. �հ�/���հ�\r\n4. ����\r\n5. �α���\r\n6. ���� Ȯ��\r\n7. BMI\r\n8. ����\r\n9. P/F");
		//�Ʒ� �ڵ�� ���Ƽ� �ּ�ó�� ��(�Ʒ� �ڵ尡 �� �������� ����)
		System.out.print("1. �޴� ���\r\n"
				+ "2. ¦��/Ȧ��\r\n"
				+ "3. �հ�/���հ�\r\n"
				+ "4. ����\r\n"
				+ "5. �α���\r\n"
				+ "6. ���� Ȯ��\r\n"
				+ "7. BMI\r\n"
				+ "8. ����\r\n"
				+ "9. P/F");
		// �� �ڵ忡�� \r�� �����ص� ��
		
		/* System.out.print("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		*/	
		
		//�޴� ��ȣ �Է� �ޱ�
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menuNumber = sc.nextInt();
		
		//���õ� �޴��� ���� ���� ����
		switch (menuNumber) {
		case 1:
			System.out.println("�޴� ���");
			controlPractice1();
			break;
		case 2:
			System.out.println("¦��/Ȧ��");
			controlPractice2();
			break;
		case 3:
			System.out.println("�հ�/���հ�");
			controlPractice3();
			break;
		case 4:
			System.out.println("����");
			controlPractice4();
			break;
		case 5:
			System.out.println("�α���");
			controlPractice5();
			break;
		case 6:
			System.out.println("���� Ȯ��");
			controlPractice6();
			break;
		case 7:
			System.out.println("BMI");
			controlPractice7();
			break;
		case 8:
			System.out.println("����");
			controlPractice8();
			break;
		case 9:
			System.out.println("P/F");
			controlPractice9();
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		//practice8();
		//castingPractice1();
		//castingpractice3();
		//controlPractice1();
		//controlPractice1();
		//controlPractice2();
		//controlPractice3();
		//controlPractice4();
		//controlPractice5();
		//controlPractice6();
		//controlPractice7();
		//controlPractice8();
		//controlPractice8_1();
		controlPractice9();
		//controlPractice10();

	}

}