package inner;
// 정적 클래스 static class = 정적 멤버 클래스
/* class 앞에 static이 붙습니다. 객체 생성 없이 사용합니다. 
 * 클래스의 static변수처럼 사용합니다. 외부 클래스와 내부 클래스는 
 * 다르게 동작합니다.
 * 외부 클래스와 내부 클래스의 멤버가 private이더라도 상호 모두 접근 가능하다.
 * 경로만 지정되면 단독으로 직접 사용할 수 있습니다.
 *  
 * 
 */
public class StaticClass01 {
	static int num;
	public static class Inner{
		private int innerMember = 20;
		private static int outDF = 22;
		final int LV = 120;
		// static이 붙은 메소드는 static이 붙은 변수만 부를수 있지만,
		// static이 붙지 않은 메소드는 static이 붙든 안붙든 모두 부를 수 있다.
		public static void nestedMethod() {
//			System.out.println(innerMember);
			System.out.println(outDF);
//			System.out.println(LV);
		}
		public void innerMethod() {
			System.out.println(innerMember);
			System.out.println(outDF);
			System.out.println(LV);
		}
	} // inner Class end
	public static void main(String[] args) {
//		StaticClass01.Inner in = new StaticClass01.Inner(); 가능
		StaticClass01.Inner in = new Inner();
		in.innerMethod();
		StaticClass01.Inner.nestedMethod();
		// outDF
		StaticClass01.Inner.outDF = 100;
		
	}
	
}
