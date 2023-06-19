package car;
/* static 키워드
 * static 은 정적 이라는 위미가 있습니다.
 * 
 *  자바에서는 정적 개념과 동적 개념이 있습니다.
 *  쉽게 이야기 하면 정적은 클래스가 로드되는 시점이고
 *  동적은 로드된 클래스가 실행되는 이후를 이야기합니다.
 *  
 *  이중 객체는 동적 데이터입니다.
 *  프로그램이 실행된 이후에 발생되는 형태입니다.
 *  
 *  
 *  
 *  
 *  
 */

class Counter {
	static int count;
	public Counter() {
		count++;
	}

}

public class Static01 {
	public static void main(String[] args) {
		Counter c1 = new Counter(); // 0에서 증감
		System.out.println(Counter.count); // 1
		Counter c2 = new Counter(); // 1에서 증감
		System.out.println(Counter.count); // 2
		Counter c3 = new Counter(); // 2에서 증감
		System.out.println(Counter.count); // 3
		
		
		int[][] arr = new int[][] {{45, 50, 75, 81}, {89, 60, 38}};
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[1][2]);
		System.out.println(arr[0][3]);
		System.out.println(arr[1][1]);
		
	}
}
