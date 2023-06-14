package jun09;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
//

public class Test01 {
	public static void main(String[] args) {

		int[] arr01 = new int[5];
		// 0 1 2 3 4
		
		arr01[arr01.length - 1] = 100;
		// 사용자가 점수입력을 하면 arr01에 저장하고 출력하기
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr01.length; i++) {
			System.out.print("점수를 입력하세요 : ");
			arr01[i] = sc.nextInt();
		}
		
		// 출력
		 System.out.println(Arrays.toString(arr01));
		
//		for (int i = 0; i < arr01.length; i++) {
//			System.out.println(arr01[i]);
//		}
		
		// forEach 향상 for문
		for (int i : arr01) {
//            요소 : 집합	  집합을 구성하는 요소를 하나씩 반환
			System.out.print(i + " ");
		}
		
		// 닫기
		sc.close();

		
//		System.out.println(arr01);	// 주소
//		System.out.println(arr01[0]); // 0번지에 저장된 값
//		
//		boolean[] arr02 = new boolean[4];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 수 : ");
//		double input = sc.nextDouble();
//		
//		System.out.print("두 번째 수 : ");
//		double input2 = sc.nextDouble();
//	
//		System.out.println("----------------");
//		
//		if (input2 == 0 && input2 == 0.0 ) {
//			System.out.println("결과 무한대");
//		} else {
//			System.out.println("결과 : " + (input / input2));
//		}
	
		int num = (int) (Math.random() * 4) + 8;
		
		if (num == 1) {
			System.out.println("1");
		} else if (num == 2) {
			System.out.println("2");
		} else if (num == 3) {
			System.out.println("3");
		} else if (num == 4) {
			System.out.println("4");
		} else if (num == 5) {
			System.out.println("5");
		} else {
			System.out.println("6");
		}

//		String grade = "C";
//		
//		System.out.println(grade);
//		
//		switch (grade) {
//		case "A" :
//		case "a" :
//			System.out.println("우수 회원입니다.");
//			break;
//		case "B" :
//		case "b" :
//			System.out.println("일반 회원입니다.");
//			break;
//		default :
//			System.out.println("손님입니다.");
//			break;
//		}	
	}
}
