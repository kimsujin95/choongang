package jun02;

public class Hello {	// 클래스
	// 메인메소드는 반드시 이 모양이어야 합니다.
	public static void main(String[] args) {	// main 메소드
		int number;	// 변수 선언
		number = 100;	// 변수의 값 대입
		
		// a == b : a와 b의값을 비교한다.
		
		int num = 101;	// 변수 선언 + 값 대입 == 변수 초기화
		// 리터럴 = 고정된 값
		
		// 3.14
		double num1 = 1.00008;	// <-----
		
		int num2 = 10;	// 문자열""
		// (중요!) 대입기호 기준으로 양 변의 데이터 타입이 동일해야 대입이 가능하다.
		
		int num3 = num;
		
		num1 = 3.333333;
		
		num3 = (int) 10.433333;	// 형 변환 = 데이터타입 변환
		// cast = 값의 절삭
		System.out.println(num3);
		
		int iNumber = 14;
		double dNumber = iNumber;	// 자동 대입 : 프로모션
		// 왼쪽 변이 더 큰 타입이라 int가 자동대입됩니다.
		
		System.out.println(dNumber);	// 14.0
	
		// 상속
	}
}
// 변수 : 변하는 값 <-> 상수 : 변하지 않는 값(ex: 파이, 주민등록번호)
// 프로그램이 진행할 때 중간의 값을 저장해두기 위한 공간.
// 데이터타입 변수이름; = 변수 선언 = 명령어 