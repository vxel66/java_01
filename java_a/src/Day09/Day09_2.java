package Day09;

public class Day09_2 {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1 ; i<=5 ; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTrie = new HankookTire(15, "�տ���");
				break;
			
		case 2:
			System.out.println("�տ��� ��ȣŸ�̾�� ��ü");
			car.frontLeftTrie = new HankookTire(13, "�տ�����");
			break;
		
	case 3:
		System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
		car.frontLeftTrie = new HankookTire(14, "�ڿ���");
		break;
	
case 4:
	System.out.println("�տ��� ��ȣŸ�̾�� ��ü");
	car.frontLeftTrie = new HankookTire(17, "�ڿ�����");
	break;

		}
		
		
	}

	
}
}
