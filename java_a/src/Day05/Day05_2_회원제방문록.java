package Day05;

import java.util.Scanner;

public class Day05_2_회원제방문록 {

	public static void main(String[] args) {
		
		// 0. 입력객체
		Scanner scanner = new Scanner(System.in);
		
		//1. 회원 100명[id,pw] 저장하는 방법 선언
		String[][] 회원목록 = new String[100][2]; //100명 * 2명 =>200칸
		//1. 방문록 100개 저장하는 방법 선언
		String[][] 방문록 = new String[100][2];
		
		//2. 메뉴 => 메뉴는 계속 반복실행 : 무한루프 : [ while ]
		while(true) {
			System.out.println("\t - 회원제 방문록 - ");
			System.out.println("-----------------------------");
			System.out.println(" [[ 1.회원가입 2.로그인 선택 : ");
			int ch = scanner.nextInt();
			//3. 입력에 따른 값 제어
			switch (ch) {
			case 1:
				System.out.println(" - 회원가입 페이지 " ); 
				System.out.println(" Id :"); String id = scanner.next();
				System.out.println(" password :"); String pw = scanner.next();
				
				//id 중복체크
				boolean idcheck = true;
				for(int i = 0 ; i< 회원목록.length; i++) {
								//회원목록.legth : 배열의 가로길이 => 100
					
					if( 회원목록[i][0] !=null &&회원목록[i][0].equals(id)) {// 만일 기존배열내 id 동일하면
						System.out.println("중복된 아이디가 존재합니다");
						idcheck = false;
						break; //중복찾기 for 종료
					}
				}
				
				// 중복체크 변수가 true 이면 배열내 빈 공간을 찾아서 저장
				if(idcheck) {	
					for(int i =0 ; i<회원목록.length ; i++) {
						if(회원목록[i][0]==null) {
							회원목록[i][0] = id ; 회원목록[i][1] =pw;
							System.out.println("회원가입이 완료되었습니다");
							break;
						}
					}				
				}						
				break;
				
			case 2 :	
				System.out.println(" - 로그인 페이지 " ); 
				// 1. 입력 -> 저장 => 배열내에서 비교[for,if]
				
				System.out.println(" id :"); String id2 = scanner.next();
				System.out.println(" pw :"); String pw2 = scanner.next();
				
				
				//2. 배열내에서 입력한 아이디와 패스워드가 존재하는지 -> 존재하면 로그인 성공
					// for문을 이용한 모든 인덱스에 접근에서 하나씩 비교
				
				boolean logincheck = true;
				for(int i =0; i< 회원목록.length; i++) {
					if( 회원목록[i][0]!=null&&회원목록[i][0].equals(id2) &&회원목록[i][1].equals(pw2)) {
						System.out.println("로그인 완료");
							////////////////////////로그인 성공시 메뉴///////////////
							while(true) {
								System.out.println("\n\n\t -회원메뉴 1.방문록등록 2. 방문록확인 3.로그아웃");
								int ch2 = scanner.nextInt();
								
								if( ch2 == 1 ) {
											scanner.nextLine(); //nextline 오류 해결
											System.out.println("방문록 내용 :"); String 내용 = scanner.next();
									// 방문록 배열내 빈공간을 찾아서 내용과 로그인된 아이디를 찾아 저장
									for(int m = 0 ; m < 방문록.length; m++) {
										if(방문록[m][0]==null) {
										   방문록[m][0] =내용 ; 방문록[m][1] = id2;
										   System.out.println("방문록 등록");
										   break;
										   
										}
									}
								}
								else if(ch2==2) {
									System.out.println("방문록 목록");
									System.out.println("작성자\t\t방문록");
									for(int j =0; j<방문록.length ; j++) {
										if( 방문록[i][0]== null) {
											break;
										}
										System.out.printf("%10s\t%s\n" , 방문록[i][1], 방문록[i][0]);
										break;
									}
									
								}
								else if(ch2==3) {
									System.out.println("로그아웃 되었습니다");
									break;
								}
								else System.out.println("알수 없는 행동입니다");
								
							}
						
						
							///////////////////////////////////////////////////
						logincheck = false;
						break;
						
						}
					if(logincheck) {
						System.out.println("로그인 실패"); break;
					}
				}break;
			default:
				System.out.println("[[알림]] : 알수없는 번호입니다");
			}
		}
		
		
		
	}
}





















