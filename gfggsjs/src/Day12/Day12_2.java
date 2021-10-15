package Day12;

import java.util.Random;

public class Day12_2 {

	public static void main(String[] args) {
		//p527. 포장클래스
			//Wrapper 클래스 : 기본자료형 -> 객체화
		
		//문자열 -> 기본타입
			//1) Integer.parseInt("문자열")
			//2) Double.parseDouble("문자열")
			//3) Boolean.parseBoolean("문자열")
			// * Byte.parseInt(), Short.parseInt(), Long.parseInt(), Float.parseInt()
		
		//기본타입 -> 문자열
			// String.valueOf(기본자료형)
		
		//바이트배열 -> 문자열 
			// new 생성자 (바이트배열) 많이씁니다!
		
		
		//p.531 
		int value1 = Integer.parseInt("10"); //"10" (문자열 10) - > 10 (정수 10) 으로 변환
		double value2 = Double.parseDouble("3.14"); //"3.14" (문자열 3.14) - > 3.14 (실수 3.14) 으로 변환
		boolean value3 = Boolean.parseBoolean("true"); //"true" (문자열 true) - > true
		
		//p.531 math 클래스 -> 수학 관련 메소드 제공
			//1. 절대값 : Mat.abs()
		System.out.println("절대값 : " + Math.abs(-5)); //5
		System.out.println("절대값 : " + Math.abs(-3.14)); //3.14
		
			//2. 올림 : Math.cell()
		System.out.println("올림값 : " + Math.ceil(5.3)); //6.0
		System.out.println("올림값 : " + Math.ceil(-5.3)); //-5.0 음수니까
		
			//3. 버림 : Math.floor()
		System.out.println("버림값 : " + Math.floor(5.3)); //5
		System.out.println("버림값 : " + Math.floor(-5.3)); //-6.0
		
			//4. 최댓값 : Math.max()
		System.out.println("최댓값 : " + Math.max(5, 9)); //9
		System.out.println("최댓값 : " + Math.max(5.3, 2.5)); //5.3
		
			//5. 최소값 : Math.min()
		System.out.println("최소값 : " + Math.min(5, 9)); //5
		System.out.println("최소값 : " + Math.min(5.3, 2.5)); //2.5
		
			//6. 무작위 Math.random() : 0~1사이의 난수
		System.out.println("난수 : " + Math.random());
			
			//7. 가까운 정수의 실수 값 Math.round
		System.out.println("가까운 정수의 실수 값 : " + Math.rint(5.3)); //5.0
		System.out.println("가까운 정수의 실수 값 : " + Math.rint(5.7)); //6.0
		
			//8. 반올림 Math.round
		System.out.println("반올림: " + Math.round(5.3)); //5
		System.out.println("반올림 : " + Math.round(5.7)); //6
		
			//** 소수점 셋째 자리에서 반올림 [자릿수를 올리고 반올림 자릿수 내림]
		double value = 12.3456;
		double rvalue = (Math.round(value*100))/100.0;
							//연산자 우선순위
							//1. value*100
							//2.Math.round(1)
							//3.(2)/100.0;
							//4.대입
		System.out.println("소수점 셋째자리 반올림 : " + rvalue);
		
		//p.536 : 주사위
			int num = (int)Math.random(); // 0 ~ 1 (1전까지)\
			System.out.println(num);
			int num2 =(int) (Math.random()*6); //0*6 ~ 1*6
			System.out.println(num2);
			int num3 =(int) (Math.random()*6)+1; // 0*6+1 ~ 1*6+1 : 1~7
			System.out.println(num3);
			
		//p.537 : Random 클래스
			Random random = new Random(); // Random 클래스는 static 클래스르 제공하지 않아서 객체를 만듦
			int number = random.nextInt();	// int가 표현할 수 있는 범위만큼 난수(0 ~ 20억)
			int number2 = random.nextInt(6)+1; // 1 ~ 6(인덱스)
			System.out.println("number2 : "+number2);
	}
}
