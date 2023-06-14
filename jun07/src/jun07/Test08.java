package jun07;

public class Test08 {
	public static void main(String[] args) {
		// 1 ~ 10까지 출력 ---> 1 ~ 10까지 모든 숫자를 더하면? 55
		int result = 0;
		// 여기서 10까지 짝수만 더하면
		for (int i = 2; i <= 10; i += 2) {
			result += i;
		}
		System.out.println(result);	// 30
		// 탈출
		
		// 또는
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}	
		System.out.println(sum);
		
	}
}
