package jun15;

import java.util.Arrays;

import zoo.Animal;
import zoo.Cat;
import zoo.Dog;

// abstract : 추상화, 미완성인 상태, 객체를 만들지 못한다.
// final : 수정이 불가능하다.
// 프로그램 로직에 필요한 것과 필요없는 거 생각하기.

public class Human {
	// 필드
	// 사람에게 필요한 정보 -> 필요한 정보만 남기고 필요없는거 빼버림
	String name;
	int age;
	String addr;
	String ssn;
	double tall;

	// 생성자
	// 메소드
	void myInfo() {
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 나이는 " + age + "살입니다.");
	}

	public void talk() {
		System.out.println("말하기");
	}

	public void sleep() {
		System.out.println("자기");
	}

	public void eat() {
		System.out.println("먹기");
	}

	public static void main(String[] args) {

		Human h = new Human(); // 기본 생성자
//		int[] i = new int[3];
//		i[0] = 1;
		System.out.println("h : " + h); // jun15.Human@3d012ddd
		Human[] man = new Human[3];
		System.out.println("array : " + man); // [Ljun15.Human;@626b2d4a
		man[0] = h;
		man[1] = new Human();
		man[2] = new Human();
		man[1] = man[0]; // 메모리에서 [1]이 소거됩니다. GC(가비지 컬렉터) = 메모리 자동관리
		System.out.println("array[0] : " + man[0]); // jun15.Human@3d012ddd 
		System.out.println("array[1] : " + man[1]); // jun15.Human@3d012ddd 
		System.out.println("array[2] : " + man[2]); // jun15.Human@1c4af82c 
		
		
		h.name = "홍길동";
		System.out.println(h.name); // 홍길동
		System.out.println(man[0].name); // 홍길동
		System.out.println(man[1].name); // 홍길동
		System.out.println(man[2].name); // null
		
		System.out.println(h == man[1]); // R type에서는 객체 비교
		System.out.println(h == man[2]); // R type에서는 객체 비교
		
		man[1] = new Human();
		System.out.println("array[1] : " + man[1]); // jun15.Human@77ec78b9
		
		Human h2 = man[0];
		Object[] arr01 = new Object[3];
		arr01[0] = h;
		arr01[1] = 1000;
		arr01[2] = "이것도 됩니다.";
		// 프로모션
		
		int number = (int) arr01[1]; // int 캐스트
		System.out.println(number);
		
		String str = (String) arr01[2]; // String 캐스트
		System.out.println(str);
		
		Human h3 = (Human) arr01[0]; // Human 객체로 캐스팅
		
		// 다른 패키지에 있는 클래스 호출
		// cat
		Cat tom = new Cat();
		tom.sleep();
		tom.name = "톰";
		// dog
		Dog dog = new Dog();
		dog.sleep();
		dog.name = "시고르자브종";
		
		System.out.println(tom.name);
		System.out.println(dog.name);
		
//		System.out.println(h2);
//		System.out.println(h2.name);
//		System.out.println(h == h2);

		
//		h.name = "김수진";
//		h.age = 29;
//
//		h.myInfo();
//
//		h.talk();
//		h.sleep();
//		h.eat();

	}

}
