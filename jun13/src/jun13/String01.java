package jun13;

import java.util.Arrays;

// String 사용법
/* 문자열, "값", 값 불변, 주소, 참조타입
 * 
 * 
 */
public class String01 {
	public static void main(String[] args) {
		
		int num = 10;
		int num2 = 10;
		
		String str = new String("Hi");
		String str2 = new String("Hi");
		
		if (str.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
			
		// 문자열 = 문자 + 문자 + 문자 + 문자.....
		char[] ch = new char[] {'가', '&', 'A', '1'};
		String str3 = new String(ch); // 생성자는 메소드
		System.out.println(str3);
			
		byte[] by = new byte[] {65, 66, 67, 68, 69, 70};
		String str4 = new String(by); // ABCDEF
		System.out.println(str4);
			
		String str5 = new String(by, 0, 2); // src, 시작위치, length
		System.out.println(str5);
		
		str2 = "안녕하세요.";
		System.out.println(str2.length());
		char ch2 = str2.charAt(3);
		
		System.out.println(ch2);
		
		for (int i = 0; i < str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}
		
		str2 = "가나다라마바사";
		System.out.println(str2.length());
		// 맨 마지막 글자 "사"를 뽑아주세요.
		
		char ch3 = str2.charAt(6);
		System.out.println(ch3);
		System.out.println(str2.charAt(str2.length() - 1));
	
		String str6 = "ehwuifbwekcernjebcveryhbverlkhrlkfrnre";
		// 여기에서 e가 몇 개 있는지 갯수를 출력해주세요.
	
		int sum = 0;
		for (int i = 0; i < str6.length(); i++) {
			char ch4 = str6.charAt(i);
			if (ch4 == 'e') {
				sum++;
			}
		}
		System.out.println(sum);
	
		String str7 = str2.concat("님"); // "가나다라마바사" + 님
		System.out.println(str7);
		// 해당 글자를 포함하고 있는지 판별
		System.out.println(str2.contains("님")); // false
		System.out.println(str7.contains("님")); // true
		System.out.println(str7.contains("가")); // true
		System.out.println(str7.contains("가나다")); // true
		System.out.println(str7.contains("가다")); // false
		
		// indexOf
		System.out.println(str7.indexOf("나")); // 1
		System.out.println(str7.indexOf("님")); // 7
		System.out.println(str7.indexOf("라마바")); // 3
		System.out.println(str7.indexOf("타")); // -1  
		System.out.println(str7.indexOf("타파하")); // -1  
		
		// relaceAll
		String apple = "apple";
		apple = apple.replaceAll("p", "피");
		System.out.println(apple);
			
		// substring
		String result = str2.substring(3); // "가나다라마바사"
		System.out.println(result); // 라마바사
		
		result = str2.substring(1, 5); // 시작 index, 끝 index
		System.out.println(result); // 나다라마
		
		result = str2.substring(3, 4); // 라
		System.out.println(result); // 시작위치 <= a < 끝위치

		// equalsIgnoreCase()
		apple = "apple";
		System.out.println(apple.equalsIgnoreCase("apple"));
		System.out.println(apple.equalsIgnoreCase("APPLE"));
		System.out.println(apple.equals("apple"));
		System.out.println(apple.equals("APPLE"));
		
		// getByte()
		byte[] appleByte = apple.getBytes();
		System.out.println(Arrays.toString(appleByte));
		
	}
}
