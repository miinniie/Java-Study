package algorithm;

import java.util.Scanner;

/*
 654745 
 547456
 */

public class NumberReverse {
	//StringBuffer, StringBuilder를 이용하지 않는 경우
	
	public static void number1(String data) {
		String resultData="";
		for (int idx=data.length()-1; idx>=0; idx--) {//5,4,3,2,1..
			resultData += data.charAt(idx);
		}
		System.out.println(resultData);
	}
	
	public static void number2(String data) {
		StringBuffer sb = new StringBuffer(data);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void number3(String data) {
		//문자열을 배열로 구한다
		char[] arr = data.toCharArray();
		String resultTxt ="";
		for(int i=arr.length-1; i>=0; i--) {
			resultTxt += arr[i];
		}
		System.out.println(resultTxt);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inData = scan.nextLine();
		number1(inData);
		number2(inData);
		number2(inData);
	}

}



