package com.kh.RunnablePre;

public class 러너블연습 implements Runnable {
//필드
	int 초;
//메서드
	//생성자 - 필수
	public 러너블연습(int 초) {
		super();
		this.초 = 초;
	}
	//void run() - sleep 1초 try-catch this.초 "스레드 시작" "스레드 종료"
	@Override
	//Runnable 인터페이스에서 run() 은 반드시 작성해줘야 하는 메서드
	public void run() {
		System.out.println(this.초 + " 스레드 시작");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.초 + " 스레드 종료");
	}
}
