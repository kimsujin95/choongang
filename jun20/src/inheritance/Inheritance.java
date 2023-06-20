package inheritance;

import java.util.*;

// 패키지 (286p) : 관련성 있는 자바 파일들을 폴더 단위로 구분한다.
//				   com.poseidon.print
//                 net.daum.map
// import (290p) : 상위패키지.하위패키지.클래스명;
// 				 import java.util.*;
 
// 2023-06-20 : 프로그래밍 언어활용

// static, 상속, 추상화, 인터페이스 순으로...

/* 나 <--> 부모님
 * 상속
 * 자바에서 클래스의 상속은 아래와 같은 장점이 있습니다.
 * 1. 기존에 작성된 클래스를 재활용할 수 있습니다.
 * 2. 자식 클래스 설계 시 중복되는 멤버를
 *    미리 부모 클래스에 작성해 놓으면,
 *    자식 클래스에서는 해당 멤버를 작성하지 않아도 됩니다
 * 3. 클래스 간의 계층적 관계를 구성함으로써
 *    다형성의 문법적 토대를 마련합니다.
 *    
 * class 자식클래스이름 extends 부모클래스이름 { ... }   
 * 
 * 자바에서 클래스는 단 한 개의 클래스만을 상속받는
 * 단일 상속만이 가능합니다.
 * 
 * ---------------------------------------------------------------------------
 * 자바의 모든 클래스는 Object의 하위 클래스입니다.
 * 
 */
class Apple {
	private int number;
	private String name;
	
	private Apple() {
		
	}
	
	static Apple getInstance() {
		return new Apple();
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number > 100) {
			number = 50;
		}
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals("바보") || name.equals(null)) {
			name = "춘식이";
		}
		this.name = name;
	}
	
//	public void setNumber(int number) { // setter --> DTO
//		this.number = number;
//	}
//	
//	public int getNumber() { // getter
//		return this.number;
//	}
}

class Animal { // 부모 클래스, 상위 타입, 슈퍼 타입
	String name;
	int age;
	
	public void sound() {
		System.out.println("자식마다 소리가 달라요.");
	}
}
// 자바는 단일상속을 합니다.

class Dog extends Animal { // 자식 클래스, 하위 클래스, 서브 타입
	int number;

	@Override
	public void sound() {
		System.out.println("BOWOW");
	}
}

class Cat extends Animal {
	// 부모에 정의된 메소드를 재정의해서 사용해보겠습니다.
	// 어노테이션 ---> 정보표시
	
	@Override
	public void sound() {
		System.out.println("Mew~ Meow~");
	}
}

public class Inheritance {
	// int number;를 선언.
	int number;
	public int num1;
	
	public void print1() {
		System.out.println("출력");
	}
	
	void print2() {}
	
	public static void main(String[] args) {
	/*
		// Apple a = new Apple();
		Apple a = Apple.getInstance();
		
		a.setNumber(150); // private number에 접근하지 못해서 메소드 활용
		System.out.println(a.getNumber()); // private number에 우회 접근
	*/	
		
		Animal[] oArr = new Animal[3];
		// oArr 배열 각 인덱스에 각기 다른 하위 클래스 객체들을 대입
		oArr[0] = new Dog(); 
		oArr[1] = new Cat();
		oArr[2] = new Human();
		
		for (int i = 0; i < oArr.length; i++) {
			oArr[i].sound();
		}
		
		Animal aaa = new Dog();
		Animal aaa4 = new Korean();
		aaa4.sound();
		//aaa4.ssn = ""; // 없는 것 처럼 보입니다.
		Korean kor = (Korean) aaa4;
		kor.ssn = "880605-7654321";
		kor.myInfo();
		kor.ssn = "880605-9753135";
		((Korean)aaa4).myInfo();
		
		System.out.println("========================================");
		
		List<Integer> l = new ArrayList<>();
		Set<Integer> s = new HashSet<>();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal a = new Animal();
		Object obj = new String();
		Number n = new Integer(10);
		
		cat.sound();
		dog.sound();
		KorShort korShort = new KorShort();
		korShort.sound();
		
		MZ mz = new MZ();
		mz.ssn = "950605-1234567";
		mz.myInfo("김수진", 29);
	}
}

class Human extends Animal {
	
}

class Asia extends Human {
	String rice;
}

class Korean extends Animal {
	String ssn;
	
	void myInfo() { // 840410-1******
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
		System.out.println("주민번호는 " + ssn.subSequence(0, 8) + "******입니다.");
	}
	
	@Override
	public void sound() {
		System.out.println("부모님이 한국분 이십니다.");
	}
}

class MZ extends Korean {
	
	void myInfo(String name, int age) { // 840410-1******
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
		System.out.println("주민번호는 " + ssn.subSequence(0, 8) + "******입니다.");
	}
}

class KorShort extends Cat {
	@Override
	public void sound() {
		System.out.println("냐옹.");
	}
}

/* 오버라이드 : 상속, 메소드 재정의
 * 				부모의 메소드를 자식 클래스에서 재정의 해서 사용하는 것이다.
 * 				부모의 일부 메소드를 다시 수정해서 사용한다.
 * 규칙 : 1. 부모의 메소드와 동일한 시그니처(리턴타입, 메소드명, 매개변수)를
 * 			 가지고 있어야 합니다. 다르면 다른 메소드
 * 		  2. 접근제한을 더 강하게 할 수 없습니다. 동일하게 설정합니다.
 * 			 혹은 더 넓게 지정합니다.
 * 		  3. 새로운 예외를 Throw할 수 없습니다.
 * 
 * 				오버라이드 했다면 메소드 상단에 @override라고 표시됩니다.
 * 			    자식 메소드에서 재정의 했다면 부모의 메소드는 은닉됩니다.
 * 				은닉된 부모의 객체를 호출할 때는 super로 호출합니다.				
 * 
 * 오버로드 : 매개변수, 같은 이름, 다른 호출 
 * 				하나의 클래스 속에 같은 이름의 메소드를 여러 개 만드는 것이다.
 * 				메소드 시그니처(수, 순서, 타입)이 일치하지 않으면 됩니다.
 * 				호출할 때는 시그니처에 맞는 메소드가 일을 합니다.
 *				접근제어자, 리턴타입은 보지 않습니다. 오로지 파라미터만. 
 * 
 * 
 * 
 * 
 */
