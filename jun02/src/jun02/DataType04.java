package jun02;
// 문자형, 논리형
/* 
 * 문자형 : 한글자만 저장합니다.
 * 문자 하나를 저장하기 위한 타입이다.
 * 반드시 값으로는 문자 하나만 존재해야 하며
 * 하나 이상일 경우엔 String(문자열)에 저장합니다.
 * char 타입은 정수 타입입니다.
 * 
 * 	크기는 음수가 없는 2byte의 범위를 가집니다.
 * (0 ~ 65,535)
 * 
 * 문자값을 표현할 때에는 반드시 홀따옴표를 이용한다.
 * 정수타입이기 때문에 int에 프로모션 됩니다.
 * int값 또한 문자로 변경될 수 있습니다.(cast)
 * 
 * 
 * 
 */
public class DataType04 {
	public static void main(String[] args) {
		char ch = '가';	// 문자열 "", 캐릭터 ''
		ch = 'A';
		ch = '價';
		ch = '\ub059';	// 유니코드 표기, 아스키 코드
		System.out.println(ch);
		
		String str = ch + "";	// 연결		캐릭터 + 문자열
		System.out.println(str);
		//     0 1 2 3 4
		str = "안녕하세요";
		System.out.println(str);
		// 문자열 자르기 -> char 타입으로 나옵니다.
		ch = str.charAt(4);	// charAt()
		System.out.println(ch);
		
		ch = '9';
		System.out.println(ch);	// 9

		int num = 33;
		
		ch = (char) num;
		System.out.println(num);	// 33
		System.out.println((char) num);	// !
		
		ch = 57;
		System.out.println(ch);	// 9
		
		ch = (char) (ch + 9);
		System.out.println(ch);	// B
		
		System.out.println( (char) 65);	// A
		System.out.println( (char) 66);	// B
		System.out.println( (char) 67);	// C
		System.out.println( (char) 68);	// D
		
		for (int i = 97; i < 123; i++) {
			System.out.print((char) i + " ");
		}
		// a b c d e f g h i j k l m n o p q r s t u v w x y z
	
/* 10진수	2진수
 * 	 0		 0
 * 	 1		 1 = 1비트
 *   2      10
 *   3      11
 *   4     100 
 *   5     101
 *   6     110
 *   7     111 = 3비트 2^2 + 2^1 + 2^0
 *   8    1000
 *   9    1001
 *  10    1010 = 4비트
 *  
 */		
		
	}
}
