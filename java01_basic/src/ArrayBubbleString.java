
public class ArrayBubbleString {

	public static void main(String[] args) {
		String names[] = {"�����","�迬��","�߽ż�","������","����ȯ","������","������","�迬��"};
		
		System.out.println("\n=====������======");
		for(String d : names) {
			System.out.print(d+"\t");
		}
		
		
		for(int j=0; j<names.length-1;j++) {
			//���� ����
			for(int i=0; i<names.length-1-j; i++) {
				//System.out.println(++cnt);
				if(names[i].compareTo(names[i+1])>0) {
					String temp = names[i]; //�ӽú����� ����� ���� �������� ������ �����
					names[i]=names[i+1];
					names[i+1]=temp;
				}
			}
		}
		
		System.out.println("\n=====������======");
		for(String d : names) {
			System.out.print(d+"\t");
		}
		
		
	}
}
