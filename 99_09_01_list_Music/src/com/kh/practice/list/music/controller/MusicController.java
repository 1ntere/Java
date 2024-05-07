package com.kh.practice.list.music.controller;

import java.util.*;

import com.kh.practice.list.music.model.compare.AscSinger;
import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	//���� ���
	List<Music> list = new ArrayList<>();
	
	//������ �ڸ��� ���� �߰�
	public int addList(String title, String singer) {
		//		Music ��ü�� �־���� ��
		//					DB �߰��� �����ϸ� 1, �����ϸ� 0
		//							���࿡ �߰� ������ ? true : false
		return list.add(new Music(title, singer)) ? 1 : 0;
	}
	
	//ù��° �ڸ��� ���� �߰�
	public int addAtZero(String title, String singer) {
		//��Ͽ� �߰��ϴ� �� �� �տ��ٰ� �ٽ� ���� �ڸ����� �����
		//���� �߰��ϴ� ���� ������ 0 �ڸ��� �߰� �� �� �ֵ��� �߰�
		list.add(0, new Music(title, singer));
		return 1;
	}
	
	//��ü �� ��� ���
	public List<Music> printAll() {
		return list;
	}
	
	//Ư�� �� �˻�
	public Music searchMusic(String title) {
		//for-each�� ����ؼ� 
		for(Music music : list) {
			//���࿡ ���� ���ϴ� ������ ������
			if (music.getTitle().equals(title)) {
				return music;
			} else {
				System.out.println("ã���ô� ���� �����ϴ�.");
			}
		}
		return null;
	}
	
	//Ư�� �� ����
	public Music removeMusic(String title) {
			// list�� length ��� size() ���
		for (int i = 0; i < list.size(); i++) {
			//���࿡ ���� �Է��� ����� list���� ã�� ������ ���ٸ� ����
			if (list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}			
		}
		return null;
	}
	
	//Ư�� �� ���� (����) ����
	public Music setMusic(String title, String singer) {
		//for - each ���� ���ϴ� ����� ������ �ִ��� Ȯ���ϱ�
		for (Music music : list) {
			if (music.getTitle().equals(title)) {
				music.setSinger(singer);
				return music;
			}
		}
		return null;
	}
	
	//��������
	public void ascTitle() {
		Collections.sort(list);
	}
	
	//��������
	public void descSinger() {
		Collections.sort(list, new AscSinger());
	}
}