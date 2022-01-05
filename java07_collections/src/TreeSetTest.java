import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

		//중복허용하지 않는다
		//입력순서 유지하지 않는다
		//객체는 정렬된다
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
			
			//오름차순으로 정렬
			Iterator<String> getStrData = color.iterator();
			while(getStrData.hasNext()) {
				System.out.print(getStrData.next()+"\t");
			}
			System.out.println();
			
			//오름차순으로 정렬
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
