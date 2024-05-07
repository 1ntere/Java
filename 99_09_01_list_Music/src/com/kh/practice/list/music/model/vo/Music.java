package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music>{
//�ʵ�
	private String title;
	private String singer;
//�޼���
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	//������ - �⺻
	public Music() {
		
	}
	//������ - �ʼ�
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	/*
	�� ���� �߻�
	toString�� ������� ������ ����̳� ���� ������ �ʰ� �ּҷ� ����
		[com.kh.practice.list.music.model.vo.Music@4cb2c100]�� ��µ�
	-----
	String���� �������ִ� ���� ���� ����
	=====
	�� ���� �ذ� ���
	@Override
	public String toString() {
		return "��� : " + title + ", ������ : " + singer;
	}
		//[��� : ������, ������ : ������]�� ��µ�
	*/
	@Override
	public String toString() {
		return "��� : " + title + ", ������ : " + singer;
	}
		//[��� : ������, ������ : ������]�� ��µ�
	
	//sort(), compareTo() ����ϰ� �ʹٸ� ���� ������ ���������!
	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.title);
	}
}