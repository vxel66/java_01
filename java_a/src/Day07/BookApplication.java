package Day07;

import java.util.Scanner;

public class BookApplication {//���� Ŭ����
	
	// 0. �迭 
	public static Member[] members = new Member[100];
	public static Book[] books = new Book[100];
	// 0.�Է°�ü
	public static Scanner scanner =new Scanner(System.in);
	

	public static void main(String[] args)  {
		main_menu();
	}
		//1. ���θ޴�
		public static void main_menu() {
			while(true) {
			System.out.println("\n\n ----------------------�α��� ������-----------------------");
			System.out.println("1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã�� 5.");
			System.out.println(">>>>���� : "); int ch = scanner.nextInt();
			if(ch==1) {
				//�α��� �޼ҵ� ȣ��
				String loginid = Member.login();
				//1.�α��� ����
					if(loginid == null) {
						System.out.println("�˸� :������ ȸ�������� �����ϴ�");
					}
					//2.�����ڸ޴�
					else if(loginid.equals("admin")) {
						admin_menu();
					}
					//3.�Ϲ�ȸ���޴�
					else {
						member_menu(loginid); 
					}
				
					
			}
			if(ch==2) {
				//ȸ������ �޼ҵ� ȣ��
				//1. �ٸ�Ŭ���� ��� ȣ�� ���
					//1.��ü������ ��ü�� ���� �ɹ�����
					//2.�ش� �޼ҵ� static
				Member.signup();
			}
			if(ch==3) {
				//���̵�ã�� �޼ҵ� ȣ��
				String findid = Member.findid();
				if(findid==null) {
					System.out.println("������ ȸ���� �����ϴ�");
				}else {
					System.out.println("ȸ������ ���̵��"+findid);
				}
			}
			if(ch==4) {
				//��й�ȣ ã�� �޼ҵ� ȣ��
				String findpw = Member.findpw();
				if(findpw==null) {
					System.out.println("������ ȸ���� �����ϴ�");
				}else {
					System.out.println("ȸ������ �����"+findpw);
				}
			}
			}
			
			
			
			
		}
		//2. �α��ν� �޴�
		public static void member_menu(String loginid) {
			
			Book book = new Book();
			
			while(true) {
			System.out.println(" ---------- Menu ----------");
			System.out.println("1.������� 2.�뿩 3.�ݳ� 4.�α׾ƿ�");
			System.out.println("���� :"); int ch =scanner.nextInt();
			if(ch==1) {book.book_list();}
			if(ch==2) {book.book_rental(loginid);}
			if(ch==3) {book.book_return(loginid);}
			if(ch==4) {System.out.println("�α׾ƿ��Ǿ����ϴ�");return;}
		}												//return �ش� �޼ҵ忡�� ��������(�ٽ� �α��� ��������
		}
		//3. ������ �޴�
		public static void admin_menu() {
			Book book = new Book();// Book �ӽð�ü : �޼ҵ� ȣ���
			
			while(true) {
			
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println("1.������� 2.������� 3.�α׾ƿ�");
			System.out.println("���� :"); int ch =scanner.nextInt();
			if(ch==1) {book.book_add();}
			if(ch==2) {book.book_list();}
			if(ch==3) {{System.out.println("�α׾ƿ��Ǿ����ϴ�");return;}}
		}
		}	
	
	
}



























