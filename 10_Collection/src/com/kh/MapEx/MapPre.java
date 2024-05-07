package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
//�޼���
	//������ (�⺻)
	public MapPre() {
		
	}
	
	//void
	private void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "���׸���");
		map.put(3, "��Ƽ�����ٺ�ť");
		map.put(1, "�����̽ý�����");
		System.out.println(map);//{1=�����̽ý�����, 2=���׸���, 3=��Ƽ�����ٺ�ť}
			//���ı��� �ؼ� ����
	}
	
	private void practice2() {
		//							<> �ȿ��� �ڷ����� �־ �ǰ� �� �־ ��
		Map<String, String> map = new HashMap<>();
		
		map.put("�п�", "����� ������");
		map.put("���", "����� ���Ǳ�");
		map.put("�Ԥ�Ÿ��", "����� ���ı�");
		System.out.println(map);//{���=����� ���Ǳ�, �п�=����� ������, �Ե���Ÿ��=����� ���ı�}
			//map = {���=����� ���Ǳ�, �п�=����� ������, �Ԥ�Ÿ��=����� ���ı�}
		
		//get() - �Ԥ�Ÿ���� ��� �ִ��� ���
		System.out.println("�Ԥ�Ÿ���� ��� �ֳ���? : " + map.get("�Ԥ�Ÿ��"));
			//map.get("�Ԥ�Ÿ��") - key "�Ե�Ÿ��"�� value "����� ���ı�"�� ������
		
		//remove() - ��� ����
		map.remove("���");//map = {�п�=����� ������, �Ԥ�Ÿ��=����� ���ı�}
		System.out.println(map);//{�п�=����� ������, �Ԥ�Ÿ��=����� ���ı�}
		
		//for-each, KeySet() - ��ü��� ���
		for (String a : map.keySet()) {
			String ��ġ = map.get(a);
				//����� �������� ����� ���ı��� value�̴�.
			System.out.println(a+"��(��) "+��ġ+"�� �ֽ��ϴ�.");
		}
	}
	
	//containsValue() - Ư�� ��(value)�� �����ϴ��� Ȯ��
	public void practice3() {
		Map<String, Integer> map = new HashMap<>();
		map.put("���", 100);
		map.put("�ٳ���", 200);
		map.put("ü��", 300);

		//200��¥�� ������ �����ϴ°�?
		System.out.println("������ 200���� ������ �����ϴ°�? : " + map.containsValue(200));//true
			//map = {ü��=300, ���=100, �ٳ���=200}
			//value�� 200�� �ٳ����� �����ϱ� ������ true
		
		//ü���� �����ϴ°�?
		System.out.println("ü�� �ֳ���? : " + map.containsKey("ü��"));//true
			//map = {ü��=300, ���=100, �ٳ���=200}
			//key�� ü���� �ٳ����� �����ϱ� ������ true
		/*containsValue�� containsKey ��� true�� false ������ ��� ��*/
		
		//ũ�� ��ȸ
		System.out.println("���� map�� ũ�� : " + map.size());//3
			//map = {ü��=300, ���=100, �ٳ���=200}
			//map�� ũ��� 3�̴�.
	}
	
	public void practice4() {
		//������ map
		Map<Integer, String> map = new HashMap<>();
		
		//put() - 1-���׸���, 2-��Ƽ�����ٺ�ť, 3-������ũ��ġ��, 4-�����̽ý�����
		map.put(2, "��Ƽ�����ٺ�ť");
		map.put(3, "������ũ��ġ��");
		map.put(1, "���׸���");
		map.put(4, "�����̽ý�����");
		System.out.println(map);//{1=���׸���, 2=��Ƽ�����ٺ�ť, 3=������ũ��ġ��, 4=�����̽ý�����}
			//������ �ٲ㼭 �־ �˾Ƽ� ���ĵǾ� ����� (index�� ����)
		
		//get() - 3�� �޴��� �������� Ȯ��
		System.out.println("3�� �޴� : " + map.get(3));//������ũ��ġ��
		
		//size() - �� �޴��� ���� Ȯ��
		System.out.println("�� �޴��� ���� : " + map.size());//4
			//map = {1=���׸���, 2=��Ƽ�����ٺ�ť, 3=������ũ��ġ��, 4=�����̽ý�����}
		
		//remove() = 4�� �޴��� ������
		map.remove(4);
			//map = {1=���׸���, 2=��Ƽ�����ٺ�ť, 3=������ũ��ġ��}
		
		//isEmpty() - map�� ����ִ��� Ȯ���ϱ�
		System.out.println("�޴��� �������? : "+map.isEmpty());//false
			//map = {1=���׸���, 2=��Ƽ�����ٺ�ť, 3=������ũ��ġ��} �̹Ƿ� false
		System.out.println("===============");
		
		//for-each, keySet() - ��� �޴� ����, 1�� ���
		for (int i : map.keySet()) {
			String �޴� = map.get(i);
			System.out.println(i+"�� �޴� : " + �޴�);
		}
		System.out.println("===============");
		
		//for-each, Map.Entry, entrySet() - ��� �޴� ����, 2�� ���
			//Map.Entry : Ű-���� ���ÿ� ������
			//keySet() ��ſ� entrySet()�� ���
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		System.out.println("===============");
		
		//clear() - ��� ����
		map.clear();
		System.out.println(map);//{}
			//map = {}
		System.out.println("�޴��� �������? : "+map.isEmpty());//true
	}
	
	//���� �޼���
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		//mp.practice1();
		//mp.practice2();
		mp.practice3();
		//mp.practice4();
	}
}
