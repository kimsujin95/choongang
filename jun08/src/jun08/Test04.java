package jun08;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input;
      
      System.out.println("암호화 할 문장을 입력하세요.");
      System.out.print("입력 : ");
      
      input = sc.nextLine();
      //입력받은 문장을 모두 대문자화 하기
      input = input.toUpperCase();
      
      //System.out.println(input);
      //String to char
      char[] chInput = input.toCharArray();//스트링 -> char배열
      // 바퀴를 두 번 만들지 마라.
      System.out.println(Arrays.toString(chInput));
      
      //for문 사용하시고, 출력해주세요.
      //X, Y, Z -> A, B, C
      for (int i = 0; i < chInput.length; i++) {
    	  // 만약 chInput[i] + 3 한 것이 X를 넘어간다면 다시 A로
    	  if (chInput[i] + 3 >= 'X') {
    		  System.out.print((char) (chInput[i] - 23));  
    	  } else {
    		  System.out.print((char) (chInput[i] + 3));    		  
    	  }
      }
   }
}
