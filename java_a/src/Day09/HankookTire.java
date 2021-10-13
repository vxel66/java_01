package Day09;

public class HankookTire extends Tire {
	
	//필드
	
	//생성자
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	}


	//메소드
	//오버라이딩 : 메소드 재정의[메소드 내용물 바꾸기]
	@Override
	public boolean roll() {
		++accumulatedRotation;//누적 회전수 증가
		if( accumulatedRotation< maxRotation) {//최대 회전수 더 크면
			System.out.println(" HankookTire수명:"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {//최대회전수가 더 작으면
			System.out.println("***"+location+" HankookTire펑크");
			return false;// false 수명이 없음을 표시하는 반환
		}
	}
	
	
}
