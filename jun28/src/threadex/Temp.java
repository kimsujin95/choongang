package threadex;

public class Temp extends Thread {
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				
			}
		}; // 생성자 끝
		thread.start();
	}
}
