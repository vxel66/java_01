package Day09;

public interface ATM {

	//��� �ʵ�
	
	//�߻� �޼ҵ�
	public void ���µ��();
	public void ����();
	public void ���();
	public void ��ü();
	public void �ܰ�();
	
	//default �޼ҵ�
	default void ����() {
		System.out.println("ATM ���� �մϴ�");
	}
	//���� �޼ҵ�
	
}
