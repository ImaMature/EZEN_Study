package Day03;

public class Day03_6 {//c s

	public static void main(String[] args) { //m s
		
		// for (�ʱⰪ; ���ǹ�; ������) { ���๮ }  => ���ǹ� �������� for���� ����
		// 
		// �ʱⰪ
		// while (���ǹ�){				//while�� ���ѷ����� �� ���� ��
		//		���๮
		//		������
		
		//p.125 ��1)
		
		int i = 1;			//1) while �ۿ� �ʱⰪ
		while(i <=10 ) { 	//2) ���ǹ�
			System.out.println(i+" ");	//3) ���๮�� �߰�ȣ �ȿ�. 
		i++;							//4) �����ĵ� �߰�ȣ �ȿ�.
		}

	System.out.println("\n---------------------------");	
		//for ���� ����
		for(int j=1; j<=10; j++) { // for start
			System.out.println(j+" ");
		} //for end
		
		//p.125 ��2)
	System.out.println("\n---------------------------");	
		int sum=0;
		int h = 1; //�ʱⰪ
		while( h<=100 ) { sum+=h; h++; }
		System.out.println("1~100���� �����հ� : " + sum);
	
		// for ����	
	System.out.println("\n---------------------------");
		int sum2 = 0;
		for( int k = 1; k<=100; k++)	{ sum2+=k; }
		System.out.println("1~100���� �����հ� : "+sum2);
		
		
		
		//p.127 ���ѷ��� => while(true) // for������ �� ���� ��
		while(true) { System.out.println("��ӽ���");}
	} //m e

} //c e
