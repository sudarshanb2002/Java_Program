package java_basics;

public class permutation {
	static void perumu(int[] a,int fi) {
		if(fi==a.length-1) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]);	
			}
			System.out.println();
			return;
		}
		for(int i=fi;i<a.length;i++) {
			swap(a,i,fi);
			perumu(a,fi+1);
			swap(a,i,fi);
		}
			
}
	static void swap(int[] a,int i,int fi) {
		int temp=a[i];
		a[i]=a[fi];
		a[fi]=temp;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2};
		perumu(a,0);

	}

}
