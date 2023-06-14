package jun07;

public class Test10 {
	public static void main(String[] args) {
		// 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz
		// 3의 배수, 5의 배수, 3,5의 배수냐
		// 1 ~ 25까지 진행되는 for

		for (int i = 1; i < 26; i++) {
			if (i % 5 == 0 && i % 3 == 0) { // 3의 배수이면서, 5의 배수
//			if (i % 15 == 0) {	
				System.out.print("fizzBuzz");
			} else if (i % 3 == 0) { // 3의 배수
				System.out.print("fizz");
			} else if (i % 5 == 0) { // 5의 배수
				System.out.print("buzz");
			} else {
				System.out.print(i); // 숫자 + 문자 = 연결
			} // if
		System.out.print(", ");
		} // for
	}
}
