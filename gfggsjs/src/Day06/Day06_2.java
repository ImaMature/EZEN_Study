package Day06;

import java.util.Scanner;

public class Day06_2 {
	// Car3.java의 설계도를 Day06_2.java클래스에 출력해보기
	public static void main(String[] args) {
		
		//p.213
		//Scanner sc = new Scanner(sss)
		Day06_2_Car3 car1 = new Day06_2_Car3();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model); //null model에 지정된 수가 없기 때문
		
		Day06_2_Car3 car2 = new Day06_2_Car3("자가용"); 
		//자가용이 Car3.java의 model => this.model에 저장됨
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model); // this.model에 저장된 자가용 출력
		System.out.println();
		
		Day06_2_Car3 car3 = new Day06_2_Car3("자가용", "빨강"); 
		//자가용이 값이 지정되지않은 Car3.java의 model => this.model에 저장됨
		//빨강은 값이 지정되지않은  color에 저장됨 = > this.color에 저장됨
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model); // this.model에 저장된 자가용 출력
		System.out.println("car3.color : " + car3.color);	//this.color 출력
		
		Day06_2_Car3 car4 = new Day06_2_Car3("자가용", "빨강", 200); 
		//자가용이 값이 지정되지않은 Car3.java의 model => this.model에 저장됨
		//빨강은 값이 지정되지않은  color에 저장됨 = > this.color에 저장됨
		//200은 값이 지정되지 않은 maxSpeed에 저장됨 => this.maxSpeed에 저장
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model); // this.model에 저장된 자가용 출력
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);	
		//this.maxSpeed 출력
	}
}
