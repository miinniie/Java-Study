import java.util.Stack;

public class StackTest {

	public StackTest() {

		Stack<String> st = new Stack<String>();
		
		//���ÿ� ��ü �߰��ϱ�
		st.push("ȫ�浿");
		st.push("�����");
		st.push("����ȯ");

		//������ ����
		System.out.println(st.pop());
		
		st.push("�迬��");
		
		while(!st.empty()) {//������ ��������� true, �׷��� ������ false
			System.out.println(st.pop());
			//�迬�� > ����� > ȫ�浿 ������ ���;���
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
