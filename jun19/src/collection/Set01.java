package collection;
// Set : 중복 없습니다. index가 없습니다.
// ArrayList : 중복 저장합니다. 순서가 있습니다. 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Set01 {
	public static void main(String[] args) {
		
//		ArrayList<Integer> arr01 = new ArrayList<Integer>();
//		arr01.add(100);
//		arr01.add(100);
//		arr01.add(100);
//		arr01.add(100);
//		System.out.println(arr01);
//		System.out.println(arr01.get(0));
		
		HashSet<Integer> set01 = new HashSet<Integer>();
		set01.add(103);
		set01.add(103);
		set01.add(102);
		set01.add(101);
		set01.add(100);
		
		System.out.println(set01.size());
		System.out.println(set01);
		
		set01.clear();
		System.out.println(set01.size());
		System.out.println(set01); // []

		while (set01.size() < 6) {
			set01.add((int)(Math.random() * 45) + 1);
		}
	
		System.out.println(set01.size());
		System.out.println(set01);
		
		for (Integer integer : set01) {
			System.out.println(integer);
		}
		
		// 정렬 -> List로 변경하기
		ArrayList<Integer> lotto = new ArrayList<Integer>(set01);
		Collections.sort(lotto);
		System.out.println(lotto);
	
		for (int i = 0; i < lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}
	}
}
