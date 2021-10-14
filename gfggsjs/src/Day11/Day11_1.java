package Day11;

public class Day11_1 {
	
	//p.448 10�� ���� Ȯ�ι���
		//1������ ��) 4
			//1. ����� ���� Ȥ�� �������� �߸��� �ڵ��� ������ ���ܶ� �Ѵ�.
			//2. ���࿹�� [ ���� ���߿� ���� �߻� ], �Ϲݿ��� [ ���� ���� ���� �߻�]
			//3. try{ } catch(����Ŭ���� ������){}
			//4. �����ڰ� ���� Ŭ������ ���� ����
		//2������ ��) 3
			//3. ���� ������� ������ ����Ǵ� �� [ �׻� ���� ]
			//
			//
		//3������ �� 4)
			// throw�� throws�� �ٸ���
			// throw : ����� ���� ����
			// throws : ���ܴ����� => �޼ҵ� �ȿ��� �߻��� ���ܸ� �޼ҵ� ȣ��� ������ ����
			// Exception : ���� Ŭ���� �߿� ���� Ŭ����
			// �ڽ��� ��ü�� ȥ�ڼ� �����Ǵ°� �ƴ϶� �θ�Ŭ������ ���� ����ǰ� �ڽ��� ��ü�� ����� �ڽ�Ŭ������ �����ڰ� ����Ǹ� �θ�Ŭ������ �����ڵ� ���� ����
		//4������ �� 2)
			// throw�� ���ѱ�� ���� �ƴ϶� ���ܸ� �����ϴ� ���̴�.
		//5������ �� 3)
			//catch (Exception e) {} catch(ClassNotFoundException e){}	�տ� catch (Exception e)���ִ� Exception�� ���ܵ��� ����Ŭ������ �ڿ� ���� ȿ���� ����.
			//Exception�� ���ܵ��� (ClassNotFoundException ��)�� ���� Ŭ���� �տ� ����Ŭ������ ���ܰ� ������ �ڿ��ִ� �ڽ�Ŭ������ ���ܵ��� �ǹ̰� ����.
	
	//p.449 	
		//6������ ���� �ڵ尡 ����Ǿ����� ��°��
//			public static void main(String[] args) {
//				String[] strArray = {"10","2a"};
//				int value = 0;
//				for (int i=0; i<=2; i++) {
//					try {
//						value = Integer.parseInt(strArray[i]);		
//					}												
//					//i == 0 => strArray[0] => ���� �߻� X => ���ܰ� ���� ������ finally�� �̵� => 10 ���	
//					//i == 1 => strArray[1] => ���� �߻� O(a10=���ڿ��̱� ����) => finally�� �̵� => value = 0 catch������ �̵� => NumberFormatException e�� �̵� => ���ڷκ�ȯ�� �� ���� ���
//					//i == 2 => strArray[2] => �ε��� ���� => ���ܹ߻� => finally ��� 10 value�� = 10
//					catch (ArrayIndexOutOfBoundsException e) {
//						System.out.println("�ε����� �ʰ�����");
//					}
//					catch (NumberFormatException e) {
//						System.out.println("���ڷ� ��ȯ�� �� ����");
//					} 
//					finally {
//						System.out.println(value);
//					}
//				}
//			}
			
		//7������ NotExistIDException, WrongPasswordException
			//���̵� ���� ��� ���� Ŭ���� �����
			//��й�ȣ�� �ٸ� ��� ���� Ŭ���� �����
	public static void main(String[] args) {	//1. main ����
		
	
	try {
		login("white" , "12345") ;	//2. login �޼ҵ��� white�μ� �޾Ƽ� //8.
	}
	catch (Exception e) {
		System.out.println( e.getMessage() );
	}
	try {
		login("blue", "54321");
	}catch (Exception e) {
		System.out.println( e.getMessage() );
	}
}			
				
	//public static void login(String id, String password)  throws Exception { //���ٰ� ���� ��
	public static void login(String id, String password)  throws NotExistIDException, WrongPasswordException {	//4. String id �Ű������� �̵� //7. ����ó��(throws)
		
			if(!id.equals("blue")) {	//5. ���̵� blue�� �ٸ��� Ȯ��
				//!~.equals : ~�� �ƴϸ� 
				throw new NotExistIDException("���̵� �������� �ʽ��ϴ�."); // ���ο� ���� ����	//6.throw new NotExistIDException ���⼭ throw�� NotExistIDException ��Ű���� public NotExistIDException(String message) ���⿡ String message �μ�����
			}
			if(!id.equals("12345")) {
				//!~.equals : ~�� �ƴϸ� 
				throw new WrongPasswordException("�н����尡 �ٸ��ϴ�.");
			
		}
	}
}

//1. main �޼ҵ忡�� try�� ����
//2. login�޼ҵ� ���� �μ� "white", "12345"�� Line 66�� login(String id, String password)(�Ű�����)�� �ޱ� 
//3. if�� ���� ���̵� �ٸ��� Ȯ��
//4. throw(���� ����) new NotExistIDException (������ ����)
//5. NotExistIDExceptionŬ������ String message �Ű������� "���̵� �������� �ʽ��ϴ�." �̵�
//6. String �Ű������� ������ super(message)�� �̵� message�� "���̵� �������� �ʽ��ϴ�." �̵�
//7. super(message) �� �θ��� �������̱� ������ �θ�Ŭ����(Exception)�� "���̵� �������� �ʽ��ϴ�."  ������
//	Exception�� ����Ŭ������ �θ�Ŭ�����̹Ƿ� message������ main�޼ҵ��� Exception���� ���� throws�� ���ؼ� ���� ������
//8. catch���� ��Ƽ�  e�� �޽��� ����
//9. e.getmessage�� e�� ����� "���̵� �������� �ʽ��ϴ�." ���

