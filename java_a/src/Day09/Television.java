package Day09;

public class Television implements RemoteControl {
	//extends : ���赵 ����
	//implements : (�߻�޼ҵ� ����) �����ϴ�
	
	//�ʵ�
	private int volume;
	//������
	//�޼ҵ�
	
		//����� �������̽��� �߻�޼ҵ� �����ϱ�
	public void turnOn() {
		System.out.println("tv�� �մϴ�");
	}
	@Override //��������
	public void turnOff() {
		System.out.println("tv�� ���ϴ�");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			//���� ������ �ִ�������� Ŀ����
			this.volume = RemoteControl.MAX_VOLUME;
			//�ִ�������� �����ϱ� [ ��������� �ִ�������� Ŀ������ ����]
			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			//��������� �ּҼ���[0] ���� ������
			this.volume = RemoteControl.MIN_VOLUME;
			//�ּҼ������� �����ϱ� [ ��������� ������ �� ������ ]
		}else {
			this.volume = volume;
		}
		System.out.println("���� tv ����:"+volume);
	}
}
