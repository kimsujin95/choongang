package threadex;

import java.awt.Toolkit;

// 스래드를 상속받아야 해요.
public class BeepTask implements Runnable {
// 실제 작업은 run()에 적어줍니다. 실행은 start()		

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {

				e.printStackTrace();
		
			}
		}
	}

}
