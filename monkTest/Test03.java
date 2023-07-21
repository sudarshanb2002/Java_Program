package monkTest;
import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		int sum=0;
		int ar[]=new int [a];
		for(int i=0;i<a;i++){
			ar[i]=scan.nextInt();
		}
		
		
			for(int i=0;i<n;i++) {
				if(i!=ar[0]) {
					sum+=i;
				}
			}
			System.out.println(sum);
		System.out.print(sum);
	}

}
