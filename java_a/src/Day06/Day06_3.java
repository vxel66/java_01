package Day06;

public class Day06_3 {

	
	public static void main(String[] args) {
		
		
		//��ü�� ����� [������ ���� ������ ������� �������
		Calculator calculator = new Calculator();
		//��ü�� ���� �޼ҵ� ȣ��
		calculator.powerOn();
		
		// ��ü�� ���� �޼ҵ� ȣ�� [�μ��� ���� �ؼ� ���ϰ��� ������ ����]
		int result1= calculator.plus(5, 6);
		System.out.println(result1);
		
		byte x =10; byte y =4;
		double result2 = calculator.divide(x,y);
		System.out.println(result2);
		
		calculator.poweroff();
	
		
		//p 223
		
		Car4 car4 //��ü
		= new Car4(); //�ν��Ͻ�ȭ
			//��ü�� �ʵ忡 ���� �ʱ�ȭ�Ҽ� �ִ¹��
		 		//1.��ä��.�ʵ�� =10
				//2.new Ŭ������(10)
				//3.��ü��.set�޼ҽ�(10)
				
		car4.setGas(5); //setgas �޼ҵ� ȣ�� [�μ��� 5�ֱ�]
		
		boolean gasState = car4.isLeftGas();
		
		if(gasState) {
			System.out.println("���");
			car4.run();
		}
		
		if(car4.isLeftGas()) {
			System.out.println("������ ������ �ʿ䰡�����ϴ�");
			
		}
		else {
			System.out.println("������ �����ϼ���");
		}
		
	}
}



















