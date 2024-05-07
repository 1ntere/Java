package com.kh.variable.ex;

		//   VariableEx2 => 자료형변환Ex
public class 자료형변환Ex {
	// 메인 메서드 (프로그램 실행)
	public static void main(String[] args) {
	/*
	  컴퓨터에서 계산을 할 때 값 처리 원칙
	  - 같은 자료형끼리 연산, 결과도 같은 자료형
	  
	  만약에
	  다른 자료형끼리 연산하는 경우 자료형을 맞게 변환
	  
	  자동 형변환
	  - 연산 시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
	  
	  ex)
	  	byte   (1byte)
	  	int    (4byte)
	 */
	
	// 자동 형변환 확인
	int num1 = 9; //9원
	long num2 = 10_000_000_000L; // 100억원, '_'안써도 됨	
	
	long result = num1 + num2;
	//int와 long을 더해서 총 100억 9원
	System.out.println("더한 결과 : "+result+"원");
	
	// 작은 값으로 큰 값을 형변환 하려고 할 경우
	// int result1 = num1 + num2;
	// 오류발생 : cannot convert from long to int
	
	// 강제로 형태를 변환해서 넣을 수는 있지만
	// 값이 깨지거나 잘못된 값이 들어감
	
	// int + long
	//  -> long + long 으로 자동 형변환
	//  -> 결과도 long
	// 그런데 int형 변수에 long을 대입하려고 해서 오류 발생
	}

}
