package interview;
import java.util.*;
public class fibonacciseries {
	static int fibo(int n) {
		if(n==0||n==1) {
			return n;
		}
		else {
			return fibo(n-1)+fibo(n-2);	
		}
		//System.out.println(fibo(n-1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.print(fibo(n));
	}


}
