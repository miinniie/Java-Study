import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		/*
		 코솔에서 정수를 입력받아 짝수를 3배한 값을
		 홀수는 4배한 값을 출력하라
		 
		 실행결과
		 정수=5
		 5의 4배는 20이다.
		 
		 정수=4
		 4의 3배는 12이다
		 */
		
//		Scanner s =new Scanner(System.in);
//		System.out.print("정수=");
//		
//		int data = s.nextInt();
//				
//		int result = (data%2==0)? 3: 4;
//		
//		System.out.println(data + "의 "+ result +"배는 " + data*result + "이다");
		
		// 단항연산자
		int a=10;
		a++;
		System.out.println(a);
		
		int b = a--; // 연산자가 숫자 뒤에 있다면 (ex.a++) 결과를 변수에 넘겨주고 나서 단항 연삼을 함 (연산의 우선순위)
		System.out.println("b=" + b + ", a=" + a);
		
		char c = 'A';
		//c++;
		char d = c++; //d = "B, d = "" 
		
		int e = c+1; //char 이랑 int랑 계산하면 int
				
		
		char f = (char)(c+1); // 강제 형변환
		
		System.out.println(e + "그리고" c);
		
	}	
}