
public class StringBufferTest {

	public static void main(String[] args) {
		//StringBuffer
		StringBuffer sb = new StringBuffer();
		sb.append(12);
		sb.append("문자열테스트");
		
		sb.insert(3,"java programing"); //메모리가 모자라면 알아서 추가 할당
		System.out.println(sb);
		
		sb.delete(3,5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		//확보된 메모리 크기 (디폴트:16)
		System.out.println("capacity->"+sb.capacity());
		System.out.println(sb);
		
	}
}
