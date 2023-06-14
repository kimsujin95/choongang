package jun12;
// label : break나 continue가 실행할 반복문의 위치를 이름으로 지정
public class For03 {
	public static void main(String[] args) {
		
		A : for (int i = 0; i < 10; i++) {
			B : for (int j = 0; j < 10; j++) {
				if (j == 5) {
					break B; // 가장 가까운 반복문을 탈출합니다.
				}
				System.out.println(i + "" + j);
			}
		}
		// B for문을 벗어날 때 05부터는 출력되지 않고 06이 출력되는 것이 아닌 
		// A for문으로 돌아가면서 증가되어 10부터 시작된다.
	}
}
