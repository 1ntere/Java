package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	public static void main(String[] args) {
		//1. www.google.com의 호스트명과 IP주소 가져오기
		try {
			InetAddress 구글 = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : " + 구글.getHostName());//www.google.com
			System.out.println("IP 주소 : " + 구글.getHostAddress());//172.217.24.228
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. 나의 컴퓨터의 이름과 자리번호 확인하기
		try {
			InetAddress 내컴퓨터이름 = InetAddress.getLocalHost();
			System.out.println("내집주소 : " + 내컴퓨터이름);//DESKTOP-DFKSK64/172.27.240.1
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. www.facebook.com 호스트이름 호스트주소
		try {
			InetAddress 페북주소 = InetAddress.getByName("www.facebook.com");
			System.out.println("호스트명 : " + 페북주소.getHostName());//www.facebook.com
			System.out.println("IP 주소 : " + 페북주소.getHostAddress());//157.240.215.35
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4. www.instagram.com 호스트이름 호스트주소
		try {
			InetAddress 인스타주소 = InetAddress.getByName("www.instagram.com");
			System.out.println("호스트명 : " + 인스타주소.getHostName());//www.instagram.com
			System.out.println("IP 주소 : " + 인스타주소.getHostAddress());//157.240.215.174
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
