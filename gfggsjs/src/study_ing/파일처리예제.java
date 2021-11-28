package study_ing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ����ó������ {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\JHD\\git\\EZEN_Study\\gfggsjs\\src\\study_ing\\test.txt");
			/*	1. ���� ���� ����ϴ� ��ü ���� (FileOutputStream ��ü�� = new FileOutputStream("���")
				2. ����ó�� �ʼ� (try,catch Ȥ�� throws Exception)
			 	3. "/" = "\\"
			 */
			
			String str = "��Ŭ�������� �ۼ��� ����"; 
			// 1.str�� �ش� ���� ����  2.�ѱ� => 2����Ʈ  3.����, ����, ���� => 1����Ʈ
			
			fileOutputStream.write(str.getBytes()); 
			/*	1. .write() : �ش� ���Ͽ� ����	
			 	2. ()�ȿ� byte �迭�̳�, int��, (byte �迭, int������, int��������)�̵�����.
				3. ��ü��.getBytes() : String ��ü -> ����Ʈ �迭ȭ
			*/
			
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\JHD\\git\\EZEN_Study\\gfggsjs\\src\\study_ing\\test.txt");
			//	�Է¹޴� ��ü ���� (FileOutputStream ��ü�� = new FileOutputStream("���/���ϸ�.Ȯ����  or ���\\���ϸ�.Ȯ����")
			
			byte [] bytearr = new byte[1000]; 
			//	1000byte ũ���� byte �迭 ���� 
			
			fileInputStream.read(bytearr);
			/*	1. .read() : byte �迭 �о����
			 *	2. bytearr ��ü�� read�޼ҵ忡 �Ű�����(�μ�)�� �Ѱ� ó��
			 *	3. ()�ȿ� byte �迭�̳�, (byte �迭, int������, int��������)�̵�����
			 *	4. .write�ʹ� �ٸ��� ()�ȿ� int�� �ܵ����δ� �� �� ����.
			 */
			
			String str2 = new String(bytearr);
			//	byte �迭 ��ü bytearr�� String���� ����ȯ�ؼ� str2�� ����
			
			System.out.println("���� ���� : " + str2);
			//	����� ���� ���
			
			Scanner scanner = new Scanner(System.in);
			//	�Է� ��ü ����
			
			while(true){ //	���� ������ ���� while�� ����
				System.out.println("�Է��� ������ : ");
				String inputdata = scanner.nextLine();
				//	���� �Է¹ޱ� ���� .nextLine() ���
//				if("\n".equals(scanner.nextLine())){
//					System.out.println("�ٽ� �Է����ּ���");
//					return;
//				}
				// 	���๮��(\n) �Է½� ó�����
				inputdata += "\n";
				//	�Է��� �����Ͱ� ����� �� �ֵ��� inputdata= inputdata+"\n" ���
				fileOutputStream.write(inputdata.getBytes());
				//	�Է��� �����͸� byte �迭ȭ �ؼ� ���Ͽ� ����
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
