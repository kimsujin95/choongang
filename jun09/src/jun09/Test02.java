package jun09;

import java.util.Arrays;

// 자바의 랜덤(난수) = 로또... 45/6
public class Test02 {
	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		// 1. 랜덤 Math.random();
		// 0.5593089889979873
		for (int i = 0; i < 6; i++) {
			// 1 ~ 45		
			lotto[i] = ((int) (Math.random() * 45) + 1);			
			for (int j = 0; j < i; j++) {				
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}	
	
		for (int i : lotto) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println(Arrays.toString(lotto));
		
		
		int people[] = new int[25];
		
		System.out.print((int) (Math.random() * 25) + 1);
	}
}
