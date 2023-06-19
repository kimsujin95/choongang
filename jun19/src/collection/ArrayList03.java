package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
	public static void main(String[] args) {
		// arr01를 만들어주세요.
		// 6칸, 1 ~ 45를 넣어주세요.
		// 중복이 있다면 제거해 주세요.
		// indexIf(value) : 해당 값이 있는 index를 반환한다.
		// contains(value) : 해당 값이 있으면 참이고, 없으면 거짓이다.

		ArrayList<Integer> arr01 = new ArrayList<Integer>();

//		for (int i = 0; i < 6; i++) {
//			arr01.add((int) ((Math.random() * 45) + 1));				
//			for (int j = 0; j < i; j++) {
//				if (i == j) {
//					i--;
//				};
//			}
//		}

		while (arr01.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			if (!arr01.contains(num)) {
				arr01.add(num);
			}
		}

		Collections.sort(arr01);
		System.out.println(arr01);

		Collections.reverse(arr01);
		System.out.println(arr01);

		arr01.add(45);
		arr01.add(40);
		arr01.add(6);
		// indexIf(value) : 해당 값이 있는 index를 반환한다.
		System.out.println(arr01.indexOf((Integer) 45));
		System.out.println(arr01.indexOf(40));
		System.out.println(arr01.indexOf(5));
		// contains((Integer) 40)
		System.out.println(arr01.contains(45));
		System.out.println(arr01.contains(40));
		System.out.println(arr01.contains(10));

		List<String> list = new ArrayList<String>();
		
	}
}