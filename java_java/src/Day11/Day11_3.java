package Day11;

public class Day11_3 {
	
	
	public static void main(String[] args) {
		
		// System Ŭ���� [��� �ɹ��� static �̱� ������ ��ü�� �ʿ���� ]			
			  
		// 1.exit : ���α׷� ����
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
		//���۽ð�
		long time1 = System.nanoTime();
		
		int sum=0;
		for(int i = 1; i<=1000000 ; i++) {
			sum+=i;
		}
		
		
		//�����½ð�
		long time2 =System.nanoTime();
		
		System.out.println(" �� "+sum);
		
		System.out.println("�ɸ��ð� :"+(time2-time1)+"������");
		
		
		//3. �ý��� ���� ���[ System.getProperty("ȣ��Ű") ]
		System.out.println(System.getProperty("os.name"));
		
		System.out.println("pc ������̸� :"+System.getProperty("user.name"));
		
		System.out.println("������ġ : "+System.getProperty("java.home"));
		
		
		
		
		
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
