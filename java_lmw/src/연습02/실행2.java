package ����02;

import java.util.Scanner;

public class ����2 {

	
	public static void main(String[] args) {
		
		/* ���ѷ��� �޴�
		 * 1.�������
		 * 2.��ȭ���
		 * 
		 * ����1.1�����ý� 1�ʰ������� �������
		 * ����2.2�������ý� 1�ʰ��� ��ȭ��� ���
		 * ����3.���ǿ�ȭ�� ������ ��ȣ�� �ٽ� �����ϸ� �������
		 * 
		*/
		
		boolean onoff = true ;//������� Ȯ��
			
		while(true) {
				Scanner scanner = new Scanner(System.in);
				
				System.out.println(" 1.���� 2.��ȭ");
				int ch = scanner.nextInt();
				���� ���� = new ����();	
				
				if(ch==1) {	
					
					����.setStop(onoff);						
					����.start();
					onoff = false;
					
				}else {
					����.setStop(onoff);
					onoff= true;
				}
				
				if(ch==2) {
					��ȭ ��ȭ = new ��ȭ();
					��ȭ.setStop(onoff);
					��ȭ.start();
				}
				
				
			}
			
			
			
		
	}
	
}
