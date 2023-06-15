package oop;

import java.util.Scanner;

class Test {
	public int variable(int num) {
		int a = 10;
		a++;
		return a;
	
	}
}

public class OOP03 {
	
	public void print() {
		int c = 0; // 입력한 횟수 
		
		int num = (int) ((Math.random() * 100) + 1); // 난수 1 ~ 100까지 뽑기
		Scanner sc = new Scanner(System.in); // 스캐너
		
		for (int i = 0; i < 100; i++) { // 0 ~ 99(1 ~ 100)까지 돌기
			System.out.print("맞혀보세요 : ");
			int input = sc.nextInt();	// 입력 값
			
			if (input > num) {
				System.out.println("DOWN"); 
				// 입력한 숫자가 난수보다 크면 다운
				c++; // 입력 횟수 증가
			} else if (input < num) {
				System.out.println("UP");
				// 입력한 숫자가 난수보다 작으면 업
				c++; // 입력 횟수 증가
			} else {
				System.out.println("정답");
				c++;
				break; // 맞추면 나가기
			}
		}
		System.out.println("입력한 횟수 : " + c); // 입력한 횟수 표시하기
		sc.close(); // 스캐너 닫기
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		int a = 0;
		a = t.variable(a);
		System.out.println(a); // 11
	
		// 팀 25--------5분씩....
		
		OOP03 oop03 = new OOP03();
		oop03.print();
			
	}
}
