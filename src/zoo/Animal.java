package zoo;
// 개, 고양이, 쥐, 말 등등등

// public은 해당 파일명과 동일한 클래스만 넣을 수 있다.

class Ancestor { // 개, 고양이, 말, 쥐의 선조
	public void sleep() {
		System.out.println("Zzzzzz...");
	}
}

class Rat extends Ancestor {
	String name;
	int age;
}

class Horse extends Ancestor {
	String name;
	int age;
}

public class Animal {
	public static void main(String[] args) {
		// 각각 동물들을 인스턴스화 해주세요.
		Ancestor[] ani = new Ancestor[4];
		ani[0] = new Cat();
		ani[1] = new Dog();
		ani[2] = new Rat();
		ani[3] = new Horse();

		for (int i = 0; i < ani.length; i++) {
			ani[i].sleep();
		}
		
	}
}
