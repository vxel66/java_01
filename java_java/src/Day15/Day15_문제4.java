package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_����4 {

	//����4 :���ñ����� �̿��� ���ڿ� ���� ���
		//[����1] ����
		//[����2] �Է¹��� ���ڿ��� ������� ���ÿ� ����
		// ����3 ���ڿ� �ݴ�� ���
		// ��� ���� 
		// �Է� ABC
		// ��� CBA
	public static void main(String[] args) {
		
		Stack<Character> chars = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			
			System.out.println("�Է�: "); 
			String �Է� = scanner.next();
			
			for(int i=0; i<�Է�.length();i++) {
				char c = �Է�.charAt(i);
				chars.push(c);
			}
			
			System.out.println(chars);
			for(int i=0; i<�Է�.length();i++) {
				System.out.print(chars.pop());
			}
			
			
			
		}
		
	}
	
	
}
