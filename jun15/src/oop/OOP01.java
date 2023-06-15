package oop;

/* 객체지향 특징 
 * 
 * 캡슐화 = 보호 = 보안 = 콘텍600
 * 		관련된 데이터(필드)와 기능(메소드)를 하나의 묶음으로 처리한다.
 * 		
 * 상속 = 코드 재활용 = 이미 작성된 클래스(부모)를 이어받아서
 * 			새롭게 만드는(자식) 것이다.
 * 			자식 클래스는 부모 클래스의 모든 속성(필드)과 동작(메소드)를
 * 			사용할 수 있습니다.
 * 			필요한 기능은 자식 클래스에서 추가해 사용합니다.
 * 
 * 추상화 = 불필요한 것을 제외하고 필요한 것을 유지한다.
 * 			실제로 객체를 인스턴스화 할 때 필요한 내용을 남기고
 * 			나머지를 제외하는 것이다.
 * 
 * 다형성(부품화) = 객체의 동작이 변경되는 것이다.
 * 					파라미터나 상황에 따라 동작이 변경됩니다.
 * =======================================================================
 * 클래스 = 인스턴스를 발생시킬 수 있는 설계도 = 붕어빵 틀
 * 인스턴스 = 결과물 = 붕어빵
 * 
 * 자동차 설계도 -> 자동차 
 * 
 * 클래스 구성요소
 * 1. 필드 = 변수 -> 클래스 변수 / 인스턴스 변수   
 * 2. 생성자 
 * 3. 메소드 = 기능 
 * 
 * 
 * 
 * 
 * 
 */


class Notebook {
	String game;
	boolean power;
	int memory = 2048;
	
	void runGame() {
		if (power) {
			System.out.println(game + "을 구동합니다.");			
		}
	}

	void power() {
		if (power) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("켭니다.");
		}
		power = !power; // 상태 반전
	}
	
	void addMemory(int add) { //1024
		memory += add;
		System.out.println("업그레이드 되었습니다. " + memory);
	}

}

public class OOP01 { 
	public static void main(String[] args) { 
		
		Notebook gram = new Notebook();		
		System.out.println(gram.memory); 
		gram.game = "LOL"; 
		gram.power(); // 전원을 킨다.
		gram.runGame();
		gram.power(); // 전원을 끈다.
		gram.addMemory(1024); 
		
		Notebook sam = new Notebook();
		System.out.println(sam.memory);
		sam.game = "D4";
		sam.runGame();
		
	}

//	int[] getScore() {
//		
//		return new int[3];
//	}
}
