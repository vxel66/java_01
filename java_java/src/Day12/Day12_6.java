package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_6 {

	// 메모리[주기억장치 = RAM]:변수, 배열 , 객체 등등 : 프로그램 종료시 다 초기화
		//주기억장치 : 현재 실행중인 프로그램(명령어들의 집합) 제어
			//전기 X 저장X => 휘발성 메모리
		//보조기억장치 : [ 파일 , DB 등]
			//전기 X 저장O => 비휘발성 메모리
	
	// 파일 <-- 스트림(단위:바이트) --> JAVA 프로그램
	
	public static void main(String[] args) throws Exception {
		
		
		// 파일처리 클래스
			//1.FileOutputStream :파일출력 스트림 [해당 파일이 없으면 생성]
				//FileOutputStream 객체면 = new FileOutputStream("파일경로")
															//  /:경로
				//1. write( 바이트형 ) : 해당 파일에 쓰기
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:/00lmw/java_java/src/Day12/test.txt");
			//입출력 관련된 클래스 => 무조건 예외처리발생
//		String 문자열 = "이클립스에서 작성된 문서입니다";
//		fileOutputStream.write(문자열.getBytes());
			
		FileInputStream fileInputStream = new FileInputStream("D:/00lmw/java_java/src/Day12/test.txt");
//		
//			//읽어온 바이트를 저장할 배열
		byte[] 바이트배열 = new byte[1024]; //1kb = 1024byte
		fileInputStream.read(바이트배열);
			
		String strreed = new String(바이트배열);
		System.out.println("현재 파일의 내용은 : " + (new String(strreed)));
		
		//키보드에 입력된 변수를 메모장 누적 저장
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("메모장 입력 데이너:");
			String outstr = scanner.next();
			outstr = outstr +"\n";
			fileOutputStream.write(outstr.getBytes());
					
		}
		
	}
	
}
