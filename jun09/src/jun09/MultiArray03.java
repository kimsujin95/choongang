package jun09;

import java.util.Arrays;

public class MultiArray03 {
	public static void main(String[] args) {
		
		int[][] arr01 = new int[7][7];
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		/* [0,0,0,0,0,0,0]
		 * 
		 * 
		 */		
	
		int num = 1;
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][0] = num;
				arr01[i][6] = num;
				if (i == j) {
					arr01[i][j] = num;
				}
				System.out.print(arr01[i][j] + " ");
			}
			System.out.println();
		}
	
//		for (int[] is : arr01) {
//			System.out.println(Arrays.toString(is));
//		}
	}
}
