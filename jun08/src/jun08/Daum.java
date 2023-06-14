package jun08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Daum {
	public static void main(String[] args) {
		int[] s = {1, 3, 4, 8, 13, 17 ,20};
		int fir = 0; // 시작 숫자
		int sec = 0; // 끝 숫자
		int temp = s[1] - s[0]; // 두 수의 차이
		// int temp = Integer.MAX_VALUE;
		
		// 							길이 - 1 ---> 마지막까지 X
		for (int j = 0; j < s.length - 1; j++) {
			if (temp > (s[j + 1] - s[j])) {
				temp = s[j + 1] - s[j];
				fir = s[j];
				sec = s[j + 1];
//				System.out.println("(" + s[j] + ", " + s[j + 1] + ")");
			}
		}
		System.out.print("두 거리의 차가 가장 작은 숫자는 : ");
		System.out.println("(" + fir + ", " + sec + ")");

		String[] st = {"qwe", "asd", "zxc"};
		System.out.println(Arrays.toString(st));
	
		long[] l = {10, 100, 1000, 10000, 100000, 10000000, 1000000000};
		System.out.println(Arrays.toString(l));
	
		byte[] b = new byte[] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(b));
	
		// 삼항 연산자
		int score = 95;
		String grade = (score > 90) ? "합격" : "불합격";
		System.out.println(grade);
		// 알고리즘, 자료구조
		
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = height * (lengthTop + lengthBottom) / 2.0;
//		System.out.println(area);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 수 : ");
//		double input = sc.nextDouble();
//		
//		System.out.print("두 번째 수 : ");
//		double input1 = sc.nextDouble();
//		
//		System.out.println("-----------");
//		if (input1 == 0 || input1 == 0.0) {
//			System.out.println("결과 : " + input / input1);
//		} else {
//			System.out.println("결과 : 무한대");			
//		}
//		sc.close();
	
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이 : " + var4);
		// double 타입은 var 변수
	}
}
