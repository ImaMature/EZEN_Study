package Day12;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day12_3 {
	public static void main(String[] args) {
	
		//p.539
			//Date Ŭ���� : �ý��� ��¥/�ð�
			Date date = new Date(); //import java.util.Date;
			System.out.println(date);
			System.out.println(date.toString());
			//simpleDateFormat : ��¥ ���� ( ��� �ٹ̱� )
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��"); //���� ����
															//y:����, M:��, d:��, h:��, s:��
			//���� ����
			System.out.println(dateFormat.format(date));
			
			// p.540
			//< Calender Ŭ���� >: �ü�� �ð����� ��¥/�ð��� ���� ����
			
			Calendar now = Calendar.getInstance(); // import java.util.Calendar; ������ �ִ� ��ü�� ��������
			//int year = now.get(Calendar.MONTH) +1;	// 0 ~ 11 [1�� : 0]
			System.out.println("���� : " + now.get(Calendar.YEAR));
			System.out.println("�� : " + now.get(Calendar.MONTH) + 1);
									//+:���Ῥ����			//+:���ϱ� ������
			System.out.println("�� : " + now.get(Calendar.DAY_OF_MONTH));
			System.out.println("���� : " + now.get(Calendar.DAY_OF_WEEK));
									//1:�Ͽ��� 2:������ 3:ȭ���� 4:������ 5:����� 6:�ݿ��� 7:�����
			
			
			int week = now.get(Calendar.DAY_OF_WEEK); //��ǻ�ʹ� ���ڸ� ���� ���ڷ� �����ϴ� ��ü ���� "." �������� ������
			String strWeek = null; //null���� strweek�� �����ؼ� strWeek�� �ʱ�ȭ
			switch (week) {
			case Calendar.SUNDAY : strWeek = "��"; break;
			case Calendar.MONDAY : strWeek = "��"; break;
			case Calendar.TUESDAY : strWeek = "ȭ"; break;
			case Calendar.WEDNESDAY : strWeek = "��"; break;
			case Calendar.THURSDAY : strWeek = "��"; break;
			case Calendar.FRIDAY : strWeek = "��"; break;
			case Calendar.SATURDAY : strWeek = "��"; break;
		}	
			System.out.println("���� : " + strWeek);
			
			// ���ڸ� ���ڿ��� ���������ϱ�
			System.out.println("����/���� : " + now.get(Calendar.AM_PM)); // 0 = ����, 1 = ����
			int ampm = now.get(Calendar.AM_PM);
			String strampm = null;
			if( ampm == Calendar.AM) {strampm = "����";}
			else { strampm = "����";}
			System.out.println("����/���� : " + strampm);
			
			System.out.println("�� : " + now.get(Calendar.HOUR));
			System.out.println("�� : " + now.get(Calendar.MINUTE));
			System.out.println("�� : " + now.get(Calendar.SECOND));
			
			//�����ð�
			ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println("�����ð� �ð� : "+ zonedDateTime);
			
			zonedDateTime=ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
			System.out.println("���� �ð� : " + zonedDateTime);
			
			zonedDateTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println("����ð� �ð� : " + zonedDateTime);
			
	}
}
