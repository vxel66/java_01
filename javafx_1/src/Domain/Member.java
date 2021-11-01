package Domain;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Member {

	private String m_id;
	private String m_password;
	private String m_name;
	private String m_email;
	private int m_point;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String m_id, String m_password, String m_name, String m_email, int m_point) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = m_point;
	}
	
	public Member(String m_id, String m_password, String m_name, String m_email) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = 1000;
	}
	
	//회원수정시 사용되는 생성자
	public Member(String m_name, String m_email) {
		this.m_name = m_name;
		this.m_email = m_email;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public int getM_point() {
		return m_point;
	}

	public void setM_point(int m_point) {
		this.m_point = m_point;
	}
	
	//이메일 전송 메소드
	public static void sendmail(String tomail , String msg , int type) {
							//tomail 받는사람  // msg 내용물   //type 메일 타입
		//보내는 사람 정보
		String frommail = "alsdnr5341@naver.com";
		String frompassword = "";
		
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.naver.com");
		properties.put("mail.smtp.port", 587);
		properties.put("mail.smtp.auth", true);
		
		Session session = Session.getDefaultInstance(properties,new Authenticator() {
			//익명 구현객체
			
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(frommail, frompassword);
		}
		}); //인증 끝
		
		//메일 보내기
	try {	
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(frommail));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(tomail));
		
		if(type ==2) {
			message.setSubject("패스워드");
			message.setText("회원님의 비밀번호"+msg);
		}
		Transport.send(message);
		
	}catch (Exception e) {
		// TODO: handle exception
	}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}

































