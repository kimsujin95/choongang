package jun08;
// String 자르기
public class Test05 {
	public static void main(String[] args) {
		
		String word = "Hello";
		//			   01234
		System.out.println(word.length()); // 5
		
		System.out.println(word.charAt(4)); // o
		
		for (int i = 0; i < word.length(); i++) {
			System.out.print( (char) (word.charAt(i) + 3) );
		}

		System.out.println("\n============");
		
		System.out.println(word.substring(2)); // llo
		System.out.println(word.substring(3)); // lo
		System.out.println(word.substring(0, 2)); // He
		System.out.println(word.substring(2, 4)); // ll
		
		String name = "가나다라마법사";
		
		System.out.println(name.length());
		System.out.println(name.substring(4, name.length())); // 마법사
		
	}
}
