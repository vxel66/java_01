package 팀;

public class 사람 {
//필드
	private String name;
	
	private int age;
//생성자
	public 사람(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name;
		}
	
}
