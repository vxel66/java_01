package Day29;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day29_server {

	//통신용 서버 만들기
		//1.서버소켓 만들기 [ ServerSocket 클래스 ]
			//소켓 : pc간의 통신 종착점 [ server 소켓이 허락하여 client 와 연결 ]
		//2. 서버소켓 바인딩 하기
			//ip 주소화 port 번호 설정
			//* port : ip당 6만개 정도 설정된 번호 [ ip내 프로세스 연결 번호 ]
	
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(); //1. 서버소켓 만들기
			//2. 서버소켓에 ip, port 설정
			serverSocket.bind(new InetSocketAddress("127.168.123.50",5000)); //2.
			while(true) {
				System.out.println("서버에 연결 대기중 ");
				Socket socket = serverSocket.accept();// .accept() : 클라이언트 요청시 수락
		
				// 수락된 클라이언트 소켓 확인
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("연결 되었습니다" +socketAddress.getHostName());
				
				// 데이터 수신하기 [ 받기 ] : 스트림을 이용한 외부 네트워크 통신
				InputStream inputStream = socket.getInputStream(); // 소켓입력 스트림
				byte[] bs = new byte[1000];
				inputStream.read(bs);
				System.out.println("메세지 :"+new String(bs));
				
				OutputStream outputStream = socket.getOutputStream();
				Scanner scanner = new Scanner(System.in);
				System.out.println("클라이언트 에게 보낼 : ");
				String msg = scanner.nextLine();
				
				outputStream.write(msg.getBytes());
						
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}

























