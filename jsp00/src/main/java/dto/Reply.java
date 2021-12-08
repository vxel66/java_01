package dto;

public class Reply {

	private int r_num;
	private String r_contents;
	private String r_date;
	private int m_num;
	private int b_no;
	
	public Reply() {
		// TODO Auto-generated constructor stub
	}

	public Reply(String r_contents, int m_num, int b_no) {
		super();
		this.r_contents = r_contents;
		this.m_num = m_num;
		this.b_no = b_no;
	}
	

	public Reply(int m_num, int b_no) {
		super();
		this.m_num = m_num;
		this.b_no = b_no;
	}

	public Reply(int r_num, String r_contents, String r_date, int m_num, int b_no) {
		super();
		this.r_num = r_num;
		this.r_contents = r_contents;
		this.r_date = r_date;
		this.m_num = m_num;
		this.b_no = b_no;
	}

	public int getR_num() {
		return r_num;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public String getR_contents() {
		return r_contents;
	}

	public void setR_contents(String r_contents) {
		this.r_contents = r_contents;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	
	
	
	
	
	
}
