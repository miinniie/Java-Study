
public class StringTest {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		
		//
		String tel = new String("010-7896-8888");
		byte[] b = new byte[] {65,66,67}; // byte[] b={65,66,67}
		String txt = new String("b");
		System.out.println(txt);
		char[] cc = {'T','E','S','T','P','R'};
		//index2���� 3���� ���ڿ��� ��ȯ
		String charTxt = new String(cc,2,3);
		System.out.println(charTxt);
		//              0123456789

		String str = "java programing test...";
		System.out.println("charAt=>"+str.charAt(5));
		
		//���ڿ� ���� +
		str = str.concat("�ڹ����α׷���"); // String Ŭ������ ������ �־����� ������ �Ҹ�� >> StringBuffer Test�̶� �ٸ�
		System.out.println(str);
		
		byte strByte[] = str.getBytes();
		for(int i=0; i<strByte.length; i++) {
			System.out.print(strByte[i]+"\t");
		}
		System.out.println("\n"+new String(strByte));	
		
		//indexOf(): Ư�� ������ ��ġ�� ���Ѵ�.
		int idx = str.indexOf("g");
		System.out.println("indxOf->"+idx);
		
		int idx2 = str.lastIndexOf("�ڹ�");
		System.out.println("indxOf->"+idx2);
		
		//subString() :������ Ư�� �κ��� ������ ����
		System.out.println(str.substring(5));
		System.out.println(str.substring(3,6)); //index 3���� 6�ձ���
		
		String sub = str.substring(str.indexOf("p"),str.indexOf("g"));
		System.out.println("indxOf->"+sub);
		
		//Ư�� ��ȣ�� ���ڸ� �ɰ���
		String tels[] = tel.split("-");
		for (String t:tels) {
			System.out.println(t);
		}
		
		//���ڿ��� ��
		// �������� ��>>> equals():��ҹ��� ���� ��, euqalsIngnorCase():��ҹ��� ��������
		// ũ�⸦ �� >>> compareTo(): 0=����, -1 = �������� ũ��, +1 =������ ũ��
		String t1 = "JAVA";
		String t2 = "java";
		
		int r1 = t1.compareTo(t2);
		int r2 = t2.compareTo(t1);
		
		//��� : ���ʰ�ü�� ũ��
		//���� : ������ ��ü�� ũ��
		//0   : �� ��ü�� ũ�Ⱑ ����
		System.out.println("r1=>"+r1); // -32
		System.out.println("r1=>"+r2); // +32
		
		
		
	}
}
