package study_ing;

import java.util.Arrays;

public class �л���� {
int number;
String name;
int kor;
int eng;
int math;
int total;
double average;

public �л����() {};



public �л����(int number, String name, int kor, int eng, int math, int total, double average) {
	super();
	this.number = number;
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.total = total;
	this.average = average;
}


//���������� �Է¹޴� ���� list�ᵵ �ǰ�. ������ ����. try catch��



public void inputGrade() {
	
	System.out.println("���� �Է��ϱ�."); 
	System.out.print("��ȣ : ");	int num = ����ǥ.scanner.nextInt();
	System.out.print("�̸� : ");	String name = ����ǥ.scanner.next();
	System.out.print("���� ���� : ");	int kor = ����ǥ.scanner.nextInt();
	System.out.print("���� ���� : ");	int eng = ����ǥ.scanner.nextInt();
	System.out.print("���� ���� : ");	int math = ����ǥ.scanner.nextInt();
	
	//���� (�Ǽ���)

	int sum = (kor + eng + math);
	
	//��������ȯ int ���տ� �ֱ� ����
	
	int sum2 = (int) sum;
	
	// ��� ���ϱ�
	
	double average = Math.round(((sum/3)*100)/100.0);
	System.out.println(num+" "+name+" "+kor+" "+eng+" "+math+" "+sum+" "+sum2+" "+average);
	
		�л���� list = new �л����(num, name, kor, eng, math, sum2, average);
		for(int i = 0; i<����ǥ.arr.length; i++) {
			if(����ǥ.arr[i] == null) {
			����ǥ.arr[i] =list;
			break;
			
		}
	}
}



public void outputGrade() {
	
	System.out.println("--------------------------------------------------------------");
	System.out.println("\t\t��\t��\tǥ");
	System.out.println("--------------------------------------------------------------");
	System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
	System.out.println("--------------------------------------------------------------");
	Arrays.sort(����ǥ.arr);
	
	int number = 1;
	
		for(int i= 0; i<����ǥ.arr.length;i++)
			if(����ǥ.arr[i] != null) {
				�л���� �ӽð�ü = new �л����();
				System.out.println(�ӽð�ü.getNumber()+"\t"+�ӽð�ü.getName()+"\t"+
				�ӽð�ü.getKor()+"\t"+�ӽð�ü.getEng()+"\t"+�ӽð�ü.getMath()+"\t"+
						�ӽð�ü.getTotal()+"\t"+�ӽð�ü.getAverage()+"\t"+ i++);
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
