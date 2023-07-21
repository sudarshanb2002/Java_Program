package monkTest;
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int t=scan.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=t) {
				count++;
			}
			else if(a[i]==t){
				break;
			}
		}
		if(count==n) {
		System.out.println("-1");
		}
		else {
			System.out.print(count);
		}
		
		
}
}