package A00;

public class ���� extends Thread {

static boolean stop = true  ;
		

	
	public static boolean getStop() {
	return stop;
}



public static void setStop(boolean onoff) {
	stop = onoff;
	if(stop) {
		System.out.println("���ǽ���");
	}else {
		System.out.println("��������");
	}
}



	@Override
		public void run() {
			
			while(stop) {
				System.out.println("���ǼҸ�");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	
	
}
