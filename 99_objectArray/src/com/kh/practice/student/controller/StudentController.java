package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	/*
	Student[] sArr = new Student[5];
	
			�� sArr[0] ��浿 �ڹ� 100
			�� sArr[1] �ڱ浿 ��� 50
	Student �� sArr[2] �̱浿 ȭ�� 85
	  sArr	�� sArr[3] ���浿 ���� 60
			�� sArr[4] ȫ�浿 �ڹ� 20
	
	*/
	
	public Student[] sArr = new Student[5];
	//5���� �� �迭�� ������ִµ� �л����� ������ּ���.
	
	public static final int CUT_LINE = 60;//��� (����x)
	//����� ������ �޸� �빮�ڷ� ��
	
//�޼���
	//�⺻ ������
	public StudentController() {
		//0��° �л� ~ 4��° �л� ���� �־��ֱ�
		sArr[0] = new Student("��浿", "�ڹ�", 100);
		sArr[1] = new Student("�ڱ浿", "���", 50);
		sArr[2] = new Student("�̱浿", "ȭ��", 85);
		sArr[3] = new Student("���浿", "����", 60);
		sArr[4] = new Student("ȫ�浿", "�ڹ�", 20);
	}
	//return
	public Student[] printStudent() {
		return sArr;
	}
	//�л����� ������ ��� ���ؼ� ������ ���
	public int sumScore() { //���� ���� �� ����
		int sum = 0;//�ʱⰪ
		for (Student s : sArr) {
			sum += s.getScore();
		}
		//���������� ������ sumScore�� ȣ���Ѵٸ� ���� ���� ������ ������
		return sum;
	}
	//������ �޾Ƽ� ��� ���ϱ�
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
			//������ ���� ��� �л��� ���� ���� ���� �����ϴ� ����
		avgArr[1] = avgArr[0] / sArr.length;
			//��� = (���� / �� �л���)
		return avgArr;
	}
		//avgScore() �ȿ� avgArr[]�迭�� ���� 
		//avgArr[0] : �� ����, avgArr[1] : ���  
}
