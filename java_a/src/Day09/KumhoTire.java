package Day09;

public class KumhoTire extends Tire {

	//�ʵ�
	
	//������
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}

	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;//���� ȸ���� ����
		if( accumulatedRotation< maxRotation) {//�ִ� ȸ���� �� ũ��
			System.out.println(" KumhoTire����:"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}
		else {//�ִ�ȸ������ �� ������
			System.out.println("***"+location+" KumhoTire��ũ");
			return false;// false ������ ������ ǥ���ϴ� ��ȯ
		}
	}
	
	
	
}
