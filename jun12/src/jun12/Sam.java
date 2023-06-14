package jun12;

import java.util.Arrays;

// 3X3배열에 1~9까지 숫자 랜덤하게 입력하기
public class Sam {
	public static void main(String[] args) {
		
		int[][] sam = new int[3][3]; 
		/*
		 * [0,0] [0,1] [0,2]
		 * [1,0] [1,1] [1,2]
		 * [2,0] [2,1] [2,2]
		 * 
		 */
		for (int i = 0; i < sam.length; i++) {
			for (int j = 0; j < sam[i].length; j++) {
				int temp = (int) (Math.random() * 9) + 1;
				// sam[1][0] == temp;
				System.out.println("뽑은 숫자 : " + temp);
				// boolean 변수로 확인해보기로 변경
				boolean check = false;
				Check : for (int k = 0; k < sam.length; k++) {
					for (int k2 = 0; k2 < sam[i].length; k2++) {
						if (temp == sam[k][k2]) {
							// 같은 숫자가 있으면 다시 뽑기;
							check = true; // 다시 뽑아
							break Check;
						}
					}
				} // 검사 for문
				
				if (check) { // boolean 검사
					j--; // 빼기 = 다시 뽑기
				} else {					
					sam[i][j] = temp; // 대입
				}
			}
		}
	
		// print
		for (int[] is : sam) {
			System.out.println(Arrays.toString(is));
		}
	
	}
}
