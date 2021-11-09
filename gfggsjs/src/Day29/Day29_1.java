package Day29;

import java.net.InetAddress;

public class Day29_1 {

	//네트워크에 대한 설명
		//네트워크 : 두 대 이상의 컴퓨터들을 연결하고 통신할 수 있는 것
		//통신망 : 전자 신호를 통해 통신하는 모든 기기가 서로 통신하기 위한 하나 이상의 망을 의미
		//TCP/IP
		//컴퓨터 사이의 통신 표준 및 네트워크의 라우팅 및 상호연결에 대한 자세한 규칙을지정하는 프로토콜 스위트, 인터넷에서 광범위하게 사용.
		//네트워크를 연결하는 자세한 규칙
			//TCP : 통신제어, 두 컴퓨터 간의 전송 계층
			//IP : 통신 장치들이 서로를 인식하고 통신을 하기 위해 사용하는 특수한 번호
//		집주소 (집 1개 -> 1개 주소) : 컴퓨터 주소 (컴퓨터 1개 -> 1개 IP)
//		택배 (쿠팡 -> 집 )         : 통신 (PC방 -> 학원)  
//		네이버접속 (학원 ip ---> 네이버 ip 서버실)
//		ip : 숫자 0~255, 4자리, 구분
//		ip는 사람이 사이트마다 외우기 힘들기 때문에 문자로 변환
//		ip ---> 문자 : 도메인 주소(DNS) 
//		현재 IP확인법
//		CMD -> ipconfig 
//		JAVA -> InetAddress 클래스 사용
//	
//	
	public static void main(String[] args) {
		//1. 현재 pc의 호스트 가져오기
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();//무조건 예외처리
			System.out.println("현재 pc의 정보객체 : " + inetAddress);
			System.out.println("현재 pc의 이름 : " + inetAddress.getHostName());
			System.out.println("현재 pc의 주소 : " + inetAddress.getHostAddress());
		//2. 네이버 회사의 호스트 가져오기
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 회사의 정보객체 : " + inetAddress2);
			System.out.println("네이버 회사의 이름 : " + inetAddress2.getHostName());
			System.out.println("네이버 회사의 주소 : " + inetAddress2.getHostAddress());
		//3. 네이버 회사의 다수 IP 확인
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			for(InetAddress address : inetAddresses) {
				System.out.println("네이버 배열 내 PC 이름 : " + address.getHostName());
				System.out.println("네이버 배열 내 PC 주소 : " + address.getHostAddress());
			}
		//4. 페이스북 회사의 IP 확인	
			InetAddress inetAddress3 = InetAddress.getByName("www.facebook.com");
			System.out.println("페이스북 pc의 정보객체 : " + inetAddress3);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
}
