package 연습;



public class 회원 {

	//필드
	
	private String m_id;
	private String m_pw;
	private String admin ="admin";
	//생성자
	public 회원(String m_id, String m_pw) {
		
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
	public 회원() {
		// TODO Auto-generated constructor stub
	}
	
	//메소드
	public void 회원메뉴() {
		System.out.println("1.도서목록 2.대여. 3.반납 4.로그아웃");
		System.out.println("선택 : "); int ch = Practice.scanner.nextInt();
		if(ch==1) {
			
		}
		if(ch==2) {
			
		}
		if(ch==3) {
			
		}
		if(ch==4) {
			return;
		} 
	}
	public void 관리자메뉴() {
		System.out.println("1.도서목록  2.도서등록  3.로그아웃");
		System.out.println("선택:"); int ch = Practice.scanner.nextInt();
		if(ch==1) {
			
		}
		if(ch==2) {
			
		}
		if(ch==3) {
			return;
		}
	}
	
	
	public String 로그인() {
		System.out.println("아이디를 입력해주세요"); String id = Practice.scanner.next();
		System.out.println("비밀번호를 입력해주세요"); String pw = Practice.scanner.next();
		//회원 idpw = new 회원(id, pw);
		for(int i = 0; i<Practice.members.length; i++) {
			//if(Practice.members[i] != null &&Practice.members[i].equals(idpw)) 
			if(	Practice.members[i] != null &&
				Practice.members[i].getM_id().equals(id)&&
				Practice.members[i].getM_pw().equals(pw))
			{
				if(id.equals("admin")) {
					return "어드민로그인";
				}
				return "회원로그인";
			}
		}
		
		System.out.println("아이디 또는 비밀번호가 다릅니다");
		return "로그인실패";
	}
	
	public void 회원가입() {
		while(true) {
			System.out.println("아이디를 입력해주세요:");String id = Practice.scanner.next();
			boolean idcheck = 아이디체크(id);
			if( idcheck ) {
				System.out.println(" [[ 알림 ]] : 사용할수 없는 아이디 입니다 ");
				 break;
			}
			System.out.println("비밀번호 입력");String pw = Practice.scanner.next();
			
			회원 idpw = new 회원(id, pw);
			for(int i = 0; i<Practice.members.length; i++) {
				if(Practice.members[i]==null) {
					Practice.members[i]=idpw;
					return;
				}
			}
			
		
		}
		
	}
	
	public static boolean 아이디체크( String id) {
		for(int i = 0; i < Practice.members.length ; i++) {
			//   ******
			if( Practice.members[i] != null &&
				Practice.members[i].getM_id().equals(id)&&
				Practice.members[i] != null ) {
				
				return true;
			}
		}
		return false;
	}
	
	
	
	
	//게터 세터
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	
	
	
}
