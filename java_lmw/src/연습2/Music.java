package ����2;

public class Music extends Thread {

	
	static public boolean stop = true;
	


	static public void musicstop (boolean sw) {
		stop =sw;
		if(stop) {System.out.println("���ǽ���");}
		else {System.out.println("��������");}
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) {System.out.println("���ǽ���");}
		else {System.out.println("��������");}
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
