package Day13;

public class PrintThread extends Thread {

	private boolean stop;
	
	public void setStop( boolean stop) {
		this.stop = stop;
	}
	
	
	
	@Override
	public void run() {
		
		while(!stop) {
			System.out.println("실행중");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	
	
		System.out.println("실행종료");
	}
	


	}
}
