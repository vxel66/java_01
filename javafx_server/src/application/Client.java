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
				InputStream inputStream = socket.getInputStream();//�Է½�Ʈ��
				byte[] bytes = new byte[1000]; //����Ʈ �迭 ����
				inputStream.read(bytes);	//
				String msg = new String (bytes);
				// ���� �޽����� ������ ���ӵ� ��� Ŭ���̾�Ʈ���� ������
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
				outputStream.flush();//��Ʈ���� �޸� �ʱ�ȭ
				
				
				}catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		};
		ServerCon.threadpool.submit(runnable);
	}
	
}






















