package ����;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice {

	static Scanner scanner = new Scanner(System.in);
	static ȸ��[] members = new ȸ��[100];
	
	
	
	public static void main(String[] args) throws Exception {

		
		while(true) {
			System.out.println("--------�޴�--------");
			System.out.println("1.�α��� .2.ȸ������");
			System.out.println("���� :"); int ch = scanner.nextInt();
			
		
			ȸ�� mem = new ȸ��();
			if(ch==1) {
				ȸ��.�α���();
			}
			else if(ch==2) {
				mem.ȸ������();
			}
			else if(ch==3) {
				
			}
			else {
				
				
			}
			
		}
		
		
		
		
	}
	
}
