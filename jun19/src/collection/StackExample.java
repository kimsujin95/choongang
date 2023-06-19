package collection;

import java.util.Stack;

class Coin {
	public int value;
	
	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	} 
}

public class StackExample {
	public static void main(String[] args) {
		
		// Coin객체를 Stack에 넣습니다.
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전을 끼움
		coinBox.push(new Coin(100)); // 첫 번째
		coinBox.push(new Coin(50)); // 두 번째
		coinBox.push(new Coin(500)); // 세 번째
		coinBox.push(new Coin(10)); // 네 번째
		
	
		while (!coinBox.isEmpty()) { // 동전 케이스가 비었는지 확인
			Coin coin = coinBox.pop(); // 동전 케이스에서 제일 위의 동전을 꺼냄
			System.out.println("꺼낸 동전 : " + coin.getValue() + "원");
		
			// 꺼낸 동전 : 10원  -> 네 번째가 첫 번째
			// 꺼낸 동전 : 500원 -> 세 번째가 두 번째
			// 꺼낸 동전 : 50원 -> 두 번째가 세 번째
			// 꺼낸 동전 : 100원 -> 첫 번째가 네 번째

		}
	}
}
