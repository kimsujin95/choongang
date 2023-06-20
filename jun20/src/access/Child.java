package access;

import inheritance.Parent;
// 상속으로 연결합니다.
// 부모의 코드 자식이 자신의 것처럼 활용한다.

class Son extends Parent {
	void print() {
		number2 = 10;
		System.out.println("number2 : " + number2);
	}
	
//	Parent p = new Son();
}

public class Child {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.number1 = 10;
		System.out.println("number1 : " + p.number1);
		// p.number2 = 10;
		// 상속으로 연결되지 않았기 때문에
		// number2를 쓸 수가 없다.
		
		Son s = new Son();
		s.print();

	}
}
