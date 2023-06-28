package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
// 쓰래드, net, gui

public class Map02 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map02 = new LinkedHashMap<String, String>();
		map02.put("5번", "사과");
		map02.put("6번", "배");
		map02.put("1번", "포도");
		map02.put("9번", "복숭아");
		map02.put("7번", "망고");
		map02.put("2번", "두리안");
	
		System.out.println(map02);
		System.out.println(map02.keySet());
	
		// HashMap은 입력 순서를 무작위로 해도 출력도 순서와 다르게 무작위로 출력된다.
		// LinkedHashMap은 입력순서를 무작위로 하면 그 순서대로 출력된다.
		
	}
}
