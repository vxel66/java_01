package dto;

import java.text.DecimalFormat;

public class Product {
	
	  private int  p_num;
	  private String p_name;
	  private int  p_price;
	  private String p_category;
	  private String p_made;
	  private int p_activation;
	  private int p_size;
	  private int p_count;
	  private String p_img;
	  private String p_contents;
	  private String p_date;
		
	  public String getprice() { 
		  DecimalFormat decimalFormat = new DecimalFormat("###,###");
		  return decimalFormat.format(this.p_price);
	  }
	  
	  
	  public String getact() {
		  if(this.p_activation==1) {
			  return "준비중";
		  }
		  if(this.p_activation==2) {
			  return "판매중";
		  }
		  if(this.p_activation==3) {
			  return "품절";
		  }
		  return null;
	  }
	  
	public Product() {}

	public Product(int p_num, String p_name, int p_price, String p_category, String p_made, int p_activation,
			int p_size, int p_count, String p_img, String p_contents, String p_date) {
		super();
		this.p_num = p_num;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_category = p_category;
		this.p_made = p_made;
		this.p_activation = p_activation;
		this.p_size = p_size;
		this.p_count = p_count;
		this.p_img = p_img;
		this.p_contents = p_contents;
		this.p_date = p_date;
	}
	
	public Product(String p_name, int p_price, String p_category, String p_made, int p_activation, int p_size,
			int p_count, String p_img, String p_contents) {
		super();
		this.p_name = p_name;
		this.p_price = p_price;
		
		this.p_category = p_category;
		this.p_made = p_made;
		this.p_activation = p_activation;
		this.p_size = p_size;
		this.p_count = p_count;
		this.p_img = p_img;
		this.p_contents = p_contents;
	}
	

	public Product(String p_name, int p_price, String p_category, String p_made, int p_size, int p_count, String p_img,
			String p_contents) {
		super();
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_category = p_category;
		this.p_made = p_made;
		this.p_size = p_size;
		this.p_count = p_count;
		this.p_img = p_img;
		this.p_contents = p_contents;
	}
	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

	public String getP_made() {
		return p_made;
	}

	public void setP_made(String p_made) {
		this.p_made = p_made;
	}

	public int getP_activation() {
		return p_activation;
	}

	public void setP_activation(int p_activation) {
		this.p_activation = p_activation;
	}

	public int getP_size() {
		return p_size;
	}

	public void setP_size(int p_size) {
		this.p_size = p_size;
	}

	public int getP_count() {
		return p_count;
	}

	public void setP_count(int p_count) {
		this.p_count = p_count;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public String getP_contents() {
		return p_contents;
	}

	public void setP_contents(String p_contents) {
		this.p_contents = p_contents;
	}

	public String getP_date() {
		return p_date;
	}

	public void setP_date(String p_date) {
		this.p_date = p_date;
	}

	



	
}
