package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class Client {

	Socket socket;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client ( Socket socket ) {
		this.socket = socket;
		receive();
	}
	
	public void receive() {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
			try {
				while(true)	{			
				InputStream inputStream = socket.getInputStream();//입력스트림
				byte[] bytes = new byte[1000]; //바이트 배열 선언
				inputStream.read(bytes);	//
				String msg = new String (bytes);
				// 받은 메시지를 서버내 접속된 모든 클라이언트에게 보내기
				for(Client client : ServerCon.clients) {
					client.send(msg);
				}
				}
				
			}catch (Exception e) {
			}
				
			}
		};
		ServerCon.threadpool.submit(runnable);
	}
	
	public void send( String msg ) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(msg.getBytes());
				outputStream.flush();//스트링내 메모리 초기화
				
				
				}catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		};
		ServerCon.threadpool.submit(runnable);
	}
	
}






















