package Day12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day12_3 {
	public static void main(String[] args) {
	
		//p.539
			//Date Ŭ���� : �ý��� ��¥/�ð�
			Date date = new Date();
			System.out.println(date);
			System.out.println(date.toString());
			//simpleDateFormat : ��¥ ���� ( ��� �ٹ̱� )
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��"); //���� ����
															//y:����, M:��, d:��, h:��, s:��
			//���� ����
			System.out.println(dateFormat.format(date));
	}
}
