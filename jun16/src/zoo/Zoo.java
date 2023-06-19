package zoo;
// Dog 클래스를 만들어주세요.
// 생성과 동시에 이름과 나이를 지정하는 생성자를 만들어주세요.
// 메인 메소드에서 인스턴스를 발생시키시고 출력해주세요.

class Dog {
	
	String name, addr;
	int age;
	
	// this();
	public Dog(String name) { 
		this.name = name;
	} 
	
	public Dog(String name, int age) {
//		this.name = name;
		this(name); // 생성자 호출
		this.age = age;
		System.out.println(name + "이가 태어났습니다. (" + age + ")살");
	}
	
	public Dog(String addr, int age, String name) {
		this(name, age);
		this.addr = addr;
		// 생성자 호출
		/* 같은 클래스에 정의된 다른 생성자를 호출하는 키워드 this();
		 * 호출하려면 생성자의 파라미터의 순서에 맞게 호출하면 자동으로
		 * 호출됩니다.
		 * 
		 * 단 this생성자 호출은 생성자 첫줄에만 호출가능합니다.
		 * 호출은 단 한번만 가능합니다.
		 * 
		 */
	}
	
	public void sleep() {
		System.out.println(this.name + "이가 잠을 자요");
	}
}

public class Zoo {
	public static void main(String[] args) {
		Dog d = new Dog("댕댕이");
		Dog dog = new Dog("댕댕", 1);		
	}
}
