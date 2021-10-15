package Day11;

public class Day11_3 {
	
	
	public static void main(String[] args) {
		
		// System 클래스 [모든 맴버가 static 이기 때문에 객체가 필요없음 ]			
			  
		// 1.exit : 프로그렘 종료
//		System.setSecurityManager(new SecurityManager() {
//			
//			@Override
//			public void checkExit(int status) {
//				if( status !=5) {
//					throw new SecurityException();
//				}
//			}
//		});
//		
//		for(int i = 0 ; i<10; i++) {
//			System.out.println(i);
//			try {
//			System.exit(i);
//			}catch ( Exception e) {
//				
//			}
//		}
		
		//2
		//시작시간
		long time1 = System.nanoTime();
		
		int sum=0;
		for(int i = 1; i<=1000000 ; i++) {
			sum+=i;
		}
		
		
		//끝나는시간
		long time2 =System.nanoTime();
		
		System.out.println(" 합 "+sum);
		
		System.out.println("걸린시간 :"+(time2-time1)+"나노초");
		
		
		//3. 시스템 정보 얻기[ System.getProperty("호출키") ]
		System.out.println(System.getProperty("os.name"));
		
		System.out.println("pc 사용자이름 :"+System.getProperty("user.name"));
		
		System.out.println("폴더위치 : "+System.getProperty("java.home"));
		
		
		
		
		
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
