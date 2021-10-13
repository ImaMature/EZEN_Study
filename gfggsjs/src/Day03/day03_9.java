package Day03;

import java.util.Scanner;

public class day03_9 {

	public static void main(String[] args) {
		
		
		//교재 p. 134 3번 for문을 이용해 1~100까지 정수중 3의 배수의 총합
		
		
		 int a =0;
		 for(int i = 0; i<=100; i++)
		 {if(i%3==0) a += i;}
		 System.out.println(a); //1683
		 
		 // 5번
		 for(int x = 1; x<=10; x++) { 
			 
			 for (int y = 1; y<=10; y++) {
				 if( (4*x) + (5*y) == 60) {
					 System.out.printf("\n(%d, %d)", x, y);
			} // if 끝
		  }//for 끝
			  
		}//for 끝
		 
		 // 6번
		 System.out.println("\n");
		 for(int i =1; i<=5; i++) {
			 for(int s=1; s<=i; s++) { System.out.print("*");
			 }
		 System.out.println(); 
		 }

	}

}
