package Day04;

import java.util.Scanner;

public class Day04_3_키오스크 { // class start

	
	//console 키오스크 [ 자판기 ] 문제
	
		// 1. 메뉴판 [ 1. 콜라 [300] 2.환타 [200] 3. 사이다[100] 4.결제 ]
			// 메뉴판 아래에 선택한 제품들 목록 [ 제품 수량 / 총 결제 예정 금액 출력 ]
		// 2. 초기 재고 [10개씩] 팔렸을때 재고 감소 	// 재고가 없으면 구매 불가
		// 3. 결제를 금액을 입력받아서 결제액 만큼 차감 후 잔돈 출력
	
	public static void main(String[] args) { // main start
		
		
		boolean run = true;
		Scanner sc =  new Scanner(System.in);
		
		// 재고 변수 [ 지역변수 : 선언된 괄호 안에서만 사용 가능하다.]
		// while 안에 변수를 선언하면 계속 무한 루프
		
		
		// 재고 변수
		int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 = 10; 
		
		
		// 장바구니 변수
		int 콜라구매수 = 0;		int 환타구매수 = 0;		 int 사이다구매수 = 0;
		
		//1. 무한루프
		while(run) { // while start
			
			
			System.out.println("--------------------------- 메뉴 ----------------------------");
			System.out.println("------ [ 1. 콜라 [300] 2.환타 [200] 3. 사이다[100] 4.결제 ] ------");
			System.out.print("[선택] > "); int choice = sc.nextInt();
			System.out.println();
			
				
				// 1번 콜라를 선택했을때
			if 	(choice == 1) {	
			// 재고가 없을 경우 구매 불가
				if ( 콜라재고 == 0) { System.out.println(" [[ 콜라 재고가 없습니다. : 제품 준비중 ]]");}
				else {
					System.out.println(" [[ 콜라를 담았습니다. ]]");
					콜라구매수++;
					콜라재고--;
			}
		}
			
			
				//2번 환타 선택했을 때
			if (choice == 2) {
				// 재고 없을 경우 구매 불가
				if ( 환타재고 == 0) { System.out.println(" [[ 환타 재고가 없습니다. : 제품 준비중 ]]");}
				else {
				System.out.println(" [[ 환타를 담았습니다. ]]");
				환타구매수++;
				환타재고--;
			}
		}
			
			if (choice == 3) {
				if ( 사이다재고 == 0) { System.out.println(" [[ 사이다 재고가 없습니다. : 제품 준비중 ]]");}
				else {
				System.out.println(" [[ 사이다를 담았습니다. ]]");
				사이다구매수++;
				사이다재고--;
			}
		}
			
			
			//////////////////////////////장바구니 목록////////////////////////////////////
			System.out.println("----------- 장바구니 -------------");			
			System.out.println("제품명\t제품수량\t결제액");
			if ( 콜라구매수 > 0 )  { System.out.println( "콜라\t"+콜라구매수+"\t"+콜라구매수 * 300);}
			if ( 환타구매수 > 0 )  { System.out.println( "환타\t"+환타구매수+"\t"+환타구매수 * 200);}
			if ( 사이다구매수 > 0 ) { System.out.println( "사이다\t"+사이다구매수+"\t"+사이다구매수 * 100);}
			System.out.println(">>>>>>> 총결제액 : " + ((콜라구매수*300)+(환타구매수*200)+(사이다구매수*100)));
			System.out.println("-------------------------------\n");	
			
			
			if (choice == 4) { //결제 버튼 눌렀는지에 대한 제어
				// 제품이 없음을 나타내는 제어
				if( 콜라구매수 == 0 && 환타구매수 == 0 && 사이다구매수 == 0) {	System.out.println("[알림] 결제할 제품이 없습니다.");} 
				//결제에 대한 제어
				else {
					while(true) {
						System.out.print(">>>결제하시겠습니까 [y] [n] : "); String ch2 = sc.next();
						if(ch2.equals("y")) { 
								
							while(true ) {	
							System.out.print(">>> 금액 투여 :"); int money = sc.nextInt();
								int totalpay = (콜라구매수*300) + (환타구매수*200) + (사이다구매수*100);
								// 금액이 있는지 없는지에 대한 제어
								if (money < totalpay) { 
									System.out.println("[알림] 금액이 부족합니다.");
								}
								// 금액이 있을때 결제에 대한 제어
								else {
									System.out.println("[결제완료] 잔돈 : " + (money-totalpay));
									//장바구니초기화
									콜라구매수 = 0; 환타구매수 = 0; 사이다구매수=0; break;								
								
								}
							}
							break;
							
						 // 결제 거부에 대한 제어
						}else if (ch2.equals("n")) {
							//장바구니 초기화
							콜라구매수 = 0; 환타구매수 = 0; 사이다구매수=0;
							break;
						}else {
							System.out.println("[알림] : 알 수 없는 행동입니다.");
					  }
				   }
				}	
			} 
			
				
			
			
			
		} // while end

	} // main end
} // class end
