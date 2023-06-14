package jun12;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {

		int[] a = { 75, 95, 85, 100, 50 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		// print
		System.out.println(Arrays.toString(a));

	}
}
