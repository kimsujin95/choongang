package jun07;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 주민등록번호 뒷자리 첫 숫자를 입력했을 때 
		// 남자인지, 여자인지 판별하는 프로그램
		// 950605 - 1000000
		System.out.print("주민등록번호 뒷자리 첫 숫자를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if (input == 1 || input == 3) {
			System.out.println("남자입니다.");
		} else {
			System.out.println("여자입니다.");
		}
		sc.close();
		
		
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           