package Day13;

public class CalcThread extends Thread {

	//성성자 
	
	public CalcThread(String name) {
		super.setName( name );
		//super.메소드() :부모클래스내 메소드 접근
	}
	@Override
	public void run() {
		for(int i = 0 ; i<2000000000; i++) {
			
			
		}System.out.println("반복문종료 : " + getName());
	}
	
}
