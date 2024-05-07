package com.kh.variableEx;
/*
변수
	자료형(기본)
		숫   자	: byte, short, int, long	//기본 값 : int
		문   자	: char						//'' 사용, 한 글자만 들어갈 수 있음
		실   수	: float, double				//기본 값 : double
		참, 거짓	: boolean					//기본 값 : false
	자료형(참조)
		문자열	: String					//"" 사용, 문자를 모두 나열하는 문자열, 특수문자 등 모든 것 사용 가능
	상수형
		final 자료형 상수명 = 값;
		final int MAX_NUM = 100;			//상시적으로 변하지 않는 수	, 값의 변화 절대 x, 대문자로 표기
	열거형
		상수를 하나씩 작성하기 번거로우니 관련 있는 상수들을 한번에 {}안에 작성하는 상수 표기 방법
		보통 요일, 계절과 같이 변함 없는 예제를 사용해서 상수를 나열
		enum 대표이름 {
			상수를 모두 작성
		}
*/
//변수명은 어떤 특정 행위나 행동을 하기 위한 것이 아니기 때문에 메서드 안에 작성하지 않아도 괜찮음
//System.out.print 와 같은 행동은 무언가를 행하기 위한 표기이기 때문에 메서드 안에 작성해줘야함
//클래스에서 바로 작성 가능
public class 기본변수 {
//필드
	//자료형 기본
		//1. 숫자
			int		 숫자	 = 10;
			byte	 b	 = 2;
			short	 sh	 = 3;
			long	 lng = 5;
		//2. 실수
			float	 ft	 = 3.14f;
				//기본 실수 값은 double이고, double은 float보다 큰 값이기 때문에
				//뒤에 f나 F를 붙여서 작성해줘야 함
			double	 db	 = 3.14;
				//실수는 초기 값이 double 이므로 뒤에 d를 붙이지 않아도 된다
		//3. 문자
			char	 ch	 = 'A';
				//문자는 ''작성해줘야 하고 1글자만 넣어야 함
		//4. true false
			boolean	 bln = false;
				//boolean은 기본값이 false이기 때문에
				//boolean bln; 과 boolean bln = false; 는 같은 값이다.
	//자료형 참조
			String name = "가나다";
				//추가로 만들어진 자료형으로 대문자 S로 시작
				//누구나 참조 자료형을 만들 수 있음
	//상수형
			final int MAX_NUMBER = 100;
			final double PI = 3.14;
			final String 규칙 = "변경되면 안되는 규칙";
				//자료형 앞에 final을 붙여주고 모두 사용할 경우 static 작성
	//열거형
			enum Day {
				MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
			}
				//관련있는 상수형들의 모음집
}
