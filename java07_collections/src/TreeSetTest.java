import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

		//�ߺ�������� �ʴ´�
		//�Է¼��� �������� �ʴ´�
		//��ü�� ���ĵȴ�
		String names[] = {"red","yello","green","black","white","red","blue"};
		int num[] = {25,9,36,95,45,853,36,25,68,25,26,25,36,85};
		
		public TreeSetTest(){};
		
		public void start() {
			TreeSet<String> color = new TreeSet<String>();
			TreeSet<Integer> numSet = new TreeSet<Integer>();
			
			for(String c:names) {
				color.add(c);
			}
			for(int n:num) {
				numSet.add(n);
			}
			System.out.println("color->"+color.size()+", num->"+numSet);
			
			//������������ ����
			Iterator<String> getStrData = color.iterator();
			while(getStrData.hasNext()) {
				System.out.print(getStrData.next()+"\t");
			}
			System.out.println();
			
			//������������ ����
			Iterator<Integer> getIntData = numSet.iterator();
			while(getIntData.hasNext()) {
				System.out.print(getIntData.next()+"\t");
			}
			System.out.println();
		}
	
		
		public static void main(String[] args) {
			TreeSetTest tt = new TreeSetTest();
			tt.start();
			
		}
}
