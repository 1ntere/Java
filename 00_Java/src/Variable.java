
public class Variable {

	public static void main(String[] args) {
		// 1.���� 2.���� 3.���ڿ� 4.�Ǽ� 5.����(��,����)
		
		// 1. ���� byte short int long
		// byte = 1byte = 8bit
		byte ����Ʈ = 1;
		System.out.println("����Ʈ");
		System.out.println(����Ʈ);
		//������ ������ �� ctrl + s �� �����ָ� �����
		byte bt = 2;
		System.out.println(bt);
		
		short ��Ʈ = 3;
		System.out.println(��Ʈ);
		
		int ��Ʈ = 1;
		System.out.println(��Ʈ);
		
		// byte �ڷ��� ���� �����̸� bte bte �ȿ� ���� 2 �ְ� ����ϱ�
		// short �ڷ��� ���� �����̸� shrt shrt �ȿ� ���� 2 �ְ� ����ϱ�
		// int �ڷ��� ���� �����̸� nt nt �ȿ� ���� 2 �ְ� ����ϱ�
		// long �ڷ��� ���� �����̸� lng lng �ȿ� ���� 2 �ְ� ����ϱ�
		byte bte = 2;
		System.out.println(bte);
		short shrt =2;
		System.out.println(shrt);
		int nt = 2;
		System.out.println(nt);
		long lng = 2;
		System.out.println(lng);
		
		// 2. ���� char String
		char myChar = 'A';
		System.out.println(myChar);
		// ���ڸ� ��Ÿ���� char�� '' ���� ����ǥ�� ����ؼ� ǥ��
		// "" ū ����ǥ�� String ���ڿ��� ��Ÿ���� ǥ��
		
		//char myChar2 = "A";
		//System.out.println(myChar2);
		//char ���� �ϳ��� ���ڸ� ���� �� �ֱ� ������
		// A�� B �� �� �ϳ��� �ۼ� ����
		
		/*
		 * char myChar3 = 'AB';
		 * char myChar4 = 'ABC';
		 * char myChar5 = '������';
		 * ��� ���ڰ� �ϳ��� �ƴϱ� ������ ����� �� ����
		 * */	
		
		//String
		String str1 = "�� ���� ���ڴ�~~";
		System.out.println(str1);
		
		//String�� ����ؼ� ������ �̸� ����ϱ�
		String name = "����ö";
		
		/*
		 * System.out.print("����� �̸��� ");
		 * System.out.println(name);
		 * System.out.print("�Դϴ�.");
		 */		
		
		System.out.print("����� �̸��� ");
		System.out.println(name + "�Դϴ�.");
		// ���࿡ ���� ���ڳ� ������ �� �ٷ� ����ϰ� �ʹٸ�
		// + �� ����ؼ� �̾ ����� �� ����
		System.out.println("����� �̸���"+name+"�Դϴ�.");
		// ���ϴ� �� ����� �̸��� ������ �Դϴ�.
		System.out.println("����� �̸��� "+name+" �Դϴ�.");
		System.out.println("�� �� �� �� �� �� "+name+" �� �� ��.");
		// ���⸦ �ְ� ���� ��� "" ū ����ǥ ���ο� ���⸦ �־�� ��
		
		// ���� + ���� + ���ڿ� ����ϱ�
		/*
		 * �ȳ��ϼ���. ���¿�. ���￡ ��� ������ �Դϴ�.
		 * �� ��ȭ��ȣ�� 111-222-3333�Դϴ�.
		 * �� �ֹι�ȣ�� ����Դϴ�.
		 * �� �������� A���Դϴ�.
		 */
		String greeting = "�ȳ��ϼ���. ";
		String introduction = "���¿�. ���￡ ��� ������";
		String end = " �Դϴ�.";
		int number1 = 111;
		int number2 = 222;
		int number3 = 3333;
		char dash = '-';
		String secret = "���";
		String bloodType = "A��";
		
		System.out.println(greeting+introduction+end);
		System.out.println("�� ��ȭ��ȣ�� "+number1+dash+number2+dash+number3+end);
		System.out.println("�� �ֹι�ȣ�� "+secret+end);
		System.out.println("�� �������� "+bloodType+end);
		
		System.out.print(number1+dash+number2+dash+number3);
		// 111+222+3333�� ���� 3756�� ��µ�
		// ���߿� ���� int���� String�� ���� ���
		String number = "111-222-3333";
		System.out.println("�� ��ȭ��ȣ�� "+number+end);
		
		// 4. �Ǽ�, 5. ����
		// �Ǽ��� float�� double�� ����
		// �Ǽ��� �⺻���� double �������� �Ǿ�����
		// float = 4byte, double = 8byte
		// float�� �Ǽ��� ��� ���ؼ��� f�� �ٿ���� ��
		// �Ǽ� �ڿ� f�� ���� �� ��,�ҹ��� ���� ���� ��� ����
		float ff1 = 3.14f;
		float ff2 = 3.14F;
		System.out.println("ff1 �� : "+ff1+" �̴�.");
		System.out.println("ff2 �� : "+ff2+" �̴�.");
		
		// double�� ũ�Ⱑ float���� ũ�� ���ʿ� double�� ������ �߱� ������
		// �ڿ� �ٸ� ������ ������ �ʾƵ� ����� �� ���� 
		double dd1 = 3.14;
		System.out.println(dd1);
		
		// 5. ����
		// boolean�� ����ؼ� true���� false���� ǥ���� �� ����
		// ���߿� �˰����̳� if for while ���� ����� �� ���� ���
		
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("���� ������ "+isTrue);
		System.out.println("���� ������ "+isFalse+" ?");
		
		// ���� ���� ���ڿ� �Ǽ� ����
		int num = 10;
		System.out.println("���� num�� �� = "+num);
		
		char ch = 'Z';
		System.out.println("���� ch �� �� = "+ch);
		
		String text = "Hello, World!";
		System.out.println("���ڿ��� text = "+text);
		
		double db1 = 3.14;
		System.out.println(db1);
		
		boolean isTrue2 = true;
		System.out.println("isTrue2 = "+isTrue2);
		
		// num���ٰ� 10 ��� 20�� �ְ� �ʹٸ�?
		
		int ���� = 10;
		System.out.println("������ �� = "+����);
		���� = 20;
		System.out.println("20���� ������ ������ �� = "+����);
		
		// �������� ó�� 1ȸ�� ����� ��
		// ������ �ٸ� ���ڳ� ���� ���� ����
		// �������� �����Ѵ�.
		
		/*
		 * ö���� 19���̾���.
		 * �׷��� 24���� �Ǹ鼭 20���� �Ǿ���.
		 */
		String name1 = "ö��";
		String age = "19";
		System.out.println(name1+"�� "+age+"���̾���.");
		age = "20";// age ���� 20���� ����
		System.out.println("�׷��� 24���� �Ǹ鼭 "+age+"���� �Ǿ���.");
	}

}
