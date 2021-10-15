package Day11;

public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//object Ŭ������ �޼ҵ� �������̵�
	@Override
	public boolean equals(Object obj) { //���� ��ü�� �μ��� ����
		
		if(obj instanceof Member) {// s
			//Member Ŭ������ obj ���ԵǾ� �ִ��� Ȯ�� [true,false]
			Member member = (Member)obj;
			
		
		if(id.equals(member.id)) {
			return true;
		}
		}
		return false;
	}
		
	@Override
	public String toString() {
		
		return "���� ����� �ʵ�� : " + this.id;
	}
	
	
}
