package arrays;
import java.util.*;
public class Transposearray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [][] a=new int [2][3];
		int [][]b=new int [3][2];
		int [][]c=new int [2][2];
		//System.out.print(a.length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length+1;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		int n=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length+1;j++) {
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length-1;j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				 for(int k=0;k<3;k++) {
					 c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				 }
			}
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
