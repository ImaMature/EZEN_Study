package study_ing;

import java.util.Arrays;

public class �л���� {
int num;
String �̸�;
int ��������;
int ��������;
int ��������;
int ����;
double ���;

public �л����() {};






public �л����(int num, String �̸�, int ��������, int ��������, int ��������, int ����, double ���) {
	super();
	this.num = num;
	this.�̸� = �̸�;
	this.�������� = ��������;
	this.�������� = ��������;
	this.�������� = ��������;
	this.���� = ����;
	this.��� = ���;
}




public void inputGrade() {
	System.out.println("���� �Է��ϱ�."); 
	System.out.print("��ȣ : ");	int num = ����ǥ.scanner.nextInt();
	System.out.print("�̸� : ");	String name = ����ǥ.scanner.next();
	System.out.print("���� ���� : ");	int kor = ����ǥ.scanner.nextInt();
	System.out.print("���� ���� : ");	int eng = ����ǥ.scanner.nextInt();
	System.out.print("���� ���� : ");	int math = ����ǥ.scanner.nextInt();
	
	//���� (�Ǽ���)
	int sum = 0;
	sum = (kor + eng + math);
	
	//��������ȯ int ���տ� �ֱ� ����
	int sum2 = 0;
	sum2 = (int) sum;
	
	// ��� ���ϱ�
	double average = 0;
	average = Math.round(((sum/3)*100)/100.0);
	
	
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
	
	
		for(int i= 1; i<����ǥ.arr.length;i++)
			if(����ǥ.arr[i] != null) {
				�л���� �ӽð�ü = new �л����();
				System.out.println(�ӽð�ü.getNum()+"\t"+�ӽð�ü.get�̸�()+"\t"+
				�ӽð�ü.get��������()+"\t"+�ӽð�ü.get��������()+"\t"+�ӽð�ü.get��������()+"\t"+
						�ӽð�ü.get����()+"\t"+�ӽð�ü.get���()+"\t"+ i++);
			}
}








public int getNum() {
	return num;
}






public void setNum(int num) {
	this.num = num;
}






public String get�̸�() {
	return �̸�;
}






public void set�̸�(String �̸�) {
	this.�̸� = �̸�;
}






public int get��������() {
	return ��������;
}






public void set��������(int ��������) {
	this.�������� = ��������;
}






public int get��������() {
	return ��������;
}






public void set��������(int ��������) {
	this.�������� = ��������;
}






public int get��������() {
	return ��������;
}






public void set��������(int ��������) {
	this.�������� = ��������;
}






public double get���() {
	return ���;
}






public void set���(double ���) {
	this.��� = ���;
}






public int get����() {
	return ����;
}






public void set����(int ����) {
	this.���� = ����;
}













}
