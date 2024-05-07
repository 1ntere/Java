package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("�����");
		set.add("����");
		set.add("�ɰԶ�");
		set.add("������");
		set.add("��¡���");
		set.add("�˻���Ĩ");
		set.add("�ɰԶ�");
		set.add("�ɰԶ�");
		set.add("�ɰԶ�");

		System.out.println(set);//[����, ������, ��¡���, �����, �˻���Ĩ, �ɰԶ�]
			//set�� �ߺ��Ǵ� ���� ��� �߰����� �����Ƿ�
			//set[] = [����, ������, ��¡���, �����, �˻���Ĩ, �ɰԶ�]
		
		//size() - set[]�� size Ȯ��
		System.out.println(set.size());//6
		
		//contains() - �������� �����ϴ��� Ȯ��
		System.out.println(set.contains("������"));//true
			//set[] = [����, ������, ��¡���, �����, �˻���Ĩ, �ɰԶ�] �̹Ƿ�
			//�������� �����ϹǷ� true
		
		//remove() - ���� ����
		set.remove("����");//[������, ��¡���, �����, �˻���Ĩ, �ɰԶ�]
		System.out.println(set);
			//set[] = [������, ��¡���, �����, �˻���Ĩ, �ɰԶ�]
		
		//isEmpty() - �����Ͱ� ��� ���ŵǾ����� Ȯ��
		System.out.println(set.isEmpty());//false
			//set[] = [������, ��¡���, �����, �˻���Ĩ, �ɰԶ�] �̹Ƿ�
			//set�� ������� �����Ƿ� false
	}
}