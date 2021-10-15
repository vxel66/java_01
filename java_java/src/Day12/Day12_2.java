package Day12;

import java.util.Random;

public class Day12_2 {

	public static void main(String[] args) {
		
		//Wrapper ���� Ŭ���� : �⺻�ڷ��� -> ��äȭ
		// ���ڿ� -> �⺻Ÿ��
			//1. Integer.parseInt("���ڿ�");
			//2. Double.parseDouble("���ڿ�"):
			//3. Boolean.parseBoolean("���ڿ�");
			//* Byte.parseInt() , Short.parseInt() , Long.parseInt() , Float.parseInt()
		//�⺻Ÿ�� -> ���ڿ�
			//1. String.valueOf( �⺻�ڷ���)
			//����Ʈ�迭 -> ���ڿ�
			//2. new ������(����Ʈ�迭)
		int value1 = Integer.parseInt("10");   // "10" -> 10
		
		double value2 = Double.parseDouble("3.14"); // "3.14" -> 3.14
		
		boolean value3 = Boolean.parseBoolean("true"); // "true" - > true
		
		// 1. Math.abs() ���밪
		System.out.println(Math.abs(-5)); //5
		System.out.println(Math.abs(-3.14)); //3.14
		
		// 2. Math.ceil() �ø�
		System.out.println(Math.ceil(5.3)); //6.0
		System.out.println(Math.ceil(-5.3)); // 5.0
		
		//3. Math.floor() ����
		System.out.println(Math.floor(5.3)); //5
		System.out.println(Math.floor(-5.3)); // -6.0
		
		//4.Math.max() �ִ�
		System.out.println(Math.max(5, 9));//9
		System.out.println(Math.max(5.3, 2.5)); //5.3
		
		//5.Math.min() �ּҰ�
		System.out.println(Math.min(5, 9)); //5
		System.out.println(Math.min(5.3, 2.5)); //2.5
		
		//6. double random()
		System.out.println("���� : "+Math.random());
		
		//7. Math.rint() // ����� ������ �Ǽ���
		System.out.println(Math.rint(5.3));
		System.out.println(Math.rint(-5.7));
		
		//8. Math.round() : �Ҽ��� ù°�ڸ� �ݿø�
		System.out.println(Math.round(5.3));
		System.out.println(Math.round(-5.7));
			//*�Ҽ��� ��°�ڸ� �ݿø� (�ڸ��� �ø��� �ݿø� 
		double value = 12.3456;
		double rvalue =( Math.round(value*100))/100.0;
		System.out.println(rvalue);
		
	//	int num = Math.random(); //0~1
	//	int num = Math.random()*6; //0~1
		int num = (int)(Math.random()*6)+1; //0~1
		System.out.println(num);
		Random random= new Random();
		int num2 = random.nextInt(6)+1; //int�� ǥ���Ҽ��ִ� ���� ��ŭ ����
		
		System.out.println(num2);
		
		
	}
	
}

























