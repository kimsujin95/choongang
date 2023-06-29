package threadEx;

public class User2 extends Thread {
	private Calculator calculator;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		// 메모리 : 50
		calculator.setMemory(50);
	}
	
}
