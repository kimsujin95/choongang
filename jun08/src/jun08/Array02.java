package jun08;

import java.util.Arrays;

/* 배열(Array)
 * 일단, 무조건 하나만 기억해주세요
 * 배열은 객체입니다. 그리고 객체는 기본적으로 속성과 메소드를
 * 가지고 있습니다.
 * 이 중 배열만 유일하게 속성만 가지고 있습니다.
 * 
 * 배열은 동일한 타입의 데이터를 하나의 묶음으로 관리하기 위해
 * 사용되는 데이터 구조입니다.
 * 
 * 예를 들어 int 타입의 변수가 100이 필요하다고 한다면?
 * 우리는 100개의 다른 이름, 다른 변수를 만들어야 합니다.
 * 시간도 많이 걸리고, 관리하기 어려워집니다.
 * 		
 * 이를 보완하기 위해서 사용하는 것이 배열입니다.
 * 		
 * 배열은 객체라고 했기 때문에 객체의 속성과 메소드를 사용해서
 * 배열을 관리합니다.
 * 배열은 유일하게 속성만 가지고 있습니다.
 * 배열의 속성 중 배열의 길이를 나타내는 length가 있습니다.
 * 객체의 속성과 메소드 등을 호출할 때는 .(점)을 사용합니다.
 * 
 * 		
 * 
 */		
public class Array02 {
	public static void main(String[] args) {
		// 10 9 8 7 6 5 4 3 2 1 = length = 10
		// 생성
		int[] arr01 = new int[10];
		
		// 값 입력 - 역순
		for (int i = 9; i >= 0; i--) {
			arr01[i] += 10 - i;
		}
		
		// 출력
		System.out.println(Arrays.toString(arr01));
		
		// 실수 배열 - 역순
		double[] arr02 = new double[3];
		
		for (int i = 2; i >= 0; i--) {
			arr02[i] = 2.0 - i;
		}
		
		System.out.println(Arrays.toString(arr02));
		
		// 생성 + 값입력
		int[] arr03 = new int[] {10, 9, 8, 7, 5};
		int arr04[] = {5, 4, 3, 2, 1};
		
		System.out.println(Arrays.toString(arr03));
		System.out.println(Arrays.toString(arr04));
		
		double[] arr05 = {2.45, 4.6, 6.7, 6.4};
		
		System.out.println(Arrays.toString(arr05));
		
		for (int i = 0; i < arr05.length; i++) {
			System.out.println(Arrays.toString(arr05));
		}
	}
}
