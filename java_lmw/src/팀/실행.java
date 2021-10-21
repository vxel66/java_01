package 팀;

import java.util.Arrays;
import java.util.Scanner;

/*
	문제 명단프로그램

	메뉴 [무한루프]
		1.명단추가
		2.명단출력
	이름 , 나이 입력받아 아래조건에 따라 명단 출력
		
	나이가 8세 미만 이면 유아 명단 등록
	나이가 20세 미만 이면 청소년 명단 등록
	그외는 성인 명단 등록 
	
	명단 출력시 명단별 인원들의 모든 이름 출력
	유아,청소년,성인 => 사람으로 부터 상속
*/


public class 실행 {
static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
	
		while(true) {
			System.out.println("========명단프로그램=======");
			System.out.println( "1.명단추가2.명단출력 :"); int ch = scanner.nextInt();
			
			if (ch==1) {
				전체명단추가();
				
			}
			if(ch==2) {
				전체명단출력();
			}
			
			
			
		
			
			
			
		}
			
		
		
}  
	public static void 전체명단추가() {
	
	System.out.println("이름 :"); String 이름 = scanner.next();
	System.out.println("나이 :"); int 나이 = scanner.nextInt();
	String 명단1;
	if (나이<8) {
		명단1 = "어린이";
	}else if (나이>8&&나이<20) {
		명단1 = "청소년";
	}else 명단1 = "성인";
	
	
	명단<사람> personCourse = new 명단<>(명단1 ,5);
	personCourse.add( new 사람(이름,나이));
	
	
	}
	
	public static void 전체명단출력( ) {
		명단 명단 = new 명단();
		for(int i = 0 ; i < 5;i++) {			
		System.out.println( 명단.getName()+" 수강생명단 : "+ 
					Arrays.toString( 명단.getStudents() ));
		}
	}						
	
	
	
	
	
	
	
}


