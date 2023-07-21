package advent;
import java.util.*;
public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int count=0;
		int count2=0;
		int count3=0;
		int count4=0;
		//int[][] a=new int[n1][n2];
		int a[][]= {{3,0,3,7,3},{2,5,5,1,2},{6,5,3,3,2},{3,3,5,4,9},{3,5,3,9,0}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(j==0) {
					count++;
				}
				else if(j>0&&i==0){
					count2++;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==0&&j==0||i==0&&j==n1-1||i==n1-1&&j==0||i==n1-1&&j==n1-1) {
					count3++;
				}
			}
		}
		System.out.println(count);
		System.out.println(count2);
		System.out.println(count3);
		int edge=(count*count2)-count3;
		System.out.println(edge);
		int n=0;
		/*for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(i==n||n<n1) {
					if(a[n][n]>a[n][n+1]) {
						count++;
					}
				}
			}
			n++;
		}*/
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==0){
					count4++;
				}
			}
		}
		System.out.println(count4);
		System.out.println();
		System.out.println(edge+count4);
	}

}
