package Day12;

import java.util.Arrays; //import �ٸ���Ű���κ���Ŭ���� ��������
import java.util.Collections;

public class Day12_1 {

	public static void main(String[] args) {
		

	//p.521
	//1. Arrays Ŭ����	
	
	char [] arr1 = {'j','a','v','a'}; // �迭 ����
				//char : �⺻�ڷ��� ['����']
				//String : Ŭ���� ["���ڿ�"]
	
				//�迭���� = �迭��.length		: �ʵ�
				//���ڿ����� = ���ڿ�.length()	: �޼ҵ� ()�ڸ��� �μ��ڸ�
		//���1
			//1-1) .copyOf(): �迭 ���� (�����迭, ������ ����) : �迭 ����
			char[] arr2 = Arrays.copyOf(arr1, arr1.length);
						//���� Ŭ�������� �ٸ� Ŭ���� �� �޼ҵ� ȣ�� ����
						//. : ���������ڸ� ���� �޼ҵ� ȣ��
						//1_ ��ü�� ���� �޼ҵ� ȣ��
							// Ŭ������ ������ = new ������()
							// ��ü��.�޼ҵ��()
					
						//2_ static �޼ҵ� : ��ü ���� ȣ��
							// Ŭ������.�޼ҵ��()
			
			//1-2) Arrays.toString (�迭) : �ε��� ������ ������ ���
			System.out.println(Arrays.toString(arr2)); //��°� : [j, a, v, a]
		
		//���2
			//3) copyofRange(������ �迭, �����ε���, ���ε���)
			char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); //[1] ~ [2] ����
			System.out.println(Arrays.toString(arr3)); //��°� : [a, v]
		
		//���3
			//4)System.arraycopy (�����迭, �����ε���, Ÿ�ٹ迭, Ÿ�ٽ����ε���, ���簳��)	
			char[] arr4 = new char[arr1.length];
			System.arraycopy(arr1, 0, arr4, 0, arr1.length);
			System.out.println(Arrays.toString(arr4)); //��°� : [j, a, v, a]
		
	//p.522
			//5) Arrays.equals(�迭1, �迭2)	: 1���� �迭 ��
			//6) Arrays.deepEquals(�迭1, �迭2) : 2���� �迭 ��
			System.out.println("1�� �迭 �� : " + Arrays.equals(arr1, arr2)); //��°� : 1�� �迭 �� : true
			//System.out.println("2�� �̻� �迭 �� : " + Arrays.deepEquals(arr1, arr2));//�迭�� �ϳ� �� �߰��ؾߵ�		
			
			//7) Arrays.sort (�迭��) : �ش� �迭 �� �������� ����
			Arrays.sort(arr1);
			System.out.println("�迭 �ּ� ���� : "+ arr1.toString());
			System.out.println("�迭�� ������ ���� : "+ Arrays.toString(arr1));
			
			//8) Arrays.sort(�迭��, Collections.reverseOrder()) : �迭 �� �������� ����
				//*���� : Ŭ������ �����ؼ� �ش� �迭�� �⺻ �ڷ���(int, byte ��)�� ��� ���� �߻�
			//Arrays.sort(arr1, Collections.reverseOrder()); //
			
	//p.526
			//9) Arrays.binarySearch(�迭��, ������) : �ش� �������� �ε��� ��ȣ
				// * ����!! ������������ ������ �� ���¿����� ��� ����
			System.out.println(Arrays.binarySearch(arr1, 'j'));	// {a,a,j,v}�� ���ĵǾ��ֱ� ������ 2���
	}
}
