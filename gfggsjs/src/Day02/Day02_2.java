package Day02;

public class Day02_2 {


		
		// ���� : �ϳ��� ���� ������ �� �ִ� �޸� ���� (=���ͷ�)
			// �޸� [ �ֱ����ġ = RAM ] : ���� ���� ���� ���α׷� ���
				// ���α׷� <---- ���μ���[������] <---- ��ɾ�[�ڵ�] ����
			// ���� ���� ���� ---> �뷮 ���� ---> �ӵ� ����
			// ���� ȿ���� => �ڷ���
		
		// ���� ����
			// �ڷ��� ������ [����]
			// int age;
		
		// ������ ��Ģ
			// ���ڷ� ���� X  // ��ҹ��� ����
		
		// ������ ���� [ ������ ���� ���ʿ� ���� : ���� �����ڴ� '=' ]
			// int score; // ���� ����
			// score = 90; // ������ 90�� ����
	
		// ������ ����� ��� �������� ���� [ ��ȣ ������ �̵� ���� // ��ȣ ������ �̵� �Ұ� ]
	public static void main(String[] args) {	
		
		// ���� p35 ����
		int value= 10 ; // int�� �ڷ��� value �������� ���� ���� ����� ���ÿ� 10 ����
		
		int result = value + 10; // ���� + �� ����, <������ ������ ����>
		
		System.out.println(result);
		
		// p.38 �ڷ���
			// �ڷ��� ��� ���� : �޸� ȿ���� [ ������ ��� ]
			// ��ǻ�ʹ� ���� ��� [0 �� 1] ���� : bit => 0 Ȥ�� 1
				// 1bit * 8 => 8bit => 1byte		[ 01010101 => 1byte [ 8ĭ ] ]
				// 1byte *1024 => 1024byte => 1kb ���..
				// * ��ǻ�ʹ� byte ������ �뷮�� ó���� ����) c����̺� �Ӽ� -> ���� ��ũ �뷮 Ȯ��
				
		/* [��]
		 * boolean 1��Ʈ	=	true, false
		 * 
		 * [����]
		 * char  2����Ʈ	=	���� [�����ڵ�]
		 * 
		 * [����]
		 * byte  1����Ʈ	=	+-127
		 * short 2����Ʈ	=	+-3������
		 * int	 4����Ʈ	=	+-20������
		 * long	 8����Ʈ	=	+-20���̻�
		 * 
		 * [�Ǽ�]
		 * float 4����Ʈ	=	�Ҽ��� 8�ڸ����� ǥ��
		 * double8����Ʈ	=	�Ҽ��� 16�ڸ����� ǥ��
		 * 
		 */
		
		
		//p.40 byte 
		
		//byte�� ���� [ -128 ~ +127 ]
		
		byte var1 = -128; System.out.println(var1); // ���ٷ� sysout�� �ص� ��µ� ;�� �ڵ带 ���� ���ױ� ����
		byte var2 = -30; System.out.println(var2); 
		byte var3 = 30; System.out.println(var3);
		//byte var4 = 128; System.out.println(var4); // ����
		byte var4 = 'j'; System.out.println(var4);
		
		//p.43 char
		// [�� ����]
		char c1 = 'A';		System.out.println(c1);
		char c2 = 65;		System.out.println(c2);
		char c3 = '\u0041';	System.out.println(c3);
		
		char c4 = '��';		System.out.println(c4);
		char c5 = 44032;	System.out.println(c5);
		char c6 = '\uac00';	System.out.println(c6);
		// ��ǻ�ʹ� ��� ���ڸ� ó���ϳ�???
			// �ƽ�Ű �ڵ�(ASCII) : �̱� [ ���� ---> ���� ---> ���� ] => 128����
			// �����ڵ�[java] : ������ ��� ���� ǥ��, �ڹٴ� �����ڵ带 �⺻���� ���. �ƽ�Ű�ڵ庸�� �뷮�� ŭ.
		
		char b = 'B';
		int uniCode = b;
		System.out.println(uniCode);
		//char 
		//------------------------------------------------------------------------------------------------------
		
		// p.44 ~ 45 short, int
		// short [ 2byte ], int [ *�⺻ ���� �ڷ���, 4byte ] Ÿ��
				
		short num1 = 30000;		System.out.println(num1);
		//short num2 = 40000; 	System.out.println(num2); //���� �뷮�ʰ��� ����ȵ�
		//short�� �� 30000���� ���� ���� ���� ����
		
		int num2 = 10;		System.out.println(num2);
		int num3 = 012;		System.out.println(num3); // 8������ 10 ����
		int num4 = 0xA;		System.out.println(num4); // 16���� 10
		int num4_1 = 0xB;		System.out.println(num4_1); // 16���� 11
		
			// ���� ���� : ��ǻ�Ͱ� ǥ���� �� �ִ� ���� �Ѱ� �ذ��ϱ� ����
			// 2���� [ 0, 1 ] : ����
			// 8���� [ 0 ~ 7 ]									[ 0 ]
			// 10���� [ 0 ~ 9 ] : ���
			// 16���� [ 0 ~ 9, A, B, C, D ....] : �پ��� ǥ�� ����		[ 0x ] 
		
		// p.46 : Long [ 8byte ] : 20�� �̻�
		Long num5 = 2000000000L; System.out.println(num5); 
		// int Ÿ���� ������� [20��]�� �Ѿ�� ū ������ �ݵ�� ������ �ڿ� �ҹ��ڳ� �빮�� L�� �־�� ��. 
		
		// p.47 ~ 48 : float [ 4byte ] , double [ *�⺻ �Ǽ� �ڷ��� / 8byte ]
		
		double val = 3.14; 			System.out.println(val);
		//float val2 = 3.14; 	System.out.println(val2); // ����! 3.14�� �Ǽ� double��, �׷��� float�� ���� �� ����.
		float val2 = 3.14f;			System.out.println(val2); // �� �ڿ� f�� �־��ָ� ��� ����
		
		double val3 = 0.1234567890123456789; System.out.println(val3); // �Ҽ��� 18�ڸ����� ǥ�� ����
		float val4 = 0.1234567890123456789f; System.out.println(val4); // �Ҽ��� 8�ڸ����� ǥ�� ����
		
		// boolean : ��Ʈ [0(false), 1(true)]
		boolean bol = true; 		System.out.println(bol);
		//boolean bo2 = 10; 		System.out.println(bol2); 
		// ����!! boolean�� true�� false �ۿ� ��� ���ϱ� ������ ���ڰ� ���� �ȵ�.
		
		// p.49 ~ 51 Ÿ�Ժ�ȯ
			// 1. �ڵ� Ÿ�Ժ�ȯ [ ũ��� : ���� ���ڿ��� ū ���ڷ� �̵� ���� ]
				// byte -> short/char -> int -> long -> float -> double
				// byte + byte => int / byte [x]
				// int + byte => int => int
			// int + float => int => float�� ���� �� ����
			// int + double => int => double�� ���� �� ����
				// * ū ���ڿ��� ���� ���ڷ� �̵� �Ұ� ��, ***�ݴ�� �Ұ�!
				// char�� ���ڿ��̱� ������ short�� ����ȯ�� �ȵ�.
				
		byte bytevalue1 = 10;
		int intvalue1 = bytevalue1; // �ڵ� ����ȯ [ ���� ] byte -> int
		System.out.println("intvalue : " + intvalue1);
		//byte bytevalue2 = intvalue; // �Ұ�!! int -> byte 
		
		
			// 2. ���� Ÿ�Ժ�ȯ [ �޸� �ս� => ������ �ս� ] => Casting
				// �ڷ��� ������ = (�ڷ���)������;
			// p.54 
		byte bytevalue2 = (byte)intvalue1;
		
		/*ex) int intValue3 = 1;
			  short shortvalue3 = (short) intValue3;
			  �޸𸮰� ū ���� (int>short) �տ� ��ȯ�ϰ��� �ϴ� ������ Ÿ�� (short) ����
			*/
		int intValue3 = 1;
		  short shortValue3 = (short) intValue3;
		  System.out.println("shortValue3 : " + shortValue3);
		
			//p. 60
		//5��
//		byte byteValue = 10;
//		char charValue = 'A';
//		
//		int intValue = byteValue;
//		int intValue = charValue;
//		short shortVaule = charValue;
//		double doubleValue = byteValue;
		  /*short�� char�� ��� 2 byte�� ũ�⸦ ������, 
		  short�� ������ -215 ~ 215-1(-32768~32767)�̰� 
		  char�� ������ 0~216-1(0~65535)�̹Ƿ� ���� ������ �޶� 
		  �� �� ��� �������� ����ȯ�� �� �ս��� �߻��� �� �����Ƿ� 
		  �ڵ������� ����ȯ�� ����� �� ����.*/
		
		/*6��  
		  String���� class�� char������ ��ȯ�� �� ����.*/
		  
		// 7��
		//�ƽ�Ű�ڵ忡 ������ ����. �׷��� ����
		//char char2 = ''; // �� ������ ������ �ٸ� ���̴�.
		//String ������ ""���� char �ʱ�ȭ�Ϸ��� ' '�̷��� ���� ����ǥ ���̿� �����̽��� �־����
		
		// 8��
		// 5�� int
		// �ֳĸ� �����̰� ����� �⺻ Ÿ���� int
		// �׷��� ����Ʈ + ����Ʈ = int
		// int + float => int => float�� ���� �� ����
		// int + double => int => double�� ���� �� ����
		
		
		
		
//		float floatvalue = 2.5f;
//		float result1 = 5 + floatvalue;
//		System.out.println(result1);
		
		int amd = 1234567890;	// int ������ Ÿ�Կ��� float ������ Ÿ������ �ڵ� ����ȯ
		int nvidia = 1234567890;	// float ������ Ÿ�Կ��� int ������ Ÿ������ ���� ����ȯ
		
		float intel = nvidia;
		nvidia = (int) intel;
		
		int lisasu = amd - nvidia;
		System.out.println(lisasu); // -46�� ����
		 // �̴� int ���� float���� �ڵ� ����ȯ �ϸ鼭 ������ �߻��߱� ����
		 // float�� �ƴ� double ������ Ÿ���� ������ָ� ���� �ذ�
		 // 0�� ����
		
		int intV = 10;

		double doubleV = 5.5;

		double result2 = intV + doubleV;      
		
		System.out.println(result2);
		
		//���� ��ũ https://stage-loving-developers.tistory.com/8
		
	}
}
