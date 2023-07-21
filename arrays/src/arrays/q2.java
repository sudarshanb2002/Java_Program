package arrays;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {3,4,6,6,3};
		
		//int a[]= {4,4,3,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int min=a[0];
		int count=0;
		for(int i=0;i<a.length;i++) {
			count+=a[i]-min;
		}
		System.out.print(count);
		//System.out.println(min);
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>=min) {
					count++;
				}
				else {
					break;
				}
			}
			break;
		}*/
		//int count=0;
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[j]=a[j]-1;
					count++;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}*/
		//System.out.println(count);

	}

}
