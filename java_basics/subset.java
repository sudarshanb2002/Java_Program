package java_basics;
import java.util.*;
public class subset {
	static void subset(int ar[],int size,int index,int sol[]) {
		if(index==size) {
			for(int i=0;i<size;i++) {
				if(sol[i]==1) {
					System.out.print(ar[i]);
				}
				
			}
			System.out.println();
		}
		else {
			sol[index]=1;
			subset(ar,size,index+1,sol);
			sol[index]=0;
			subset(ar,size,index+1,sol);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5};
		int index=0;
		int sol[]=new int[a.length];
		subset(a,a.length,index,sol);
	}

}
