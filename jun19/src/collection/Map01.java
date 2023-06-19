package collection;

import java.util.HashMap;
import java.util.Set;

/*
 * List : 중복허용, 순서가 있습니다.  
 * Set :  중복 X, 순서 X
 * Map :  키와 값으로 저장합니다. 쌍으로 저장합니다. 
 *         키는 중복될 수 없습니다. 값은 중복 가능합니다.
 */
public class Map01 {
	public static void main(String[] args) {
		// Key, Value = 사전
		HashMap<String, String> map01 = new HashMap<String, String>();
		map01.put("사과", "사과입니다.");
		// map01.put(120, 1000);
		map01.put("배", "배입니다.");
		map01.put("토마토", "배입니다.");
		map01.put("사과", "사과라고 저장합니다.");
		
		System.out.println(map01);
		System.out.println(map01.get("토마토"));
		System.out.println(map01.get("사과"));
		System.out.println(map01.get("포도"));// key를 넣어야 value가 나옴
		
		System.out.println(map01.size());
		System.out.println(map01.isEmpty());
		// System.out.println(map01.remove("사과"));//삭제됩니다.
		
		// keySet() key를 뽑아줍니다.
		Set<String> ks = map01.keySet();
		System.out.println(ks); // [배, 토마토, 사과]
		
		System.out.println(map01.get("배"));
		System.out.println(map01.get("토마토"));
		System.out.println(map01.get("사과"));
		// for문으로 바꾸기
		
		for (String str : map01.keySet()) { // 키만 뽑아서 foreach
			System.out.println(map01.get(str));
		}
		
		System.out.println(map01.values()); // 값만 뽑기
	
		System.out.println(map01.containsKey("바나나"));
		System.out.println(map01.containsKey("사과"));
	
		System.out.println(map01.containsValue("바나나입니다."));
		System.out.println(map01.containsValue("배입니다."));
	
		//map01.clear();
		//System.out.println(map01.size());
		
		map01.replace("토마토", "토마토입니다.");
		System.out.println(map01);
		
	}
}