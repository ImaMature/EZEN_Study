package Day12;

import java.util.Calendar;
import java.util.Scanner;

public class Day12_5_달력 {

	//달력 만들기
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.println("연도와 월을 입력해 주세요.");
		System.out.println("연도 : "); int year = sc.nextInt(); 
		System.out.println("월 : "); int month = sc.nextInt(); 
		
		//메소드 호출
		달력보기 (year, month);
	}
		//메소드 선언 : 접근제한자 키워드 반환타입 메소드명 (인수1, 인수2 ~~~){}
		public static void 달력보기 (int year, int month) {
			//1. 캘린더 객체 => new 사용 X, 클래스내에 이미 객체가 있어서 이걸 호출
			//클래스내 객체가 없을 때 new 사용해서 객체 생성
			Calendar calendar = Calendar.getInstance();
			
			//2. 연도, 월, 일
			//int year = calendar.get(Calendar.YEAR);
			//int month = calendar.get(Calendar.MONTH)+1; // 0:1월 ~11 : 12월 그냥출력하면 현재달-1이 나옴
			//int day = calendar.get(Calendar.DAY_OF_MONTH);
				
				// 사용자 정의 캘린더
				calendar.set(year, month-1, 1); //입력받은 연도, 입력받은 달-1, 입력받은 날짜
				//해당 월의 1일 요일 찾기
				int sweek = calendar.get(Calendar.DAY_OF_WEEK); // 현재요일(금), 6
				//해당 월의 마지막 일 찾기 [.getActualMaximum(필드) -> 해당 필드의 최댓값 구하기 ]
				int endDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH); //해당 값의 최댓값
				
			//3. 달력
			System.out.println(" ****************** " +year+"년 "+month+"월 ******************");
			System.out.println(" 일\t월\t화\t수\t목\t금\t토");
							//1:일요일 2:월요일 3:화요일 4:수요일 5:목요일 6:금요일 7:토요일 이건 그냥 외우기 Day_of_Month Day_of_week는 정수로 받음
			
			//4. 현재 월 1일의 위치 앞에 공백 채우기
			for (int i = 1; i<sweek; i++) { //현재요일(금)에 공백을 찍으면 안되니까 <=쓰면 안됨
				System.out.print(" \t");
			}
			
			//5. 1일부터 마지막 날까지 출력
			for (int i = 1; i<=endDay; i++) {
				System.out.print(i+"\t");
				if(sweek % 7 == 0) 
					//요일이 토요일마다 줄바꿈 [sweek가 7의 배수 마다]
					System.out.println();
					sweek++; //요일 증가
			
		}
		
			
		//+ 과제 주말에 해보려면 해보고 아님 말고
			// 문제 : 달력 범위 출력
			// 시작날짜와 끝날짜를 입력받아 달력 출력하기
			
			/*시작 연도/월 입력받기
			 * 끝 연도/월 입력받기
			 * 		//시작 날짜부터 끝날짜까지의 모든 달력 출력
			 * 		// 2021 08 ~ 2022 10
			 */
		
	}
}
