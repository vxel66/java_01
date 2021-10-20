package Day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.border.Border;

public class Day15_1 {	

	//�÷��� :[�迭�� ������ ����] �ڷᱸ�� �������� ��ü�� �߰� ���� �˻�
		//1.list : ������ �����ϰ� ���� //�迭�� ���� //�ߺ� ���� ����
			//1.Arraylist 2.Vector 3.Linkedlist
				//1.����Ʈ��.add(��ü��) : �ش� ��ü�� ����Ʈ�� ����
				//2.����Ʈ��.contains(��ü��) : �ش� ��ü�� ����Ʈ�� ���� ���� (true,false)
				//3.����Ʈ��.get(�ε���) //�ش� �ε����� ��ü ȣ��
				//4.����Ʈ��.isEmpty():����Ʈ�� ��� �ִ��� Ȯ�� true/false 
				//5.����Ʈ��.size() :����Ʈ�� ��ü��
				//6.����Ʈ.clear() : ����Ʈ �ʱ�ȭ [��簴ü����]
				//7.����Ʈ��.remove(�ε��� or ��ü��): �ش� �ε��� Ȥ�� ��ü ����
				//8.����Ʈ��.indexOf(��ü��) : �ش� ��ü�� �ε��� ��ȣ
		//2.Vector : 
			//ArrayList: ���Ͻ�����(����ȭx),�˻�����
			//Vector : ��Ƽ������(����ȭ)
			//linkedList : �߰��� ����/���� ����

		//2.Set : ������ �������� �ʰ� ���� // �ߺ� ���� �Ұ�
			//1.HashSet 2.TreeSet
				//1. set��.add(��ü��) : �ش� ��ü�� set�� ����
				//2. set��.contains(��ü��) : �ش� ��ü�� set�� ���� ���� Ȯ�� (true , false)
				//3. set��.isEmpty(): set �� ��� �ִ��� Ȯ�� (true ,false)
			//*  4. set��.iterator(): ����� ��ü�� �ϳ��� �������� �ݺ��� ����
					//1.hashNext() : ���� ��ü�� �����ϸ� true ������ false
					//2.next() : ��ü ��������
					//3.remove() : ��ü ����
				//5. set��.size() : set�� ��ü��
				//6. set��.clear() : set�� �ʱ�ȭ
				//7. set��.remove(��ü) : �ش��ε��� ��ü ����
		//3.Map : Ű/�� �ѽ����� ����// Ű�� �ߺ� ����Ұ� ���� ����
		//Map : Ű(key) + ��(value) = ��Ʈ��(entry)
		//1.MashMap 2. Hashtable 3. TreeMap 4.Properties
			//1.map��.put(Ű,��) :Ű�� ������ �̷���� ��Ʈ�� �߰�
			//2.map��.containsKey(Ű) : Ű ���� ���� Ȯ��
			//3.map��.containsValue(��) : �� ���� ����Ȯ��
			//4.map��.entryset() : �ش� ��Ʈ�� set�� ����
			//5.map��.get(Ű) : �ش� Ű�� ���� ȣ��
			//6.map��.isempty() : map�� ��� �ִ��� Ȯ��
			//7.map��.keyset() : �ش� Ű�� Set�� ����
			//8.map��.size() : ��map�� Ű�� ��
		//2. ����
			//HashMap : ���Ͻ�����[����ȭx]
			//Hashtable : ��Ƽ������[����ȭo]
			
	
	public static void main(String[] args) {
			
			//ArrayList : ����ȭx --> ���Ͻ�����
			//Vector : ����Ȯo --> ��Ƽ������ ( ��Ƽ�̵�� ���α׷��� )
			
		
			//1. ����Ʈ ���� [����Ʈ�ȿ� ���� �ڷ��� ���� (���׸�)]
			List<Board> list = new Vector<>(); 
				//<���׸�> ����Ʈ�ȿ� �ڷ���
			//2.����Ʈ�� ��ü �ֱ�
			list.add(new Board("����1", "����1", "�۾���1"));
			list.add(new Board("����2", "����2", "�۾���2"));
			list.add(new Board("����3", "����3", "�۾���3"));
			list.add(new Board("����4", "����4", "�۾���4"));
			
		
			System.out.println(list);
			list.remove(2);
			
			
			for(Board temp : list) {
				//����Ʈ�� ��ü �ϳ��� ���ʿ� ����
				System.out.println(temp.subject);
				System.out.println(temp.content);
				System.out.println(temp.writer);
			}
			//ArrayList : �߰�, �˻� ����
			//Linkedlist : ���� , ���� ����
			
			ArrayList<String> list1 = new ArrayList<>();
			LinkedList<String> list2 = new LinkedList<>();
			
			long startTime;
			long endTime;
			
			startTime = System.nanoTime();
			//1. Arrylist i�� 0�� �ε����� 10000�� ����
			for(int i =0 ; i<10000 ; i++) {
				list1.add(0,String.valueOf(i));				
			}
			endTime = System.nanoTime();
			System.out.println("arraylist �ð�:"+(endTime-startTime));
			
			startTime = System.nanoTime();
			//2.linkedlist �� i�� 01�� �ε����� 10000�� ����
			for(int i =0 ; i<10000 ; i++) {
				list2.add(0,String.valueOf(i));				
			}
			endTime = System.nanoTime();
			System.out.println("linkedlist �ð�:"+(endTime-startTime));
	}
	
}




























