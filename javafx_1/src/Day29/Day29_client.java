package Day29;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day29_client {

	public static void main(String[] args) {
		
		//1. 소켓 만들기
		Socket socket = new Socket();
		try {
		while(true) {
			
				socket.connect(new InetSocketAddress("127.168.123.50",5000));
				System.out.println("서버와 연결 성공");
				
				//3. 데이터 송신하기 
				Scanner scanner = new Scanner(System.in);
				System.out.println("메세지 입력 :");
				String msg = scanner.next();
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(msg.getBytes()); // 입력받은 문자열 바이트로 내보내기
				System.out.println("서버에게 메세지 전송 성공");
				
				InputStream inputStream = socket.getInputStream(); // 소켓입력 스트림
				byte[] bs = new byte[1000];
				inputStream.read(bs);
				System.out.println("메세지 :"+new String(bs));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
