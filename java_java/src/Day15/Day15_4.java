package Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_4 {

	
	public static void main(String[] args) {
		
		
		//Hashtable // ȸ������ /�α���
		Scanner scanner = new Scanner(System.in);
		//0. map�÷��� ����
		Hashtable<String, String> hashtable = new Hashtable<>();
				//���̵�(Ű) , ��й�ȣ(��)
		// �޴�
		
		while(true) {
			System.out.println("1.ȸ������ 2.�α���"); 
			int ch = scanner.nextInt();
			
			if(ch == 1 ) {
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��й�ȣ : ");String pw = scanner.next();
				
				 if(hashtable.contains(id)) {
					 System.out.println("�ߺ��Դϴ�");
				 }else {				 				
					 hashtable.put(id, pw);
					 System.out.println("���Լ���");
				 }				
			}
			if(ch ==2 ) {
				System.out.println("���̵� :");	String id = scanner.next();
				System.out.println("��й�ȣ :");	String pw = scanner.next();
				
				if(hashtable.contains(id)){
					if(hashtable.get(id).equals(pw)) {
						System.out.println("�α��� ����");
					}
				}else {
					System.out.println("�α��� ����");
				}
			}
		}
		
	}
}
