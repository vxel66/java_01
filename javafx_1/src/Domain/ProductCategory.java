package Domain;

public class ProductCategory {

	private String p_category;
	private int count;
	
	public ProductCategory() {
		// TODO Auto-generated constructor stub
	}

	public ProductCategory(String p_category, int count) {
		super();
		this.p_category = p_category;
		this.count = count;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
