package Day09;

public class Audio implements RemoteControl {
				//implements :Ŭ������ �������̽� ����
	//1. �ʵ�
	private int volum;
	private boolean mute;
	//2. ������
	
	//3. �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�");
			
	}
	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�");
			
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
		System.out.println("���� ����� ����:"+volume);	
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute ) {
			System.out.println("����� ���� ó���մϴ�");
		}else {System.out.println("����� ���� �����մϴ�");}
	}
}
