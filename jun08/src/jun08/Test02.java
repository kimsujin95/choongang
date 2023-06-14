package jun08;

import java.util.Iterator;

// 2 ~ 9 단까지 for문으로 출력
public class Test02 {
	public static void main(String[] args) {
		// 2단 옆에 3단, 4단 찍기 = 필요한 것 \t = tab
		
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d x %d = %d\t", j, i, (i * j));
			}
			System.out.println("");
		}
	
//		for (int i = 1; i < 10; i++) {
//			for (int j = 9; j >= 2; j--) {
//				System.out.printf("%d x %d = %d ", j, i, i * j);
//			}
//			System.out.println("");
//		}
		
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(j * i + " ");
//			}
//			System.out.println("");
//		}
	}
}
