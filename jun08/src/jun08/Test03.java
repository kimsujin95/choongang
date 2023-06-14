package jun08;

import java.util.Arrays;
import java.util.Scanner;

// 알파벳을 A - Z까지 저장하는 배열을 만들어주세요.
public class Test03 {
	public static void main(String[] args) {
		
		char ch[] = new char[26];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (65 + i);
		}
		
		System.out.println(Arrays.toString(ch));
		
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (97 + i);
	
		}
		
		System.out.println(Arrays.toString(ch));
	
//		for (int i = 0; i < ch.length; i++) {
//			System.out.println("");
//		}
	}
}
