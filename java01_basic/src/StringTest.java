
public class StringTest {

	public static void main(String[] args) {
		String name = "홍길동";
		
		//
		String tel = new String("010-7896-8888");
		byte[] b = new byte[] {65,66,67}; // byte[] b={65,66,67}
		String txt = new String("b");
		System.out.println(txt);
		char[] cc = {'T','E','S','T','P','R'};
		//index2부터 3개를 문자열로 변환
		String charTxt = new String(cc,2,3);
		System.out.println(charTxt);
		//              0123456789

		String str = "java programing test...";
		System.out.println("charAt=>"+str.charAt(5));
		
		//문자열 연결 +
		str = str.concat("자바프로그래밍"); // String 클래스는 변수에 넣어주지 않으면 소멸됨 >> StringBuffer Test이랑 다름
		System.out.println(str);
		
		byte strByte[] = str.getBytes();
		for(int i=0; i<strByte.length; i++) {
			System.out.print(strByte[i]+"\t");
		}
		System.out.println("\n"+new String(strByte));	
		
		//indexOf(): 특정 문자의 위치를 구한다.
		int idx = str.indexOf("g");
		System.out.println("indxOf->"+idx);
		
		int idx2 = str.lastIndexOf("자바");
		System.out.println("indxOf->"+idx2);
		
		//subString() :문자의 특정 부분을 가지고 오기
		System.out.println(str.substring(5));
		System.out.println(str.substring(3,6)); //index 3부터 6앞까지
		
		String sub = str.substring(str.indexOf("p"),str.indexOf("g"));
		System.out.println("indxOf->"+sub);
		
		//특정 기호로 문자를 쪼개기
		String tels[] = tel.split("-");
		for (String t:tels) {
			System.out.println(t);
		}
		
		//문자열의 비교
		// 동일한지 비교>>> equals():대소문자 구별 비교, euqalsIngnorCase():대소문자 구별안함
		// 크기를 비교 >>> compareTo(): 0=같다, -1 = 오른쪽이 크다, +1 =왼쪽이 크다
		String t1 = "JAVA";
		String t2 = "java";
		
		int r1 = t1.compareTo(t2);
		int r2 = t2.compareTo(t1);
		
		//양수 : 왼쪽객체가 크다
		//음수 : 오른쪽 객체가 크다
		//0   : 두 객체의 크기가 같다
		System.out.println("r1=>"+r1); // -32
		System.out.println("r1=>"+r2); // +32
		
		
		
	}
}
