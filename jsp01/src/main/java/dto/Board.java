package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import dao.MemberDao;

public class Board {
	
	
	private int b_no;
	private String b_title;
	private String b_contents;
	private int m_no;
	private String b_date;
	private String b_file;
	private String b_file2;
	private int b_view;
	private int b_activation;
	private String b_writer;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Board(String b_title, String b_contents, int m_no, String b_file, String b_file2) {
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.m_no = m_no;
		this.b_file = b_file;
		this.b_file2 = b_file2;
		
	}

	public Board(int b_no, String b_title, String b_contents, int m_no, String b_date, String b_file,String b_file2, int b_view,
			int b_activation) {
		super();
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.m_no = m_no;
		Date today = new Date();
		SimpleDateFormat datetimeformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm");
		try {
			Date date =  datetimeformat.parse( b_date );
			if( dateFormat.format(date).equals(dateFormat.format(today))) {
				this.b_date = timeformat.format(date);
			}else {
				this.b_date = dateFormat.format(date);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		this.b_file = b_file;
		this.b_file2 = b_file2;
		this.b_view = b_view;
		this.b_activation = b_activation;
		this.b_writer = MemberDao.getmMemberDao().member_num(m_no);
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_contents() {
		return b_contents;
	}

	public void setB_contents(String b_contents) {
		this.b_contents = b_contents;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getB_file() {
		return b_file;
	}

	public void setB_file(String b_file) {
		this.b_file = b_file;
	}

	public int getB_view() {
		return b_view;
	}

	public void setB_view(int b_view) {
		this.b_view = b_view;
	}

	public int getB_activation() {
		return b_activation;
	}

	public void setB_activation(int b_activation) {
		this.b_activation = b_activation;
	}


	public String getB_file2() {
		return b_file2;
	}

	public void setB_file2(String b_file2) {
		this.b_file2 = b_file2;
	}


	public String getB_writer() {
		return b_writer;
	}


	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	
	
	
	
	
	

}
