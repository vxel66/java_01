package Day09;

public class Day09_4 {

	
		//인터페이스 : 객체의 사용방법을 정의하는 타입
			//목적 : 클래스들이 구현해야 햐는 동작을 지정하는데 사용되는 추상자료
			//추상 
			//예 : 오락기 
				// 인터페이스[버튼] = 이동버튼,공격버튼,방어버튼
				// 클래스[게임들]= 비행게임, 사냥게임,rpg게임
					//동일한 목적하의 서로다른 클래스들을 조작
		//implements : 구현하다
			//추상메소드 : 선언만 있는 메소드 => 연결된 클래스내에서 구현
			//추상메소드 구현
		//인터페이스는 혼자 객체 생성 안됨
			//익명 구현 객체 : 
	public static void main(String[] args) {
		
		//p.347 ~ 354
			//1.인터페이스 설계 : RemoteControl
			//2.클래스 설계 : Telvision
			//3.클래스 설계 : Audio
		
		//1. 리모컨 생성 [메모리 할당 x ]
		RemoteControl rc;
		//2. 리모콘에 텔레비전 클래스 연결
		rc = new Television(); // 해당리모컨은 텔레비전으로 사용
			//텔레비전리모컨 사용
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(5);
		//3. 텔레비전 리모컨을 오디오 리모컨 변경
			System.out.println("리모컨을 오디오리모컨을로 변경합니다");
			rc = new Audio();
			// 오디오 리모컨 사용
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(15);
			
			rc.setMute(true); //디폴트메소드 재정의
			
		RemoteControl.changeBattery(); //정적메소드는 객체 없이 사용
		//p.355 : 익명 구현 객체 : 일회성 코드
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	
	
}






















