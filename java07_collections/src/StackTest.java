import java.util.Stack;

public class StackTest {

	public StackTest() {

		Stack<String> st = new Stack<String>();
		
		//스택에 객체 추가하기
		st.push("홍길동");
		st.push("손흥민");
		st.push("박태환");

		//끄집어 내기
		System.out.println(st.pop());
		
		st.push("김연아");
		
		while(!st.empty()) {//스택이 비어있으면 true, 그렇지 않으면 false
			System.out.println(st.pop());
			//김연아 > 손흥민 > 홍길동 순서로 나와야함
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
