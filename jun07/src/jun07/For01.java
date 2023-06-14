package jun07;

import java.util.Iterator;

// 별찍기
// 2023-06-07 응용 SW 기초기술 활용
public class For01 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("_");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println(""); // 엔터같은 효과
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (int j = 7; j > i * 2; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);				
			}
			System.out.println();
		}
	
	/* 
	 * 
	 * 배열 
	 * 2차원배열
	 * switch
	 * while
	 * do ~ while
	 * 
	 */
	
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + " : " + j);
			}
		}
	
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("$");
			}
			if (i % 2 == 0) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
