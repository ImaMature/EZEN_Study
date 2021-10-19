package Day14;

import java.util.Arrays;
import java.util.Scanner;

public class Day14_2 {
 
	public static void main(String[] args) {
		
		//제네릭
			//1. 자체적으로 new 연산자 불가
		
		//p.666
		//Course<Person> <제네릭>이 Course클래스의 T에 들어감
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		// Person 클래스로 배열이 생성 
		personCourse.add( new Person("일반인"));
		personCourse.add( new Worker("직장인"));
		personCourse.add( new Student("학생"));
		personCourse.add( new HighSchool("고등학생"));
				//학생 배열에 add는 일반인, 직장인, 학생, 고등학생
			
		Course<Worker> workerCourse=new Course<>("직장인과정", 5);
			//workerCourse.add(new Person("일반인"));
			workerCourse.add(new Worker("직장인"));
			//workerCourse.add(new Student("학생"));
			//workerCourse.add(new Highschool("고등학생"));
			//Worker클래스로 배열이 생성되었기 때문에, 해당 배열의 add는 직장인만 가능, 직장인에 자식클래스가 있으면 자식클래스도 같이 들어감
			
		Course<Student> studentCourse = new Course<>("학생과정", 5);	
			//studentCourse.add(new Person("일반인"));
			//studentCourse.add(new Person("직장인"));
			studentCourse.add(new Student("학생"));
			studentCourse.add(new HighSchool("고등학생"));
			//student 클래스로 배열이 생성
			//해당 배열에 add는 학생, 고등학생
			
		Course<HighSchool> highCourse = new Course<>("고등학생과정", 5);
			//highCourse.add(new Person("일반인"));
			//highCourse.add(new Worker("직장인"));
			//highCourse.add(new Student("학생"));
			highCourse.add(new HighSchool("고등학생"));
			
		System.out.println("************ 모든 클래스 호출가능 ************");		
		registerCourse(personCourse);	
		registerCourse(workerCourse);	
		registerCourse(studentCourse);
		registerCourse(highCourse);
		System.out.println();
		
		System.out.println("********  Course< ? extends 클래스> : 클래스로부터 자식클래스만 가능 ******* ");
		//registerCourseStudnet(personCourse);
		//registerCourseStudnet(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highCourse);
		System.out.println();
		
		System.out.println("********  Course< ? super 클래스> : 클래스로부터 부모클래스만 가능 ******* ");
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
			//registerCourseWorker(studentCourse);
			//registerCourseWorker(highStundentCourse);
	
}//main end
	// 코스 수강생 명단 출력 메소드				// ? : 와일드 카드 [ 모든 클래스 대응 ] //p.665
	public static void registerCourse (Course<?> course) {
	System.out.println(course.getName()+"수강생명단 : " + Arrays.toString(course.getStudents()));}
		//코스내 배열 호출
	
	//학생 목록 출력 메소드					// ? extends 학생 [ 학생 클래스로부터 상속받은 클래스만 가능(본인 포함)]
	public static void registerCourseStudent (Course<? extends Student > course) {
	System.out.println(course.getName()+"수강생명단 : " + Arrays.toString(course.getStudents()));}
		//코스내 배열 호출
	
	//학생 목록 출력 메소드					// ? super 직장인 [ 직장인 클래스의 부모 클래스만 가능 ( 본인 포함 ) ]
	public static void registerCourseWorker (Course<? super Worker> course) {
	System.out.println(course.getName()+"수강생명단 : " + Arrays.toString(course.getStudents()));}
		//코스내 배열 호출



}


