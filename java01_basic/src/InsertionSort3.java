import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("��� ���ڸ� �迭�� �ְڽ��ϱ�?=");
		int num = scan.nextInt();
		int array[] = new int[num];
		
		//������
		System.out.print("������=");
		for(int i=0; i<array.length;i++) {
			array[i] = random.nextInt(1000)+1001;
		}
		System.out.println(Arrays.toString(array));
		
		
		//sort1
		for(int j=1; j<array.length; j++) {
			int currentValue = array[j];
			int position = j;
			while (position>0 && array[position-1]>currentValue) {
				array[position] = array[position-1];
				position--;
			}
			array[position] = currentValue;	
		}
		
		//sort2
		for(int i=1; i<array.length; i++) {
			int pointData = array[i];
			for(int k=i-1; 0<=k ; k--) {
				
			}
		}
		
		
		//������
		System.out.print("������=");
		System.out.println(Arrays.toString(array));
		
		
		
		
		
	}
}
