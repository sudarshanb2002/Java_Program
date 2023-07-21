package monkTest;
import java.util.Scanner;
public class Test06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2+1;j++) {
				if(j==0&&i>2&&i<n-4||i==0&&j>2&&j<5||i==n-1&&j>2&&j<5) {
					System.out.print("#");
				}
				else if(i==j&&j<3&&i!=0&&j!=0) {
					System.out.print("**");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
