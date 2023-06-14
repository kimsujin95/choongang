package jun08;

import java.util.Arrays;
import java.util.Scanner;

// 배열 : 같은 데이터타입이 줄줄이 있습니다.
// 같은 타입, 동일관리, 주소호출
public class Array01 {
	public static void main(String[] args) {
				
		//int 타입의 10개 공간을 만들겠습니다.
		// 데이터타입 변수명 = 값;
		int[] arr01 = new int[10];
		// 실수형태의 배열 5칸짜리를 생성 = arr02
		double arr02[] = new double[5];
		// 문자열 3개를 저장하는 arr03
		String[] arr03 = new String[3];
		
		System.out.println(arr01); // [I@3d012ddd
		// 출력 [위치, index, 번지]를 적어줍니다.
		System.out.println(arr01[0]); // 변수[int index]
		// 입력 변수[위치]
		arr01[0] = 100;
		arr01[1] = 10;
		arr01[2] = 50;
		
		arr03[0] = "김수진";
		arr03[1] = "김길동";
		arr03[2] = "이길동";
		// arr03[3] = "박길동"; // 배열의 길이가 3 --> 0, 1, 2
		// 마지막 번지 = 길이 - 1
		
		System.out.println(arr03[0]);
		System.out.println(arr03[1]);
		System.out.println(arr03[2]);
		
		System.out.println("=============");
		System.out.println(arr03.length); // 길이 출력 int : 3 출력
		
		for (int i = 0; i < arr03.length; i++) {
			System.out.println(arr03[i]);
		}
		
		for (int i = 0; i < arr01.length; i++) { // 0 ~ 9
			arr01[i] = i + 1;
		}
		// 배열 전체 출력해보기 = Arrays 클래스 사용
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		System.out.println(Arrays.toString(arr03));
		// 초기값 = 객체는 객체 생성과 동시에 초기값을 가집니다.
		// 정수 = 0, 실수 = 0.0, 객체 = null
		// char = 0, boolean = false
		
		boolean[] bo = new boolean[3];
		
		for (int i = 0; i < bo.length; i++) {
			System.out.println(Arrays.toString(bo));
		}
	
		int test01[] = new int[3];
		System.out.println(Arrays.toString(test01)); 
		// [0, 0, 0]
		byte[] test02 = new byte[3];
		System.out.println(Arrays.toString(test02)); 
		// [0, 0, 0]
		short[] test03 = new short[3];
		System.out.println(Arrays.toString(test03)); 
		// [0, 0, 0]
		long[] test04 = new long[3];
		System.out.println(Arrays.toString(test04)); 
		// [0, 0, 0]

		float[] test05 = new float[3];
		System.out.println(Arrays.toString(test05)); 
		// [0.0, 0.0, 0.0]
		
		char[] test06 = new char[3];
		System.out.println(Arrays.toString(test06)); 
		// [ , , ]
	
		// R타입들은 값을 아직 넣지 않았을 때는 출력하면 null값으로 나온다.
		String[] test07 = new String[3];
		System.out.println(Arrays.toString(test07));
		// [null, null, null]
	
		Scanner[] test08 = new Scanner[3];
		System.out.println(Arrays.toString(test08));
		// [null, null, null]
		
		Object[] test09 = new Object[3];
		System.out.println(Arrays.toString(test09));
		// [null, null, null]
	
	}
}
