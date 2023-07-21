package java_basics;

import java.util.Arrays;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,0};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {	
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>=0&&(a[i]+1)!=a[j]){
						System.out.print(a[j]+""+(a[i]+1));
						break;	
				}
			}
		}
	}

}
