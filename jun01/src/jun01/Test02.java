package jun01;

public class Test02 {
	
	static void family() {
		System.out.println("아버지, 어머니, 형, 나");
	}
	
	public static void teacher() {
		System.out.println("윤승현 강사님");
	}
	
	void family1() {
		System.out.println("아버지, 어머니, 형, 나");
	}
	
	public static void main(String[] args) {
		family();
	
		Test02 t2 = new Test02();
		t2.family1();
		
		teacher();

		int apple = 4;
		
		apple = 9000;
		
		System.out.println(apple);
		
	}
}
