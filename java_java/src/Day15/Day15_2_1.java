package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_2_1 {

static Scanner scanner = new Scanner(System.in);
	
	
	/*����� ���α׷�

	�޴� 

	1.����߰� (�ο��� �Է¹޾� ����ȣ ��ȯ)
	2.������(����ȣ �Է¹޾� ��� ���)

	������ 3. ��� ����(��� 1������ ���� ������ ���� ���)
	 * 
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			//��� ��Ȳ
			System.out.println("/////�����Ȳ///////");
			for(int i = 0 ; i<list.size() ; i++) {
				System.out.println("����� : "+ (i+1) +"����ο�"+list.get(i));
			}
			
			
			
			
			///////////////////////////////
			System.out.println("����� ���α׷�");
			System.out.println("1.����߰� 2. ������ 3. ������ �������" );
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("�ο��� : "); int count = scanner.nextInt();
				//1. ����Ʈ�� ��ü ����
				list.add(count);
				System.out.println("������ ����ȣ : "+ list.size());
			}
			if(ch==2) {
				System.out.println("�ּ��� ��� ��ȣ"); int num = scanner.nextInt();
				list.remove(num-1);
				System.out.println("�ּҵǾ����ϴ�");
				
			}
			if(ch==3) {
			
				if(list.isEmpty()) {
					System.out.println("��� ���� ���� �����ϴ�");
					
				}else {
					System.out.println("����ȣ 1�� ����");
					list.remove(0);///����
				}
			}
									
			}
		}
		
	}

























