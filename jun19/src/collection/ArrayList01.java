package collection;

import java.util.ArrayList;

// 자료구조
// 컬랙션 하위 arrayList타입
// 이름도 배열이 들어갑니다. 배열과 흡사합니다.
// 배열보다 쉽습니다.
public class ArrayList01 {
	public static void main(String[] args) {
		
		// 배열 선언
		int[] arr = new int[10];
		
		// List -> ArrayList
		ArrayList<Integer> arr01 = new ArrayList<Integer>();
		
		// 값대입 = add()
		arr01.add(10);
		arr01.add(15); // [10, 15]
		arr01.add(20); // [10, 15, 20]
		int num = 100;
		arr01.add(num);
		// arr01.add((Byte)100); 대입 불가
		// 반드시 타입은 일치해야한다.
				
		for (int i = 1; i <= 10; i++) { // 1 ~ 10
			arr01.add(i);
		}
		System.out.println(arr01);
		// get()
		int num1 = arr01.get(0);
		System.out.println(num1);
		// int P타입
		// Integer R타입

		// 길이 뽑기
		System.out.println(arr01.get(3));

		System.out.println(arr01.size()); // list의 길이 14
		
		// 마지막 index에 저장된 10을 출력하려고 한다면?
		System.out.println(arr01.get(arr01.size() - 1));
		
		// for문 이용해서 출력하기
		for (int i = 0; i < arr01.size(); i++) {
			System.out.println(arr01.get(i));
		}
		
		// list타입 arr02라고 만들어주세요.
		// 홀수를 저장하되 저장된 값이 20개가 되면 멈춰주세요.
		ArrayList<Integer> arr02 = new ArrayList<Integer>();
		
//		for (int i = 1; arr02.size() <= 20; i++) {
//			if (i % 2 == 1) {
//				arr02.add(i);				
//			}
//		}
		int number = 1;
		while (arr02.size() < 20) {
			arr02.add(number);
			number += 2;
		}
		System.out.println(arr02);
	
	}
}
