package Day09;

public class HankookTire extends Tire {
	
	//�ʵ�
	
	//������
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}


	//�޼ҵ�
	//�������̵� : �޼ҵ� ������[�޼ҵ� ���빰 �ٲٱ�]
	@Override
	public boolean roll() {
		++accumulatedRotation;//���� ȸ���� ����
		if( accumulatedRotation< maxRotation) {//�ִ� ȸ���� �� ũ��
			System.out.println(" HankookTire����:"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}
		else {//�ִ�ȸ������ �� ������
			System.out.println("***"+location+" HankookTire��ũ");
			return false;// false ������ ������ ǥ���ϴ� ��ȯ
		}
	}
	
	
}
