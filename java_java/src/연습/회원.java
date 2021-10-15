package 연습;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class 회원 {

	//필드
	
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	//생성자
	public 회원(String m_id, String m_pw) {
		
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
public 회원(String m_id, String m_pw,String m_name,String m_phone) {
		
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	public 회원() {
		// TODO Auto-generated constructor stub
	}
	
	//메소드
	public void 회원메뉴() {
		System.out.println("로그인");
	}

	static public void 로그인() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("C:/java/sample.txt");
		byte[] 바이트배열 = new byte[1024];
		fileInputStream.read( 바이트배열 );
		String strread = new String( 바이트배열 );
		System.out.println(" 개인정보 : " + strread );
		
		System.out.println("아이디 입력"); String id = Practice.scanner.next();
		System.out.println("비밀번호 입력"); String pw = Practice.scanner.next();
		
		회원 idpw = new 회원(id, pw);
		
		for(int i = 0; i<Practice.members.length; i++) {
			if(Practice.members[i]!=null&&
					Practice.members[i].equals(idpw)) {
				
			}
		}
		
		
		
	}
	
	public void 회원가입() throws Exception {
		while(true) {
				
			System.out.println("아이디를 입력해주세요:");String id = Practice.scanner.next();									
			System.out.println("비밀번호 입력");String pw = Practice.scanner.next();			
			System.out.println("이름 입력");String name = Practice.scanner.next();		
			System.out.println("전화번호 입력");String num = Practice.scanner.next();
			
			회원 member= new 회원(id, pw, name, num);
			
			
			for(int i = 0; i < Practice.members.length ; i++) {
				if(Practice.members[i]==null) {
					Practice.members[i]=member;
				}
			}
			
			FileOutputStream fileOutputStream = new FileOutputStream("C:/java/memberlist.txt");	
			String out = (member.m_id+","+member.m_pw+","+member.m_name+","+member.m_phone);
			fileOutputStream.write( out.getBytes() );
			
			return;
			
			
	
		}
	}
	//팀 문제 : 로그인 /회원가입 [파일처리]

			//조건 : 회원가입 파일에 저장
			// 회원클래스: 아이디 비밀번호 성명 연락처
	
	
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
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	
	
	
}
