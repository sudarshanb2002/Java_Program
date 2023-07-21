package mallow;

public class It2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=6;
		int count=0;
		int flag=0;
		System.out.print(n%2);
		while(n!=1) {
			/*if(n%2!=0&&n!=1) {
				for(int i=0;i<n;i++) {
					if(Math.pow(2,i)<=n) {
						n=(int)Math.pow(2,i);
					}
				}
			}*/
			if(n%2==0&&n!=1) {
				n=n/2;
			}
			count++;
		}
	
System.out.print(count);
}
}
