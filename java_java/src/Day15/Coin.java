package Day15;

public class Coin {

	private int value;
	
	public Coin() {
		// TODO Auto-generated constructor stub
	}
	
	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value+"";
	}
	
}
