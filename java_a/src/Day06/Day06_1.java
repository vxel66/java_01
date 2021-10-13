package Day06;

public class Day06_1 {

	public static void main(String[] args) {
	
		// p.195 
		// 1. 객체 만들기 : 클래스 이용한 메모리할당	
			Student student = new Student();
			//클래스면 객체명  =  new  생성자();
				//클래스명 == 생성자명
			System.out.println(" student 변수가 Student 객체를 참조합니다");
			
			Student sutdent2 = new Student();
			System.out.println(" student 변수가 또 다른 Student 객체를 참조합니다");
			
			System.out.println("객체이름 출력 : " + student );
			
			
			//p 201
			
			//1. 자동차 객체 만들기
			Car car = new Car();
			
			//2. 객체를 맴버[필드] 호출
			System.out.println("제작회사 : "+ car.company);
			System.out.println("모델명 "+car.model);
			System.out.println("색상 " + car.color);
			System.out.println("최고속도"+ car.maxSpeed);
			System.out.println("현재 스피드:"+car.speed);
			
			//3. 객체내 맴버[필드] 값 변경
			System.out.println(">>>>>속도 증가");
			car.speed = 60;
			System.out.println("수정된 속도:"+car.speed);
			
			
		//p.203 : 생성자
			Car2 car2 = new Car2("검정",3000); //생산자
		//p.207 " 생성자를 이용한 => 필드 초기화
			Korean korean = new Korean("박자바", "131351-65135");
			System.out.println("korean.name:"+korean.name);
			System.out.println("korean.ssn:"+korean.ssn);
			
			Korean korean2 = new Korean("김자바", "13133-5646");
			System.out.println("korean2.name:"+korean2.name);
			System.out.println("korean2.ssn:"+korean2.ssn);
			
			//비어있는 객체 [빈생성자]
			Korean korean3 = new Korean();
			korean3.name = "박자바";
			korean3.ssn = "131351-65135";
			System.out.println("korean3.name:"+korean3.name);
			System.out.println("korean3.ssn:"+korean3.ssn);
	}
	
		
	
}
























