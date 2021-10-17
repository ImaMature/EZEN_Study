package study_ing;

import java.util.Arrays;

public class 학생명단 {
int num;
String 이름;
int 국어점수;
int 영어점수;
int 수학점수;
int 총점;
double 평균;

public 학생명단() {};






public 학생명단(int num, String 이름, int 국어점수, int 영어점수, int 수학점수, int 총점, double 평균) {
	super();
	this.num = num;
	this.이름 = 이름;
	this.국어점수 = 국어점수;
	this.영어점수 = 영어점수;
	this.수학점수 = 수학점수;
	this.총점 = 총점;
	this.평균 = 평균;
}




public void inputGrade() {
	System.out.println("성적 입력하기."); 
	System.out.print("번호 : ");	int num = 성적표.scanner.nextInt();
	System.out.print("이름 : ");	String name = 성적표.scanner.next();
	System.out.print("국어 성적 : ");	int kor = 성적표.scanner.nextInt();
	System.out.print("영어 성적 : ");	int eng = 성적표.scanner.nextInt();
	System.out.print("수학 성적 : ");	int math = 성적표.scanner.nextInt();
	
	//총합 (실수형)
	int sum = 0;
	sum = (kor + eng + math);
	
	//정수형변환 int 총합에 넣기 위해
	int sum2 = 0;
	sum2 = (int) sum;
	
	// 평균 구하기
	double average = 0;
	average = Math.round(((sum/3)*100)/100.0);
	
	
	학생명단 list = new 학생명단(num, name, kor, eng, math, sum2, average);
	for(int i = 0; i<성적표.arr.length; i++) {
		if(성적표.arr[i] == null) {
		성적표.arr[i] =list;
		break;
		}
	}
}



public void outputGrade() {
	
	System.out.println("--------------------------------------------------------------");
	System.out.println("\t\t성\t적\t표");
	System.out.println("--------------------------------------------------------------");
	System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
	System.out.println("--------------------------------------------------------------");
	Arrays.sort(성적표.arr);
	
	
		for(int i= 1; i<성적표.arr.length;i++)
			if(성적표.arr[i] != null) {
				학생명단 임시객체 = new 학생명단();
				System.out.println(임시객체.getNum()+"\t"+임시객체.get이름()+"\t"+
				임시객체.get국어점수()+"\t"+임시객체.get영어점수()+"\t"+임시객체.get수학점수()+"\t"+
						임시객체.get총점()+"\t"+임시객체.get평균()+"\t"+ i++);
			}
}








public int getNum() {
	return num;
}






public void setNum(int num) {
	this.num = num;
}






public String get이름() {
	return 이름;
}






public void set이름(String 이름) {
	this.이름 = 이름;
}






public int get국어점수() {
	return 국어점수;
}






public void set국어점수(int 국어점수) {
	this.국어점수 = 국어점수;
}






public int get영어점수() {
	return 영어점수;
}






public void set영어점수(int 영어점수) {
	this.영어점수 = 영어점수;
}






public int get수학점수() {
	return 수학점수;
}






public void set수학점수(int 수학점수) {
	this.수학점수 = 수학점수;
}






public double get평균() {
	return 평균;
}






public void set평균(double 평균) {
	this.평균 = 평균;
}






public int get총점() {
	return 총점;
}






public void set총점(int 총점) {
	this.총점 = 총점;
}













}
