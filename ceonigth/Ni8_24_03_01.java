package ceonigth;
import java.util.*;
 class subclass {
  subclass() {
	 Scanner sc=new Scanner(System.in);
	 int[][] a=new int[20][20];
	 int[][] b=new int[20][20];
	 for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}

 }
 subclass() {
	 Scanner scc=new Scanner(System.in);
	 int[][] a=new int[20][20];
	 int[][] b=new int[20][20];
	 for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=scc.nextInt();
			}
		}
	
 }
}
 
public class Ni8_24_03_01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] a=new int[20][20];
		int[][] b=new int[20][20];
		int[][] mul=new int [20][20];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			b[i][j]=scan.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mul[i][j]=0;   
				for(int k=0;k<3;k++) {
				mul[i][j]+=a[i][k]*b[j][k];	
				}
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mul[i][j]);
			}
			System.out.println();
		}
	}

}
