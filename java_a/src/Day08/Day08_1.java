package Day08;

public class Day08_1 {

	//���� Ŭ���� => main �޼ҵ� [������ ]
	
	public static void main(String[] args) {
		
		//����Ŭ���� �̿��� ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		System.out.println("��"+dmbCellPhone.model);//�θ��ʵ� ���� privae ������ �ƴҰ�� �ɹ� ���� ����
		System.out.println("����"+dmbCellPhone.color);
		System.out.println("ä��"+dmbCellPhone.channel);
		
		//�θ� �޼ҵ�
		dmbCellPhone.powerOn();//�θ� �޼ҵ� ����
		dmbCellPhone.bell(); //�θ� �޼ҵ� ����
		dmbCellPhone.sendVoice("�ȳ��ֿ�");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���");
		dmbCellPhone.sendVoice("�ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
		
		//���Τ��޼ҵ�
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannel(12);
		dmbCellPhone.turnOnDmb();
	}
	
	
}
