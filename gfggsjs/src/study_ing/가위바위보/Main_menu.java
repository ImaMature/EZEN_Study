package study_ing.����������;

public class Main_menu {
	//1. �ʵ� (���� ��, �÷��̾ �̱� ��, ��ǻ�Ͱ� �̱� ��,)
static int gameCount = 0;
int playerWin = 0;
int cpuWin = 0;



	public static void basicMenu() { // ���θ޴�
		System.out.println("���� �޴��Դϴ�.");
		System.out.println("������������ �ϳ��� �Է����ּ���.");
		System.out.println("���� [0], ���� [1], �� [2], ���α׷� ����[3]");	String ch = Main_����������.sc.next();
		if (ch.equals("0")) { UserScissors.scissors();}	
		if (ch.equals("1")) { UserRock.rock();}
		if (ch.equals("2")) { UserPaper.papirus();}
		if (ch.equals("3")) { ProgramShutdown.userChoice(); }
		else { System.out.println("�߸��� �����Դϴ�."); Main_����������.flag = false;}
		
	}

}
