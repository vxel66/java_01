package Day03;

import java.util.Scanner;

public class Day03_8 {

	// ATM ���α׷�
	public static void main(String[] args) {
		
		// �����ư ������ ������ 24�ð� �������� ���α׷� => while(true)
		boolean ���� = true; // ���ѷ����� �����ϴ� ����
		
		int ���ݾ� =0; //���ݾ�
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(����) { //[���ຯ�� true ���ѷ������� ���ຯ����]
		    System.out.println("---------------------------------");
		    System.out.println("1.����   |2.���   |3.�ܰ�   |4.����  ");
		    System.out.println("---------------------------------");
		    System.out.print("����:"); int ���� = scanner.nextInt();
		  		
		
		     if(���� == 1) { 
		    	 	System.out.println("���ݾ�:");
		        	���ݾ� += scanner.nextInt();
		    	
		    		System.out.println("���ݿϷ�");
		    
		    }
		     else if( ���� == 2 ) { 
					System.out.print("��ݾ�>"); 	int ��ݾ� = scanner.nextInt();
					
					if( ���ݾ� < ��ݾ� )  { System.out.println(" [[ �˸� ]] �ܰ� �����մϴ� "); }
					else  { ���ݾ�-= ��ݾ�; System.out.println(" [[ �˸� ]] ��� �Ϸ� "); }
					
				}
		    if(���� == 3) { 
		    	
		    	System.out.println("�ܰ�:");
		    
		    }
		    if(���� == 4) { //���� 4�� �Է�������
		    	����=false; //���ຯ���� false �־ ���ѷ���[while] ����
		    	System.out.println("ATM����");
		    }
		    
		    
		    
		    
		}
		
		
		
	}
	
	
	
	
}
