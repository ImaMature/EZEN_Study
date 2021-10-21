package test;

public class Students implements Comparable<Students>{

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	double average;
	private int rank;
	
	public Students() {}
	
	
	public Students(String name, int kor, int eng, int math, int sum, double average) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.average = average;
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


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public double getAverage() {
		return average;
	}


	public void setAverage(double average) {
		this.average = average;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	@Override
	public int compareTo(Students o) {
		if(getAverage()>o.average) {
			return -1;
		}else if (getAverage()== o.average) {
			return 0;
		}
		return 1;
	}
	
	
	
}
