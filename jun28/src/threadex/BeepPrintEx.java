package threadex;

public class BeepPrintEx {
	public static void main(String[] args) {
		
//		Runnable beepTask = new BeepTask();
		// 쓰래드 클래스 객체에서 생성자 안 매개변수로 BeepTask 객체를 사용할 수 있다.
		Thread thread = new Thread(new BeepTask());
		thread.start();
		
	}
}
