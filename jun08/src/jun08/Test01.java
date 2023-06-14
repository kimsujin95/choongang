package jun08;

public class Test01 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + (i * j) + " ");
			}
			System.out.println();
		}
	
		// %d = 정수, 	\n = 줄바꿈
		// %c = 문자, 	%f = 실수
		// %b = 블리언,	%o = 8진수 
		// %s = 문자열	%x = 16진수
		
		String name = "김수진";
		double pi = 3.14;
		System.out.printf("파이는 %f입니다.\n", pi);
		System.out.printf("파이는 %.2f입니다.\n", pi);
		System.out.printf("파이는 %.5f입니다.\n", pi);
		int money = 5000;
		System.out.printf("제 용돈은 %d원입니다.\n", money);
		System.out.printf("제 용돈은 %,d원입니다.\n", money);
		System.out.printf("제 용돈은 %10d원입니다.\n", money);
		
		System.out.printf("제 이름은 %s입니다.\n", name);
		System.out.printf("제 이름은 %10s입니다.\n", name);
		System.out.printf("제 이름은 %10s입니다.\n", "가나다라마");
		
		char ch = 65;
		System.out.printf("제 이름은 %c입니다.\n", 65);
		
		System.out.printf("제 이름은 %-10d입니다.\n", 1000); // 왼쪽
		System.out.printf("제 이름은 %10d입니다.\n", 1000); // 오른쪽
		System.out.printf("제 이름은 %010d입니다.\n", 1000); // 빈공간을 000000

		for (int i = 1; i < 10; i++) {
			// System.out.println("2 x " + i + " = " + (2 * i));
			System.out.printf("2 X %d = %d\n", i, (2 * i));
		}
	}
}
