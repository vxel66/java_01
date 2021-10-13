package Day10;

public class Oracle implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클 db 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("오라클 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("오라클 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("오라클 삭제");
		
	}

	
	
	
}
