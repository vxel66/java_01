package application;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ServerCon implements Initializable {
	
	public static Vector<Client> clients =new Vector<>();
		//arraylist ����ȭ ��������, ���Ͻ�����, ����
		//vector 	����ȭ ������, 	��Ƽ������, ����
			//����ȭ : ������ �޼ҵ忡 ������ ������ ȣ�� �ҋ� ȣ����� �ޱ��
	// �����带 �����ϴ� ������Ǯ
	public static ExecutorService threadpool;
	
	//1. ��������
	ServerSocket serverSocket;
	//2. �������� �޼ҵ�
	public void serverstart() {
		//1. �������Ͽ� �޸� �Ҵ�
		try {
		serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("127.0.0.12",1234));
		
		
		}catch (Exception e) {}
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
				while(true) {
				Socket socket = serverSocket.accept();//��û ����
				clients.add(new Client(socket));	  //������ �������� Ŭ���̾�Ʈ ��ü ����
				}
				//		Platform.runLater(() -> txtarea.appendText(socket.getLocalAddress()+"\n"));
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		threadpool = Executors.newCachedThreadPool(); //�������� �޸� �ʱ�ȭ
		threadpool.submit(runnable);				//Ŭ���̾�Ʈ ��û �����带 ������Ǯ�� �߱�
	}
	//3. �������� �޼ҵ�
	public void serverstop() {
		try {
		// ������ ���ӵ� ȸ������ ���� ��� �ڱ�
		for(Client client : clients) {
			client.socket.close();//���ϴݱ�
		}
			
		serverSocket.close(); // �������� �ڱ�
		threadpool.shutdown();// ������ �ݱ�
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			txtarea.setEditable(false);
			btnserver.setText("���� ����");
	}
	

	@FXML
    private Button btnserver;

    @FXML
    private Label lblserver;

    @FXML
    private TextArea txtarea;
    
	@FXML
	  void start(ActionEvent event) {
		if(btnserver.getText().equals("���� ����")) {
			serverstart();
			// ���� ����
			// �޽���â�� ���� ����
			//Platform.runLater( () -> {} );
			Platform.runLater( () -> {
				txtarea.appendText("--- server start ---");
				// ��ư �̸� ����
				btnserver.setText("���� ����");
				lblserver.setText("���� ������");
			} );
			
			
		}else {
			serverstop();
			Platform.runLater(()->{
				txtarea.appendText("--- server stop ---");
				btnserver.setText("���� ����");
				lblserver.setText("���� ������");
			});
			
			
		}
	}
}












