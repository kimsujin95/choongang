package jun12;
// 구구단 2단
import java.util.Iterator;

public class For02 {
	public static void main(String[] args) {
		// (2 * i)가 10보다 작을 경우 출력하세요.
		for (int i = 1; i < 10; i++) {
			if ((2 * i) >= 10) {
				// continue;
				break;
			}
			System.out.println("2 X " + i + " = " + 2 * i);
		}	
		// 책 156페이지에 나옵니다.
	}
}
