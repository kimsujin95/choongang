package jun12;

import java.io.IOException;

public class While02 {
	public static void main(String[] args) throws IOException {
		
		boolean quit = true;
		while (quit) {
			System.out.println("게임을 시작합니다.");
			System.out.println("게임중...");
			System.out.print("게임을 종료할까요?(Y/N) ");
			
			char input = (char) System.in.read(); // \n\r
			System.in.read(); // 엔터처리
			System.in.read();
			
			if (input == 'Y' || input == 'y') {
				System.out.println("게임을 종료합니다.");
				quit = !quit;
			}
			System.in.skip(2);
			
		}
		
	}
}
