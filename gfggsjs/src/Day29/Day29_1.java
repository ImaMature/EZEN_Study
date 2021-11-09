package Day29;

import java.net.InetAddress;

public class Day29_1 {

	//네트워크에 대한 설명
		//네트워크 : 두 대 이상의 컴퓨터들을 연결하고 통신할 수 있는 것
		//통신망 : 전자 신호를 통해 통신하는 모든 기기가 서로 통신하기 위한 하나 이상의 망을 의미
		
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
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
