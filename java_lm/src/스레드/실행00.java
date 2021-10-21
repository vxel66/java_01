package 스레드;

import java.util.Scanner;

public class 실행00 {

	
	
	public static void main(String[] args) {
		
		boolean ch2 = true;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 1.음악 2.영화");
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
