package A00;

public class ��ȭ extends Thread {

private static boolean stop;
	
	public static void setStop(boolean stop) {
		stop = stop;
			}
	
	@Override
		public void run() {
			while(!stop) {
				System.out.println("��ȭ�Ҹ�");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	
	
}
