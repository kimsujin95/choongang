package jun05;
// 이렇게 출력하려면 어떻게 하면 될까요?
// 옆으로
// 2 4 6 8 10

public class For02 {
	public static void main(String[] args) {
		// 책 134페이지에 if문, 
		// 148페이지에 for문 나옵니다.
		
		// 7일 수업내용 : 별찍기,별찍기,별찍기,별찍기,별찍기
		
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	
		System.out.println();
		
		for (int i = 1; i < 35; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Fizz Buzz, ");
			} else if (i % 3 == 0) {
				System.out.println("Fizz, ");
			} else if (i % 5 == 0) {
				System.out.println("Buzz, ");
			} else {
				System.out.println(i + ", ");
			}
		}
	}
}
