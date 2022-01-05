import java.util.Scanner;

public class EmailCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("이메일=");
			String email = scan.nextLine();
			//0123456789012
			//abcdef@nate.com
			int atMark = email.indexOf("@");
			int point = email.indexOf(".",atMark);
			int len = email.length();
			
			if(atMark==1 || atMark<5 || point==-1 || Math.abs(atMark-point)<2 || atMark > len-3) {//잘못된 메일일때
				System.out.println("유효하지 않은 메일입니다.");
			}else {//정상메일 일때
				String id = email.substring(0,atMark+1);
				String domain = email.substring(atMark+1);
				System.out.println("아이디="+id);
				System.out.println("도메일="+ domain);
				break;
			}
		}while(true);
	
		
	}
}

/*
실핼결과
이메일 = abcd@com
유효하지 않은 이메일입니다.

이메일 = ab.cd@com
유효하지 않은 이메일입니다.

이메일 = abcd@nate.com
아이디 = abcd
도메인 = nate.com
 

 */

//do {			
//System.out.print("이메일=");
//Scanner scan = new Scanner(System.in);
//String mail = scan.nextLine();
//
//String mails[] = mail.split("@");
//
//System.out.println("유효하지 않은 이메일입니다.");
//if(mails[1].contains(".")) {
//	System.out.printf("아이디=%s",mails[0]+"\n");
//	System.out.printf("도메인=%s",mails[1]);
//	break;
//}
//}while(true);	
//

