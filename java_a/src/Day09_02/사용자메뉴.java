package Day09_02;

public interface ����ڸ޴� {

	//��� �ʵ�
	
	//�߻� �޼ҵ�
	public void ��ǰ����();
	public void ��ǰȯ��();
	public void ��ǰ����Ʈ();

	//default �޼ҵ�
	default void ����() {
		System.out.println(" ȸ���޴� ���� �մϴ�");
	}
	//���� �޼ҵ�
	
}
