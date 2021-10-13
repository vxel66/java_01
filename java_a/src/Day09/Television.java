package Day09;

public class Television implements RemoteControl {
	//extends : 설계도 연장
	//implements : (추상메소드 정의) 구현하다
	
	//필드
	private int volume;
	//생성자
	//메소드
	
		//연결된 인터페이스의 추상메소드 정의하기
	public void turnOn() {
		System.out.println("tv를 켭니다");
	}
	@Override //생략가능
	public void turnOff() {
		System.out.println("tv를 끕니다");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			//현재 소음이 최대소음보다 커지면
			this.volume = RemoteControl.MAX_VOLUME;
			//최대소음으로 대입하기 [ 현재소음은 최대소음보다 커질수가 없음]
			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			//현재소음이 최소소음[0] 보다 작으면
			this.volume = RemoteControl.MIN_VOLUME;
			//최소소음으로 대입하기 [ 현재소음은 음수가 될 수없음 ]
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨:"+volume);
	}
}
