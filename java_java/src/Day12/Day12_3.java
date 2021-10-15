package Day12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day12_3 {

	public static void main(String[] args) {
		
		//1.Date Ŭ���� : �ý��� ��¥/�ð�
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		
		
		SimpleDateFormat dateFormat =
				new SimpleDateFormat("yyyy�� dd�� hh�� mm�� ss��"); //���� ����
		
		//��������
		System.out.println(dateFormat.format(date));
		
		//Calender Ŭ���� : �ü �ð�/��¥�� ���� ����
		
		Calendar now = Calendar.getInstance(); //������ �ִ� �ν��Ͻ� ��ü�� ��������
		
		System.out.println(now.get(Calendar.YEAR));
		
		System.out.println(now.get(Calendar.MONTH)+1);
												//+ 
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strweek = null ;
	
		switch (week) {
		case Calendar.FRIDAY: strweek = "��"; 
			
			break;
		}
		System.out.println(strweek);
		
		System.out.println("����/����: " + now.get(Calendar.AM_PM));
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		
		if(ampm == Calendar.AM) {
			strampm = "����";
		}else {
			strampm = "����";
			
		}
		System.out.println(strampm);
				
		System.out.println("��:" + now.get(Calendar.HOUR));
		System.out.println("��:" + now.get(Calendar.MINUTE));
		System.out.println("��:" + now.get(Calendar.SECOND));
		
		// �����ð�
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(zonedDateTime);
		 zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/seoul"));
		 System.out.println(zonedDateTime);
		 
		 zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		 System.out.println(zonedDateTime);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
