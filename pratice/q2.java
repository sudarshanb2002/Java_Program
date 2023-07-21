package pratice;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,1,4,2,5,3};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]&&a[i]!=0) {
					if(a[j]>a[i]) {
						count+=a[j]-a[i];
						System.out.print(a[i]+" "+a[j]+" ");
						a[j]=0;
						a[i]=0;
						break;
					}
				}
				else {
					break;
				}
			}
		}
		System.out.println(count);

	}

}
