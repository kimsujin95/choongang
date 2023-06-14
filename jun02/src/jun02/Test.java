package jun02;

public class Test {
	public static void main(String[] args) {
		
		int num9 = 1;
		System.out.println("num9 = 1 : " + num9);	// -2
		
		int num10 = num9--;
		System.out.println("num10 = num9-- : " + num9);	// 1
		System.out.println("num10 = num9-- : " + num10);	// -2

		int num11 = num9-- + --num9;
		System.out.println("num11 = num9-- + --num9 : " + num9);	// -2
		System.out.println("num11 = num9-- + --num9 : " + num10);	// -2
		System.out.println("num11 = num9-- + --num9 : " + num11);	// -2
		
	}
}
