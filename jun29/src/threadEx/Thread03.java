package threadEx;

import java.util.ArrayList;

public class Thread03 extends Thread {
	int seq;
	
	public Thread03(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() { // 오버라이드 해서 적어줍니다.
		System.out.println(this.seq + "번째 스래드 시작");
		try {
			
			Thread.sleep(1000); // 1초
		
		} catch (InterruptedException e) {

			e.printStackTrace();
		
		} 
		System.out.println(this.seq + "번째 스래드 끝");
	}
	
	// 동기화 join : 스레드가 모두 종료된 후에 main을 종료하겠습니다.
	public static void main(String[] args) {
		System.out.println("Main메소드 시작");
		
		ArrayList<Thread03> al = new ArrayList<Thread03>(); // 생성된 스래드 담을 
		
//		for (int i = 0; i < 11; i++) {
//			Thread03 thread03 = new Thread03(i);
//			thread03.start();
//			al.add(thread03); // 리스트에 담아요.
//		}

		for (int i = 0; i < 11; i++) {
			Thread03 thread03 = new Thread03(i);
			thread03.start();
			// ArrayList 배열에 Thread03 객체를 담은 al 인스턴스 변수에 thread03 인스턴스 변수를 add()메소드에 담는다.
			al.add(thread03);
		}
		
		for (int i = 0; i < al.size(); i++) {
			// 다시 Thread03 객체 인스턴스 변수 t에 al에 담긴 데이터를 뽑아낸다.
			Thread03 t = al.get(i);
			try {
			
				t.join();
			
			} catch (InterruptedException e) {

				e.printStackTrace();
			
			}
		}
		
		System.out.println("Main메소드 끝");
	
		
		
	}
}
