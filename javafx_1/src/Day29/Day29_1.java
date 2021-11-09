package Day29;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day29_1 {

	
	//네트워크 : 두대 이상의 컴퓨터들을 연결하고 통신할수 있는 것
		//통신망 : 전자신호를 통해 통신하는 모든 기기가 서로 통신하기 위한 하나의 망
			//LAN ,MAN , WAN 
		//인터넷 : TCP/IP 라는 통신 프로토콜 이용한 컴퓨터 네트워크 
			//프로토콜 : 규약, 규칙 ,약속
	// TCP/IP 
		//TCP : Transmission Control Protocol : 통신 제어
		//IP  :	Internet Protocol address     : 통신 인식 번호
			//집주소 [집 1개 -> 1개 주소 ] : 컴퓨터주소[컴퓨터 1개 -> 1개 IP ]
			//택배 	   [쿠팡-> 집 ] 	  : 통신 [ PC방 -> 학원 ]
			//네이버접속 [ 학원IP ----> 네이버IP ]
				//* IP : 숫자 0~255 , 4자리 , 구분
					//IP는 사람이 사이트마다 외우기 힘듬 ----> 문자편ㄴ함
				//*IP --> 문자 : 도메인주소[DNS]
	
		//SERVER PC : 많은 자료를 저장해둔 PC
	
	//현재 IP 확인 방법
		//CMD - > ipconfig
		//자바 - > InetAddress
	public static void main(String[] args) {
		
		// 1. 현재 pc의 호스트 가져오기
		try {
			
			InetAddress address = InetAddress.getLocalHost(); //무조건 예외처림
			System.out.println("현재 pc 정보 객체"+address);
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
			//2. 네이버 회사 호스트 가져오기
			InetAddress address2 = InetAddress.getByName("www.naver.com");
			System.out.println(address2);
			System.out.println(address2.getHostName());
			System.out.println(address2.getHostAddress());
		// 3. 네이버 회사의 다수 ip 확인
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			for(InetAddress temp : inetAddresses) {
				System.out.println(temp.getHostAddress());
			}
			InetAddress address3 = InetAddress.getByName("www.facebook.com");
			System.out.println(address3);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}















