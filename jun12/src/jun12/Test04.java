package jun12;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) {
		int[] a = new int[8];
		int i = 0;
		int n = 10;
		
		// n을 나눌 때 까지, 즉 0이 될 때까지 연산식을 수행한다.
		while (n != 0) {
			a[i++] = n % 8;	// 2로 나눈 나머지를 배열 안에 넣는다.
			n /= 8; // 나머지를 다시 2로 나눈 몫을 구한다.
		}
		
		for (i = 7; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}
}
