package Day05;

import java.util.Scanner;

public class Day05_4_Board {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] ���񳻿� =  new String[100][2];
		String[][] �ۼ����ۼ��� =  new String[100][2];
		
		while(true) {
			System.out.println("-----------[ �Խ��� ]----------");
			System.out.println("����\t����\t�ۼ���\t�ۼ���\t��ȸ��");
			if(!���񳻿�[1][0].equals(null)) {
			for(int i = 0; i < ���񳻿�.length; i++ ) {
				System.out.println(i+"t"+���񳻿�[i][0]);
			}
			}
			System.out.println();
			System.out.println("���� : 1.�۾��� 2.�ۻ�������");
			int ch = scanner.nextInt();
			
			if(ch == 1) {				
				System.out.println("���� �Է�:");
				String ���� = scanner.next();
			for(int i = 0 ; i < ���񳻿�.length ; i++)	{
				if( ���񳻿�[i][0] == null ) {
					���񳻿�[i][0] = ���� ;
					System.out.println(" [[ �����Է� ]]");
					break;
				}
			}
			System.out.println("���� �Է�:");
			String ���� = scanner.next();
		for(int i = 0 ; i < ���񳻿�.length ; i++)	{
			if( ���񳻿�[i][1] == null ) {
				���񳻿�[i][1] = ���� ;
				System.out.println(" [[ �����Է� ]]");
				break;
			}
		}
		System.out.println("�ۼ��� �Է�:");
		String �ۼ��� = scanner.next();
	for(int i = 0 ; i < �ۼ����ۼ���.length ; i++)	{
		if( �ۼ����ۼ���[i][0] == null ) {
			�ۼ����ۼ���[i][0] = �ۼ��� ;
			System.out.println(" [[ �ۼ����Է� ]]");
			break;
		}
	}
	System.out.println("�ۼ��� �Է�:");
	String �ۼ��� = scanner.next();
for(int i = 0 ; i < �ۼ����ۼ���.length ; i++)	{
	if( �ۼ����ۼ���[i][0] == null ) {
		�ۼ����ۼ���[i][0] = �ۼ��� ;
		System.out.println(" [[ �ۼ����Է� ]]");
		break;
	}
}
	
				
			}
			if(ch == 2) {
				System.out.println("�ۻ������� ����:");
			
			}
		}
	}
}
























