package Day12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day12_3 {

	public static void main(String[] args) {
		
		//1.Date 클래스 : 시스템 날짜/시간
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		
		
		SimpleDateFormat dateFormat =
				new SimpleDateFormat("yyyy년 dd일 hh시 mm분 ss초"); //형식 설정
		
		//형식적용
		System.out.println(dateFormat.format(date));
		
		//Calender 클래스 : 운영체 시간/날짜에 대한 정보
		
		Calendar now = Calendar.getInstance(); //기존에 있던 인스턴스 객체를 가져오기
		
		System.out.println(now.get(Calendar.YEAR));
		
		System.out.println(now.get(Calendar.MONTH)+1);
												//+ 
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strweek = null ;
	
		switch (week) {
		case Calendar.FRIDAY: strweek = "금"; 
			
			break;
		}
		System.out.println(strweek);
		
		System.out.println("오전/오후: " + now.get(Calendar.AM_PM));
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		
		if(ampm == Calendar.AM) {
			strampm = "오전";
		}else {
			strampm = "오후";
			
		}
		System.out.println(strampm);
				
		System.out.println("시:" + now.get(Calendar.HOUR));
		System.out.println("분:" + now.get(Calendar.MINUTE));
		System.out.println("초:" + now.get(Calendar.SECOND));
		
		// 협정시계
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(zonedDateTime);
		 zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/seoul"));
		 System.out.println(zonedDateTime);
		 
		 zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		 System.out.println(zonedDateTime);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
