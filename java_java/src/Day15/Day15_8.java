package Day15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Day15_8 {

	//
	
	public static void main(String[] args) {
		
		//1. map�÷��� ��ü ����
		TreeMap<Integer, String> scores = new TreeMap<>();
			// Ű =integer , �� = string 
		
		//2. map ��ü �ֱ� �ڵ����� => ����Ʈ��
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "�߱��");
		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");
		
		//3. �������� [ socres.des~~~ () �������̽��� ����]
		NavigableMap<Integer, String> desc = scores.descendingMap();
		
	
		
		for(Map.Entry<Integer, String> entry : desc.entrySet()) {
								//      ��Ʈ���ڷ���        ���ĵ� ��Ʈ��
			System.out.println(entry.getKey()+ "    ");
		}
		
		NavigableMap<Integer, String> arc =desc.descendingMap();
		
		for(Map.Entry<Integer, String> entry : desc.entrySet()) {
			//      ��Ʈ���ڷ���        ���ĵ� ��Ʈ��
			System.out.println(entry.getKey()+ "    ");
		}
	}
	
	
}
