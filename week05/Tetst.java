package week05;

public class Tetst {

	public static void main(String[] args) {
		int a[]= {0,1,3,5,6,8,12,17};
		int[] b=new int [a.length];
		int i,j;
		for(i=0;i<a.length;i++) {
			//int k=1;
			for(j=i+1;j<a.length;j++) {
				b[i]=a[j]-a[i];
				//System.out.print(b[i]+" ");
			}
			j=j;
			i=j;
			
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]);
		}
	}

}
