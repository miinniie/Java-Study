
public class Array01 {

	public static void main(String[] args) {
		// 배열이란 같은 데이터혀으이 변수가 여러개 필요할 때 생성한다.
		int num[] = new int[10];
		String names[] = new String[10];
		
		int tel[];
		tel = new int[5];
		
		//배열에 값 입력하기
		num[3]=100;
		
		//System.out.println(num);
		// 배열의 크기 구하기 -> 배열명.length
		for(int idx=0;idx<num.length;idx++) {
			System.out.println("num["+idx+"]="+num[idx]);
		}
		
		//문자열 배열의 초기값을 확인
		//확장된 for문(초기 데이터가 없이 생성) -> for(배열의 데이터 타입변수:배열명)
		System.out.println("================");
		for(String n:names) {
			System.out.println(n);
		}
		
		//배열 생성시 초기 데이터를 셋팅하기
		//정수:0, 실수: 0.0, 논리: false, char: , String: null
		
		int data[] = {19,54,75,48,65,58};
		System.out.println("================");
		
		
		//배열의 값을 이용한 합 구하기
		int tot =0;
		for(int idx = 0; idx<data.length; idx++) {
			tot += data[idx];
			System.out.println("data["+idx+"]="+data[idx]);
		}
		System.out.println("합="+tot);
		
		
		System.out.println("================");
		
		//최대값을 보관할 변수에 배열에 index 0번째 데이터를 대입한다.
		int max = data[0];
		for(int idx = 1; idx<data.length; idx++) {
			if(max<data[idx]){
				max = data[idx];
			}
		}
		System.out.println("최댓값="+max);
		
		
		System.out.println("================");
		
		//최대값을 보관할 변수에 배열에 index 0번째 데이터를 대입한다.
		
		
	}
}
