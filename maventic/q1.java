package maventic;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,10,20,15};
		for(int i=0;i<a.length;i++) {
			for(int j=i-1,k=i+1;j>=0&&k<a.length;j--,k++) {
				if(a[i]>a[j]&&a[i]>a[k]) {
					System.out.print(a[i]);
				}
			}
		}
		
	}

}
