package Day09;

public class Day09_2 {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1 ; i<=5 ; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLeftTrie = new HankookTire(15, "앞왼족");
				break;
			
		case 2:
			System.out.println("앞왼쪽 금호타이어로 교체");
			car.frontLeftTrie = new HankookTire(13, "앞오른족");
			break;
		
	case 3:
		System.out.println("앞왼쪽 한국타이어로 교체");
		car.frontLeftTrie = new HankookTire(14, "뒤왼족");
		break;
	
case 4:
	System.out.println("앞왼쪽 금호타이어로 교체");
	car.frontLeftTrie = new HankookTire(17, "뒤오른족");
	break;

		}
		
		
	}

	
}
}
