package ø¨Ω¿2;

public class Movie extends Thread {

	
	public boolean stop = true;

	public Movie(boolean stop) {
		super();
		this.stop = stop;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) {System.out.println("¿Ωæ«Ω√¿€");}
		else {System.out.println("¿Ωæ«¡æ∑·");}
	}
	
	
}
