package inner;
// 정적 멤버 클래스
/* static 키워드로 선언된 클래스
 * 
 * 
 */
class SA {
	static class SB {
		public SB() {} // 생성자
		int num;
		static int number; // 정적 멤버
		void me1() {}
		static void me2() {} // 정적 메소드
	}
}

public class StaticClass01 {
	public static void main(String[] args) {
		SA.SB sb = new SA.SB();
		sb.me1();
		
		// static이 붙은 메소드와 멤버변수는 클래스타입으로 작성한다.
		SA.SB.number = 1;
		SA.SB.me2();
		// 클래스 경로를 import문 설정하면 SB 클래스 객체 생성은 가능하지만,
		// static이 붙었으므로 객체 생성하지 말아야 한다.
//		SB sb1 = new SB(); // X
		
	}
}
