package com.kh.ListEx;

import java.util.ArrayList;
import java.util.List;

/*
List : �ڷḦ ���������� ������ �ڷ� ����(�迭�� ���)
�ε����� ������
�ε����� ������ ���еǱ� ������ �ߺ� ������ ���� ����
�������̽� ��ü�� ������ �Ұ�����
���������� �̿��� �� ����

��뿹��
	List list = new.ArrayList(3); //3ĭ¥�� list ����
	
	E(Element) : ��Ҹ� ���ϴ� ��¡���� ����(�ڷ���x)

 */
public class ListEx {
	public static void main(String[] args) {
		
	//List ��ü �����ϰ� ArrayList �ν��Ͻ� ����
	/*
	�� ���� �߻�
	List list = new ArrayList(3);
	�� List �ϰ� �Ǹ� <>�� �ڷ����� ���������� �ʾƼ� ����� ��� �߻�
	=====
	�� ���� �ذ�
	List<Object> list = new ArrayList(3);
	�ڷ����� Object�� List�� �������ָ� �ȴ�
	Object ��ſ� String Integer Boolean ��� ��� ��� ����
	*/
		List<Object> list = new ArrayList(3);
			//�ϴ� 3ĭ¥�� Object �ڷ����� list �迭�� �������
		
		//add�� ����ؼ� List�� �߰��� �� ����
		list.add("�ƹ��ų�");//�ƹ��ų�
		list.add(new Object());//java.lang.Object@1c4af82c
			//Object�� �ּҸ� �߰�����
		list.add(123123);//123123
			//List�� �ڷ����� Object�� ���� str, int, boolean ���
			//���� �ٸ� �ڷ��� �߰� ����
		list.add(false);
			//List�� 3�� �ʰ��ϸ� ũ�Ⱑ �ڵ����� �þ�� ������ ���� �߻� x
		System.out.println(list);//
	}
}