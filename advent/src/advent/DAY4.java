package advent;
import java.util.*;
public class DAY4 {
	public static void main(String[]agrs) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		int n4=scan.nextInt();
		for(int i=1;i<=size;i++) {
			if(i>=n1&&i<=n2) {
			System.out.print(i);	
			}
			else {
			System.out.print(".");
			}
		}
		System.out.println();
		for(int i=1;i<=size;i++) {
			if(i>=n3&&i<=n4) {
			System.out.print(i);	
			}
			else {
			System.out.print(".");
			}
		}
		
	} 

}
