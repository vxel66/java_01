package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_2_0 {

	static Scanner scanner = new Scanner(System.in);
	
	
	/*����� ���α׷�

	�޴� 

	1.����߰� (�ο��� �Է¹޾� ����ȣ ��ȯ)
	2.������(����ȣ �Է¹޾� ��� ���)

	������ 3. ��� ����(��� 1������ ���� ������ ���� ���)
	 * 
	 */
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<String>();
		while(true) {
			
			System.out.println("����� ���α׷�");
			System.out.println("1.����߰� 2. ������");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("�̸��Է�");
				String name = scanner.next();
				
				for(int i = 0 ; i<list.size(); i++) {
					if(list.get(i)==null) {
						list.add(new Member(name,i+1 ));	
						System.out.println("����ȣ�� :"+i);
						break;
					}
				
				
					
				}

				
				
			}
			if(ch==2) {
				for(int i = 0 ; i<list.size(); i++) {
					if(list.get(i)==null) {
					System.out.println("null");
					}					
			}
				for(int i = 0 ; i<list2.size(); i++) {
					if(list.get(i)==null) {
					System.out.println("null2");
					}					
			}
		}
		
	}
	
	
	
}
}
























