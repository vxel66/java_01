package Day11;

public class Day11_1 {

	// 448 : 
	// 실행예외[실행 도중에 예외발생 ] 일반예외 [실행 전에 예외발생]
	
	
	//throws : 예외 던지기 => 메소드 안에서 발생된 예외를 메소드 호출된 곳으로 전달
	
	// Exception : 예외클래스 중에 상위 클래스
	
	
	//Intege.parseInt()
	
	//비밀번호 틀릴때 예외 만들기
	
	public static void main(String[] args) {
		
		try {
			login("white", "12345");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
		
	}
	
	//로그인 메소드
	
	public static void login(String id , String pw ) throws Not,WrongPw {
		if (!id.equals("blue")) {
			//! 부정 반대로
			throw new Not("아이디가 존재하지 않슷ㅂ니다");
		}
		if(!pw.equals("12345")) {
			throw new WrongPw("패스워드가 존재하지않습니다");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
