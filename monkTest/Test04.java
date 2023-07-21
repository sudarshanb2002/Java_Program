package monkTest;
import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int Q=scan.nextInt();
		int sum=0;
		int prod=1;
		if(Q==1) {
			for(int i=1;i<=N;i++) {
				sum+=i;
			}
			System.out.print(sum);
		}
		else if(Q==2) {
			for(int i=1;i<=N;i++) {
				prod=prod*i;
			}
			System.out.print(prod);
		}
		//System.out.print(sum);
		//System.out.print(prod);
	}

}
