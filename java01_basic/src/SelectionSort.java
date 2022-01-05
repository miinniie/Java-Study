import java.util.Random;
import java.util.Scanner;


public class SelectionSort {
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇개의 수를 배열에 넣겠습니까?(입력한 수 만큼 1~100사이의 난수 생성)=");
		int count = scan.nextInt();
		
		//선택 정렬: 기준인덱스에서 마지막까지 비교하여 최솟값을 항상 맨앞에 두는 방식
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
		for(int offset=0; offset<data.length-1;offset++) {
			int offset_minValue = offset;
			
			for(int num=offset+1; num<data.length; num++) {
				if(data[num]<data[offset_minValue]) {
					offset_minValue = num;
				}			
			}
			int temp = data[offset_minValue]; //임시변수를 만들어 주지 않으면은 데이터 사라짐
			data[offset_minValue]=data[offset];
			data[offset]=temp;
			
			System.out.println("\n=====정렬후======");
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