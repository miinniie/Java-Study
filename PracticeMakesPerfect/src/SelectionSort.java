import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int array[] = new int[10];

		//1~100의 난수를 10개 생성한다.
		for (int idx=0; idx<array.length; idx++) {
			array[idx] = random.nextInt(100)+1;
		}
		
		System.out.println("=====정렬전======");
		for(int d : array) {
			System.out.print(d+"\t");
		}
		
		
		//sort
		for(int offset=0; offset<array.length-1; offset++) {
			int offset_minValue = offset;
			for(int idx=offset+1; idx<array.length; idx++) {
				if(array[offset_minValue]>array[idx]) {
					offset_minValue = idx;
				}
			}
			int temp = array[offset_minValue];
			array[offset_minValue] = array[offset];
			array[offset] = temp;
		}
		
		
		
		
		System.out.println("\n====정렬후======");
		for(int d : array) {
			System.out.print(d+"\t");
		}
		
	}
}
