package jun12;

public class For04 {
	public static void main(String[] args) {
		
		A : for (int i = 0; i < 10; i++) { // 100
			for (int j = 0; j < 10; j++) { // 10
				for (int j2 = 0; j2 < 10; j2++) { // 1
					if (j * 10 + j2 == 11) {
						break; // 11 ~ 19, 111 ~ 119, 211 ~ 219, 311 ~ 319까지는 출력 X
					} else if (j == 3) {
						continue; // 30 X
					} else if (i == 2) {
						continue A; // A로 갑니다. 200 X
					}
					System.out.println(i + "" + j + j2);
				}
			}
		}
		
	}
}
