package ����;


public class ����ǥ implements Comparable<����ǥ> {

	 String �̸�;
	 int ����;
	 int ����;
	 int ����;
	 int ����;
	 double ���;
	 int ���� ;
	
	public ����ǥ() {
		// TODO Auto-generated constructor stub
	}

	public ����ǥ(String �̸�, int ����, int ����, int ����, int ����, double ���, int ����) {
		
		this.�̸� = �̸�;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
		this.��� = ���;
		this.���� = ����;
	}

	@Override
	public int compareTo(����ǥ o) {
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
