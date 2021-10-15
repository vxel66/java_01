package Day11;

import java.util.Arrays;

public class Member3 implements Cloneable {

	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	
	public Member3(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	//메소드
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. 얕은 복사를 통해 name, age 복사
		Member3 cloned = (Member3)super.clone();
		//2. 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
						//Arrays.copyOf(복제대상 , 복제대상깊이)
		//3 깊복
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	
}
