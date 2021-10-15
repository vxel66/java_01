package 예외;

public interface 인터페이스 {

	public void 회원메뉴();
	
	public void 관리자메뉴();
	
	public String 로그인();
	
	public void 회원가입();
	
	public static boolean 아이디체크(String id){
		return false;
		
	};
}
