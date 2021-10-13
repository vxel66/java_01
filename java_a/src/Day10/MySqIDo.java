package Day10;

public class MySqIDo implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySqIDo  db 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySqIDo  삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySqIDo 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySqIDo  삭제");
		
	}

	
	
}
