package Day05;

import java.util.Scanner;

public class Day05_2_ȸ�����湮�� {

	public static void main(String[] args) {
		
		// 0. �Է°�ü
		Scanner scanner = new Scanner(System.in);
		
		//1. ȸ�� 100��[id,pw] �����ϴ� ��� ����
		String[][] ȸ����� = new String[100][2]; //100�� * 2�� =>200ĭ
		//1. �湮�� 100�� �����ϴ� ��� ����
		String[][] �湮�� = new String[100][2];
		
		//2. �޴� => �޴��� ��� �ݺ����� : ���ѷ��� : [ while ]
		while(true) {
			System.out.println("\t - ȸ���� �湮�� - ");
			System.out.println("-----------------------------");
			System.out.println(" [[ 1.ȸ������ 2.�α��� ���� : ");
			int ch = scanner.nextInt();
			//3. �Է¿� ���� �� ����
			switch (ch) {
			case 1:
				System.out.println(" - ȸ������ ������ " ); 
				System.out.println(" Id :"); String id = scanner.next();
				System.out.println(" password :"); String pw = scanner.next();
				
				//id �ߺ�üũ
				boolean idcheck = true;
				for(int i = 0 ; i< ȸ�����.length; i++) {
								//ȸ�����.legth : �迭�� ���α��� => 100
					
					if( ȸ�����[i][0] !=null &&ȸ�����[i][0].equals(id)) {// ���� �����迭�� id �����ϸ�
						System.out.println("�ߺ��� ���̵� �����մϴ�");
						idcheck = false;
						break; //�ߺ�ã�� for ����
					}
				}
				
				// �ߺ�üũ ������ true �̸� �迭�� �� ������ ã�Ƽ� ����
				if(idcheck) {	
					for(int i =0 ; i<ȸ�����.length ; i++) {
						if(ȸ�����[i][0]==null) {
							ȸ�����[i][0] = id ; ȸ�����[i][1] =pw;
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");
							break;
						}
					}				
				}						
				break;
				
			case 2 :	
				System.out.println(" - �α��� ������ " ); 
				// 1. �Է� -> ���� => �迭������ ��[for,if]
				
				System.out.println(" id :"); String id2 = scanner.next();
				System.out.println(" pw :"); String pw2 = scanner.next();
				
				
				//2. �迭������ �Է��� ���̵�� �н����尡 �����ϴ��� -> �����ϸ� �α��� ����
					// for���� �̿��� ��� �ε����� ���ٿ��� �ϳ��� ��
				
				boolean logincheck = true;
				for(int i =0; i< ȸ�����.length; i++) {
					if( ȸ�����[i][0]!=null&&ȸ�����[i][0].equals(id2) &&ȸ�����[i][1].equals(pw2)) {
						System.out.println("�α��� �Ϸ�");
							////////////////////////�α��� ������ �޴�///////////////
							while(true) {
								System.out.println("\n\n\t -ȸ���޴� 1.�湮�ϵ�� 2. �湮��Ȯ�� 3.�α׾ƿ�");
								int ch2 = scanner.nextInt();
								
								if( ch2 == 1 ) {
											scanner.nextLine(); //nextline ���� �ذ�
											System.out.println("�湮�� ���� :"); String ���� = scanner.next();
									// �湮�� �迭�� ������� ã�Ƽ� ����� �α��ε� ���̵� ã�� ����
									for(int m = 0 ; m < �湮��.length; m++) {
										if(�湮��[m][0]==null) {
										   �湮��[m][0] =���� ; �湮��[m][1] = id2;
										   System.out.println("�湮�� ���");
										   break;
										   
										}
									}
								}
								else if(ch2==2) {
									System.out.println("�湮�� ���");
									System.out.println("�ۼ���\t\t�湮��");
									for(int j =0; j<�湮��.length ; j++) {
										if( �湮��[i][0]== null) {
											break;
										}
										System.out.printf("%10s\t%s\n" , �湮��[i][1], �湮��[i][0]);
										break;
									}
									
								}
								else if(ch2==3) {
									System.out.println("�α׾ƿ� �Ǿ����ϴ�");
									break;
								}
								else System.out.println("�˼� ���� �ൿ�Դϴ�");
								
							}
						
						
							///////////////////////////////////////////////////
						logincheck = false;
						break;
						
						}
					if(logincheck) {
						System.out.println("�α��� ����"); break;
					}
				}break;
			default:
				System.out.println("[[�˸�]] : �˼����� ��ȣ�Դϴ�");
			}
		}
		
		
		
	}
}





















