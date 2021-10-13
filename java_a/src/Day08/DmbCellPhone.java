package Day08;

public class DmbCellPhone extends Cellphone {
						//extends " 연장하자 //상속 1개
	//핸드폰 기본기능 => Cellphon
	//필드 
	int channel;
	//생성자
	public DmbCellPhone(String model,String color,int channel) {
		// this : 현재 클래스내 맴버
//		this.model = model; //부모클래스낸 맴버 사용
//		this.color = color; //부모클래스내 맴버 사용
//		this.channel = channel; //본인클래스 맴버 사용
		
		
		//부모클래스 생성자 있을때 ->
		super(model,color); //부모클래스 생성자 호출
		this.channel = channel;//본인클래스 맴버 사용
	}
	void turnOnDmb() {
		System.out.println("채널:"+channel+"번 방송을 수신");
	}
	void changeChannel(int channel) { 
		this.channel = channel;
		//this.channel 현재클래스내맴버
		//channel 메소드에 외부로부터 들어온 인수
		System.out.println("채널"+channel );
	}
	void turnOffDmb() {
		System.out.println("DMb방송 수신을 멈춥니다");
	}
	
	//오버라이딩 [부모클래스내 메소드 재정의] "자동완성
	
	@Override // 재정의 => 코드변경 @:어노테이션 
	void powerOn() {
		//super.powerOn(); 부모메소드 호출
		System.out.println("전원 메소드 재정의 " );
	}
	
	
}
