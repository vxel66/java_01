package Day11;

public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//object 클래스내 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) { //비교할 객체를 인수로 받음
		
		if(obj instanceof Member) {// s
			//Member 클래스에 obj 포함되어 있는지 확인 [true,false]
			Member member = (Member)obj;
			
		
		if(id.equals(member.id)) {
			return true;
		}
		}
		return false;
	}
		
	@Override
	public String toString() {
		
		return "현재 저장된 필드는 : " + this.id;
	}
	
	
}
