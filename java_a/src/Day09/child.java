package Day09;

public class child extends Parent {

	private String name;
	
	public child() {
		this("ȫ�浿");
		System.out.println("Child() Call");
	}
	public child(String name) {
		this.name = name;
		System.out.println("Child(String name)Call");
	}
}
