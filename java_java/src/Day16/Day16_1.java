package Day16;


public class Day16_1 {

	//1.Member Board
		//패키지 구성
			//MVC
		//M(model):data
		//V(view) :front
		//C(control): model <--제어--> view
		//*Database : DB,File
	
	//2.클래스 구성
		// *Data:file
	
		// *M:Member,Board,Reply
		
		// *C:MemberController , BoardController , ReplyControler
		
		// *V:Application( mainmenu, membermenu, boardmenu )
	
	//3.클래스 설계 [ 필드 , 생성자 , 메소드]
		//Member
			//	필드: id, password , name ,email , point
			//  생성자: 빈생성자,전체생성자
			//  메소드: get,set 메소드
		
		//File
			//필드:filepath
			//메소드:save, load 메소드
		
		//*MemberContrllor 
			//필드: Arraylist<Member> memberlist
			//메소드:login , signup , forgotid , forgotpassword ,logout ,info , update ,deledt
	//[코드]
	
		
	
	
		
}
