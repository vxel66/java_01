package Day09;

public class Tire {

	public int maxRotation;   //최대회전수 [타이어 수명]
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어위치
	
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() { // 타이어 회전 메소드
		
		++accumulatedRotation;//누적 회전수 증가
		if( accumulatedRotation< maxRotation) {//최대 회전수 더 크면
			System.out.println("Tire수명:"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {//최대회전수가 더 작으면
			System.out.println("***"+location+"Tire펑크");
			return false;// false 수명이 없음을 표시하는 반환
		}
	}
	
	
}
