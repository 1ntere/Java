package com.kh.javaAPIEx;
/*
String : ���ڿ��� ��Ÿ���� Ŭ����
	���ڿ��� �����ϰ� �����ϴµ� ���
String str = new String();	-String ���� ���� �� ����� ������� ����
String str = "Hello World";

�ڵ��׽�Ʈ�� ���ڸ� �ڸ��� ������ �� ����ϴ� �޼��带 �ۼ�
substring : ���� �����ϰ� ���� ���ں��� ������ ���� ���ڰ��� �����ؼ� ������ �� ����.
substring(���ۼ���, �����¼���)
substring(���ۼ���) = ���ۼ��ں��� ������ ���ڱ��� ��� �����ϰų� ���

toUpperCase() = ���ϴ� ���ڿ��� ��� �빮�ڷ� ��ȯ
toLowerCase() = ���ϴ� ���ڿ��� ��� �ҹ��ڷ� ��ȯ
trim() = ���ϴ� ���ڿ��� �� �� ������ ��� �����ؼ� return
split() = ���ڿ��� Ư�� �����ڸ� �������� �����Ͽ� ���ڿ� �迭�� ��ȯ
replace() = ���ڿ����� Ư�� ���ڿ��� ���ο� ���ڿ��� ��ü
charAt() = ���ڿ����� �־��� �ε����� �ش��ϴ� ���ڸ� ��ȯ
*/
public class StringEx {
	public static void main(String[] args) {
		//String str = new String();
			//������ String�� import�ؼ� ������ ���� â�����ְ� str�� ����ؾ�������
			//String�� ��� �׳� String str = "Hello World"; ���·� ����ص� �ȴ�.
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		//������ �÷���
		//�ڵ����� ������ �ʴ� ���� �ڵ����� ���ִ� ��
		//Garbage ������ -> ������ �ʾ� �׷� �ʿ䰡����?
		//������!
		String phone = "010";
		phone += "-1234-5678";
		System.out.println(phone);
		
		//index			 0  1  2  3  4   5  6  7  8  9 10  11
		//String ���ڿ� = "H  e  l  l  o      W  o  r  l  d  !";
		
		
		String ���ڿ� = "Hello World!";
		//1. subString()
		String ���꽺Ʈ�� = ���ڿ�.substring(6);
		System.out.println(���꽺Ʈ��);//World!
			//6���� �������� �����شٴ� �ǹ�
		String ���꽺Ʈ��1 = ���ڿ�.substring(6,8);
			//6���� 7������ �����شٴ� �ǹ�
		System.out.println(���꽺Ʈ��1);//Wo
		
		//2. toUpperCase()
		String �빮�� = ���ڿ�.toUpperCase();
		System.out.println("�빮�� �³��� ? : "+�빮��);//HELLO WORLD!
		
		//3. toLowerCase()
		String �ҹ��� = ���ڿ�.toLowerCase();
		System.out.println("�ҹ��� �³��� ? : "+�ҹ���);//hello world!
		
		//4. trim()
		String ���鰡�� = "     Hello   World!     ";
		String �������� = ���鰡��.trim();
		System.out.println("�������� �Ƴ��� ? : "+��������);//Hello   World!
			//�߰��� �ִ� ������ ���Ű� ���� �ʰ�, ������ ���鸸 ���ŵ�
		
		//5. split() - ���ڿ��� Ư�� �����ڸ� �������� �����ؼ� ���ڿ� �迭�� ��ȯ
		String ���ϵ� = "apple,banana,grape";
		String[] ���Ϲ迭 = ���ϵ�.split(",");
		for (String ���� : ���Ϲ迭) {
			System.out.println(����);
		}

		//6. replace() - Ư�����ڿ��� ���ο� ���ڿ��� ��ü
		String ��ο���� = "Hello, World!";
		String ���� = ��ο����.replace("Hello", "Hi");
		System.out.println(����);
		
		//7. charAt() - ���ڿ����� �־��� �ε����� �ش��ϴ� ���� �ϳ��� ��ȯ
		//index		      0   1   2   3   4   5   6   7   8   9
		//String ���̿��� = "H   i   ,       W   o   r   l   d   !";
		//��ĭ�� ������
		String ���̿��� = "Hi, World!";
		char ch = ���̿���.charAt(4);
		System.out.println(ch);
	}
}
