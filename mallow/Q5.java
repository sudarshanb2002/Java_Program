package mallow;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  arr[] = {900, 940, 950, 1100, 1500, 1800};
		int  dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
		//int count=0;
		//int arr[]= {900,940};
		//int dep[]= {910,1200};
		//int arr[] = { 100, 300, 500 };
        //int dep[] = { 900, 400, 600 };
		
        Arrays.sort(arr);
        Arrays.sort(dep);
		int aa[]=new int[arr.length];
		int a=0;
		int b=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=a;j<dep.length;j++) {
				if(arr[i]<dep[j]) {
					System.out.println(arr[i]+" "+dep[j]);
					count++;
					aa[j]+=count;
					break;
				}
				}
			}
		int max=0;
		for(int i=0;i<aa.length;i++) {
			if(aa[i]>max) {
				max=aa[i];
			}
		}
		System.out.print(max);
		
		
	}

}
