package Day09;

public class Parent {

	//parent로 부터 상속받은 child객체 생성시 ==>부모 클래스 생성자 먼저 실행
	//parent 생성자 실행[Parent()]
	
	
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() Call");
		
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation)Call");
	}
}
