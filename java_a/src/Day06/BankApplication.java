package Day06;

import java.util.Scanner;

public class BankApplication {

	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
				
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� ");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			if( selectNo == 1 ) { createAccount();} 
			else if( selectNo == 2 ) { accountList(); }
			else if( selectNo == 3 ) { deposit(); }
			else if( selectNo == 4 ) {}
			else if( selectNo == 5 ) { run = false;}
		}
		System.out.println("���α׷� ����");
		
	}
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("���»���");
		System.out.println("--------------");
		
		System.out.print(">> ���¹�ȣ : ");	String ano = scanner.next();	
		System.out.print(">> ������ : ");	String owner = scanner.next();
		System.out.print(">> �ʱ��Աݾ� : ");int balance = scanner.nextInt();
		
		//2. ��ü ���� [�Է¹��� �������� ��ü �����ڿ� �־ ��ü �����]
		Account account = new Account(ano, owner, balance);
		
		//3. �迭���� [�迭�� �����[null]�� ã�Ƽ� ����� �ε����� ��ü ����]
		for(int i = 0 ; i<accountArray.length; i++) {
			if(accountArray[i]==null) { //i��° �ε����� ��� ������
			   accountArray[i]=account;//i��° �ε����� ��ü �ֱ�
			   System.out.println("��� : ���°� ����");
			   break; // ���»����� �ݺ��� ����
			}
		}
	}
	//���¸�� ����
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("���¸��");
		System.out.println("--------------");
		
		//1.�迭�� ��� �ε����� ȣ�� [���� ����]
		for(int i = 0 ; i<accountArray.length; i++) {
			if(accountArray[i]==null) break;
			
			System.out.println(accountArray[i].getAno()
					+accountArray[i].getOwner()+
					accountArray[i].getBalance());
		}
	}
	// account �迭���� ano�� ������ account ��üã�� �޼ҵ�
	private static Account findAccount( String ano ) {
		Account account = null; //�ӽð�ü
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] !=null) { //i��° �ε����� ������ �ƴϸ鼭
				if(accountArray[i].getAno().equals(ano)) {
					//i��° �ε����� ��ü�� ���¹�ȣ�� �μ�[�Է¹��� ���¹�ȣ�� ������
					account = accountArray[i];
					break;
				}
			}
		}
		return account; //���࿡ ������ ���¹�ȣ ������ ��ü ��ȯ
						//������ ���¹�ȣ ������ ��ü[null]��ȯ
	}
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("����");
		System.out.println("--------------");
		
		System.out.println(">>> ���¹�ȣ : ");		String ano = scanner.next();
		System.out.println(">>> ���ݾ� : ");	 	int balance = scanner.nextInt();
		//2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ��
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�");
			return;
		}
		account.setBalance(account.getBalance() + balance);
		
		System.out.println("��� ���� ����");
		
	}

}

































