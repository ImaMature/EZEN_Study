package Day29;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Day29_Server {

	//��ſ� ���� �����
	public static void main(String[] args) {
		//���� : ��Ʈ��ũ �󿡼� �����ϴ� ���α׷���(PC) ���� ����� ������
		// 		Ŭ���̾�Ʈ ���Ͽ��� ���� ��û(�ùٸ� ������ ���)�� �ϸ� ���� ������ ����ؼ� ����� �� �ֵ��� ����
		
		//1. �������� �����
		//2. ���ε� �ϱ�
			// ���ε� : ���α׷��� �⺻ ������ ���� �� �ִ� ��������� ��ü���� ���� ������ Ȯ���ϴ� ��
			// ������ IP �ּҿ� ��Ʈ ��ȣ�� ����
			// port : IP�� 6���� ���� ������ ��ȣ
		try {
			ServerSocket serverSocket = new ServerSocket(); // 1. �������� �����
			//2. ���� ���Ͽ� ip, port ��ȣ ���� (���ε�)
			serverSocket.bind(new InetSocketAddress("127.168.102.50",5000)); 
			while(true) {
				System.out.println("[�������� ���� �����]");
				Socket socket =serverSocket.accept(); //3. .accept() : Ŭ���̾�Ʈ ��û�� ����
				//4. ������ Ŭ���̾�Ʈ ���� Ȯ��
				InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
													//����ȯ
				System.out.println("[Ŭ���̾�Ʈ�� ������ �Ǿ����ϴ�. Ŭ���̾�Ʈ ����] : " + socketAddress.getHostName());
				
				//5. ������ �����ϱ�
				InputStream inputStream = socket.getInputStream(); // ���� �Է� ��Ʈ��
				byte[] bytes = new byte[1000]; // ����Ʈ �迭 ����
				inputStream.read(bytes); //�Է� ���� ������ �о ����Ʈ�迭�� ����
				System.out.println("Ŭ���̾�Ʈ�� �޽��� : " + new String(bytes)); //����Ʈ �迭 -> ���ڿ� ��ȯ�ؼ� ���
				
				
				
				//6. �۵��� ���� ���� �ܼ� ���� -> Ŭ���̾�Ʈ Ŭ���� �ܼ� ���� -> 
				// �ܼ�â �ָܼ޴� Ŭ�� Ŭ���̾�Ʈ ���� �� �޽��� �Է��ϸ� ���� �ܼ�â�� �޽��� �ۼ��� �� -> 
				// �״��� ���� �ܼ�â���� �޽��� �Է� -> Ŭ���̾�Ʈ �ܼ�â���� �޽��� ���ŵ� 
				
				//7. Ŭ���̾�Ʈ �ַܼ� ������ �۽��ϱ� [������]
				Scanner scanner = new Scanner(System.in);
				System.out.println("���� �޽��� : ");
				String msg = scanner.nextLine();
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(msg.getBytes());
				return; //���� �ݺ� ����
			}
		} catch (Exception e) {
			System.out.println("���� ���� ����" + e.getMessage());
		}
		
	}
}
