package Day08;

public class Day08_1 {

	//실행 클래스 => main 메소드 [스레드 ]
	
	public static void main(String[] args) {
		
		//서브클래스 이용한 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		System.out.println("모델"+dmbCellPhone.model);//부모필드 접근 privae 변수가 아닐경우 맴버 접근 가능
		System.out.println("색상"+dmbCellPhone.color);
		System.out.println("채널"+dmbCellPhone.channel);
		
		//부모 메소드
		dmbCellPhone.powerOn();//부모 메소드 접근
		dmbCellPhone.bell(); //부모 메소드 접근
		dmbCellPhone.sendVoice("안녕핫요");
		dmbCellPhone.receiveVoice("안녕하세요");
		dmbCellPhone.sendVoice("반갑습니다");
		dmbCellPhone.hangUp();
		
		
		//본인ㄴ메소드
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannel(12);
		dmbCellPhone.turnOnDmb();
	}
	
	
}
