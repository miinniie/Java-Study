
public class StringBufferTest {

	public static void main(String[] args) {
		//StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append(12);
		sb.append("���ڿ��׽�Ʈ");
		
		sb.insert(3,"java programing"); //�޸𸮰� ���ڶ�� �˾Ƽ� �߰� �Ҵ�
		System.out.println(sb);
		
		sb.delete(3,5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		//Ȯ���� �޸� ũ�� (����Ʈ:16)
		System.out.println("capacity->"+sb.capacity());
		System.out.println(sb);
		
	}
}
