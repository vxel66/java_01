package Day08;

public class Cellphone {

	//필드
	 	String model;
	 	String color;
	//생성자
	
		
		public Cellphone(String model, String color) {
			super();
			this.model = model;
			this.color = color;
		}
	
	//메소드[접근제한자 생략 default 반환타입 메소드 (인수1){실행코
	void powerOn() {
		System.out.println("전원을 켭니다");}	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String message) {
		System.out.println("본인:" + message);
	}
	void receiveVoice(String message ) {
		System.out.println("상대방 :"+message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
		//void 반환이 없다  return없음
}
