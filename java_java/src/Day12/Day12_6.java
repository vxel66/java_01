package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_6 {

	// �޸�[�ֱ����ġ = RAM]:����, �迭 , ��ü ��� : ���α׷� ����� �� �ʱ�ȭ
		//�ֱ����ġ : ���� �������� ���α׷�(��ɾ���� ����) ����
			//���� X ����X => �ֹ߼� �޸�
		//���������ġ : [ ���� , DB ��]
			//���� X ����O => ���ֹ߼� �޸�
	
	// ���� <-- ��Ʈ��(����:����Ʈ) --> JAVA ���α׷�
	
	public static void main(String[] args) throws Exception {
		
		
		// ����ó�� Ŭ����
			//1.FileOutputStream :������� ��Ʈ�� [�ش� ������ ������ ����]
				//FileOutputStream ��ü�� = new FileOutputStream("���ϰ��")
															//  /:���
				//1. write( ����Ʈ�� ) : �ش� ���Ͽ� ����
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:/00lmw/java_java/src/Day12/test.txt");
			//����� ���õ� Ŭ���� => ������ ����ó���߻�
//		String ���ڿ� = "��Ŭ�������� �ۼ��� �����Դϴ�";
//		fileOutputStream.write(���ڿ�.getBytes());
			
		FileInputStream fileInputStream = new FileInputStream("D:/00lmw/java_java/src/Day12/test.txt");
//		
//			//�о�� ����Ʈ�� ������ �迭
		byte[] ����Ʈ�迭 = new byte[1024]; //1kb = 1024byte
		fileInputStream.read(����Ʈ�迭);
			
		String strreed = new String(����Ʈ�迭);
		System.out.println("���� ������ ������ : " + (new String(strreed)));
		
		//Ű���忡 �Էµ� ������ �޸��� ���� ����
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("�޸��� �Է� ���̳�:");
			String outstr = scanner.next();
			outstr = outstr +"\n";
			fileOutputStream.write(outstr.getBytes());
					
		}
		
	}
	
}
