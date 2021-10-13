package Day05;

import java.util.Scanner;

public class Day05_4_Board {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] 제목내용 =  new String[100][2];
		String[][] 작성자작성일 =  new String[100][2];
		
		while(true) {
			System.out.println("-----------[ 게시판 ]----------");
			System.out.println("순번\t제목\t작성자\t작성일\t조회수");
			if(!제목내용[1][0].equals(null)) {
			for(int i = 0; i < 제목내용.length; i++ ) {
				System.out.println(i+"t"+제목내용[i][0]);
			}
			}
			System.out.println();
			System.out.println("선택 : 1.글쓰기 2.글상세페이지");
			int ch = scanner.nextInt();
			
			if(ch == 1) {				
				System.out.println("제목 입력:");
				String 제목 = scanner.next();
			for(int i = 0 ; i < 제목내용.length ; i++)	{
				if( 제목내용[i][0] == null ) {
					제목내용[i][0] = 제목 ;
					System.out.println(" [[ 제목입력 ]]");
					break;
				}
			}
			System.out.println("내용 입력:");
			String 내용 = scanner.next();
		for(int i = 0 ; i < 제목내용.length ; i++)	{
			if( 제목내용[i][1] == null ) {
				제목내용[i][1] = 내용 ;
				System.out.println(" [[ 내용입력 ]]");
				break;
			}
		}
		System.out.println("작성자 입력:");
		String 작성자 = scanner.next();
	for(int i = 0 ; i < 작성자작성일.length ; i++)	{
		if( 작성자작성일[i][0] == null ) {
			작성자작성일[i][0] = 작성자 ;
			System.out.println(" [[ 작성자입력 ]]");
			break;
		}
	}
	System.out.println("작성일 입력:");
	String 작성일 = scanner.next();
for(int i = 0 ; i < 작성자작성일.length ; i++)	{
	if( 작성자작성일[i][0] == null ) {
		작성자작성일[i][0] = 작성일 ;
		System.out.println(" [[ 작성일입력 ]]");
		break;
	}
}
	
				
			}
			if(ch == 2) {
				System.out.println("글상세페이지 선택:");
			
			}
		}
	}
}
























