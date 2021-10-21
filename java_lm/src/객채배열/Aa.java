package 객채배열;



public class Aa {

	static Ab[] books = new Ab[100];
	
	public static void main(String[] args) {
		
		// 객체 배열 값 초기화, 배열의 요소가 객체, 생성자를 통해 값 초기화
		books[0] = new Ab("하이");
		
		// 객체 배열에 저장된 값 출력 [ 객체개 저장되어 객체가 저장되어 있기 때문에 각각의 주소값이 출력됨]
		System.out.println(books[0]);
		
		// 출력 
		System.out.println(books[0].booklist);
		System.out.println(books[0].getBooklist());
		
		// private
		books[1] = new Ab(227);
		
		//private 일시 출력불가
//		System.out.println(books[1].booknum);
	
		//get 이용
		System.out.println(books[1].getBooknum());
		
	}
}
