package Day07;

public class Day07_1 {

	//Ŭ���� [���赵 " �ڷ��� �����]
		//1. �ɹ� (���û���o �ʼ��ƴ�)
		//2.������ : ������ �ʱⰪ [��ü �ʵ� �ʱⰪ[
		//3.�޼ҵ� : ������ ����
				//��ȯŸ�� �޼ҵ�� (�μ�1,�μ�2,�μ�3) {retrun}
	//��ü(Ŭ������ �ν��Ͻ�) ����
		//Ŭ������ ��ü�� 
			//��ü�� = new������();  ----�ν��Ͻ�
		//��ü�� �ɹ� ���� [��ü��.�ɹ� ���ٿ�����]
	
	
	
	public static void main(String[] args) {
		
		//p.236
		
		//p.238
		
		
		double result = 10 *10 *Calculator.pi;
		  //�ش� Ŭ������ �ɹ� ���� ���
			//1.��ü����[�ش�Ŭ�����κ��� �޸��Ҵ�]
			//2.static[��������] :���α׷� ���۽� �޸� �Ҵ� [main]���ຸ�� �켱
		int result2 = Calculator.plus(10,5);
		int result3 = Calculator.minus(10,5);
		
		System.out.println(result2+result3);
		
		Person p1 = new Person("1232132", "���");
		//�ʵ�ȣ��
		//System.out.println(p1.name+p1.ssn+p1.nation);
		
		//�ʵ���� [ final �ʵ�� ���� �Ұ� => ��� �����]
	//	p1.nation = "usa";
		p1.ssn = "748946";
		p1.name = "��������";
		
		//p253 :import : �ٸ� ��Ű���κ��� Ŭ���� �������� Ű����
		 //1. import ��Ű����.Ŭ������ [Ŭ���� �ܺο� �ۼ�]
		 //2. ��Ű����.Ŭ������ ��ü�� ; [Ŭ�������ο� �ۼ�]
		
	}
	
	
}
