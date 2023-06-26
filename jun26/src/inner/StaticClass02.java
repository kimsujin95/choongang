package inner;
// 정적 멤버 클래스 408p

class A {
	static class C { // static 클래스로 선언한다.
		
		public C() {} // 생성자
		
		int field; // 인스턴스 변수
		static int field2; // 정적 변수
		void method1 () {} // 인스턴스 메소드
		static void method2 () {} // static 메소드
	}
}
public class StaticClass02 {
	public static void main(String[] args) {
		
		A.C c = new A.C();
		c.field = 100;
		c.method1();
		
		A.C.field2 = 10;
		A.C.method2();
		
	}
}
