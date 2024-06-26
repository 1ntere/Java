package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	//main
	public static void main(String[] args) {
		//Queue - LinkedList
		Queue<Integer> 큐 = new LinkedList<>();
		
		//offer() - 큐에 80, 60, 30, 20 값을 추가
		큐.offer(80);
		큐.offer(60);
		큐.offer(30);
		큐.offer(20);
		
		//poll() - 데이터 확인 및 제거
		int 맨앞데이터 = 큐.poll();
		System.out.println(맨앞데이터);//80
			//큐의 맨 앞 데이터 : 80, 80을 반환하고 제거함
		
		//peek() - 맨 앞 데이터 확인
		int 데이터확인 = 큐.peek();
		System.out.println(데이터확인);//60
			//80이 위에서 제거 되었으므로 큐의 새로운 맨 앞 데이터 : 60, 60은 제거하지 않음
		
		//isEmpty() - 큐가 비어있는지 확인
		boolean 빈값확인 = 큐.isEmpty();
		System.out.println("비어있는가? : " + 빈값확인);//false
			//아직 큐에는 60, 30, 20의 값이 남아있음
	}
}
