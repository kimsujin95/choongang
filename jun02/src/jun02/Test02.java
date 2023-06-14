package jun02;

public class Test02 {
	public static void main(String[] args) {
		// 2진법....
		// 10 -> 1010 
		// 11 -> 1011
		
		System.out.println(10 & 11); // 둘다 1이어야 1
		// 1010
		// 1011 --> 1010 --> 10진법으로 다시 바꾸면 10
		
		System.out.println(10 | 11); // 둘 중 하나만 1이어도 1
		// 1010
		// 1011 --> 1011 --> 10진법으로 다시 바꾸면 11
		
		System.out.println(10 ^ 11); // 겹치지 않는 것만 1
		// 1010
		// 1011 --> 0001 --> 10진법으로 다시 바꾸면 1
		
		char ch = '가';
		ch = 57;	// 정수를 대입하면 int형으로 변환이 되어 산술계산을 할 수 있다. 
		int a = 9;
		System.out.println(ch + a);
		System.out.println((char)(ch + a));	// 이건 char로 변환	// B
	}
}
