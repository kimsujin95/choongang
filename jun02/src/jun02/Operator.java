package jun02;
// 연산자 + - / *
/* 모든 프로그램에서는 데이터의 계산을 위해서 
 * 연산자를 사용합니다.
 * 지금 배울 연산자는 다른 프로그래밍에서도 비슷하게 씁니다.
 * 
 * 주의해서 보셔야 할 것은 연산자의 연산 순서입니다.
 * 1. 최우선 연산자 
 * 		. : 클래스 또는 객체 소유의 변수, 메소드 등을 호출한다.
 * 		[] : 배열
 * 		() : 우선 계산
 * 
 * 2. 단항 연산자
 * 		!(논리부정) ~(비트반전) +/-(부호연산) ++/--(선행증감)
 * 
 * 3. 산술 연산자 +, -, /, *, %(모듈러:나머지 값)
 * 		
 * 4. 쉬프트 연산자 <<, >>, <<<, >>>
 * 		
 * 5. 관계 연산자 <, >, <=, >=, ==, !=
 * 
 * 6. 비트 연산자 &, |, ^
 * 
 * 7. 논리 연산자 &&, ||
 * 
 * 8. 삼항 연산자	조건식 ? 참일 때 : 거짓일 때;
 * 
 * 9. 배정대입 : =, +=, -=, %=, /= 등등
 * 
 * 10. 후행증감
 * 		++/--(후행증감)
 * 
 * 
 * 
 */
public class Operator {
	public static void main(String[] args) {
		
		int num = 1;
		int num2 = ++num;	// ++ -> +1
		//		 2  1
		System.out.println(num);	// 2
		System.out.println(num2);	// 2
		
		int num3 = ++num + ++num2;
		//       9  2    3  2
		System.out.println(num);	// 3
		System.out.println(num2);	// 3
		System.out.println(num3);	// 6
	
		num3 = --num + ++num2;	// -- -> -1
		System.out.println(num);	// 2
		System.out.println(num2);	// 4
		System.out.println(num3);	// 6
		
		num3 = num-- - num2--;
		System.out.println(num);	// 1
		System.out.println(num2);	// 3
		System.out.println(num3);	// -2
	
		num3 = num-- + --num2;
		System.out.println(num);	// 0
		System.out.println(num2);	// 2
		System.out.println(num3);	// 3 
		
		System.out.println(2 / 2);	// 1 나눈 후 몫
		System.out.println(3 / 2);	// 1
		System.out.println(4 / 2);	// 2

		System.out.println(2 % 2);	// 0 나눈 후 나머지 값
		System.out.println(3 % 2);	// 1
		System.out.println(4 % 2);	// 0
	
		// 당신의 성별은 ? 1, 3 남자, 2, 4 여자
		int ssnCode = 1;
		int result = ssnCode % 2;
		
		if(result == 0) {
			System.out.println("당신은 여자 입니다.");
		} else {
			System.out.println("당신은 남자 입니다.");
		}
		// 당신은 남자 입니다.
		
		System.out.println(1 % 4); // 1 나눌 숫자가 작으면 반환
		System.out.println(2 % 4); // 2
		System.out.println(3 % 4); // 3
		System.out.println(4 % 4); // 0
		System.out.println(5 % 4); // 1
		System.out.println(6 % 4); // 2
	
		System.out.println("쉬프트 연산자");
		int sh = 2;	// 10
		System.out.println(Integer.toBinaryString(sh)); // 10 이진수로 나타낸다.
		System.out.println(Integer.toBinaryString(sh << 3)); // 10000
		
		sh = 10;	// 1010
		System.out.println(Integer.toBinaryString(sh >> 2)); // 10
	
		sh = -1;
		System.out.println(Integer.toBinaryString(sh));
		// 11111111111111111111111111111111
		System.out.println(Integer.toBinaryString(sh >> 2));
		// 11111111111111111111111111111111
		System.out.println(Integer.toBinaryString(sh << 2));
		// 11111111111111111111111111111100
		System.out.println(Integer.toBinaryString(sh >>> 3));
		// 11111111111111111111111111111
	
		sh = -5000;
		System.out.println(Integer.toBinaryString(sh));
		// 11111111111111111110110001111000
		System.out.println(Integer.toBinaryString(sh >> 2));
		// 11111111111111111111101100011110
		System.out.println(Integer.toBinaryString(sh >>> 2));
		// 111111111111111111101100011110
		System.out.println(Integer.toBinaryString(sh << 2));
		// 11111111111111111011000111100000
	}
}
