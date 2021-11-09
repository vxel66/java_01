package Day29;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day29_client {

	public static void main(String[] args) {
		
		//1. ���� �����
		Socket socket = new Socket();
		try {
		while(true) {
			
				socket.connect(new InetSocketAddress("127.168.123.50",5000));
				System.out.println("������ ���� ����");
				
				//3. ������ �۽��ϱ� 
				Scanner scanner = new Scanner(System.in);
				System.out.println("�޼��� �Է� :");
				String msg = scanner.next();
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(msg.getBytes()); // �Է¹��� ���ڿ� ����Ʈ�� ��������
				System.out.println("�������� �޼��� ���� ����");
				
				InputStream inputStream = socket.getInputStream(); // �����Է� ��Ʈ��
				byte[] bs = new byte[1000];
				inputStream.read(bs);
				System.out.println("�޼��� :"+new String(bs));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
