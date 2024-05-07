package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController2;
import com.kh.practice.student.model.vo.Student;

//������� ���忡�� �ٶ󺸴� ��ǻ��
public class StudentMenu2 {
	private StudentController2 ssm = new StudentController2();
//�޼���
	//�⺻ ������
	public StudentMenu2() {
		
	}
	//void - �л� ������ ���� ��� ����ϴ� �޼���
	public void printStudentMenu() {
		//�л� ���� ���
		System.out.println("======= �л� ���� ��� =======");
		//for-each��
		//String student�� �ߴٸ�
			//�л��� �̸� or ���� or ���� �ϳ��� ������ �� ����
		//������ Student student�� �ϸ�
			//�̸��� ����� ������ ��� ������ �� ����
		for (Student student :  ssm.printStudent()) {
			System.out.println(student.inform());
		}
		
		//�л� ���� ���
		System.out.println("======= �л� ���� ��� =======");
		System.out.println("�л� ���� �հ� : "+ssm.sumScore());
		System.out.printf("�л� ���� ��� : %.2f\n", ssm.avgScore()[1]);
			//double�̹Ƿ� println�� �ƴ� printf�� ������
		//���������� ������ sumScore�� ȣ���Ѵٸ� ���� ���� ������ ������
		System.out.println("�� ����� ���� �̻� �ΰ�? : "+(ssm.avgScore()[1] >= StudentController2.CUT_LINE));
		/*
		�� �ǹ�
		boolean�� ���� �ʾҴµ� true�� false�� �������� ����
		-----
		      �л����� ���    >=          �հ� ĿƮ����
		(ssm.avgScore()[1] >= StudentController.CUT_LINE)
		-----
		�ε�ȣ : ���� ���ų� ũ�ų� �۴ٴ� ���� ǥ���ϱ� ����
		       true�� false�� ��ȯ		
		*/
		System.out.println("==========================");
		
		//�հ� ���� ���
		for (Student s : ssm.getsArr()) {
		/*
		������ for (Student s : ssm.sArr) {
		private�� �״�� ���ΰ� �ٲ��� �ʱ� ���ؼ���
		�ٽ� StudentController Ŭ�������� Setter�� Getter�� ����ϰ�
		for (Student s : ssm.getsArr()) {�� �ٲٸ� ��
		*/
			if(s.getScore() > StudentController2.CUT_LINE) {
				System.out.println(s.getName()+" �л��� ��� �Դϴ�.");
			} else {
				System.out.println(s.getName()+" �л��� ����� ����Դϴ�.");
			}
		}
	}
}
