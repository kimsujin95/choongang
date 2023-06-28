package cat;

import java.util.Scanner;

class Cat {
	public int run() {
		// 1 ~ 5 무작위 숫자
		int i = ((int)(Math.random() * 5) + 1);
		
		return i;
	}
	
	public int run(int roomNumber) {
		// 인접 숫자로 이동 1 == 2, 5 == 4
		int result = 0;
		if (roomNumber == 1) {
			result = 2;
		} else if (roomNumber == 5) {
			result = 4;
		} else {
			if ((int)(Math.random() * 2) == 1) {
				result = roomNumber + 1;
			} else {
				result = roomNumber - 1;				
			}
		}
		
		return result;
	}
}

public class MS {
	public static void main(String[] args) {
		Cat c = new Cat();
		int position = c.run();
//		System.out.println(position);
//		position = c.run(position);
//		System.out.println(position);
		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("상자 번호 입력 : ");
//			int input = sc.nextInt();
//			if (position == input) {
//				System.out.println("잡았습니다.");
//				break;
//			} else {
//				position = c.run(position);
//			}
//			System.out.println("하루가 지났습니다.");
//		}
		
		System.out.print("상자 번호 입력 : ");
		int input = sc.nextInt();
		
		do {
			if (position == input) {
				System.out.println("잡았습니다.");
				break;
			} else {
				position = c.run(position);	
			}		
			System.out.println("하루가 지났습니다.");
		} while (true);
			
		sc.close();
	}
}
