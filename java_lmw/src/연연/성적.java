package 연연;

public class 성적 implements Comparable<성적>  {

	String 이름;
	int 국어;
	int 영어;
	int 수학;	
	int 총점;
	double 평균;
	int 석차;
	
	public 성적(String 이름, int 국어, int 영어, int 수학, int 총점, double 평균, int 석차) {
		super();
		this.이름 = 이름;
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.총점 = 총점;
		this.평균 = 평균;
		this.석차 = 석차;
	}
	
	public 성적() {
		
	}

	@Override
	public int compareTo(성적 o) {
		if(this.총점 > o.get총점()) {
			return -1;
		}else if(this.총점 < o.get총점()) {
			return 1;
		}else return 0;
	}
	
	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get국어() {
		return 국어;
	}

	public void set국어(int 국어) {
		this.국어 = 국어;
	}

	public int get영어() {
		return 영어;
	}

	public void set영어(int 영어) {
		this.영어 = 영어;
	}

	public int get수학() {
		return 수학;
	}

	public void set수학(int 수학) {
		this.수학 = 수학;
	}

	public int get총점() {
		return 총점;
	}

	public void set총점(int 총점) {
		this.총점 = 총점;
	}

	public double get평균() {
		return 평균;
	}

	public void set평균(double 평균) {
		this.평균 = 평균;
	}

	public int get석차() {
		return 석차;
	}

	public void set석차(int 석차) {
		this.석차 = 석차;
	}
	
}
