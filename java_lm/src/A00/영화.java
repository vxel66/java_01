package A00;

public class 영화 extends Thread {

private static boolean stop;
	
	public static void setStop(boolean stop) {
		stop = stop;
			}
	
	@Override
		public void run() {
			while(!stop) {
				System.out.println("영화소리");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	
	
}
