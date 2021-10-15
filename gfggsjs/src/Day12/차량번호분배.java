package Day12;

import java.util.Random;
import java.util.Scanner;

// 차량번호 랜덤 생성문제
public class 차량번호분배 {
	public static void main(String[] args) {
		
	//1. 무한루프사용하기
		Random random = new Random();
		for(int i =0; i<10; i++) {
			int carNumber1 = random.nextInt(10)+1;
			int carNumber2 = random.nextInt(10);
			int carNumber3 = random.nextInt(10);
			int carNumber4 = random.nextInt(10);
			System.out.println("랜덤난수 : " + carNumber1*1000);
		}
		
	}
}
