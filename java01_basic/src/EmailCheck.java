import java.util.Scanner;

public class EmailCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("�̸���=");
			String email = scan.nextLine();
			//0123456789012
			//abcdef@nate.com
			int atMark = email.indexOf("@");
			int point = email.indexOf(".",atMark);
			int len = email.length();
			
			if(atMark==1 || atMark<5 || point==-1 || Math.abs(atMark-point)<2 || atMark > len-3) {//�߸��� �����϶�
				System.out.println("��ȿ���� ���� �����Դϴ�.");
			}else {//������� �϶�
				String id = email.substring(0,atMark+1);
				String domain = email.substring(atMark+1);
				System.out.println("���̵�="+id);
				System.out.println("������="+ domain);
				break;
			}
		}while(true);
	
		
	}
}

/*
���۰��
�̸��� = abcd@com
��ȿ���� ���� �̸����Դϴ�.

�̸��� = ab.cd@com
��ȿ���� ���� �̸����Դϴ�.

�̸��� = abcd@nate.com
���̵� = abcd
������ = nate.com
 

 */

//do {			
//System.out.print("�̸���=");
//Scanner scan = new Scanner(System.in);
//String mail = scan.nextLine();
//
//String mails[] = mail.split("@");
//
//System.out.println("��ȿ���� ���� �̸����Դϴ�.");
//if(mails[1].contains(".")) {
//	System.out.printf("���̵�=%s",mails[0]+"\n");
//	System.out.printf("������=%s",mails[1]);
//	break;
//}
//}while(true);	
//

