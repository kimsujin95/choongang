package jun12;

import java.util.Arrays;

public class Sam03 {
	public static void main(String[] args) {
		
		int[][] sam = new int[3][3];
		// index 를 뽑아서 해당 위치에 1 ~ 9 순차적으로 입력하기
		for (int i = 1; i < 10; i++) { // 입력할 숫자
			int r1 = (int) (Math.random() * 3); // 0 1 2
			int r2 = (int) (Math.random() * 3); // 0 1 2
			if (sam[r1][r2] == 0) { // 값을 저장한 적 없다면
				sam[r1][r2] = i;
			} else {
				i--; // 중복발생으로 다시 뽑기
			}
		}
			
		for (int[] is : sam) {
			System.out.println(Arrays.toString(is));
		}
	}
}
