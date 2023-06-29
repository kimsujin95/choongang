package threadEx;

public class User1 extends Thread {
	private Calculator calculator;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		// 메모리 : 100
		calculator.setMemory(100);
	}
	
}
