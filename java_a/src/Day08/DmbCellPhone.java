package Day08;

public class DmbCellPhone extends Cellphone {
						//extends " �������� //��� 1��
	//�ڵ��� �⺻��� => Cellphon
	//�ʵ� 
	int channel;
	//������
	public DmbCellPhone(String model,String color,int channel) {
		// this : ���� Ŭ������ �ɹ�
//		this.model = model; //�θ�Ŭ������ �ɹ� ���
//		this.color = color; //�θ�Ŭ������ �ɹ� ���
//		this.channel = channel; //����Ŭ���� �ɹ� ���
		
		
		//�θ�Ŭ���� ������ ������ ->
		super(model,color); //�θ�Ŭ���� ������ ȣ��
		this.channel = channel;//����Ŭ���� �ɹ� ���
	}
	void turnOnDmb() {
		System.out.println("ä��:"+channel+"�� ����� ����");
	}
	void changeChannel(int channel) { 
		this.channel = channel;
		//this.channel ����Ŭ�������ɹ�
		//channel �޼ҵ忡 �ܺηκ��� ���� �μ�
		System.out.println("ä��"+channel );
	}
	void turnOffDmb() {
		System.out.println("DMb��� ������ ����ϴ�");
	}
	
	//�������̵� [�θ�Ŭ������ �޼ҵ� ������] "�ڵ��ϼ�
	
	@Override // ������ => �ڵ庯�� @:������̼� 
	void powerOn() {
		//super.powerOn(); �θ�޼ҵ� ȣ��
		System.out.println("���� �޼ҵ� ������ " );
	}
	
	
}
