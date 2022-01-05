import java.lang.reflect.Array;
import java.util.Random;

public class Question05 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int array[]  = new int[10];
		
		//정렬전
		System.out.print("정렬전=[");
		for(int i=0; i<array.length; i++) {
			array[i] = random.nextInt(999)+1001;
			if(i==9) {
				System.out.println(array[i]+"]");
			}else {
				System.out.print(array[i]+",");
			}
		}
		
		//sort
		for (int offset=0; offset<array.length-1; offset++) {
			int minValue = offset;
			for(int idx=offset+1; idx<array.length; idx++) {
				if(array[minValue]>array[idx]) {
					minValue = idx;
				}
				int temp = array[minValue];
				array[minValue] = array[offset];
				array[offset] = temp;
			}
			
		}
			
		
		System.out.print("정렬후=[");
		for(int i=0; i<array.length; i++) {
			if(i==9) {
				System.out.println(array[i]+"]");
			}else {
				System.out.print(array[i]+",");
			}
		}
		
	}
}
