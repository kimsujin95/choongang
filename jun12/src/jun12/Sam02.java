package jun12;

import java.util.Arrays;

// 다른 모양
public class Sam02 {
	public static void main(String[] args) {
		
		int[][] sam = new int[3][3];
		int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 입력 숫자
	
		// 입력숫자에서 랜덤하게 한 숫자를 뽑아 00부터 22까지
		// 순차 입력하고 뽑힌 입력 숫자는 0으로 바꾸기
		// 입력 숫자 뽑기에서 0이면 다시 뽑기
		
		for (int i = 0; i < sam.length; i++) {
			for (int j = 0; j < sam[i].length; j++) {
				int temp = 0; // index 용도
				do {
					temp = (int) (Math.random() * 9); // 0 ~ 8
				} while (number[temp] == 0);
				sam[i][j] = number[temp]; // 저장 하기
				number[temp] = 0; // 중복 방지하기 위해서
			} // 내부측
		} // 배열 외부측
		
		for (int[] is : sam) {
			System.out.println(Arrays.toString(is));
		}
	}
}
