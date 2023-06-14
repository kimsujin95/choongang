package jun07;
// 이름 만드는 방법, class, method, var, data type
// if, for
class AppleKorea {
	public void apple() {
		System.out.println("사과입니다.");
	}
}

public class Test02 {
	
	// 메소드 속에 메소드가 들어갈까요? : 아니오.
	public static void ppp() {
		System.out.println("저는 ppp메소드 입니다.");
	}
	
	// 메소드 속에 메소드를 생성할 순 없지만 호출은 가능하다.
	public static void print() {
		ppp(); // 메소드 호출을 해야 실행됩니다. - main()메소드 안에서
	}

	public static void main(String[] args) {
		
		int i = 100;
		String str = new String("R"); // 인스턴스 만들기
		String str2 = "R";
		print(); // 이렇게 한다면?
	
		//AppleKorea 클래스 불러오기
		AppleKorea appleKorea = new AppleKorea();
		// 메소드 실행하기
		appleKorea.apple();
	}
}
