package study_ing;

import java.util.Arrays;

public class 학생명단 {
int number;
String name;
int kor;
int eng;
int math;
int total;
double average;

public 학생명단() {};



public 학생명단(int number, String name, int kor, int eng, int math, int total, double average) {
	super();
	this.number = number;
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.total = total;
	this.average = average;
}


//무제한으로 입력받는 것은 list써도 되고. 석차는 정렬. try catch꼭



public void inputGrade() {
	
	System.out.println("성적 입력하기."); 
	System.out.print("번호 : ");	int num = 성적표.scanner.nextInt();
	System.out.print("이름 : ");	String name = 성적표.scanner.next();
	System.out.print("국어 성적 : ");	int kor = 성적표.scanner.nextInt();
	System.out.print("영어 성적 : ");	int eng = 성적표.scanner.nextInt();
	System.out.print("수학 성적 : ");	int math = 성적표.scanner.nextInt();
	
	//총합 (실수형)

	int sum = (kor + eng + math);
	
	//정수형변환 int 총합에 넣기 위해
	
	int sum2 = (int) sum;
	
	// 평균 구하기
	
	double average = Math.round(((sum/3)*100)/100.0);
	System.out.println(num+" "+name+" "+kor+" "+eng+" "+math+" "+sum+" "+sum2+" "+average);
	
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
	
	int number = 1;
	
		for(int i= 0; i<성적표.arr.length;i++)
			if(성적표.arr[i] != null) {
				학생명단 임시객체 = new 학생명단();
				System.out.println(임시객체.getNumber()+"\t"+임시객체.getName()+"\t"+
				임시객체.getKor()+"\t"+임시객체.getEng()+"\t"+임시객체.getMath()+"\t"+
						임시객체.getTotal()+"\t"+임시객체.getAverage()+"\t"+ i++);
			}
}



	public int getNumber() {
		return number;
	}
	
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getKor() {
		return kor;
	}
	
	
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	
	
	public int getEng() {
		return eng;
	}
	
	
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	
	public int getMath() {
		return math;
	}
	
	
	
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	public int getTotal() {
		return total;
	}
	
	
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	public double getAverage() {
		return average;
	}
	
	
	
	public void setAverage(double average) {
		this.average = average;
	}

}
