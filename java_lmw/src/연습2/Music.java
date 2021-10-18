package ø¨Ω¿2;

public class Music extends Thread {

	
	static public boolean stop = true;
	


	static public void musicstop (boolean sw) {
		stop =sw;
		if(stop) {System.out.println("¿Ωæ«Ω√¿€");}
		else {System.out.println("¿Ωæ«¡æ∑·");}
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) {System.out.println("¿Ωæ«Ω√¿€");}
		else {System.out.println("¿Ωæ«¡æ∑·");}
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
