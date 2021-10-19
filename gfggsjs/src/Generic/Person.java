package Generic;
//문제1 명단 프로그램
//[조건1] 메뉴 [무한루프]
//	1. 명단 추가
//	2. 명단 출력
//
//[조건2] 이름, 나이 입력받아 아래 조건에 따라 명단 등록
//
//[조건3]    나이가 8세 미만이면 유아 명단 등록
//	나이가 20세 미만이면 청소년 명단 등록
//	그외는 성인 명단 등록
//
//[조건4] 명단출력시 명단별 인원들의 모든 이름 출력
//
//[조건5] 유아, 청소년, 성인 => 사람으로부터 상속


public class Person {

	String name;
	int age;
	
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
