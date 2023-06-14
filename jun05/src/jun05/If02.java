package jun05;

import java.io.IOException;

// if
// 사용자가 입력한 숫자가 무엇인지 판별하는 프로그램
public class If02 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("0 ~ 9 중 하나만 입력하세요.");
		System.out.print("입력 : ");
		
		int input = System.in.read() - 48; // 입력대기
		
		System.out.println("당신이 입력한 숫자는 " + input);
		
		if (input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
