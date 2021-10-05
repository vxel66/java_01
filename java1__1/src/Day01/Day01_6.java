package Day01;

import java.util.Scanner;

public class Day01_6 {
	
	public static void main(String[] args) {
		
		//문제3 : 방문록 입력받아 출력하기
		/*입력받기 : 이름, 작성자,내용,날짜
		 * 출력
		 * ------------방문록------------
		 * 순번 이름  내용 날짜
		 * ---------------------------
		
		
		*/
		Scanner 입력객체 = new Scanner(System.in);
		
		System.out.print("순번 : ");
        String id = 입력객체.next();
        
        System.out.print("이름 : ");
        String pa = 입력객체.nextLine(); // 공백 포함 o
             //scanner.nextLine();
        System.out.print("내용 : ");
        String na = 입력객체.next();
        
        System.out.println("날짜 : ");
        String em = 입력객체.next();
		
        System.out.println("--------------------방문록---------------------");
        System.out.println(" | 순번  | 작성자  | 내용 \t | 날짜 |");
        System.out.println(" | "+ id + "|" +pa + "|" + na + "\t|" + em + "|");
        System.out.println("---------------------------------------------");
		
		
		
	}

}
