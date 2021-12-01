package dto;

public class Member {

	private int m_num;
	private String id;
	private String password;
	private String name;
	private String brith;
	private String sex;
	private String phone;
	private String adress;
	private int point;
	private String m_sdate;
	
	public Member() {
	}
	
	
	//회원가입

	public Member(int m_num, String id, String password, String name, String brith, String sex, String phone,
			String adress, int point, String m_sdate) {
		super();
		this.m_num = m_num;
		this.id = id;
		this.password = password;
		this.name = name;
		this.brith = brith;
		this.sex = sex;
		this.phone = phone;
		this.adress = adress;
		this.point = point;
		this.m_sdate = m_sdate;
	}
	
	


	public Member(String id, String password, String name, String brith, String sex, String phone, String adress) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.brith = brith;
		this.sex = sex;
		this.phone = phone;
		this.adress = adress;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}


	public String getM_sdate() {
		return m_sdate;
	}


	public void setM_sdate(String m_sdate) {
		this.m_sdate = m_sdate;
	}
	
	
	
	
	
}
