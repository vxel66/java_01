package Day14;

public class Course<T> {

	//필드
	private String name;
	private T[] students; //배열
	
	
	public Course(String name,int capacity){
		this.name =name;
		students = (T[])new Object[capacity];
			//
	}


	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}

	public void add(T t ) {
		for(int i = 0 ; i< students.length ; i++) {
			if(students[i]==null) {
				students[i] = t; break;
			}
		}
	}
	
	
	
	
}
