import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Random ran = new Random();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇개의 수를 배열에 넣겠습니까?(입력한 수 만큼 1~100사이의 난수 생성)=");
		int count = scan.nextInt();
		
		//삽입 정렬: 현재 위치보다 아래쪽으로 순회하며 알맞은 위치에 삽입
		//1~100사이의 입력한 수 만큼의 난수 생성
		int data[] = new int[count];
		for (int idx=0; idx<data.length; idx++) {
			data[idx] = ran.nextInt(100)+1;
		}
		
		System.out.println("=====정렬전======");
		for(int d : data) {
			System.out.print(d+"\t");
		}
		
		//선택 정렬 수행
		for(int idx=1; idx<data.length; idx++) {
			int currentValue = data[idx];
			int position = idx;
			
			while(position>0 && data[position-1]>currentValue) {
				data[position] = data[position-1];
				position--;
			}
			data[position]=currentValue;
			
			System.out.printf("\n=====정렬%d======\n",idx);
			for(int d : data) {
				System.out.print(d+"\t");
			}
		}
		
		//정렬이 될때마다 출력
		System.out.println("\n=====정렬(최종값 출력)======");
		for(int d : data) {
			System.out.print(d+"\t");
		}
	
	}
}
