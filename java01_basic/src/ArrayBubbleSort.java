import java.util.Random;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		Random ran = new Random();
		//배열을 이용하여 정수를 오름차순으로 정렬하라.
		
		//1~100의 난수를 10개 생성한다.
		int data[] = new int[10];
		for (int idx=0; idx<data.length; idx++) {
			data[idx] = ran.nextInt(100)+1;
		}
		
		System.out.println("=====정렬전======");
		for(int d : data) {
			System.out.print(d+"\t");
		}
//		int cnt = 0;
		
		for(int j=0; j<data.length-1;j++) {
			//버블 정렬
			for(int i=0; i<data.length-1-j; i++) {
				//System.out.println(++cnt);
				if(data[i]>data[i+1]) {
					int temp = data[i]; //임시변수를 만들어 주지 않으면은 데이터 사라짐
					data[i]=data[i+1];
					data[i+1]=temp;
				}
			}
		}
		
		System.out.println("\n=====정렬후======");
		for(int d : data) {
			System.out.print(d+"\t");
		}
		
		
	}
}
