package Day09;

public class Audio implements RemoteControl {
				//implements :클래스에 인터페이스 연결
	//1. 필드
	private int volum;
	private boolean mute;
	//2. 생성자
	
	//3. 메소드
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
			
	}
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
			
	}
	@Override
	public void setVolume(int volume) {
		if( volume > MAX_VOLUME) {
			this.volum = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volum = RemoteControl.MIN_VOLUME;
		}else {
			this.volum = volume;
		}
		System.out.println("현재 오디오 볼륨:"+volume);	
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute ) {
			System.out.println("오디오 무음 처리합니다");
		}else {System.out.println("오디오 무음 해제합니다");}
	}
}
