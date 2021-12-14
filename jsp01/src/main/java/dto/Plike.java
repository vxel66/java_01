package dto;

public class Plike {

	 private int like_num;
	 private int p_num;
	 private int m_num;
	 
	 public Plike() {
		// TODO Auto-generated constructor stub
	}

	public Plike(int like_num, int p_num, int m_num) {
		super();
		this.like_num = like_num;
		this.p_num = p_num;
		this.m_num = m_num;
	}
	
	public Plike(int p_num, int m_num) {
		super();
		this.p_num = p_num;
		this.m_num = m_num;
	}

	public int getLike_num() {
		return like_num;
	}

	public void setLike_num(int like_num) {
		this.like_num = like_num;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	 
	 
}
