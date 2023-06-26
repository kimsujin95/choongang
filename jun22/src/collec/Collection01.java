package collec;
// List<E> : 순서 있어요. 중복 저장 허용해요. 
// Set<E> : 순서 없어요. 중복 저장 안해요.
// Map<K, V> : 순서 없어요. 키/값으로 저장해요.

import java.util.ArrayList;
import java.util.List;

public class Collection01 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();

		list.add(100); // 0
		list.add(200); // 1
		list.add(300); // 2
		
		System.out.println(list);
		
		for (int i = 0; i < 3; i++) {
//			list.get(i);
			list.add(i);
		}
		
		System.out.println(list); // [100, 200, 300, 0, 1, 2]
		
		for (int i = 0; i < 3; i++) {
			list.add(i * 2, 10 * i);
		}
		
		System.out.println(list); // [0, 100, 10, 200, 20, 300, 0, 1, 2]
		list.clear();
		
		System.out.println(list.isEmpty());
		
		for (int i = 10; i > 0; i--) {
			list.add(i);
		}
		System.out.println(list); // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
		
		// foreach
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
	}
}
