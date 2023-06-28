package threadex;
// 쓰래드 연습

public class Thread02 extends Thread {
	int seq;
	
	public Thread02(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(this.seq + "스래드 시작");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println(this.seq + "스래드 종료");
	
	}	// end run
	
	public static void main(String[] args) {
		System.out.println("main시작");
		
		for (int i = 0; i < 11; i++) {
			Thread02 thread02 = new Thread02(i);
			thread02.start();
		}
		
		System.out.println("main끝");
		
		
		
		
		
		
		
	}
}
