package Day09;

public class Day09_4 {

	
		//�������̽� : ��ü�� ������� �����ϴ� Ÿ��
			//���� : Ŭ�������� �����ؾ� ��� ������ �����ϴµ� ���Ǵ� �߻��ڷ�
			//�߻� 
			//�� : ������ 
				// �������̽�[��ư] = �̵���ư,���ݹ�ư,����ư
				// Ŭ����[���ӵ�]= �������, ��ɰ���,rpg����
					//������ �������� ���δٸ� Ŭ�������� ����
		//implements : �����ϴ�
			//�߻�޼ҵ� : ���� �ִ� �޼ҵ� => ����� Ŭ���������� ����
			//�߻�޼ҵ� ����
		//�������̽��� ȥ�� ��ü ���� �ȵ�
			//�͸� ���� ��ü : 
	public static void main(String[] args) {
		
		//p.347 ~ 354
			//1.�������̽� ���� : RemoteControl
			//2.Ŭ���� ���� : Telvision
			//3.Ŭ���� ���� : Audio
		
		//1. ������ ���� [�޸� �Ҵ� x ]
		RemoteControl rc;
		//2. �����ܿ� �ڷ����� Ŭ���� ����
		rc = new Television(); // �ش縮������ �ڷ��������� ���
			//�ڷ����������� ���
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(5);
		//3. �ڷ����� �������� ����� ������ ����
			System.out.println("�������� ��������������� �����մϴ�");
			rc = new Audio();
			// ����� ������ ���
			rc.turnOn();
			rc.turnOff();
			rc.setVolume(15);
			
			rc.setMute(true); //����Ʈ�޼ҵ� ������
			
		RemoteControl.changeBattery(); //�����޼ҵ�� ��ü ���� ���
		//p.355 : �͸� ���� ��ü : ��ȸ�� �ڵ�
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






















