import java.util.*;
public class Quicksort {
	static void quicksort(int a[],int low,int high) {
		low=0;
		high=high/2;
		int mid =(low+high)/2;
		int i=low;
		int j=high;
		int pivot =a[mid];
		//i=0 j=6
		int count=0;
		while(i<j){
			while(a[i]<pivot) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
				count++;
			}
		}
		if(low<j) 
			quicksort(a,low,j);
		
		if(high>i) 
			quicksort(a,i,high);
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=6;
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		quicksort(ar,0,ar.length-1);
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
