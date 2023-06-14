package jun12;
// 반복문을 제어합니다.
public class For01 {
	public static void main(String[] args) {
		
		// 1 ~ 10까지 출력되는 반복문
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 5) {
				// break; // 가장 가까운 반복문을 탈출합니다.	
				// System.out.print(i + " "); break문 바로 다음에는 코드가 올 수 없다.
				continue; // 이하 실행문을 무시하고 다시 반복.
			} // continue 보다 위에 출력문이 있으면 상관없이 출력된다.
			System.out.println("continue아래 문장입니다.");
		}
		//
	}
}
