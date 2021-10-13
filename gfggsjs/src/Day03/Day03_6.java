package Day03;

public class Day03_6 {//c s

	public static void main(String[] args) { //m s
		
		// for (초기값; 조건문; 증감식) { 실행문 }  => 조건문 증감식은 for문이 편함
		// 
		// 초기값
		// while (조건문){				//while은 무한루프할 때 많이 씀
		//		실행문
		//		증감식
		
		//p.125 예1)
		
		int i = 1;			//1) while 밖에 초기값
		while(i <=10 ) { 	//2) 조건문
			System.out.println(i+" ");	//3) 실행문은 중괄호 안에. 
		i++;							//4) 증감식도 중괄호 안에.
		}

	System.out.println("\n---------------------------");	
		//for 와의 차이
		for(int j=1; j<=10; j++) { // for start
			System.out.println(j+" ");
		} //for end
		
		//p.125 예2)
	System.out.println("\n---------------------------");	
		int sum=0;
		int h = 1; //초기값
		while( h<=100 ) { sum+=h; h++; }
		System.out.println("1~100까지 누적합계 : " + sum);
	
		// for 차이	
	System.out.println("\n---------------------------");
		int sum2 = 0;
		for( int k = 1; k<=100; k++)	{ sum2+=k; }
		System.out.println("1~100까지 누적합계 : "+sum2);
		
		
		
		//p.127 무한루프 => while(true) // for문보다 더 많이 씀
		while(true) { System.out.println("계속실행");}
	} //m e

} //c e
