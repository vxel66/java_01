package ����;

import java.util.Scanner;

import Day07.Member;

public class ���� {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n\n ------------------ �α��� ������ -------------");
			System.out.println(" 1.�α��� | 2.ȸ������ | 3.���̵�ã�� | 4.��й�ȣã�� ");
			System.out.print(" >>> ���� : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {
				// �α��� �޼ҵ� ȣ��
				String loginid = Member.login();
					// login �޼ҵ��� ��ȯ���� ���� ����
				// 1. �α��� ����
				if( loginid ==null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
		
				
				// 3.  �Ϲ�ȸ���޴�
				else { member_menu( loginid ); }
					
			}
			if( ch == 2 ) {
				// ȸ������ �޼ҵ� ȣ�� 
					// 1. �ٸ�Ŭ���� �޼ҵ� ȣ�� ��� 
						// 1. ��ü������ ��ü�� ���� ��� ���� 
							//Member member = new Member();
							//member.login()
						// 2. �ش� �޼ҵ� static
				Member.signup();
			}
			if( ch == 3 ) {
				// ���̵�ã�� �޼ҵ� ȣ�� 
			 	String findid = Member.findid();
			 	if( findid == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
			 	else {System.out.println(" [[ ȸ������ ���̵�� "+findid+" ]] ");}
			}
			if( ch == 4 ) {
				// ��й�ȣã�� �޼ҵ� ȣ�� 
			 	String findpw = Member.findpw();
			 	if( findpw == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
			 	else {System.out.println(" [[ ȸ������ ��й�ȣ�� "+findpw+" ]] ");}
			 	
			}
		}
	}
}
