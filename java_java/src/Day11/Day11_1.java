package Day11;

public class Day11_1 {

	// 448 : 
	// ���࿹��[���� ���߿� ���ܹ߻� ] �Ϲݿ��� [���� ���� ���ܹ߻�]
	
	
	//throws : ���� ������ => �޼ҵ� �ȿ��� �߻��� ���ܸ� �޼ҵ� ȣ��� ������ ����
	
	// Exception : ����Ŭ���� �߿� ���� Ŭ����
	
	
	//Intege.parseInt()
	
	//��й�ȣ Ʋ���� ���� �����
	
	public static void main(String[] args) {
		
		try {
			login("white", "12345");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
		
	}
	
	//�α��� �޼ҵ�
	
	public static void login(String id , String pw ) throws Not,WrongPw {
		if (!id.equals("blue")) {
			//! ���� �ݴ��
			throw new Not("���̵� �������� �ʽ����ϴ�");
		}
		if(!pw.equals("12345")) {
			throw new WrongPw("�н����尡 ���������ʽ��ϴ�");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
