package jun05;

// if
/* 
자바의 제어문
 	조건문 : 조건에 따라 분기되는 문장
		if, switch
		
 	반복문 : 특정 명령어를 반복적으로 수행하는 문장
 		for, while, do~while

	
	if(조건식) {
		조건식이 참일 때 실행할 명령;
	}
	
	if(조건식) {
		조건식이 참일 때 실행할 명령;
	} else {
		조건식이 거짓일 때 실행할 명령;
	}
	
	결과가 참 또는 거짓이 되는 문장?
	boolean : true / false
	부등호 : 1 > 5
	1 == 2
	1 + 2 == 4
	
*/
public class If01 {
	public static void main(String[] args) {

		boolean ch = !true;
		int number = 13;
		
		if (number == 5) {
			System.out.println("조건식1이 참입니다.");
		} else if (number == 4) {
			System.out.println("조건식2가 참입니다.");
		} else if (number == 3 ) {
			System.out.println("조건식3이 참입니다.");
		} else {
			System.out.println("조건식1, 2, 3 모두 거짓.");
		}
		// 
		
		// 중첩
		
	}
}
