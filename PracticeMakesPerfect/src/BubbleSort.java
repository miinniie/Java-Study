import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
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
	for(int i=0; i<array.length-1 ; i++) {
		for(int j=0; j<array.length-1-i; j++) {
			if(array[j]>array[j+1]) {
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
		}
	}
	
	System.out.println("\n������");
	for(int d : array) {
		System.out.print(d+"\t");
	}
	
	
		
	}
}
