import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int array[] = new int[10];

		//1~100�� ������ 10�� �����Ѵ�.
		for (int idx=0; idx<array.length; idx++) {
			array[idx] = random.nextInt(100)+1;
		}
		
		System.out.println("=====������======");
		for(int d : array) {
			System.out.print(d+"\t");
		}
		
			
		//sort
		for(int i=1; i<array.length; i++) {
			int currentValue = array[i];
			int position = i;
			
			while(position>0 && array[i-1]>currentValue) {
				array[position] = array[position-1];
				position--;
			}
			array[position]=currentValue;
		}

		//sort2
		for(int idx =1; idx<array.length; idx++) {
			int currentValue = array[idx];
			int position = idx;
			
			while(position>0 && array[idx-1]>currentValue) {
				array[position] = array[idx-1];
				position--;
			}
			array[position] = currentValue; 
		}
		
		
		System.out.println("\n====������======");
		for(int d : array) {
			System.out.print(d+"\t");
		}
		
	}
}
