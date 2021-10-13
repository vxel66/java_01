package Day09;

public class Tire {

	public int maxRotation;   //�ִ�ȸ���� [Ÿ�̾� ����]
	public int accumulatedRotation; //���� ȸ����
	public String location; //Ÿ�̾���ġ
	
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() { // Ÿ�̾� ȸ�� �޼ҵ�
		
		++accumulatedRotation;//���� ȸ���� ����
		if( accumulatedRotation< maxRotation) {//�ִ� ȸ���� �� ũ��
			System.out.println("Tire����:"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}
		else {//�ִ�ȸ������ �� ������
			System.out.println("***"+location+"Tire��ũ");
			return false;// false ������ ������ ǥ���ϴ� ��ȯ
		}
	}
	
	
}
