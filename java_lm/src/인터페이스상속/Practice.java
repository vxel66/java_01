package �������̽����;

import java.util.Scanner;



public class Practice {

	static Scanner scanner = new Scanner(System.in);
	static �θ�[] members = new �θ�[100];
	
	
	
	public static void main(String[] args)  {
		// �������̽� ����
		�������̽� �޴�;
		// �������̽� Ŭ���� ����
		�޴� = new �ڽ�();
		
		
		while(true) {
			System.out.println("--------�޴�--------");
			System.out.println("1.�α��� .2.ȸ������ 3.id/pwã��");
			System.out.println("���� :"); int ch = scanner.nextInt();
			
		
			
			if(ch==1) {
				String �α���üũ = �޴�.�α���();
			try {	
				if(�α���üũ.equals("���ηα���")) {
					�޴�.�����ڸ޴�();
				}
			}catch (Exception a) {
				System.out.println("����"+ a);
			}
			try {	
				if(�α���üũ.equals("ȸ���α���")) {
					�޴�.ȸ���޴�();
				}
			}catch (Exception b) {
				System.out.println("����"+ b);
			}finally {
				System.out.println("�����");
			}
				
				if(�α���üũ.equals("�α��ν���")) {
					System.out.println("�α��ν���");
				}
			}
			
			else if(ch==2) {
				
				�޴�.ȸ������() ;
			
			}
		
		
			else if(ch==3) {
				String �α���üũ = �޴�.�α���();
				System.out.println(�α���üũ);
			}
			else {
				//���ã�� �޼ҵ�
			}
			
		}
		
		
		
	}
	
}
