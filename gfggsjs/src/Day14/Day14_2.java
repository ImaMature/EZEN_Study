package Day14;

import java.util.Arrays;
import java.util.Scanner;

public class Day14_2 {
 
	public static void main(String[] args) {
		
		//���׸�
			//1. ��ü������ new ������ �Ұ�
		
		//p.666
		//Course<Person> <���׸�>�� CourseŬ������ T�� ��
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
		// Person Ŭ������ �迭�� ���� 
		personCourse.add( new Person("�Ϲ���"));
		personCourse.add( new Worker("������"));
		personCourse.add( new Student("�л�"));
		personCourse.add( new HighSchool("����л�"));
				//�л� �迭�� add�� �Ϲ���, ������, �л�, ����л�
			
		Course<Worker> workerCourse=new Course<>("�����ΰ���", 5);
			//workerCourse.add(new Person("�Ϲ���"));
			workerCourse.add(new Worker("������"));
			//workerCourse.add(new Student("�л�"));
			//workerCourse.add(new Highschool("����л�"));
			//WorkerŬ������ �迭�� �����Ǿ��� ������, �ش� �迭�� add�� �����θ� ����, �����ο� �ڽ�Ŭ������ ������ �ڽ�Ŭ������ ���� ��
			
		Course<Student> studentCourse = new Course<>("�л�����", 5);	
			//studentCourse.add(new Person("�Ϲ���"));
			//studentCourse.add(new Person("������"));
			studentCourse.add(new Student("�л�"));
			studentCourse.add(new HighSchool("����л�"));
			//student Ŭ������ �迭�� ����
			//�ش� �迭�� add�� �л�, ����л�
			
		Course<HighSchool> highCourse = new Course<>("����л�����", 5);
			//highCourse.add(new Person("�Ϲ���"));
			//highCourse.add(new Worker("������"));
			//highCourse.add(new Student("�л�"));
			highCourse.add(new HighSchool("����л�"));
			
		System.out.println("************ ��� Ŭ���� ȣ�Ⱑ�� ************");		
		registerCourse(personCourse);	
		registerCourse(workerCourse);	
		registerCourse(studentCourse);
		registerCourse(highCourse);
		System.out.println();
		
		System.out.println("********  Course< ? extends Ŭ����> : Ŭ�����κ��� �ڽ�Ŭ������ ���� ******* ");
		//registerCourseStudnet(personCourse);
		//registerCourseStudnet(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highCourse);
		System.out.println();
		
		System.out.println("********  Course< ? super Ŭ����> : Ŭ�����κ��� �θ�Ŭ������ ���� ******* ");
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
			//registerCourseWorker(studentCourse);
			//registerCourseWorker(highStundentCourse);
	
}//main end
	// �ڽ� ������ ��� ��� �޼ҵ�				// ? : ���ϵ� ī�� [ ��� Ŭ���� ���� ] //p.665
	public static void registerCourse (Course<?> course) {
	System.out.println(course.getName()+"��������� : " + Arrays.toString(course.getStudents()));}
		//�ڽ��� �迭 ȣ��
	
	//�л� ��� ��� �޼ҵ�					// ? extends �л� [ �л� Ŭ�����κ��� ��ӹ��� Ŭ������ ����(���� ����)]
	public static void registerCourseStudent (Course<? extends Student > course) {
	System.out.println(course.getName()+"��������� : " + Arrays.toString(course.getStudents()));}
		//�ڽ��� �迭 ȣ��
	
	//�л� ��� ��� �޼ҵ�					// ? super ������ [ ������ Ŭ������ �θ� Ŭ������ ���� ( ���� ���� ) ]
	public static void registerCourseWorker (Course<? super Worker> course) {
	System.out.println(course.getName()+"��������� : " + Arrays.toString(course.getStudents()));}
		//�ڽ��� �迭 ȣ��



}


