package interf;
// 인터페이스
/* 인터페이스는 왜 생겼을까?
 * 어떻게 써야 할까?
 * 특징은 무엇인가?
 * 
 * 인터페이스란?
 * 추상 클래스 : 추상 메소드가 하나라도 있거나 class 앞에 abstract를 붙인 것이다.
 * 				 인스턴스 생성을 위해 존재하는 것이 아니라 (= 객체 생성 용도 X)
 *				 상속에서 부모 용도로 존재하기 위해서 만들어 준 것이다.
 * 
 * 추상 메소드 : 바디({})가 없는 메소드 = 구현부가 없습니다.
 * 				 리턴 타입 앞에 abstract를 붙여줍니다.
 * 				 public abstract void print();
 * 				 자식 클래스에서 오버라이드 해야 합니다.
 * 
 * 인터페이스 : 상수 + 추상 메소드
 *              다중 상속이 가능합니다.
 *              외부와 연결하는 통로역할을 합니다.
 * 
 * 
 * 
 * 
 * 
 */


public class Inter02 {
	public static void main(String[] args) {
		Television tv = new Television();
		Audio audio = new Audio();
		
		tv.turnOn();
		audio.turnOn();
		
//		tv.setVolume(4);
//		audio.setVolume(6);
			
		RemoteControl rc = new Audio();
		
		rc.turnOn();
		
		tv.turnOff();
		audio.turnOff();
	}
}
