package Day03;

import java.util.Scanner;

public class Day03_7 {

	//1. ���ѷ����� �Է��� ��� �ޱ�
	    //1.while(true)
	    //2.while(boolean����)
	//2. ������ ����
	
	public static void main(String[] args) {
		
		boolean run = true;

		// ���ѷ��� [ ������ false �϶����� ��� �ݺ����� ]
		int keycode = 0;
		int sp = 0;
		while (run) {System.out.println("���ѷ���");
		     Scanner scanner = new Scanner(System.in);
		    
		     System.out.println("1.���� 2.���� 3����");
		     System.out.print("����:");  keycode = scanner.nextInt();
		    
		     if(keycode == 1) {sp++; System.out.println(sp);}
		     if(keycode == 2) {sp--; System.out.println(sp);}
		     
		     
		     
		     
		     
	}
	
	}
}
