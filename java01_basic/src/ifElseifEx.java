import java.util.Scanner;

public class ifElseifEx {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("(1: 사각형의 넓이, 2: 원의 넓이)");
		int check = s.nextInt();
					
		if(check==1) {
			System.out.print("가로=");
			int square1 = s.nextInt();
			
			System.out.print("세로=");
			int square2 = s.nextInt();
			
			System.out.printf("사각형의 넓이는 %d", square1*square2);
			
		}else if (check==2) {
			System.out.print("반지름=");
			int circle = s.nextInt();
			System.out.printf("원의 넓이는 %f\n", Math.PI*Math.pow(circle,2));
			System.out.printf("원의 넓이는 %f", 3.141592*Math.pow(circle,2)); 
			
		}else {
			System.out.println("메뉴를 잘못 선택하였습니다"
					+ "");
		}
	}
}

/*
 실행결과
 메뉴 선택 (1: 사각형의 넓이, 2: 원의 넓이) ?1
 가로= 20
 세로= 10
 사각혀으이 넓이는 200
 
 메뉴 선택 (1: 사각형의 넓이, 2: 원의 넓이) ?2
 반지름 = 3
 원의 넓이 = 
 
 메뉴 선택 (1: 사각형의 넓이, 2: 원의 넓이) ?2
 반지름 = 3
 원의 넓이 = 
 */
		