package jun05;
// 컴파일 <-> 스크립트
// 소스코드.java -> 컴파일 -> .class
// 클래스 : 클래스 변수, 메소드, 생성자
// 메소드 : 함수 function
// 명령어 : 

// 이름 만들기(apple, korea) = 영어대소문자, 숫자, _, $
// 	클래스 : AppleKorea = 파스칼 표기법
// 	메소드, 변수 : appleKorea = 카멜 표기법
// 	상수 : APPLE_KOREA = 스네이크 표기법

public class Test01 {
	public static void main(String[] args) {
		// 우리반 인원수를 저장하고 싶어요.
		// 어떤 데이터타입을 쓰면 좋은지 적어주세요.
		// 변수명은 member
		// 자바에는 P/R
		byte member = 25; // -128 ~ 0 ~ 127 선언 + 초기화
		// 변수 활용 
		member = 100;
		System.out.println(member);
		
		int num = 1000;	// 데이터 스코프
		// 예약어
		num = member;	// 값 대입	(왼쪽) <-- (오른쪽)
		// num = num + 1;
		// ++num;	// 변수++
		num += 1; // num = num + 1;	num = ++num; num = num++;
		num -= 1; 
		num %= 2; // 모듈러 : 나머지 값
		// 위 num에 저장될 값은? 몇 개? 0, 1
		// 나눌 값이 나누어야 하는 값보다 크거나 나눌 값의 1을 뺀 값이 나머지로 나올 값들이다.
		System.out.println(num);
	
		// 캐스트, 프로모션
		// int,	byte
			num = member;	// 프로모션
			member = (byte) num;	// 캐스트
	}
}
