package Day05;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_00 {

	public static void main(String[] args) {
		
		String[][] boards = new String[100][5]; // �Խù� 100�� �����Ҽ� �ִ� �迭 ����
		Scanner scanner = new Scanner(System.in);
		
		//1. ���ѷ���
		while(true) {
			
			System.out.println("----------------------[ �Խ��� ]---------------------");
			System.out.printf("%2s\t %10s \t %5s \t %5s  %3s\n", "����","����","�ۼ���","�ۼ���","��ȸ��");
			//�迭 ��� �ε��� ���
			for(int i = 0 ; i <boards.length; i++) {
				if(boards[i][0]!=null) {
					System.out.printf("%2s \t %10s  \t %5s  \t %5s  %3s\n"
							,i,boards[i][0],boards[i][2],boards[i][3],boards[i][4]);
				}
			}
			System.out.println("--------------------------------------------------");
			System.out.println(" 1.�۾��� 2. �ۻ󼼺��� >> ����: "); int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println(">>>>>>>>> �Խñ۾��� >>>>>>>>> ");
					scanner.nextLine();
				System.out.println(" ����:"); String title = scanner.next();
				System.out.println(" ����:"); String contents = scanner.next();
				System.out.println(" �ۼ���:"); String writer = scanner.next();
				// ���� ����
				Date now = new Date();
				// ��¥ ���� Ŭ����
				SimpleDateFormat dateFormat = new SimpleDateFormat( "MM-dd" );
				String date = dateFormat.format(now);
				//��ȸ��
				String count = "1";
				//��� ������ ����� �迭�� ����
				for(int i = 0 ; i<boards.length ; i++) {
					if( boards[i][0]== null) {
						boards[i][0]= title; boards[i][1]= contents;
						boards[i][2]= writer; boards[i][3]= date; boards[i][4]= count; break;
					}
				}
			}
			if(ch==2) {
				
				System.out.println(" �Խñ� ���� : "); int ch2 = scanner.nextInt();
				   		//�ش� �Խù��� ��ȸ�� 1 ����
					int count = Integer.parseInt(boards[ch2][4]);  //�ش� �Խù��� ��ȸ�� 1 ���� [��ȸ�� (String) -> int ��ȯ ]
					boards[ch2][4] = Integer.toString(++count); //��ȸ�� ������ -> String ��ȯ
				System.out.println("-------------�Խù� ��������---------------");
				System.out.println("���� : "+ boards[ch2][0] );
				System.out.println("�ۼ��� :"+ boards[ch2][2]+"\t"+"�ۼ��� :"+boards[ch2][3]+"\t" +"��ȸ�� :"+boards[ch2][4]);
				System.out.println("���� :"+ boards[ch2][1] );
				System.out.println("----------------------------------------");
				
				
				
			}
			
		}
		
		
		
	}
}




















