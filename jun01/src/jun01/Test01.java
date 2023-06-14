package jun01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		System.out.print("이름을 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		String name = input.next();
	
		System.out.println(name + "님, 반갑습니다.");
		System.out.println("오늘도 고생하셨습니다.");
		input.close();
	}
}
