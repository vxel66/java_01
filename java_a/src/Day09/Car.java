package Day09;


public class Car {

	Tire frontLeftTrie = new Tire(6,"�տ���");
	Tire frontRightTrie = new Tire(2,"�տ�����"); 
	Tire beckLeftTrie = new Tire(3,"�ڿ���");
	Tire beckRightTrie = new Tire(4,"�ڿ�����");
	
	int run() {
		//���������� ������ default
		System.out.println("[�ڵ����� �޸��ϴ�]");
		if(frontLeftTrie.roll() == false) {
			stop(); return 1;
		}
		if(frontRightTrie.roll() == false) {
			stop(); return 2;
		}
		if(beckLeftTrie.roll() == false) {
			stop(); return 3;
		}
		if(beckRightTrie.roll() == false) {
			stop(); return 4;
		}
		return 0 ;
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�");
	}
	
}
