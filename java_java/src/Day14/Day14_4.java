package Day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day14_4 {

	
	// 회원제 프로그램
		//1. 리스트를 이용한 회원가입 , 로그인, 회원정보 ,회원수정 ,회원탈퇴
	
	public static void main(String[] args) {
	
		//1. 메뉴
		Scanner scanner = new Scanner(System.in);
		
		//배열생성 User클래스 만 들어갈수있는 (User 클래스 하위클래스(상속받은)도 가능)
		ArrayList<User> users = new ArrayList<>();
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:/Users/505/git/java_01/java_java/src/Day14/UserList.txt");			
			//1. 파일내 모든 글자 가져오기 [스트림 단위 : 바이트 ]
				//1.byte 배열 선언
				byte[] bytes = new byte[1024];// 
				//2. 읽어오기
				fileInputStream.read(bytes);
				String inString = new String(bytes);
			
			//2. 회원 구분하기
				String[] usernum = inString.split("\n");
				
			//3. 필드 구분하기
				
				for(String temp : usernum) {
					String[] userdata = temp.split(",");
					if(usernum.length == 1) break;					
					//4. 객체 생성
					User user = new User(userdata[0],userdata[1], userdata[2]);
					//5. 리스트 받기
					users.add(user);
					
				}
			
				
			
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
		while(true) {
			System.out.println("1.회원가입 2.로그인");
			int ch = scanner.nextInt();
			
			if(ch==1) {
				System.out.println("아이디:");	String id = scanner.next();
				System.out.println("비밀번호 : ");	String pw = scanner.next();
				System.out.println("이름 :");		String name = scanner.next();
				
				//2. 입력받은 데이터를 객체화 [3개 변수를 하나의 객체로]
				User user = new User(id , pw , name);
				
				//아이디 중복체크 [리스트내 객체 하나씩 temp에 대입 ]
				for(User temp : users) {
					if(temp.getId().equals(id)) {
						System.out.println("중복된 아이디입니다");
						break;
					}
				}								
				//3.리스트에 저장
				users.add(user);
				System.out.println("회원가입성공");
				
				//4.파일처리
					//1. 파일출력 클래스 
					try {
						FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/java_01/java_java/src/Day14/UserList.txt", true);
					 
					//2.String ----> bytes 내보내기
					String outstring = user.getId()+","+user.getPassword()+","+user.getName()+"\n";
					fileOutputStream.write(outstring.getBytes());
					System.out.println("파일처리 성공");
					}catch (Exception e) {
						System.out.println("파일처리 실패");
					}
				
			}else if (ch==2) {
				System.out.println("아이디:");	String id = scanner.next();
				System.out.println("비밀번호 : ");	String pw = scanner.next();
				for(User temp : users) {
					if(temp.getId().equals(id)&&temp.getPassword().equals(pw)) {
						System.out.println("로그인성공");
						
						///////////////////////////로그인 성공///////////////////////
						
						System.out.println("1.회원정보 2.회원수정 3. 회원탈퇴 4.로그아웃");
						int ch2 = scanner.nextInt();
						if (ch2==1) {
							System.out.println("아이디 :"+temp.getId());
							System.out.println("이름 :"+temp.getName());
						}
						if (ch2==2) {
							System.out.println("수정할 성명 : " ); String newname = scanner.next();
							temp.setName(newname);
							//파일처리
							//1.리스트내 모든 회원 저장[업데이트]
							try {
								FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/java_01/java_java/src/Day14/UserList.txt");
								String outString = ""; //모든 회원정보를 담을 문자열
								for(User temp2 : users) {
									//회원분류
									String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
									//분류된 정보를 모든 회원 문자열에 추가
									outString += outtemp;
								}
								fileOutputStream.write(outString.getBytes());
							} catch (Exception e) {
								
								e.printStackTrace();
							}
							
						}
						if (ch2==3) {
							//리스트 객체 삭제
							System.out.println("회원탈퇴");
							users.remove(temp);
							//파일 업데이트 처리
							try {
								FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/505/git/java_01/java_java/src/Day14/UserList.txt");
								String outString = ""; //모든 회원정보를 담을 문자열
								for(User temp2 : users) {
									//회원분류
									String outtemp = temp2.getId()+","+temp2.getPassword()+","+temp2.getName()+"\n";
									//분류된 정보를 모든 회원 문자열에 추가
									outString += outtemp;
								}
								fileOutputStream.write(outString.getBytes());
							} catch (Exception e) {
								
								e.printStackTrace();
							}
							break;
						}
						if (ch2==4) {System.out.println("로그아웃");break;}
						
					}else {System.out.println("동일한 회원정보가 없습니다");}
				}
							
				
			}
			
			
		}
		
		
	}
}



















