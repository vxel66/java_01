package Day10;

public class MySqIDo implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySqIDo  db �˻�");
		
	}

	@Override
	public void insert() {
		System.out.println("MySqIDo  ����");
		
	}

	@Override
	public void update() {
		System.out.println("MySqIDo ����");
		
	}

	@Override
	public void delete() {
		System.out.println("MySqIDo  ����");
		
	}

	
	
}
