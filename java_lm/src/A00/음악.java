package A00;

public class ¿Ωæ« extends Thread {

static boolean stop = true  ;
		

	
	public static boolean getStop() {
	return stop;
}



public static void setStop(boolean onoff) {
	stop = onoff;
	if(stop) {
		System.out.println("¿Ωæ«Ω√¿€");
	}else {
		System.out.println("¿Ωæ«¡æ∑·");
	}
}



	@Override
		public void run() {
			
			while(stop) {
				System.out.println("¿Ωæ«º“∏Æ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	
	
}
