package Day06;

public class Day06_1 {

	public static void main(String[] args) {
	
		// p.195 
		// 1. ��ü ����� : Ŭ���� �̿��� �޸��Ҵ�	
			Student student = new Student();
			//Ŭ������ ��ü��  =  new  ������();
				//Ŭ������ == �����ڸ�
			System.out.println(" student ������ Student ��ü�� �����մϴ�");
			
			Student sutdent2 = new Student();
			System.out.println(" student ������ �� �ٸ� Student ��ü�� �����մϴ�");
			
			System.out.println("��ü�̸� ��� : " + student );
			
			
			//p 201
			
			//1. �ڵ��� ��ü �����
			Car car = new Car();
			
			//2. ��ü�� �ɹ�[�ʵ�] ȣ��
			System.out.println("����ȸ�� : "+ car.company);
			System.out.println("�𵨸� "+car.model);
			System.out.println("���� " + car.color);
			System.out.println("�ְ�ӵ�"+ car.maxSpeed);
			System.out.println("���� ���ǵ�:"+car.speed);
			
			//3. ��ü�� �ɹ�[�ʵ�] �� ����
			System.out.println(">>>>>�ӵ� ����");
			car.speed = 60;
			System.out.println("������ �ӵ�:"+car.speed);
			
			
		//p.203 : ������
			Car2 car2 = new Car2("����",3000); //������
		//p.207 " �����ڸ� �̿��� => �ʵ� �ʱ�ȭ
			Korean korean = new Korean("���ڹ�", "131351-65135");
			System.out.println("korean.name:"+korean.name);
			System.out.println("korean.ssn:"+korean.ssn);
			
			Korean korean2 = new Korean("���ڹ�", "13133-5646");
			System.out.println("korean2.name:"+korean2.name);
			System.out.println("korean2.ssn:"+korean2.ssn);
			
			//����ִ� ��ü [�������]
			Korean korean3 = new Korean();
			korean3.name = "���ڹ�";
			korean3.ssn = "131351-65135";
			System.out.println("korean3.name:"+korean3.name);
			System.out.println("korean3.ssn:"+korean3.ssn);
	}
	
		
	
}
























