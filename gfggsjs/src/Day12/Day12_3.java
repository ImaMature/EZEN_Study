package Day12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day12_3 {
	public static void main(String[] args) {
	
		//p.539
			//Date 클래스 : 시스템 날짜/시간
			Date date = new Date();
			System.out.println(date);
			System.out.println(date.toString());
			//simpleDateFormat : 날짜 형식 ( 모양 꾸미기 )
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //형식 설정
															//y:연도, M:월, d:일, h:시, s:초
			//형식 적용
			System.out.println(dateFormat.format(date));
	}
}
