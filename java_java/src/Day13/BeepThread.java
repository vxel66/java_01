package Day13;

import java.awt.Toolkit;

public class BeepThread extends Thread {

	public BeepThread() {
		setName("������A");
	}
	
	
	
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
	
		for( int i = 0 ; i<5 ; i++ ) { // 
			toolkit.beep(); // ������ �Ҹ� �޼ҵ�
			
			// ������ ����ó��
			try {Thread.sleep(1000);}  // 1�� �Ͻ����� [ Thread.sleep( �и���[1000/1��] ) ]
			catch (InterruptedException e) {} 
		}
		
	}
	
	
}
