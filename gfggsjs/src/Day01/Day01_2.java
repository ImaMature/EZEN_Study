package Day01;

public class Day01_2 { // Ŭ���� ���� ( c    s)
	
	public static void main(String[] args) { // (���� ����)  m s
		
		// 1. ��� 
			// 1) print(����� ����) : only ���
		// ex1) syso + ctrl + �����̽� ��
		System.out.print("java");
		System.out.print(12345); // ����� ���ڿ��� ����ó�� X
		System.out.print("java10"); // ���� + ���� -> ����ó��
		
			// System : �̸� ������� �ý����̶�� Ŭ���� 
				// out : ��� ��Ʈ��
					// print (�μ� : ����ϰ� ���� ��) : ��� �Լ�
			// "." : Ŭ���� �� ��� (�Լ�, ����) ���� ������ [Ư������]
			// " "(ū ����ǥ) �� ' '(���� ����ǥ) ���� ??
				// ū ����ǥ�� Ű����[�̸� �ۼ��� �ܾ�], ���� �� ������ ��� ���ڿ� ����ó���ϴµ� ����
		
		// System.out.println() <- main ���� ���� �Ұ�
		// main + ctrl + �����̽� ��
		// ";" : ���� �� �� ���� ���� �ڵ� �� [ ��ó�� ]
		//ctrl + F11 = ������
		
			// 2) println(����� ����) : ��� �� �� �ٲ� [���� �ٲ�]
		// ex2) sysout + ctrl + �����̽���
		System.out.println("java");
		System.out.println(12345);
		System.out.println("java10");
		
			// 3) printf( ���Ĺ���, ��¹��� ) : ���Ĺ��� �´� ���
				// f => format : ���, ����ȭ�� ����� �ϰڴٴ� �ǹ�
				// ���Ĺ���
					// %d : 10���� ���� ������ ���
					// %f : �Ǽ�
					// %s : ���ڿ�
					// %c : ����
	
		// ex3)
		System.out.printf("java");
		System.out.printf("%d", 12345);
		System.out.printf("%s", "java10");
		System.out.printf("���̴� %d �Դϴ�." , 20);
		// %d�� �� ���ڸ� �����ϴ� ��
		System.out.printf("���̴� " + 20 + "�� �Դϴ�.");
			// + : ���� ������
		
			// 4) ����� [ ���� p.34 ]
				// \ : ���� ���� ��ȭ ��ȣ
				// \n : �ٹٲ�
				// \t : �� [�鿩���� => 5ĭ]
				// \r : ���� [�� ������ �̵�]
				// \\ : \ �ϳ� ���
		System.out.print("\njava\n"); //�� �ڷ� �� �ٲ�
		System.out.print("\t 12345 "); // �鿩����
		System.out.print("\r java10"); // �� ������
		
		
			// 5) ���� 1
			/* ��°��
			 * 					[[ �⼮�� ]]
			 * -----------------------------------------------
			 * �̸�		1����		2����		3����		���
			 * ��ȣ��		�⼮		�Ἦ		�⼮
			 * ���缮		�⼮		�Ἦ		�⼮ 
			 * -----------------------------------------------
			 */
		System.out.println("\n\n");
		System.out.println("\t\t\t [[ �⼮�� ]]");
		System.out.print("------------------------------------------------------------");
		System.out.println("\n�̸�\t\t1����\t\t2����\t\t3����\t\t���");
		System.out.print("��ȣ��\t�⼮\t\t�Ἦ\t\t�⼮");
		System.out.println("\n���缮\t�⼮\t\t�Ἦ\t\t�⼮");
		System.out.println("------------------------------------------------------------");
		
			// 6) ���� 2
			// ����� ���
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
			// 7) ����3 
			// �� ���
			// ū ����ǥ ����Ϸ��� ū ����ǥ �տ� \���� �ֱ�
		System.out.println("\n|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		
	} // (���� ��) m e
	// ���

} // Ŭ���� �� (c    e)
