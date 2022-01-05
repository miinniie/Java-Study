
// 2. 정수를 입력받아 입력 받은 수까지 전체합, 홀수합, 짝수합을 구하여 출력하라.
public class Assignment02 {

	public static void main(String[] args) {
		
		// 정수 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("정수=");
		int num = scan.nextInt();
		
		// 총합,홀수합,짝수합 담을 변수 선언
		int total = 0;
		int odd   = 0;
		int even  = 0;
		
		//전체,짝수,홀수 나눠서 누적
		for(int i=0;i<=num;i++) {
			total += i;
			
			if(i%2==0) {
				even += i;
			}else {
				odd += i;
			}
		}
		System.out.printf("전체합=%d\n홀수합=%d\n짝수합=%d",total,odd,even);
	}

}
