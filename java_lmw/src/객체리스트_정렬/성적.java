package ��ü����Ʈ_����;

public class ���� implements Comparable<����>  {

	String �̸�;
	int ����;
	int ����;
	int ����;	
	int ����;
	double ���;
	int ����;
	
	public ����(String �̸�, int ����, int ����, int ����, int ����, double ���, int ����) {
		super();
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
	}
	
	public ����() {
		
	}

	@Override
	public int compareTo(���� o) {
		if(this.���� > o.get����()) {
			return -1;
		}else if(this.���� < o.get����()) {
			return 1;
		}else return 0;
	}
	
	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public double get���() {
		return ���;
	}

	public void set���(double ���) {
		this.��� = ���;
	}

	public int get����() {
		return ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}
	
}
