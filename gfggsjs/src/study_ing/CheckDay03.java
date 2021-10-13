package study_ing;

import java.util.Scanner;

public class CheckDay03 {

	public static void main(String[] args) {
	
		
		//문제1 p.119 String switch
		
		//문제2 [switch] 국어, 영어, 수학 점수를 입력받아 평균이 90점 이상이면 "A등급" 80점 이상이면 "B등급" 나머지 "탈락"
		
		//p.124 예7) 2~15에 *9하는 구구단
	// 단수 : 2~15[변수]			곱 : 1~9[변수]
	
/* 별문제3 : 입력받은 줄 만큼 출력
		
		*
		**
		***
		****
		*****
		
		*/ 
		
		
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		
		System.out.print("출력할 별의 개수 : ");	int x1 = scanner.nextInt(); //줄 수 받기
		 for (int i = 1; i<=x1; i++) { //줄 몇개까지 제한
			 for (int j = 1; j<=i; j++) {System.out.print("*");} //별 출력
		 
		System.out.println(); //줄바꿈
	
		 }
	
		 /*System.out.print("출력할 별의 개수 : ");	int x2 = scanner.nextInt(); //줄수 받기
		 for (int i = 1; i<=x2; i++) {
			 for (int j = 1; ; j++)
		 }*/
		 
		 //p. 134 3번 for문을 이용해 1~100까지 정수중 3의 배수의 총합
		 int a =0;
		 for(int i = 0; i<=100; i++)
		 {if(i%3==0) a += i;}
		 System.out.println(a); //1683
		 
		 // 5번
		 for(int x = 1; x<=10; x++) { 
			 
			 for (int y = 1; y<=10; y++) {
			 if( (4*x) + (5*y) == 60) {
				 System.out.printf("\n(%d, %d)", x, y);
			}
		  }
			  
		}
		 
		 // 6번
		System.out.println("\n");
		 for(int i =1; i<=5; i++) {
			 for(int s=1; s<=i; s++) { System.out.print("*");
			 }
		 System.out.println(); 
		 }
	}		
	
}
