package study_ing;



public class Students_TreeSet extends GradeTable_TreeSet implements Comparable<Students_TreeSet>{

	
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double ave;
	private int rank;
	
	public Students_TreeSet() {}
	
	public Students_TreeSet(int num, String name, int kor, int eng, int math) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	
	
	
	
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public double getAve() {
		return ave;
	}

	public void setAve(double ave) {
		this.ave = ave;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public int compareTo(Students_TreeSet o) {
		if(total<o.total) return 1;
		else if(total == o.total) return 0;
		else return -1;
	}
	
	
	
	
}
