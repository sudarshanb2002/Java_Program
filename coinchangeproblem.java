import java.util.*;
public class coinchangeproblem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int a[]={1, 2, 5, 10, 20, 50, 100,200, 500, 2000};
		int a[] = {1,2,5};
		int N=scan.nextInt();
		int[][] min=new int[a.length][N+1];
		//int N=scan.nextInt();
		//int i;
		for(int i=0;i<a.length;i++) {
			min[i][0]=0;
		}
		
		for(int i=1;i<a.length;i++) {
			for(int j=1;j<N;j++) {
				if(i==1&&j<a[i]) {
					min[i][j]=0;
				}
				else if(i==1) {
					min[i][j]=1+min[1][j-a[1]];
				}
				else if(j<a[i]) {
					min[i][j]=min[i-1][j];
				}
				else {
					min[i][j]=Math.min(min[i-1][j],1+min[1][j-a[1]]);
				}
			}
		}
//System.out.print(min[a.length][N]);
		for(int i=0;i<min.length;i++) {
			for(int j=0;j<min.length;j++) {
				System.out.print(min[i][j]);
			}
			System.out.println();
		}
	}

}
