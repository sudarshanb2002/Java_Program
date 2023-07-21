package week05;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,9,10,2,5,6};
		int count[];
		int[] b=new int[a.length];
		int low=0;
		int high=a.length;
		int mid=(low+high)/2;
		for(int i=0;i<a.length/2;i++){
			b[i]=a[i];
			count=1;
			}
		int n=low;
		int l=high;
		int m=mid;
		if(n<=l) {
			int temp=b[n];
			b[n]=b[l];
			b[l]=temp;
			count++;
		}
		for(int i=0;i<b.length/2;i++) {
			System.out.print(b[i]);
		}
			
		}
		
	}
