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
				return true;//�����Ұ�� true ����
			}
				return false;//�������� ������� false ����
			
		}
	// 2. �α׾ƿ� �޼ҵ� [�μ� : id, ��ȯx]
		void logout(String id) {
			System.out.println(id+"�� �α׾ƿ� �Ǿ����ϴ�");
		}
		
}
















