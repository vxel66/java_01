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
		//arraylist 동기화 지원안함, 단일스레드, 빠름
		//vector 	동기화 지원함, 	멀티스레드, 느림
			//동기화 : 동일한 메소드에 여러개 스렏가 호출 할떄 호출순서 메기기
	// 스레드를 관리하는 스레드풀
	public static ExecutorService threadpool;
	
	//1. 서버소켓
	ServerSocket serverSocket;
	//2. 서버실행 메소드
	public void serverstart() {
		//1. 서버소켓에 메모리 할당
		try {
		serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("127.0.0.12",1234));
		
		
		}catch (Exception e) {}
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
				while(true) {
				Socket socket = serverSocket.accept();//요청 수락
				clients.add(new Client(socket));	  //수락된 소켓으로 클라이언트 객체 생성
				}
				//		Platform.runLater(() -> txtarea.appendText(socket.getLocalAddress()+"\n"));
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		threadpool = Executors.newCachedThreadPool(); //스레드콜 메모리 초기화
		threadpool.submit(runnable);				//클라이언트 요청 스레드를 스레드풀에 추기
	}
	//3. 서버중지 메소드
	public void serverstop() {
		try {
		// 서버에 접속된 회원들의 소켓 모두 닥기
		for(Client client : clients) {
			client.socket.close();//소켓닫기
		}
			
		serverSocket.close(); // 서버소켓 닥기
		threadpool.shutdown();// 스레드 닫기
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			txtarea.setEditable(false);
			btnserver.setText("서버 중지");
	}
	

	@FXML
    private Button btnserver;

    @FXML
    private Label lblserver;

    @FXML
    private TextArea txtarea;
    
	@FXML
	  void start(ActionEvent event) {
		if(btnserver.getText().equals("서버 실행")) {
			serverstart();
			// 서버 실행
			// 메시지창에 내용 비우기
			//Platform.runLater( () -> {} );
			Platform.runLater( () -> {
				txtarea.appendText("--- server start ---");
				// 버튼 이름 변경
				btnserver.setText("서버 중지");
				lblserver.setText("서버 실행중");
			} );
			
			
		}else {
			serverstop();
			Platform.runLater(()->{
				txtarea.appendText("--- server stop ---");
				btnserver.setText("서버 실행");
				lblserver.setText("서버 중지중");
			});
			
			
		}
	}
}












