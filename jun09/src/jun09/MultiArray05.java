package jun09;
	
import java.util.Arrays;
	
public class MultiArray05 {
	public static void main(String[] args) {
		int[] arr01 = new int[9];
		int[][] arr02 = new int[3][3];
		
//		int num = 1;
//		for (int i = 0; i < arr01.length; i++) {
//			for (int j = 0; j < arr01[i].length; j++) {
//				arr01[i][j] = num;
//				++num;
//				System.out.print(arr01[i][j] + " ");
//			}
//			System.out.println();
//		}
				
		System.out.println(arr01.length);
		
		// 입력
		// 값 비교 검사
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (arr01[i] == arr01[j]) {
					i--;
					break;
				}
			}
		}
		
		// 값 대입
		int a = 0;
		for (int i = 0; i < arr02.length; i++) {
			for (int j = 0; j < arr02[i].length; j++) {
				arr02[i][j] = arr01[a++]; 
			}
		}
		
		// 출력
		for (int[] is : arr02 ) {
			System.out.println(Arrays.toString(is));
		}
	}
}
