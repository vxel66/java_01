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
	//�޼ҵ�
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. ���� ���縦 ���� name, age ����
		Member3 cloned = (Member3)super.clone();
		//2. ���� ����
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
						//Arrays.copyOf(������� , ����������)
		//3 ��
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	
}
