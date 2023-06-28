package map;

import java.util.TreeMap;

public class Map01 {
	public static void main(String[] args) {
		//treeMap : 이진트리를 기반으로 한 map
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		
		map1.put(6, "자바");
		map1.put(3, "JSP");
		map1.put(7, "spring");
		map1.put(8, "SQL");
		map1.put(1, "Android");
		map1.put(2, "Swift");
		map1.put(5, "Python");
		
		System.out.println(map1);
		System.out.println(map1.keySet());
		
		
	}
}
