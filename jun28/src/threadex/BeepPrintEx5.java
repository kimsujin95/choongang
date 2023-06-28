package threadex;

import java.awt.Toolkit;

// 익명객체로 만들기
public class BeepPrintEx5 {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {

						Thread.sleep(1500);

					} catch (InterruptedException e) {

						e.printStackTrace();

					}
				}
			}
		}; // 생성자 끝

		thread.start();
		
	}
}
