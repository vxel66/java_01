package Day06;

public class Member {

	
	//13
		String name;
		String id;
		String password;
		String age;
	//14
		Member(String name,String id){
			this.name = name;
			this.id = id;
			
		}
	//15 
		boolean login(String id,String password) {
			if(id.equals("hong")&&password.equals("12345")) {
				return true;//동일할경우 true 리턴
			}
				return false;//동일하지 않을경우 false 리턴
			
		}
	// 2. 로그아웃 메소드 [인수 : id, 반환x]
		void logout(String id) {
			System.out.println(id+"님 로그아웃 되었습니다");
		}
		
}
















