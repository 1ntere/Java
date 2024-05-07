package com.kh.oop.constructor;

public class Join {
	//�ʵ� : ȸ����ȣ ���̵� �̸� ����ó
	public int memberNo;//ȸ������ ����
	public String memberId;//ȸ���� �ۼ��� ���̵�
	public String memberName;
	public String phoneNumber;
	
	//1. �⺻ ������
	public Join() {
		
	}
	
	//2. �ʼ� ������
	public Join(int memberNo, String memberId,
			String memberName, String phoneNumber) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
		this.phoneNumber = phoneNumber;
	}
	
	//3. �޼��� = Ŭ���� �ȿ� �����ϰ�, Ư�� ����� �� �� �ֵ��� ������� �ڵ� ����
	//void �޼��� = ����� �������� ����
	public void memberInfo() {
		System.out.println("��� ��ȣ : "+memberNo);
		System.out.println("��� ID : "+memberId);
		System.out.println("��� �̸� : "+memberName);
		System.out.println("��� ���� : "+phoneNumber);
	}
	
	
	public static void main(String[] args) {
		System.out.println("=== ���� ȸ�� ���� Ȯ�� ===");
		
		//�ʼ��� �Է��ؾ��ϴ� ������ ����
		//Join ��ü ����
		Join member1 = new Join();
		member1.memberId = "������";
		member1.memberName = "���׶��";
		member1.phoneNumber = "010-1111-2222";
		member1.memberInfo();
		System.out.println("---------------");
		
		//�ʼ��� �Է��ؾ��ϴ� ������ ����
		Join member2 = new Join();
		member2.memberNo = 2;
		member2.memberId = "�л�";
		member2.memberName = "ȫ�浿";
		member2.memberInfo();
		System.out.println("---------------");
		
		//ȸ�������� �� �ʼ��� �ۼ��ؾ��ϴ� ������ ����
		//ȸ����ȣ ���̵� �̸� �ڵ��� ��ȣ
		Join member3 = new Join(3, "abc",
				"ȫ�浿", "010-1234-5678");
		member3.memberInfo();
		System.out.println("---------------");
		
		/*
		member4 �� member5�� ȸ������ ��Ű��
		member4�� �⺻ �����ڸ� ������ ȸ������ ��Ű��		
		member5�� �ʼ� �����ڸ� ������ ȸ������ ��Ű��
		*/
		Join member4 = new Join();
		member4.memberNo = 4;
		member4.memberId = "���ƴ�";
		member4.memberInfo();
		System.out.println("---------------");
		
		Join member5 = new Join(5, "���۸�",
				"�� ����", "010-1938-1932");
		member5.memberInfo();
		System.out.println("---------------");
		
		
		
	}
}
