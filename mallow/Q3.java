package mallow;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,7,8,6,2,1};
		//output: 3 7 4 8 2 6 1 
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(i%2==0) {
					if(a[i]>a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					break;
				}
				if(i%2!=0) {
					if(a[i]<a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					break;
				}	
				}
			}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		}
	}


