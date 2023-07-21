package ceonigth;
import java.util.*;
public class Ni824_04 {
public static void main(String []agrs) {
	Scanner scan=new Scanner(System.in);
	//int[] a=new int[50];
	int a[]= {1,4,3,5,0,6,5,7,3,8,5,9,6,10,8,11,8,12,2,13,12,14};
	System.out.println(a.length);
	/*for(int i=0;i<11;i++) {
		System.out.println("Start:");
		a[i]=scan.nextInt();
		System.out.println("finish:");
		a[i+1]=scan.nextInt();
	}*/
for(int i=0;i<11;i++) {
	if(a[i+1]<a[i+2]&&a[i+2]<a[i+3]) {
		System.out.println(a[i+2]+" "+a[i+3]);
	}
} 
	}
}
