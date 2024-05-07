package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;


public class AnimalManager {

	public static void main(String[] args) {
		/*
		������ 5¥�� Animal Ÿ���� ��ü �迭 �����Ͽ�
		�� �ε������� �������� Dog, Cat Ŭ������ �̿��Ͽ� ��ü �����ϰ�
		�ݺ������� �� �ε����� ��ü�� speak() �޼ҵ� ����
		*/
		Animal[] animals = new Animal[5];
		
		//��������
		Random random = new Random();
		
		for (int i = 0; i < animals.length; i++) {
			//���࿡ �������� true false�� �������� �� ���� true �� ������
			//false�� ����̸� ĭ�� ���� ����
			//random.nextBoolean() : �������� ������ ���� ����
			if (random.nextBoolean()) {
				animals[i] = new Dog("�۸���" + i, "��", random.nextInt(30) + 1);
					//Dog(String name, String kinds, int weight)
					//�۸��� �̸��� ������ �� �۸���1, �۸���2, "�۸���"+�ڿ� ���� ����,
					//������ ���� ��, ������ �����Դ� 1~30kg ���� ����
			} else {
				animals[i] = new Cat("�߿���" + i, "�����", "��", "������");
			}
		}
		for(Animal a : animals) {
			a.speak();
		}
	}
}
