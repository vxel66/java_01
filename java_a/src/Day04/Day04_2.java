package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {

	// ����0 ����1 ��2
	  // ���������� �Է�
	  // ��ǻ�ʹ� �������� ���������� �ϳ� ����
	  //�¸��� �÷��̾� ȣ��
	     // 
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		boolean ���� = true;
		int �÷��̾�; 
		int ��ǻ��;  
		int ���Ӽ�=0; // ���Ӽ� ���� ����
	    int �÷��̾�� = 0;
	    int ��ǻ�ͽ� = 0;
		while(����)	{
				// �Է¹ޱ�
				System.out.println("���������� ����");
				System.out.println("�Է�  0���� 1���� 2�� 3����");
				�÷��̾� = scanner.nextInt();
				if( �÷��̾� == 3 ) {  // ���࿡ 4�� �Է������� 
				
					System.out.println("���� ���Ӽ�:" + ���Ӽ�); 
					break;
				}
				if(�÷��̾�� > ��ǻ�ͽ�) {
					System.out.println("�÷��̾��");
				}
				else if(�÷��̾�� < ��ǻ�ͽ�) {
					System.out.println("��ǻ�ͽ�");
				}
				else {System.out.println("���");
				}
				if(�÷��̾� <0 || �÷��̾� >3) {
					System.out.println("�ٽ��Է�");
					continue;// ���� ����� �ݺ��� Ż��
				}
				
				// ��ǻ�� ��������
				System.out.println("��ǻ�� ���� ��");
				Random random = new Random();// ���� ��ü
				
				��ǻ�� = random.nextInt(3); //0` 2
				System.out.println("��ǻ�ͼ���"+��ǻ��);
				// �¸��� �Ǵ�                   0����      1����      2��
				if((�÷��̾� ==0 && ��ǻ�� ==2 )||(�÷��̾� ==1 && ��ǻ�� ==0 )|| (�÷��̾� ==2 && ��ǻ�� ==1 )) {
					System.out.println("�÷��̾� �¸�");
				    �÷��̾��++;
				}
				else if ((�÷��̾� ==0 && ��ǻ�� ==0 )||(�÷��̾� ==1 && ��ǻ�� ==1 )|| (�÷��̾� ==2 && ��ǻ�� ==2 )) {
					System.out.println("���");
				}
			
				else {
					System.out.println("��ǻ�� �¸�");
					��ǻ�ͽ�++;
				}
				���Ӽ�++; //���Ӽ� 
				
	
		}
	
	
	}
}












