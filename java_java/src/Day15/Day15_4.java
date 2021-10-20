package Day15;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_4 {

	
	public static void main(String[] args) {
		
		
		//Hashtable // 회원가입 /로그인
		Scanner scanner = new Scanner(System.in);
		//0. map컬렉셩 선언
		Hashtable<String, String> hashtable = new Hashtable<>();
				//아이디(키) , 비밀번호(값)
		// 메뉴
		
		while(true) {
			System.out.println("1.회원가입 2.로그인"); 
			int ch = scanner.nextInt();
			
			if(ch == 1 ) {
				System.out.println("아이디 : "); String id = scanner.next();
				System.out.println("비밀번호 : ");String pw = scanner.next();
				
				 if(hashtable.contains(id)) {
					 System.out.println("중복입니다");
				 }else {				 				
					 hashtable.put(id, pw);
					 System.out.println("가입성공");
				 }				
			}
			if(ch ==2 ) {
				System.out.println("아이디 :");	String id = scanner.next();
				System.out.println("비밀번호 :");	String pw = scanner.next();
				
				if(hashtable.contains(id)){
					if(hashtable.get(id).equals(pw)) {
						System.out.println("로그인 성공");
					}
				}else {
					System.out.println("로그인 실패");
				}
			}
		}
		
	}
}
