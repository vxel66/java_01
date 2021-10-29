package Day15;

public class Person implements Comparable<Person>{
							//comparable<정렬대상> :정령 인터페이스
	
	String name;
	int age ;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Person o) {
		if(age<o.age)return 1;
		else if(age==o.age )return 0;
		else return -1;
	}
	
}
