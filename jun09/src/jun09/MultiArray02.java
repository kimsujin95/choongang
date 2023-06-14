package jun09;

import java.util.Arrays;

public class MultiArray02 {
	public static void main(String[] args) {
		// 1 ~ 25	5 X 5
		int[][] arr01 = new int[5][5];
		int num = 0;
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				++num;
				arr01[i][j] += num;
				System.out.print(arr01[i][j] + " ");
			}
			System.out.println();
		}
		
		// 출력 java 1.5 추가
		// forEach문은 배열이 오른쪽에 올 때만 쓸 수 있다.
		for (int[] is : arr01) { // 내부요소 : 집합
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		int[] t = {10, 12, 13, 14, 15};
		for (int i : t) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// 배열 Arrays.toString 메소드를 객체값이 아닌 데이터값으로 나열하는 법
		// 방법 1
		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));
		}
	
		// 방법 2
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(Arrays.toString(arr01[i]));
		}		
	}
}
