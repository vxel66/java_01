package Day08;

public class Cellphone {

	//�ʵ�
	 	String model;
	 	String color;
	//������
	
		
		public Cellphone(String model, String color) {
			super();
			this.model = model;
			this.color = color;
		}
	
	//�޼ҵ�[���������� ���� default ��ȯŸ�� �޼ҵ� (�μ�1){������
	void powerOn() {
		System.out.println("������ �մϴ�");}	
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�");
	}
	void sendVoice(String message) {
		System.out.println("����:" + message);
	}
	void receiveVoice(String message ) {
		System.out.println("���� :"+message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�");
	}
	
		//void ��ȯ�� ����  return����
}
