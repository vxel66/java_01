package Day11;

import java.io.IOException;

public class Day11_4 {

	
	public static void main(String[] args) throws IOException {
		
		//Ű����κ��� ���ڿ� �޾ƿ��� ����
			// Ű���� �Է� => �Է°� [����Ʈ ] => ����Ʈ => ���ڿ� ��ȯ
			//Ű���� �Է� => �Է°�[ ����Ʈ��ȯ] => ����Ʈ => ���ڿ� ��ȯ
						//		a		=>  97 	=>    a
						//    Ű����     ��ȯ ����Ʈ ��ȯ    ���
		//Stirng Ŭ����
			//1. Stirng ������
				//
		// 1.����Ʈ�迭 ���� ����
//		byte[] bytes = {72,101,100,108,108,111,32,74,97,118,97};
//	
//		//2. ����Ʈ�迭�� String �����ڿ� �ֱ�
//		String str1 = new String(bytes);
//		System.out.println(str1);
//		
//		//3.						 //������ ����
//		String str2 = new String(bytes , 6, 4);
//		System.out.println(str2);
//		
//		//p498
//		byte[] bytes2 = new byte[100];
//		
//		System.out.println("�Է� : "); 
//		int reedcount = System.in.read(bytes2);
//		System.in.read(bytes2); //������ ����ó�� 
//			// ����°��� �׻� ����ó�� �߻�
//				// System.in.read(�迭��) : Ű����κ��� �о�� ����Ʈ�� �迭�� ����
//		System.out.println(new String(bytes2));
//							// ����Ʈ�� => ���ڿ� ��ȯ
//		
//		System.out.println( new String(bytes2,0,reedcount-2) );
//		
//		//���� ����
//		
//		String ssn = "010624-1230123";
//		char sex = ssn.charAt(7);
//		switch(sex) {
//		case '1' :
//		case '3' :System.out.println("����"); break;
//		case '1' :
//		case '4' :System.out.println("����"); break;
//		
//		}
		
		// equals(�񱳴���ڿ� ) : ���ڿ� ��
		
		String strVar1 = new String("����ö");
		String strVar2 = "����ö";
		
		if(strVar1 ==  strVar2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		// getBytes() : ���ڿ��� ����Ʈ���� ��ȯ
		
		String str = "�ȳ��ϼ���";
		
		byte[] bytes3 = str.getBytes(); // String �� ����Ʈ�� ��ȯ�� �迭�� ����
		
		System.out.println(bytes3.length); // ���ڼ�*2 10����Ʈ | ���� = �ѱ�(2����Ʈ)
		
		System.out.println(new String(bytes3));
		
		//���ڵ� ���� 
			//1. UTF-8 : ������ �����
		
		//5. indexOf() : ���ڿ� ã��
			String subject = "�ڹ� ���α׷���";
			System.out.println(subject.indexOf("���α׷���"));
			
			if(subject.indexOf("�ڹ�")!=-1) {
									//�ε����� -1 �θ� �ε����� ���� //ã�����ڰ� �������� ����
				System.out.println("�ڹ� ���õ� å�Դϴ�");
			}else {
				System.out.println("�ڹ� ���þ��� å�Դϴ�");
			}
		//5.5 contains : ���ڿ� ���տ��� [�μ� : ã�����ڿ� ��ȯ: true/false]
			
			System.out.println(subject.contains("�ڹ�"));
			
			
			
			
			//6. length() : ���ڿ��� ����
			System.out.println(subject.length());
			
			//7. replace("��ü�ҹ���" , "���ο��") : ���ڿ� ��ġ
			String oldstr = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�";
			String newstr = oldstr.replace("�ڹ�", "java");
			
			System.out.println(newstr);
		//8. substirng() : ���ڿ� �߶󳻱�
		String ssn2 = "880815-1234567";
		System.out.println(ssn2.substring(0,6));// �����ε��� , ���ε���
		System.out.println(ssn2.substring(7)); //�����ε���
		
		//9. sprit() : ���ڿ� �и�	
		String[] ssn3 = ssn2.split("-");
						//"-" �������� ���� => 2���� ���ڿ�
		System.out.println(ssn3[0]);
		System.out.println(ssn3[1]);
		
		//10. toLowerCase() : �ҹ��ڷ� ��ȯ toUpperCase() : �빮�ڷ� ��ȯ
		String str3 = "java Programming";
		System.out.println( str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
		//11. trim() :���ڿ� �յ� ���� ���� [ ���̰��� ���� �Ұ� ]
		String str4 = "       �ڹ�            ���α׷���  ";
		System.out.println(str4.trim());
		
		//12. valueOf() : �⺻Ÿ���� ���ڿ��� ��ȯ
		String str5 = String.valueOf(10); //������ ���ڿ� ��ȯ
		String str6 = String.valueOf(10.5);
		String str7 = String.valueOf(true);
		
		
		System.out.println(str5); //���ڰ� �ƴ϶� ���ڿ�
		System.out.println(str6);
		System.out.println(str7); 

	}
	
}











































