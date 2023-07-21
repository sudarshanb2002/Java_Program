package classes;
import java.util.*;
public class arraya {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++) {
				if(j==2) {
					a[i][0]=a[i][0]+a[i][j];
					//System.out.print(a[i][0]);
					//a[][]
					break;
				}
				else if(j==0) {
					a[i][2]=a[i][2]-a[i][0];
					System.out.println(a[i][2]);
					break;
				}
			}
		}
		/*for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++) {
				if(j==0) {
					a[i][2]=a[0][j]-a[i][2];
					System.out.println(a[i][2]);
					break;
				}
			}
		}*/
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}
		
		
		}
		
}
	

