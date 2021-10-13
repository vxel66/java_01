package Day06;

public class Day06_4 {

	
	public static void main(String[] args) {
		
		//1 객체만들기 [외부클래스에서 
		Car5 mycar = new Car5("포르쉐");
		Car5 yourcar = new Car5("밴츠");
	
		
		//2.객체를 통한 메소드 호출
		mycar.run();
		yourcar.run();
		
		
		
	}
}
