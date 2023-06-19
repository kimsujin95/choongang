package collection;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {
	public static void main(String[] args) {
		// key = id value = pw
		HashMap<String, String> map = new HashMap<>();

		map.put("admin", "01234567");
		map.put("root", "01234567");
		map.put("test", "testtest");
		map.put("admin", "admin01234"); // key 중복

		boolean b = true;
		Scanner sc = new Scanner(System.in);
		
		while(b) {
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();
	
			System.out.print("암호를 입력하세요 : ");
			String pw = sc.next();
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("정확히 일치합니다.");
					b = !b;
				} else {
					System.out.println("암호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("아이디가 없습니다.");
			}
		}
		
	}
}
