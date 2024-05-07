package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
외부 아이피 주소를 알아보자

내 집 주소 알아보기 메서드
InetAddress.getLocalHost() : 현재 내 컴퓨터에 지정된 IP주소를 가져오는 메서드

내 IP 주소 : 172.27.240.1
기본으로 처음에 컴퓨터가 동일한 인터넷선에서 1대일 때는 192.168.0.1을 부여받지만
여러 사람이 동일한 장소에서 동일한 컴퓨터 선으로 동일한 네트워크를 나눠서 받게 될 경우에는
맨 마지막 번호를 1부터 순차적으로 부여받게 됨

172.27.240.1	= 내 집에 있는 호수를 가리켜서 사용
└ 강남에 1호

127.0.0.1		= localhost = 172.27.240.1
└ 숫자로 우리집 주소
*/

public class AddressEx2 {
	public static void main(String[] args) {
		try {
			InetAddress 로컬호스트 = InetAddress.getLocalHost();
			System.out.println("내 IP 주소 : " + 로컬호스트.getHostAddress());//172.27.240.1
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
