package Day14;

import java.util.Arrays;

public class Day14_2 {

	
	public static void main(String[] args) {
		
		
		//��������� new ������ �Ұ�
		
		Course<Person> personCourse =new Course<>("�Ϲ��ΰ���", 5);
			personCourse.add(new Person("�Ϲ���"));
			personCourse.add(new Worker("������"));
			personCourse.add(new Students("�л�"));
			personCourse.add(new HighStudents("����л�"));
				//�ش� �迭�� add�� �Ϲ��� , ������, �л� ,����л�
			
			Course<Worker> workerCours = new Course<>("�����ΰ���", 5);
			//	workerCours.add(new Person("�Ϲ���"));
				workerCours.add(new Worker("������"));
			
			Course<Students> studentsCourse = new Course<>("�л�����", 5);
			
			registerCourse(personCourse);
			registerCourse(workerCours);	
				
				
	}
	
	//p668
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() +"���������"+Arrays.toString(course.getStudents()));
				
	}
	public static void registerCourseStudent( Course<? extends Students>course) {
		System.out.println(course.getName() +"���������"+
				Arrays.toString(course.getStudents()));
	}
	//������ ����� ����ϴ� �޼ҵ� // 
	public static void registerCourseStudent
	
	
}
