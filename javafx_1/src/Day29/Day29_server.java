package Day29;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day29_server {

	//��ſ� ���� �����
		//1.�������� ����� [ ServerSocket Ŭ���� ]
			//���� : pc���� ��� ������ [ server ������ ����Ͽ� client �� ���� ]
		//2. �������� ���ε� �ϱ�
			//ip �ּ�ȭ port ��ȣ ����
			//* port : ip�� 6���� ���� ������ ��ȣ [ ip�� ���μ��� ���� ��ȣ ]
	
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(); //1. �������� �����
			//2. �������Ͽ� ip, port ����
			serverSocket.bind(new InetSocketAddress("127.168.123.50",5000)); //2.
			while(true) {
				System.out.println("������ ���� ����� ");
				Socket socket = serverSocket.accept();// .accept() : Ŭ���̾�Ʈ ��û�� ����
		
				// ������ Ŭ���̾�Ʈ ���� Ȯ��
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("���� �Ǿ����ϴ�" +socketAddress.getHostName());
				
				// ������ �����ϱ� [ �ޱ� ] : ��Ʈ���� �̿��� �ܺ� ��Ʈ��ũ ���
				InputStream inputStream = socket.getInputStream(); // �����Է� ��Ʈ��
				byte[] bs = new byte[1000];
				inputStream.read(bs);
				System.out.println("�޼��� :"+new String(bs));
				
				OutputStream outputStream = socket.getOutputStream();
				Scanner scanner = new Scanner(System.in);
				System.out.println("Ŭ���̾�Ʈ ���� ���� : ");
				String msg = scanner.nextLine();
				
				outputStream.write(msg.getBytes());
						
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}

























