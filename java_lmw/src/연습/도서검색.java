package 연습;

import java.io.IOException;

public class 도서검색 {
/*서관 시스템 만들기 [ 책찾기 ]

- 도서 검색 프로그램

		1. 조건 : 도서목록 배열선언
			[4개의 도서를 배열에 등록]
			1. 된다 ! 네이버 블로그&포스트
			2.스프링 부트 실전 활용 마스터
			3. Tucker의 Go 언어 프로그래밍
			4. 혼자 공부하는 C언어

		2. scanner -> System.in.read()

		3. 조건 : 검색을 입력받아 검색한 단어가 포함된 도서 모두 출력
		4. 수정기능 : 수정할 도서를 입력받아 선택 후 교체할 단어와 새로운 단어 입력받아 교체

String[] 도서목록 = {
		"된다 ! 네이버 블로그&포스트"
		"스프링 부트 실전 활용 마스터",
		"Tucker의 Go 언어 프로그래밍"
		"혼자 공부하는 C언어"
		}
	
	*/
	public static void main(String[] args) throws IOException {
		String[] books = {"된다 ! 네이버 블로그&포스트" ,"스프링 부트 실전 활용 마스터","Tucker의 Go 언어 프로그래밍","혼자 공부하는 C언어"};
		
		//
		while(true) {
		
		byte[] byte1 = new byte[100];
			
		System.out.println("1. 도서목록 2. 도서찾기 3. 도서수정");
		int ch = System.in.read(byte1);
		//숫자로 받아서    바이트 배열에 저장
		String ch2 = new String(byte1,0,ch-2);
		if(ch2.equals("1")) {
			System.out.println("----도서목록----");
			for(int i = 0 ; i< books.length; i++) {
				System.out.println(books[i]);
				
			}
			
		}
		if(ch2.equals("2")) {
			System.out.println("도서 검색:");
			ch = System.in.read(byte1);
			String find = new String(byte1,0,ch-2);
			for(int i =0; i<books.length; i++) {
				if(books[i].contains(find)) {
					System.out.println(books[i]);
					
				}
			}
			
			
		}
		if(ch2.equals("3")) {
			System.out.println("수정할 도서입력: ");
			int book = System.in.read(byte1);
			String bookname = new String(byte1,0,book-2);
			for(int i = 0 ; i< books.length ; i++) {
				if(books[i]!=null&&
					books[i].equals(bookname)) {
					System.out.println("수정할 단어:");
					ch = System.in.read(byte1);
					String origin = new String(byte1,0,ch-2);
					System.out.println("수정:");
					ch = System.in.read(byte1);
					String newstr = new String(byte1, 0,ch-1);
					String new1 = books[i].replace(origin, newstr);
					books[i]=new1;
					System.out.println("완료");
				}
			}
			
			
			
		}
		}
		
		
	}
	
}
























