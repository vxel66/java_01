package Day13;

import java.awt.Toolkit;

public class BeepThread extends Thread {

	public BeepThread() {
		setName("스레드A");
	}
	
	
	
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
	
		for( int i = 0 ; i<5 ; i++ ) { // 
			toolkit.beep(); // 비프음 소리 메소드
			
			// 무조건 예외처리
			try {Thread.sleep(1000);}  // 1초 일시정지 [ Thread.sleep( 밀리초[1000/1초] ) ]
			catch (InterruptedException e) {} 
		}
		
	}
	
	
}
