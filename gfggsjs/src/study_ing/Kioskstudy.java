package study_ing;

import java.util.Scanner;

public class Kioskstudy {
	//console 키오스크 [ 자판기 ] 문제
	
			// 1. 메뉴판 [ 1. 콜라 [300] 2.환타 [200] 3. 사이다[100] 4.결제 ]
				// 메뉴판 아래에 선택한 제품들 목록 [ 제품 수량 / 총 결제 예정 금액 출력 ]
			// 2. 초기 재고 [10개씩] 팔렸을때 재고 감소 	// 재고가 없으면 구매 불가
			// 3. 결제를 금액을 입력받아서 결제액 만큼 차감 후 잔돈 출력
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int colaStock = 10; int fantaStock = 10; int sodaStock = 10;
		int colaPurchase = 0; int fantaPurchase = 0; int sodaPurchase = 0;
		
		while(true) {
			System.out.println("[ 1. 콜라 [300] 2.환타 [200] 3. 사이다[100] 4.결제 ]");
			System.out.print("선택 > : "); int ch = scanner.nextInt();
			if (ch == 1) {
				if(colaStock==0) {
					System.out.println("콜라 재고가 없습니다.");
				}else {
					System.out.println("콜라를 담았습니다.");
					colaStock--;
					colaPurchase++;
				}
			}
			else if (ch == 2) {
				if(fantaStock==0) {
					System.out.println("환타 재고가 없습니다.");
				}else {
					System.out.println("환타를 담았습니다.");
					fantaStock--;
					fantaPurchase++;
				}
			}
			else if (ch == 3) {
				if(sodaStock==0) {
					System.out.println("사이다 재고가 없습니다.");
				}else {
					System.out.println("사이다를 담았습니다.");
					sodaStock--;
					sodaPurchase++;
				}
			}
			
			System.out.println("-------------------------");
			System.out.println("    장    바    구    니    ");
			System.out.println("-------------------------");
			System.out.println("품목\t개수\t가격(개당)");
			if(colaPurchase>0) {System.out.println("콜라\t"+colaPurchase+"\t"+(colaPurchase*300));}
			if(fantaPurchase>0) {System.out.println("환타\t"+fantaPurchase+"\t"+(fantaPurchase*200));}
			if(sodaPurchase>0) {System.out.println("사이다\t"+sodaPurchase+"\t"+(sodaPurchase*300));}
			System.out.println("-------------------------");
			System.out.println("총 결제 금액 : " + ((colaPurchase*300)+(fantaPurchase*200)+(sodaPurchase*100)));
			System.out.println("-------------------------");
			
			if (ch == 4) {
				if(sodaPurchase==0 && colaPurchase == 0 && fantaPurchase == 0) {
					System.out.println("장바구니에 결제할 제품이 없습니다.\n");
				}else {
					while (true) {
						System.out.println("결제를 진행하시겠습니까? [y] [n]"); String ch2 = scanner.next(); 
						if(ch2.equals("y")) {
							System.out.println("결제를 진행합니다.");
							while(true) {
								System.out.println("결제 금액을 투입해주세요."); int 지불할금액 = scanner.nextInt();
								int 총금액 = ((colaPurchase*300)+(fantaPurchase*200)+(sodaPurchase*100));
							//-------------------------------------------------------------------	
								if(지불할금액<총금액) { // (사용자가 입력한 금액 < 지불해야하는 금액) 
									System.out.println("잔액이 부족합니다.");
								}else {
									System.out.println("결제 완료!! 잔돈 : " + (지불할금액-총금액));
									colaPurchase =0; fantaPurchase=0; sodaPurchase=0;
									colaStock=10; 	fantaStock=10; 	sodaStock=10;
									break; 
								}
							}break; 
							//-----------------------------------------------------------------------
							
						/*		
						  		// (사용자가 입력한 금액 >= 지불해야하는 금액)
								if	(지불할금액 >= 총금액) { 
									System.out.println("결제 완료!! 잔돈 : " + (지불할금액-총금액));
									colaPurchase =0; fantaPurchase=0; sodaPurchase=0;
									colaStock=10; fantaStock=10; sodaStock=10; 
									
								}else {	
									System.out.println("잔액이 부족합니다.");
									break;	
								}
							}break;에 오류가 발생 (해당 break;를 삭제하라고 뜸)
							
						*/	
							
						}else if (ch2.equals("n")) {
							System.out.println("결제를 취소하고 이전화면으로 돌아갑니다.");
							colaPurchase =0; fantaPurchase=0; sodaPurchase=0;
							colaStock=10; fantaStock=10; sodaStock=10;
							break;
						}else {
							System.out.println("알 수 없는 명령입니다. 다시 입력해 주세요.");
						}
					}
				}
			}
			else {}
		}//while end
	}//main end
}//class end
