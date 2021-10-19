package Day14;

import java.util.Arrays;

public class Day14_2 {

	
	public static void main(String[] args) {
		
		
		//자제저긍로 new 연산자 불가
		
		Course<Person> personCourse =new Course<>("일방인과정", 5);
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Students("학생"));
			personCourse.add(new HighStudents("고등학생"));
				//해당 배열에 add는 일반인 , 직장인, 학생 ,고등학생
			
			Course<Worker> workerCours = new Course<>("직장인과정", 5);
			//	workerCours.add(new Person("일반인"));
				workerCours.add(new Worker("직장인"));
			
			Course<Students> studentsCourse = new Course<>("학생과정", 5);
			
			registerCourse(personCourse);
			registerCourse(workerCours);	
				
				
	}
	
	//p668
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() +"수강생명단"+Arrays.toString(course.getStudents()));
				
	}
	public static void registerCourseStudent( Course<? extends Students>course) {
		System.out.println(course.getName() +"수강생명단"+
				Arrays.toString(course.getStudents()));
	}
	//직장인 목록을 출력하는 메소드 // 
	public static void registerCourseStudent
	
	
}
