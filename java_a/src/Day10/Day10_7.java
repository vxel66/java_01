package Day10;

public class Day10_7 {

	//
	public static void main(String[] args)  {
		
//		// 예외처리 : 1.일반예외 2.실행예외
//			//목적 : 다양한 오류가 발생시 => 프로그램 정상화
//		
		// 예외클래스
			//* Exception : 예외 슈퍼클래스 : 모든 예외 저장 가능
			//NullPointerException
			//ArrayIndexOutOfBoundsException
			//NumberFormatException
			// 등등
		
		// 예외 던지기
			//목적 : 메소드내에서 발생한 예외를 호출한곳으로 이동[ 예외 통일성 ]
		
		
try {		//p.423 :
		String data = null;// String 객체에 null 대입
		System.out.println(data.toString()); // toString() " 객체정보반환
		
}catch( Exception e) {
	System.out.println("예외가 발생 했습니다 "+e );
}finally {
	System.out.println("무조건");
}
			
	//	예2
	try {
		String[] 문자열배열 = new String[2];
		문자열배열[0] = "유재석";   문자열배열[1] = "강호동";   문자열배열[2] = "신동엽";     
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("예외발생 " +e);}
		//예3 p426
		try {	
			String data1 = "100";   //"100" -> 100 [가능]
			String data2 = "a100";  //"a100" -> 100 [불가능]
			
			System.out.println(Integer.parseInt(data1));
			System.out.println(Integer.parseInt(data2));
							//Integer : 정수 관련 클래스 [ 정수 괄련 메소드 제공]
							//.parseInt(문자): 문자를 정수형으로 변환해주는 메소드
		}catch(NumberFormatException e) {
			System.out.println("예외 "+ e);
		}

	}
			
	}
	
