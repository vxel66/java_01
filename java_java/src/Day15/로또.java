package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class �ζ� {

	/*
	 * set
		�ζ� ���α׷�
		1.6���� ���� �Է¹޾� set�÷��ǿ� �����Ͽ� ���
		[����] �ߺ������ x
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(true) {
			System.out.println("1~45���� ���� ���� (�ߺ��Ұ�)");
			int num = scanner.nextInt();
			
			if(num<1|| num>45) {
				System.out.println("�ߺ��Դϴ�");
			}else {
				if(set.contains(num)) {
					System.out.println("�ߺ� ��ȣ �Դϴ�");
				}else {
				set.add(num);
				System.out.println("Ȯ��: "+set);
				}
			}
			//
			if(set.size()==6) break;
				
			
		}
		
	
	}
	
}
