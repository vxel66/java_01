package ������;

import java.util.Scanner;

public class ����00 {

	
	
	public static void main(String[] args) {
		
		boolean ch2 = true;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 1.���� 2.��ȭ");
			int ch = scanner.nextInt();
				Music music = new Music();
			if(ch==1) {
				
				if(ch2) {
				music.setStop(ch2);
				music.start();
				ch2=false;
				}else{
					
					music.setStop(ch2);
					ch2=true;
				}
			}
		}
	}
}
