package practice3.model.vo;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Rabbit;
import practice3.model.vo.Horse;

//true�� �䳢
//false�� ���� ��
public class AnimalWorld {
	public static void main(String[] args) {
		//5��¥�� Animal Ÿ���� ��ü �迭 ����
		Animal[] animals = new Animal[5];
		
		//������
		Random random = new Random();
		
		for (int i = 0; i < animals.length; i++) {
			if (random.nextBoolean()) {
				animals[i] = new Rabbit("�䳢" + i, "�䳢", random.nextInt(10) + 1, "���");
			} else {
				animals[i] = new Horse("��" + i, "��", "������", "������");
			}
		}
		for(Animal a : animals) {
			a.speak();
		}
	}
}
