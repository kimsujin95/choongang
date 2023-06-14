package jun14;
// 사람을 만들어보겠습니다.

class Human {
	// 필드
	String name;
	byte age = 10;
	String addr;
	String ssn;
	
	// 메소드 : 되돌려 주는 타입
	public double what() {
		return 3;
	}
	
	public boolean eat() {
		return true;
	}
	
	public int sleep() {
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;
	}
	
	public void work() {
		System.out.println(name + " Zzzzzz");
		String ng = "홍길동";
		name = ng;
		System.out.println(name);
	}
	
//	Human() {
//		name = "김수진";
//		age = 29;
//		addr = "서울시 서초구 서초중앙로";
//		ssn = "950605-1728017";
//	}
}

public class CM01 {
	
	public void cm02() {
		
	}
	
	public static void main(String[] args) {
		
//		int num1 = 10; // 지역변수
//		System.out.println(num1);
		
		Human human = new Human();
//		human.eat(); // 인스턴스.메소드명();
//		human.toString(); // Object에 있습니다. 최상위 타입입니다.
		
		human.work();
		System.out.println(human.name);
		System.out.println(human.sleep());
		
		int[] arr = new int[5];
		System.out.println(arr.length);
		String name = "가나다라";
		System.out.println(name.length());
		
		Apple a1 = new Apple();
		System.out.println(a1.age);
		
//		Human human2 = new Human();
		
//		int number = human.sleep();
//		int sleep = human.sleep();
//		System.out.println(number);
//		System.out.println(number);
//		
//		human.name = "ㄲㄲㄲㄲ";
//		int age = 10;
//		human.age =  human2.age;
		
	}
}
