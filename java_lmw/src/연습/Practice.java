package ����;

import java.util.Scanner;

public class Practice {

	static Scanner scanner = new Scanner(System.in);
	static ȸ��[] members = new ȸ��[100];
	static ����[] books = new ����[100];
	
	
	public static void main(String[] args) {
//		------------------- ȸ���� ������ ���α׷� ---------------------
//		// [����1] : ��ü���� [ ȸ�� Ŭ���� , ���� Ŭ����  ]
//			���� : �ʵ� , ������ , �޼ҵ�
//		// [����2] : ��ü�� �迭�� ����
//		// [����3] : ȸ���� ���α׷� �̿�
//			[ �α����� ] : �α��� , ȸ������ , ���̵�/��й�ȣ ã��   
//			[ �α��ν� ] : 1.������� ,2. �뿩 , 3.�ݳ�  , 4.�α׾ƿ�
//		// [����4] : ������[ ID:admin ] �� ���� ��� ���� 
//			[ ������ �α��ν� ] : 1.������� ,2.������� 3. �α׾ƿ� 
		
		while(true) {
			System.out.println("--------�޴�--------");
			System.out.println("1.�α��� .2.ȸ������ 3.id/pwã��");
			System.out.println("���� :"); int ch = scanner.nextInt();
			
		
			ȸ�� mem = new ȸ��();
			if(ch==1) {
				String �α���üũ = mem.�α���();
				if(�α���üũ.equals("���ηα���")) {
					mem.�����ڸ޴�();
				}
				if(�α���üũ.equals("ȸ���α���")) {
					mem.ȸ���޴�();
				}			
				if(�α���üũ.equals("�α��ν���")) {
					System.out.println("�α��ν���");
				}
			}
			else if(ch==2) {
				mem.ȸ������();
			}
			else if(ch==3) {
				String �α���üũ = mem.�α���();
				System.out.println(�α���üũ);
			}
			else {
				//���ã�� �޼ҵ�
			}
			
		}
		
		
		
		
	}
	
}
