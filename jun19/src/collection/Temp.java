package collection;
// 주소록 만들어보기
import java.util.ArrayList;
import java.util.Arrays;

class Human {
	String name;
	String tel;
	
	public Human(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}

public class Temp {
	public static void main(String[] args) {
		// 제네릭에는 R타입형태만 적습니다.
		ArrayList<Human> arr01 = new ArrayList<Human>();
		
		arr01.add(new Human("홍길동", "010-5555-5678"));
		arr01.add(new Human("김나래", "010-5488-0147"));
		arr01.add(new Human("임길동", "010-2395-0678"));
		arr01.add(new Human("정길동", "010-8025-0503"));
		arr01.add(new Human("김수정", "010-1490-4509"));
		
		System.out.println(arr01);
		
		for (Human human : arr01) {
			System.out.println(human.name + " : " + human.tel);
		}
		
	}
}
