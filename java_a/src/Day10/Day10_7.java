package Day10;

public class Day10_7 {

	//
	public static void main(String[] args)  {
		
//		// ����ó�� : 1.�Ϲݿ��� 2.���࿹��
//			//���� : �پ��� ������ �߻��� => ���α׷� ����ȭ
//		
		// ����Ŭ����
			//* Exception : ���� ����Ŭ���� : ��� ���� ���� ����
			//NullPointerException
			//ArrayIndexOutOfBoundsException
			//NumberFormatException
			// ���
		
		// ���� ������
			//���� : �޼ҵ峻���� �߻��� ���ܸ� ȣ���Ѱ����� �̵�[ ���� ���ϼ� ]
		
		
try {		//p.423 :
		String data = null;// String ��ü�� null ����
		System.out.println(data.toString()); // toString() " ��ü������ȯ
		
}catch( Exception e) {
	System.out.println("���ܰ� �߻� �߽��ϴ� "+e );
}finally {
	System.out.println("������");
}
			
	//	��2
	try {
		String[] ���ڿ��迭 = new String[2];
		���ڿ��迭[0] = "���缮";   ���ڿ��迭[1] = "��ȣ��";   ���ڿ��迭[2] = "�ŵ���";     
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("���ܹ߻� " +e);}
		//��3 p426
		try {	
			String data1 = "100";   //"100" -> 100 [����]
			String data2 = "a100";  //"a100" -> 100 [�Ұ���]
			
			System.out.println(Integer.parseInt(data1));
			System.out.println(Integer.parseInt(data2));
							//Integer : ���� ���� Ŭ���� [ ���� ���� �޼ҵ� ����]
							//.parseInt(����): ���ڸ� ���������� ��ȯ���ִ� �޼ҵ�
		}catch(NumberFormatException e) {
			System.out.println("���� "+ e);
		}

	}
			
	}
	
