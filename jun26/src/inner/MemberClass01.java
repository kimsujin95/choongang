package inner;
// 멤버 클래스
/*
 * 내부에 있는 앞에 static붙으면 정적 클래스이다.
 * 내부에 있는 클래스 앞에 아무것도 없으면 멤버 클래스이다.
 * 
 * 내부 클래스는 클래스 내에 선언되었으므로 인스턴스 속성처럼 사용됩니다.
 * 즉 메소드 {}안에서 유효합니다.
 * 
 * 내부 클래스는 외부 클래스의 멤버를 사용할 수 있지만, 외부 클래스는
 * 내부 클래스의 멤버변수를 사용할 수 없습니다.
 * 또한 static붙은 메소드 내에서는 내부 클래스의 객체 선언은 X
 * 
 */
public class MemberClass01 {
	
	private int outerDF = 500;
	private static int SI = 100;
	int c = 777;
	
	void outerMethod() {
		System.out.println(c);
		System.out.println(outerDF);
		System.out.println(MemberClass01.SI);
		// 내부 클래스 객체 생성
		InnerMember im = new InnerMember();
		im.method();
		System.out.println(im.iX); // 내것처럼
//		System.out.println(InnerMember.B3); 
		
	}
	
	public static void outterM() {
//		InnerMember im2 = new InnerMember(); 생성 불가능 = static
		// 외부 객체 생성 후 사용해야 합니다.
	}
	
	public class InnerMember {
		private int iX = 1;
		int outDF = 0;
		static final int B2 = 222; // static은 final붙은것만 처리 가능하다.
		static int B3 = 100;
		
		public void method() {
			int methodInt = 130;
			
		}
	} // class end
	
	public static void main(String[] args) {
		MemberClass01 inst = new MemberClass01();
		MemberClass01.InnerMember in = inst.new InnerMember();
		in.method(); // 이렇게 호출 할 수 있습니다.
	
		// 외부 객체 생성 후 메소드를 사용하지만
		// 객체 생성 없이 클래스변수로 사용하는게 관례?
		inst.outterM();
		MemberClass01.outterM();
	}
	
}
