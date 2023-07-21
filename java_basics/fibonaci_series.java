package java_basics;

public class fibonaci_series {
	static int fibo(int n) {
		if(n==0||n==1) {
			return n;
		}
		else {
			return fibo(n-1) + fibo(n-2);	
		}
		//System.out.println(fibo(n-1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.print(fibo(3));
	}

}
