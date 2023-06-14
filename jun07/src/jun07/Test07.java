package jun07;

public class Test07 {
	public static void main(String[] args) {
		// String 클래스는 같은 값이 있으면 동일한 값을 저장합니다.
		// String은 특이하게 변경불가능한 값을 저장합니다.
		String str = "admin";
		String str2 = "admin";
		// 참조타입에서는 값 비교가 아니라 객체비교

		String str3 = new String("admin");
		String str4 = new String("admin");

		System.out.println(str == str2);
		System.out.println(str3 == str4);
	
		StringBuffer sb = new StringBuffer();
	}
}
