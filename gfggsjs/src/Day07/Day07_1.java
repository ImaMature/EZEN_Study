package Day07;	// ���� Ŭ������ ��ġ

//�ٸ� ��Ű���κ��� Ŭ���� ��������
import java.util.Scanner;
import Day06.Day06_1_Student; // ���� : import ��Ű����.Ŭ����;

public class Day07_1 {

	
	//day06 : Ŭ���� (���赵 : �ڷ��� �����)
		//1. ��� ( �ʵ�, ������, �޼ҵ�)
			//1. ��� (���û��� �ʼ� X)
				//1) �ʵ� : ������ ���� [ �޸� �Ҵ� ]
				//2) ������ : ��ü �ʵ� �ʱⰪ
				//3) �޼ҵ� : ������ ����
					//��ȯŸ�� �޼ҵ�� ( �μ�1, �μ�2, �μ�3~~~) { return ��ȯ�� } //���ڴ� return�ȵ�.
		//2. ��ü ���� (Ŭ������ �ν��Ͻ�) ����
			// Ŭ������ ��ü��
				// ��ü�� = new ������(); <-----�ν��Ͻ�
			// ��ü�� ��� ���� [ ��ü��.��� ���ٿ����� ] 
	// static�� ���� �ִ� �ֵ� ���� �о�´�( �ٸ� Ŭ������ �ִ� �� ����) -> ���� main�о��
	// static�� ���� : � ��ġ�� ȣ���� �����ϰ� �����.
	
	public static void main(String[] args) { 
		//p.236
		/*
		 * static �� ������ ����μ� ��ü�� �������� �ʰ� ����� �� �ִ� �ʵ�� �޼ҵ带 ���Ѵ�. --> ������X
		 * (����)
		 */
		
		
		//p.238
		//double result1 = 10*10*Calculator.pi; 	// �ش� Ŭ���� ��ü�� ���� ��������(�޸� �Ҵ��� ��������) ����
							
		double result1 = 10*10*Day07_1_Calculator.pi; // class Day07_1_Calculator�� double pi = 3.14159; �Ǿտ� static�� �ٿ���� �νĵ�.
			// �ش� Ŭ������ ��� ���ٹ��	
				// 1. ��ü ���� [ �ش� Ŭ�����κ��� �޸� �Ҵ� ]
				// 2. static [��������] : ���α׷� ���۽� �޸� �Ҵ�
		int result2 = Day07_1_Calculator.plus(10, 5);
		int result3 = Day07_1_Calculator.plus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result1);
		System.out.println("result3 : " + result1);
		
		
		
		//p.245
		Day07_1_Person p1 = new Day07_1_Person("123456-1234567", "���");
		
		//�ʵ� ȣ��
		System.out.println(p1.nation + " " +p1.ssn+" "+p1.name);
		
		//�ʵ� ���� [final �ʵ� = ���� �Ұ� => ��� �����]
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "��������";
		
		//p. 253 
		//[import] : �ٸ� ��Ű�κ��� Ŭ���� �������� Ű���� 
		// ex) Scanner Ŭ���� <import java.util.scanner;>
			//1. ���� : import ��Ű����.Ŭ������;		[Ŭ���� �ܺο� �ۼ�]
			//2. �ι�° ���� : ��Ű����.Ŭ������ ��ü��;	[Ŭ���� ���ο� �ۼ�]		
				//ex) Day06.Account account = new Account();
	}
}
