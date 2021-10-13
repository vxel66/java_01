package Day10;

public class Day10_1 {

	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new Oracle());
		dbWork(new MySqIDo());
		
		
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("wo");
				
			}
			
			@Override
			public void delete() {
				System.out.println("de");
				
			}
		};
	
		
		
		action.work();
		action.delete() ;
	}
	
}
