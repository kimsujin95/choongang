package jun09;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		
		char[][] nArt = new char[num][num];
		
		for (int i = 0; i < nArt.length; i++) {
			for (int j = 0; j < nArt[i].length; j++) {
				if (i == j || j == 0 || j == nArt.length - 1) {
					nArt[i][j] = 'N';
				}
				System.out.print(nArt[i][j] + " ");
			}
			System.out.println();
		}
	}
}
