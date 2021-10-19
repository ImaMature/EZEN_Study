package Generic;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		AgeList<Person> agelist = new AgeList<>("사람", 10); 
		AgeList<Adult> Adult = new AgeList<>("어른", 5);
		AgeList<MiddleAge> MiddleAge = new AgeList<>("청소년", 5);
		AgeList<Lowage> LowAge = new AgeList<>("유아", 5);
		
		while(true) {
			String name = sc.next();
			System.out.println("이름 : ");
			int age = sc.nextInt();
			System.out.println("나이 : ");
			
			agelist.add(name, age);
			
			if(age < 8 && age > 0) {
				LowAge.add(new Lowage(name, age));
			} else if(age > 8 && age < 20) {
				MiddleAge.add(new MiddleAge(name, age));
			} else if(age > 20) {
				Adult.add(new Adult(name, age));
			}
			
			//출력만들기만 하면 됨
		}
	}

	
}
