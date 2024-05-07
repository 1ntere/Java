package com.kh.ThreadEx;

public class Main {

	public static void main(String[] args) {
		ThreadEx 스레드 = new ThreadEx();
		스레드.start();
		
		System.out.println("1차 스레드 끝, Ex 스레드 시작");
		
		//for 문 - 총 3개의 스레드를 생성해서 실행
		for (int i = 0; i < 3; i++) {
			Thread t = new ThreadEx2(i);
				//원래의 경우 ThreadEx t = new ThreadEx2(i);를 사용해야하지만
				//Thread가 ThreadEx2의 부모클래스이기 때문에 Thread를 ThreadEx2 대신 사용 가능
			t.start();
		}
		System.out.println("메인 끝~~~!");
	}
}
