package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		//���� 1�� ���� ������ ���� ���� �� Employee ��ü ����
		Employee emp1 = new Employee();
		emp1.empNo = 1;
		emp1.empName = "�����";
		emp1.gender = '��';
		System.out.println("=== ����1 ===");
		System.out.println("��� ��ȣ : "+emp1.empNo);
		System.out.println("��� �̸� : "+emp1.empName);
		System.out.println("��� ���� : "+emp1.gender);

		//���� 2 : �ʼ��� ��ȣ �̸� �ְ�
		//��ü�� ������ �� �ʼ������ڷ� �ۼ��ϱ�		
		Employee emp2 = new Employee(2,"���׶��");
		System.out.println("=== ����2 ===");
		System.out.println("��� ��ȣ : "+emp2.empNo);
		System.out.println("��� �̸� : "+emp2.empName);
		
		//���� 3 : �ʼ��� ��� �ۼ��ؼ� ����
		Employee emp3 = new Employee(3, "������", "������",
				"�繫��", 20, '��', 5000, 1000,
				"010-1234-5678", "����� ������");
		System.out.println("=== ����3 ===");
		System.out.println("��� ��ȣ : "+emp3.empNo);
		System.out.println("��� �̸� : "+emp3.empName);
		System.out.println("��� �μ� : "+emp3.dept);
		System.out.println("��� ���� : "+emp3.job);
		System.out.println("��� ���� : "+emp3.age);
		System.out.println("��� ���� : "+emp3.gender);
		System.out.println("��� ���� : "+emp3.salary);
		System.out.println("��� Ư�� : "+emp3.bonusPoint);
		System.out.println("��� ���� : "+emp3.phone);
		System.out.println("��� �ּ� : "+emp3.address);
		
		/* �Ʒ��� ��쵵 �´� �ڵ�
		Employee emp3 = new Employee();
		emp3.empNo = 3;
		emp3.empName = "������";
		emp3.dept = "������";
		emp3.job = "�繫��";
		emp3.age = 20;
		emp3.gender = '��';//char�� ��� ���� ����ǥ ���
		emp3.salary = 5000;
		emp3.bonusPoint = 1000;
		emp3.phone = "010-1234-5678";
		emp3.address = "����� ������";
		*/
	}
}
