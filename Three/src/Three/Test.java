package Three;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	static String toBinaryString(int num, int n) {
		String str = Integer.toBinaryString(num);

		while (str.length() != n) {
			str = "0" + str;
		}

		return str;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
  
	System.out.print("Input n : ");
      int n = sc.nextInt();
      int[] arr1 = new int[] {9, 20, 28, 18, 11};
      int[] arr2 = new int[] {30, 1, 21, 17, 28};
      /*
       for (int i = 0; i < arr2.length; i++) {
        int x = (int)(Math.random()*(int)(Math.pow(2, n))); // 0~2^n-1
      int y = (int)(Math.random()*(int)(Math.pow(2, n))); // 0~2^n-1
      arr1[i] = x;
      arr2[i] = y;
      
   		}
   		*/
      
      System.out.println("첫번째 지도");
      System.out.println(Arrays.toString(arr1));
      System.out.println("두번째 지도");
      System.out.println(Arrays.toString(arr2));
      System.out.println(" ");
     
      char[][] map1 = new char[5][5];
      for(int i = 0; i < 5; i++) {
         for(int j = 0; j < 5; j++) {
            map1[i][j] = toBinaryString(arr1[i], 5).charAt(j);
         }
      }
      // 1번 지도
      for(char[] cs : map1) {
         System.out.println(Arrays.toString(cs));
      }
  
  
      char[][] map2 = new char[5][5];
      for(int i = 0; i < n; i++) {
         for(int j = 0; j < 5; j++) {
            map2[i][j] = toBinaryString(arr2[i], 5).charAt(j);
         }
      }
      // 2번 지도
      System.out.println();
      for(char[] cs : map2) {
         System.out.println(Arrays.toString(cs));
      }
      
      
      char[][] map = new char[5][5];
      for(int i = 0; i < 5; i++) {
         for(int j = 0; j < 5; j++) {
            if((map1[i][j] == '1' || map2[i][j] == '1') || (map1[i][j] == '0' && map2[i][j] == '1') || (map1[i][j] == '1' && map2[i][j] == '0'))
               map[i][j] = '#';
            else
               map[i][j] = ' ';
         }
      }
      // 암호 해독 지도
      System.out.println();
      for(char[] cs : map) {
         System.out.println(Arrays.toString(cs));
      }
      //3  011
      //4  100
      //   111
      //System.out.println(Integer.toBinaryString(3|4));
   }
}
