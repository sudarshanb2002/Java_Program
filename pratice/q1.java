package pratice;

public class q1 {

	public static void main(String[] args) {
		//int a[]= {100,80,60,70,60,75,85};
		int a[]= {85,75,60,70,60,80,100};
		int ans[]=new int[a.length];
		ans[0]=1;
		int b=a.length-1;
		for(int i=a.length-1;i>0;i--) {
			int count=1;
			for(int j=i-1;j>0;j--) {
				if(a[i]>a[j]) {
					count++;
				}
				if(a[i]<a[j]) {
					break;
				}
			}
			ans[b]=count;
			b--;
			//System.out.print(count);
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]);
		}
	}

}
