package ¿¬½À02;

public class ¸Á¾ÆÁö extends Thread {

	public ¸Á¾ÆÁö() {
		setName("¸Á¾ÆÁö");
	}
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("¸Á¾ÆÁö¼Ò¸®");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
}
