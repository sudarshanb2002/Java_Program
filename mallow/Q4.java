package mallow;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int a[]= {8,4,2,1};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int tem=a[i];
					a[i]=a[j];
					a[j]=tem;
					count++;
				}
			}
		}
		System.out.print(count);
		for(int i=0;i<a.length;i++) {
			//System.out.print(a[i]+" ");
		}
	}

}
