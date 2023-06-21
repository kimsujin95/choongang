package interf;
// 인터페이스 만들어보기
// 2023-06-21 프로그래밍언어 활용
// 다중 상속 --- 상속... 단일 상속
// 인터페이스는 추상메소드만 들어가요

abstract class Hero { // 추상 클래스 : 인스턴스 X, 상속용도로만 존재한다.
	String name;
}

// 인터페이스 : 각종 기능 : 추상 메소드들이 인터페이스 안에 들어갑니다.
interface Do {

	//상수도 가능
	static final int NUMBER = 150;
	// 추상 메소드 : 상속 받는 자식들은 강제로 구현
	public void attack(); // 추상 메소드만 오니까...
	public void eat();	
	public void sleep();
	
}

interface Fly {
	public void fly(); // 날아다니는 기능을 다른 인터페이스로 제작했습니다.
}

class Ironman extends Hero implements Do, Fly { // 다중 상속
	// Hero 상속만 받았다. + 인터페이스 구현
	@Override
	public void attack() {}

	@Override
	public void eat() {}

	@Override
	public void sleep() {}

	@Override
	public void fly() {}
	
}

class Hulk extends Hero implements Do {

	@Override
	public void attack() {}

	@Override
	public void eat() {}

	@Override
	public void sleep() {}
	
}

class SpiderMan extends Hero implements Do, Fly {
	
	@Override
	public void attack() {}
	
	@Override
	public void eat() {}
	
	@Override
	public void sleep() {}

	@Override
	public void fly() {}
	
}

public class Inter01 {
	public static void main(String[] args) {
		Ironman ironman = new Ironman();
		ironman.fly();
		
		Hulk hulk = new Hulk();
		// hulk.fly(); fly() 메소드가 없다.
		
		SpiderMan spiderman = new SpiderMan();
		spiderman.fly();
		
	}
}
