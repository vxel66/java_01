package Day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day15_3 {

	
	public static void main(String[] args) {
		
		
		
		// HastMap
		
		//1.map ��ü ����
		HashMap<String, Integer> map = new HashMap<>();
			//Map < Ű,�� > ���׸� 2�� 
		//2.map�� ��ü(��Ʈ��{Ű=��}) �߰�
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // Ű �� �ߺ� => �ߺ� �Ұ�
		System.out.println(map);
		
		System.out.println(map.size());
		
		//3.��ü �˻� [get(Ű) => ��]
		System.out.println(map.get("ȫ�浿"));
		
		System.out.println();
		//4
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
					//hasnext :���� ��ü�� �����ϴ���
			String key = iterator.next();
			System.out.println(map.get(key));
		}
		System.out.println();
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		//4.entry
		Set<Map.Entry<String, Integer> > entryset = map.entrySet();
		
		//5. ����
		System.out.println();
		map.remove("ȫ�浿");
		System.out.println(map);
		System.out.println();
		map.clear();// ��� ����
		System.out.println(map);
		
	}
}





















