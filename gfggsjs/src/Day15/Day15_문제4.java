package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_����4 {
/*
 * ����4 : ���� ������ �̿��� ���ڿ� ���� ���
 * 	[����1] Stack ����
 * 	[����2] �Է¹��� ���ڿ��� ������� ���ÿ� ����
 * 		Char�̳� String�ᵵ ��
 * 	[����3] ���ڿ� �ݴ�� ���
 * 	[��¿���] �Է� : ABC
 * 			 ��� : CBA
 * 	//�ϳ��� ������
 */
	


	public static void main(String[] args) {
		Stack<Character> alphabet = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է� : ");  String input = sc.next();
		
		
		for(int i=0; i<input.length(); i++) {
			alphabet.push(input.charAt(i)); //charAt = ���ڿ��� �ɰ��� �ϳ��� �ױ�
		}
		//�Է°��� �ϳ��� �߳������� Ȯ���ϱ�
		System.out.println(alphabet);

			// ������
		for ( int i =0; i<input.length(); i++) {
			System.out.print(alphabet.pop()); // �տ������� �Է��� ���ڿ� ���̸�ŭ ����
			// pop  ���࿡�� ���� �������̽����� ���� ���°� �����ϸ��
		}
		
	}
}
