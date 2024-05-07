package com.kh.oop.basic;

public class 객체 {
	/*
	OOP
	Object - Oriented - Programming
	
	컴퓨터 프로그램을 사용할 때
	어떤 데이터를 입력 받아서 순서대로 처리하고 결과를 출력하는 부품들의 조합
	
	객체란
	데이터와 그 데이터를 처리하는 메서드를 함께 묶어놓은 파일
	
		클래스(class) : 객체를 만들기 위한 템플릿 또는 설계도
			처음에 만들어 줄 때 작성한 파일명과
			public class에 작성한 파일명이 동일해야함
			
			ex)
			객체.java와
			public class 객체 {
			}는 동일해야 함
			
			파일을 외부에서 사용하고 싶다면 첫 글자를 소문자가 아니라 대문자로 작성
			대문자로 작성 안하면 불러오질 못함
			=> 파일명 첫 글자는 무조건 대문자를 사용할 것
			=> 한글은 대소문자 구분이 없으므로 public 등을 사용해서 외부에서 사용가능
			
			접근제한자
				public 		: 외부에서 접근이 가능하고 사용할 수 있음
				protected 	: 같은 패키지 또는 자식 클래스에서만 사용할 수 있음
					default : 같은 패키지에서 소속된 클래스에서만 사용할 수 있음
				private 	: 비공개, 개인적인 것으로 외부에서 사용할 수 없음
			
			클래스에는 필드와 생성자 메서드
			
			필드 : 변수 명을 작성하는 공간
				속성이나 데이터를 저장한 후 객체의 상태를 나타내기도 함
				
				ex) String name;
				=> 자료형 String의 name이란 공간을 만들어준 것
			
			생성자 : 클래스 명과 동일하게 이름을 작성해야함
				객체를 초기화하는 특별한 종류의 메서드
				생성자를 작성하지 않아도 기본 생성자를 자동으로 제공
			
			메서드 : 클래스 내부에 동작이나 활동 상태를 작성하는 공간
				ex) [접근 제한자] [반환 타입] [메서드 이름] (매개변수 리스트) {
						메서드 이름에서 실행할 내용 작성;
					}
					  public     void   practice   (          ) {
						System.out.println("안녕하세요.");
					}
				
	
	
	
	*/
}
