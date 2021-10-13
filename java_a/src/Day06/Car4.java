package Day06;

public class Car4 {

	
	//필드
	int gas; 
	//생성자
	
	//메소드
	
	void setGas(int gas) {
		this.gas =gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("가스 잔량:"+gas);
				gas-=1;
			}else {
				System.out.println("없습니다 가스잔량:"+gas);
				return;
			}
		}
	}
	
	  void run(int x) {} //가능
	//void run() {}     //불가능
	void start() {
		System.out.println("출발");
	}

	
	
}

