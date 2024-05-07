package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageResizePre {
	//���� �̹��� pigs.jpg, ������ ������ �̹��� pigs_cute.jpg, ���� 400, ���� 200
	public static void main(String[] args) {
		String �����̹��� = "src/com/kh/imageEx/pigs.jpg";
		String �����������̹��� = "src/com/kh/imageEx/pigs_cute.jpg";
		
		//���� ���� �̹��� ����ũ�� ����ũ�� ����
		int ����ũ�� = 400;
		int ����ũ�� = 200;
		
		//���� �̹��� �����͸� ���� �̹����� �о����
		try {
			BufferedImage �����̹��������� = ImageIO.read(new File(�����̹���));
			
			//���ο� ũ�� �̹��� ����
			BufferedImage �̹������� = new BufferedImage(����ũ��, ����ũ��, BufferedImage.TYPE_INT_RGB);
			
			//�̹��� ũ�� �����ؼ� ���ο� �̹����� �׸� ��
			Image �̹����׸��� = �����̹���������.getScaledInstance(����ũ��, ����ũ��, Image.SCALE_SMOOTH);
			
			//��� �غ� �Ϸ� �̹��� �׸��� ����!
			//										   ����x, ����y, ȿ���߰�����
			�̹�������.createGraphics().drawImage(�̹����׸���, 0, 0, null);
			
			//���ο� �̹��� ���Ϸ� ����
			ImageIO.write(�̹�������, "jpg", new File(�����������̹���));
			
			System.out.println("�̹��� ũ�� ���� ����!");
		} catch (Exception e) {
			System.out.println("�̹��� ���忡 �����߽��ϴ�.");
			e.printStackTrace();
		}
	}
}