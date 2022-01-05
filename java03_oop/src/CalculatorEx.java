
public class CalculatorEx {
	
	int plus(int n1, int n2) {
		return n1+n2;
	}
	
	int minus(int n1, int n2) {
		return n1-n2;
	}
	
	int multiple(int n1, int n2) {
		return n1*n2;
	}
	
	int divide(int n1, int n2) {
		return n1/n2;
	}
	
	void calculator(int n1, int n2) {
		System.out.println(n1+"+"+n2+"="+plus(n1,n2));
		System.out.println(n1+"-"+n2+"="+minus(n1,n2));
		System.out.println(n1+"*"+n2+"="+multiple(n1,n2));
		System.out.println(n1+"/"+n2+"="+divide(n1,n2));
	}
	
	
}
