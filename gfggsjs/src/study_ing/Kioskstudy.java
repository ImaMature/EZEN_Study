package study_ing;

import java.util.Scanner;

public class Kioskstudy {
	//console Ű����ũ [ ���Ǳ� ] ����
	
			// 1. �޴��� [ 1. �ݶ� [300] 2.ȯŸ [200] 3. ���̴�[100] 4.���� ]
				// �޴��� �Ʒ��� ������ ��ǰ�� ��� [ ��ǰ ���� / �� ���� ���� �ݾ� ��� ]
			// 2. �ʱ� ��� [10����] �ȷ����� ��� ���� 	// ��� ������ ���� �Ұ�
			// 3. ������ �ݾ��� �Է¹޾Ƽ� ������ ��ŭ ���� �� �ܵ� ���
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int colaStock = 10; int fantaStock = 10; int sodaStock = 10;
		int colaPurchase = 0; int fantaPurchase = 0; int sodaPurchase = 0;
		
		while(true) {
			System.out.println("[ 1. �ݶ� [300] 2.ȯŸ [200] 3. ���̴�[100] 4.���� ]");
			System.out.print("���� > : "); int ch = scanner.nextInt();
			if (ch == 1) {
				if(colaStock==0) {
					System.out.println("�ݶ� ��� �����ϴ�.");
				}else {
					System.out.println("�ݶ� ��ҽ��ϴ�.");
					colaStock--;
					colaPurchase++;
				}
			}
			else if (ch == 2) {
				if(fantaStock==0) {
					System.out.println("ȯŸ ��� �����ϴ�.");
				}else {
					System.out.println("ȯŸ�� ��ҽ��ϴ�.");
					fantaStock--;
					fantaPurchase++;
				}
			}
			else if (ch == 3) {
				if(sodaStock==0) {
					System.out.println("���̴� ��� �����ϴ�.");
				}else {
					System.out.println("���̴ٸ� ��ҽ��ϴ�.");
					sodaStock--;
					sodaPurchase++;
				}
			}
			
			System.out.println("-------------------------");
			System.out.println("    ��    ��    ��    ��    ");
			System.out.println("-------------------------");
			System.out.println("ǰ��\t����\t����(����)");
			if(colaPurchase>0) {System.out.println("�ݶ�\t"+colaPurchase+"\t"+(colaPurchase*300));}
			if(fantaPurchase>0) {System.out.println("ȯŸ\t"+fantaPurchase+"\t"+(fantaPurchase*200));}
			if(sodaPurchase>0) {System.out.println("���̴�\t"+sodaPurchase+"\t"+(sodaPurchase*300));}
			System.out.println("-------------------------");
			System.out.println("�� ���� �ݾ� : " + ((colaPurchase*300)+(fantaPurchase*200)+(sodaPurchase*100)));
			System.out.println("-------------------------");
			
			if (ch == 4) {
				if(sodaPurchase==0 && colaPurchase == 0 && fantaPurchase == 0) {
					System.out.println("��ٱ��Ͽ� ������ ��ǰ�� �����ϴ�.\n");
				}else {
					while (true) {
						System.out.println("������ �����Ͻðڽ��ϱ�? [y] [n]"); String ch2 = scanner.next(); 
						if(ch2.equals("y")) {
							System.out.println("������ �����մϴ�.");
							while(true) {
								System.out.println("���� �ݾ��� �������ּ���."); int �����ұݾ� = scanner.nextInt();
								int �ѱݾ� = ((colaPurchase*300)+(fantaPurchase*200)+(sodaPurchase*100));
							//-------------------------------------------------------------------	
								if(�����ұݾ�<�ѱݾ�) { // (����ڰ� �Է��� �ݾ� < �����ؾ��ϴ� �ݾ�) 
									System.out.println("�ܾ��� �����մϴ�.");
								}else {
									System.out.println("���� �Ϸ�!! �ܵ� : " + (�����ұݾ�-�ѱݾ�));
									colaPurchase =0; fantaPurchase=0; sodaPurchase=0;
									colaStock=10; 	fantaStock=10; 	sodaStock=10;
									break; 
								}
							}break; 
							//-----------------------------------------------------------------------
							
						/*		
						  		// (����ڰ� �Է��� �ݾ� >= �����ؾ��ϴ� �ݾ�)
								if	(�����ұݾ� >= �ѱݾ�) { 
									System.out.println("���� �Ϸ�!! �ܵ� : " + (�����ұݾ�-�ѱݾ�));
									colaPurchase =0; fantaPurchase=0; sodaPurchase=0;
									colaStock=10; fantaStock=10; sodaStock=10; 
									
								}else {	
									System.out.println("�ܾ��� �����մϴ�.");
									break;	
								}
							}break;�� ������ �߻� (�ش� break;�� �����϶�� ��)
							
						*/	
							
						}else if (ch2.equals("n")) {
							System.out.println("������ ����ϰ� ����ȭ������ ���ư��ϴ�.");
							colaPurchase =0; fantaPurchase=0; sodaPurchase=0;
							colaStock=10; fantaStock=10; sodaStock=10;
							break;
						}else {
							System.out.println("�� �� ���� ����Դϴ�. �ٽ� �Է��� �ּ���.");
						}
					}
				}
			}
			else {}
		}//while end
	}//main end
}//class end
