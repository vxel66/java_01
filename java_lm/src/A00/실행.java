package A00;

public class 실행 {

	
	public static void main(String[] args) {
		
		강아지 강아지 = new 강아지();
		고양이 고양이 = new 고양이();
		망아지 망아지 = new 망아지();
		강아지.start();
		고양이.start();
		망아지.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		강아지.setStop(true);		
		고양이.setStop(true);		
		망아지.setStop(true);		
		System.out.println(강아지.getName());
		System.out.println(고양이.getName());
		System.out.println(망아지.getName());
	}
}
