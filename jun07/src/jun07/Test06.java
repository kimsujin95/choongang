package jun07;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		// 아이디 = admin, 비밀번호 = 01234567
		String id = "admin";
		String pw = "01234567";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String inputId = sc.nextLine(); 
		
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.nextLine(); 
		// P타입 비교때 사용하는 ==, R타입의 ==는 같은 객체
		// R타입인 String타입을 비교할 때는 .equals()
		if (inputId.equals(id) && pw.equals(inputPw)) {
			System.out.println("정보가 일치합니다.");
		} else {
			System.out.println("정보가 일치하지 않습니다.");
		}
		sc.close();

	}
}
