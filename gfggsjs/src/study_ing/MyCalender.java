package study_ing;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalender {

	public static void main(String[] args) {
      
	    
		while(true) {
			try {
				Scanner sc2 = new Scanner(System.in);
				Scanner scanner = new Scanner(System.in);		//입력받기를 위한 Scanner 클래스 선언
				System.out.print("시작하는 연도를 입력해주세요. : ");		int year = sc2.nextInt(); //연도를 입력받는 객체 선언
				
				while(true) {	//while문을 추가해서 입력받는 월이 1미만 13이상일 때 다시 월을 입력받도록 함.
					
					System.out.print("시작하는 월을 입력해주세요 : ");			int month = sc2.nextInt(); // 달을 입력받는 객체 선언
						if(month>12 || month<1) {	
							//정상적인 월(1월 ~ 12월)이 아니라면
							System.out.println("잘못된 입력입니다. 월을 입력하실 땐 1에서 12 사이의 숫자를 입력해주세요."); 
							// 다시 입력받도록
							
						}else { // 정상적인 달력의 월 범위라면
						//Calendar calendar = new Calendar(); //new 생성자 생성 불가
						
							Calendar calendar = Calendar.getInstance();	
							//Calendar 클래스는 getInstance로 객체 생성해야한다
							
							calendar.set(year, month-1, 1); 
							//calendar객체에 입력받은 연도, 입력받은 달, 날짜 설정하기 
							//달은 -1을 해줘야함 0부터 나오기 때문
							//1이라고 설정한 이유? 달력은 1일 부터 시작하니까?
														
							int firstday = calendar.get(Calendar.DAY_OF_WEEK); 
							//입력받은 날(calendar객체)의 월의 요일을 가져와서 객체화
							//DAY_OF_WEEK : 특정 요일을 알기 위한 상수(1~7)
							//예시) 일요일: 1, 월요일 : 2, 화요일 : 3...
							//해당 연도, 해당 월의 첫날의 요일 구하기
							
							
							int endday = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
							//입력받은 날의 최댓값(끝날) 구하기.
							
							System.out.println( "\t\t"+year+"년 " + month  + "월" );
							System.out.println("=================================================");
							System.out.println("일\t월\t화\t수\t목\t금\t토");
							
							//첫날의 위치 앞에 \t붙여서 간격 맞추기
							for(int i = 1; i<firstday; i++){ //첫날이 /t 되지않도록 초과로 설정 
								System.out.print("\t");
							}		
							
							//마지막날까지 반복문 돌림
							//i가 1부터 시작해야 1부터 나옴
							for(int i =1; i<=endday; i++) {
								System.out.print(i+"\t");
								//날짜들 사이에 간격을 주기 위해 i뒤에 \t를 붙임
								
								//요일을 7로 나눴을 때 0 = 토요일(7) 이라면 뒤에 개행추가
								if(firstday % 7 == 0)   
								
									{System.out.println("\n");}
									firstday++;
									//firstday % 7==0 이 아니라면 firstday가 1씩 증가
							}
							break;
						}
				}//while2 end
				break;// 반복문 탈출
	
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}//try-catch end
		}//while end
	}//main end
}//class end
