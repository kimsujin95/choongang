package wrapper;

public class Wrapper02 {
	public static void main(String[] args) {
		
		Integer i1 = 100;
		Integer i2 = 100;	// cache pool = 1byte = 바이트 영역
		System.out.println(i1 == i2);
		
		Integer i3 = 330;	// -128 ~ 127
		Integer i4 = 330;	// 바이트 영역을 넘어가면 -> 용량을 넓혀서 저장
		System.out.println(i3 == i4);
		
	}
}
