package ��;

import java.util.Arrays;
import java.util.Scanner;

/*
	���� ������α׷�

	�޴� [���ѷ���]
		1.����߰�
		2.������
	�̸� , ���� �Է¹޾� �Ʒ����ǿ� ���� ��� ���
		
	���̰� 8�� �̸� �̸� ���� ��� ���
	���̰� 20�� �̸� �̸� û�ҳ� ��� ���
	�׿ܴ� ���� ��� ��� 
	
	��� ��½� ��ܺ� �ο����� ��� �̸� ���
	����,û�ҳ�,���� => ������� ���� ���
*/


public class ���� {
static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
	
		while(true) {
			System.out.println("========������α׷�=======");
			System.out.println( "1.����߰�2.������ :"); int ch = scanner.nextInt();
			
			if (ch==1) {
				��ü����߰�();
				
			}
			if(ch==2) {
				��ü������();
			}
			
			
			
		
			
			
			
		}
			
		
		
}  
	public static void ��ü����߰�() {
	
	System.out.println("�̸� :"); String �̸� = scanner.next();
	System.out.println("���� :"); int ���� = scanner.nextInt();
	String ���1;
	if (����<8) {
		���1 = "���";
	}else if (����>8&&����<20) {
		���1 = "û�ҳ�";
	}else ���1 = "����";
	
	
	���<���> personCourse = new ���<>(���1 ,5);
	personCourse.add( new ���(�̸�,����));
	
	
	}
	
	public static void ��ü������( ) {
		��� ��� = new ���();
		for(int i = 0 ; i < 5;i++) {			
		System.out.println( ���.getName()+" ��������� : "+ 
					Arrays.toString( ���.getStudents() ));
		}
	}						
	
	
	
	
	
	
	
}


