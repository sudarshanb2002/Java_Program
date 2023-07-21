package Leetcode;

public class twosum {

	public static void main(String[] args) {
		int a[]= {5,7,1,2,8,4,3};
		int target=10;
		int ans[]=new int[a.length];
		int ab=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					ans[ab]=a[i];
					ans[ab+1]=a[j];
					ab=ab+2;
				}
			}
		}
	for(int i=0;i<ans.length;i++) {
		if(ans[i]!=0)
		System.out.print(ans[i]);
	}
	}

}
