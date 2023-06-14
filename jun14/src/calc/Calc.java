package calc;

import java.util.Arrays;

public class Calc {
	// 필드
	// 생성자
	// 메소드

	int plus(int num1, int num2) {
		System.out.println("출력문 : 계산을 시작합니다.");
		return num1 + num2;
	}

	public static void main(String[] args) {

		Calc calc = new Calc();

		String name = "가나다라마";

		System.out.println(calc.plus(15, name.length()));

		Lotto lotto = new Lotto();
		
		// 중복제거
		// 정렬
		lotto.choose();
		lotto.sort();
		lotto.print();
		
		
		

	}
} // 클래스 밖

class Lotto {
	int[] lottoNum = new int[6];
	// 로또 번호 뽑는 메소드
	public int[] choose() {
		// 번호 뽑는 작업은 여기서...
		for (int i = 0; i < lottoNum.length; i++) {
			int temp = (int) (Math.random() * 45) + 1;
			boolean ch = true;
			
			for (int j = 0; j < i; j++) {
				if (temp == lottoNum[j]) { 
					ch = false; // 중복이면 거짓 
					break;
				}				
			}
		
			if (ch) {
				lottoNum[i] = temp; // 참이면 등록
			} else {
				i--;
			}
		}
		return lottoNum;
	}

	public void sort() {
		Arrays.sort(lottoNum);
	}

	public void print() {
		System.out.println("출력문 : 숫자를 뽑습니다.");
		System.out.print("[");
		for (int i = 0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i]);
			if (lottoNum[i] == lottoNum[lottoNum.length - 1]) {
				System.out.print("");
			} else {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}
