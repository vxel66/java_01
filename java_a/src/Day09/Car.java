package Day09;


public class Car {

	Tire frontLeftTrie = new Tire(6,"앞왼쪽");
	Tire frontRightTrie = new Tire(2,"앞오른쪽"); 
	Tire beckLeftTrie = new Tire(3,"뒤왼쪽");
	Tire beckRightTrie = new Tire(4,"뒤오른쪽");
	
	int run() {
		//접근제한자 생략시 default
		System.out.println("[자동차가 달립니다]");
		if(frontLeftTrie.roll() == false) {
			stop(); return 1;
		}
		if(frontRightTrie.roll() == false) {
			stop(); return 2;
		}
		if(beckLeftTrie.roll() == false) {
			stop(); return 3;
		}
		if(beckRightTrie.roll() == false) {
			stop(); return 4;
		}
		return 0 ;
	}
	void stop() {
		System.out.println("자동차가 멈춤니다");
	}
	
}
