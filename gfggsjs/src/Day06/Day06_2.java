package Day06;

import java.util.Scanner;

public class Day06_2 {
	// Car3.java�� ���赵�� Day06_2.javaŬ������ ����غ���
	public static void main(String[] args) {
		
		//p.213
		//Scanner sc = new Scanner(sss)
		Day06_2_Car3 car1 = new Day06_2_Car3();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model); //null model�� ������ ���� ���� ����
		
		Day06_2_Car3 car2 = new Day06_2_Car3("�ڰ���"); 
		//�ڰ����� Car3.java�� model => this.model�� �����
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model); // this.model�� ����� �ڰ��� ���
		System.out.println();
		
		Day06_2_Car3 car3 = new Day06_2_Car3("�ڰ���", "����"); 
		//�ڰ����� ���� ������������ Car3.java�� model => this.model�� �����
		//������ ���� ������������  color�� ����� = > this.color�� �����
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model); // this.model�� ����� �ڰ��� ���
		System.out.println("car3.color : " + car3.color);	//this.color ���
		
		Day06_2_Car3 car4 = new Day06_2_Car3("�ڰ���", "����", 200); 
		//�ڰ����� ���� ������������ Car3.java�� model => this.model�� �����
		//������ ���� ������������  color�� ����� = > this.color�� �����
		//200�� ���� �������� ���� maxSpeed�� ����� => this.maxSpeed�� ����
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model); // this.model�� ����� �ڰ��� ���
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);	
		//this.maxSpeed ���
	}
}
