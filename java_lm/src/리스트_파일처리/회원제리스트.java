package 리스트_파일처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class 회원제리스트 {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Member> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try {
			//1 파일내 모든글자 가져오기
			FileInputStream fileInputStream = new FileInputStream("C:/Users/minwook/Downloads/새 폴더/pekora.txt");
			//바이트배열선언
			byte[] bytes = new byte[1024];
			//바이트 읽어오기
			fileInputStream.read(bytes);
			//바이트를 문자열로 변경
			String inString = new String(bytes);
			// 회원구분하기
			String[] usernum = inString.split("\n");
			//필드 구분하기
			for(String temp : usernum) {
				String[] userdata = temp.split(",");
				if(userdata.length ==1) break;
				
				Member member = new Member(userdata[0], userdata[1], userdata[2]);
				
				list.add(member);
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		while(true) {
			System.out.println("1. 회원가입 2.로그인");
			int ch = scanner.nextInt();
			
			if(ch == 1 ) {
			System.out.println("아이디 :");	String id = scanner.next();
			System.out.println("비밀번호 :");	String pw = scanner.next();
			System.out.println("이름 :");		String name = scanner.next();
			
			boolean idcheck =true ;
			for(int i = 0; i< list.size() ; i++) {
				if(list.get(i).getId().equals(id)) {
					idcheck = false; break;
				}
			}
			
			if(idcheck) {
			list.add(new Member(id, pw, name));
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/minwook/Downloads/새 폴더/pekora.txt",true);
				String out = "";
				for(Member temp : list) {
					String outtemp = temp.getId()+","+temp.getPw()+","+temp.getName()+"\n";
					out+=outtemp;
				}
				fileOutputStream.write(out.getBytes());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			}else System.out.println("아이디가 존재합니다");			
			}
			if(ch == 2) {
				System.out.println(" 아이디 : ");		String id = scanner.next();
				System.out.println(" 비밀번호 : ");	String password = scanner.next();
				
				for(Member temp : list) {
					if(temp.getId().equals(id)&&temp.getPw().equals(password)) {
						while(true) {
							System.out.println("1.회원정보 2.회원수정 3.회원탈퇴 4.로그아웃 ");
							int ch3 = scanner.nextInt();
							if(ch3 == 1) {
								System.out.println(temp.getId());
								System.out.println(temp.getName());
							}
							if(ch3 == 2) {
								System.out.println("수정할 성명 : ");String newname = scanner.next();
								//set 메소드를 통한 필드값 변경
								temp.setName(newname);
								try {
									FileOutputStream fileOutputStream = new FileOutputStream("\"C:/Users/minwook/Downloads/새 폴더/pekora.txt\",true");
									
									//리스트내 모든회원 저장 [업데이트[
									String outstring =""; //모든회원의 정보를 담을 문자열
									for(Member temp2 : list) {
										String outtemp = temp.getId()+","+temp.getPw()+","+temp.getName()+"\n";
										outstring+=outtemp;
									}
									fileOutputStream.write(outstring.getBytes());
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								
							}
							if(ch3 == 3) {
								
							}
							if(ch3 == 4) {
								System.out.println("로그아웃");
							}
							
						}
						
					}else {
						System.out.println("아이디또는 비밀번호가 드립니다");
					}
				}
					
				
			}
		}
	}
	
	
	
}






















