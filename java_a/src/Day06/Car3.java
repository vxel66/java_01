package Day06;

public class Car3 {

	//1. �ʵ�
	String company = "�����ڵ���";
	String model ; String color ; int maxSpeed;
	
	//2. ������ : ���� �ٸ� �μ��� ���� ������ ������ ���� ����
		//1.�ʵ带 ���� ����
		public Car3() {//�ʵ带 ��������
		}
		//2.�ϳ��� �ʵ带 �޴� ������
		public Car3(String model) {
			this.model =model;
		}
		//3.�ΰ��� �ʵ带 �޴� ������
		public Car3(String model , String color) {
			this.model =model;
			this.color =color;
		}
		//4.3���� �ʵ带 �޴� ������
		public Car3(String model,String color,int maxspeed) {
			this.model =model;
			this.color =color;
			this.maxSpeed= maxspeed;
		}
	
	
	//3. �޼ҵ�
}
