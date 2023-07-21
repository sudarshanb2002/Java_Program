package Payoda;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {2,1,3,4,6,5};
		int a[]= {2,1,5,4,6,7};
		int count=0;
		int res=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>0) {
				res=Math.min(a[i],a[j])*(j-i-1);
				count=Math.max(res,count);
			}
			//System.out.println(res);
			//System.out.println(count);
		}
		//break;
	}
	System.out.println(count);
	//System.out.print(count*2);
	}
}
