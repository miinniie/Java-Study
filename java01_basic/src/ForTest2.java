public class ForTest2 {

	public static void main(String[] args) {
	
	int sum=0;
	
		for(int i=1; i<=1000; i+=1){
			sum += i;
			if (i%100==0) {
				System.out.println("1~"+i+"까지의 합은"+sum);
			}
			if(sum>=100000) {
				System.out.println("1~"+i+"까지의 합은"+sum);
			}
		}
	}
}