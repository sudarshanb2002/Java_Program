package mallow;

public class It1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=8;
		int a[]= {1,2,3,4,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					//System.out.print(a[i]+""+a[j]+""+a[k]);
					if(a[i]+a[j]+a[k]<=t) {
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}

}
