package week05;
import java.util.*;
class com{
	public static void add(int ar[],int br[]) {
		int sum=0;
		int com=0;
		for(int i=0;i<2;i++) {
			sum=ar[0]+br[0];
		}
		for(int i=0;i<2;i++) {
			com=ar[1]+br[1];
		}
		System.out.println(sum+"+"+com+"i");
	}
	public static void sub(int arr[],int brr[]) {
		int sum=0;
		int com=0;
		for(int i=0;i<2;i++) {
			sum=arr[0]-brr[0];
		}
		for(int i=0;i<2;i++) {
			com=arr[1]-brr[1];
		}
		System.out.println(sum+"+"+com+"i");
	}
	public static void mul(int arrr[],int brrr[]) {
		int sum=0;
		int com=0;
		int sum1=0;
		int com1=0;
		for(int i=0;i<2;i++) {
			sum=arrr[0]*brrr[0];
			com=arrr[0]*brrr[1];
		}
		for(int i=0;i<2;i++) {
			sum1=arrr[1]*brrr[0];
			com1=arrr[1]*brrr[1];
		}
		System.out.println(sum-com1+"+"+(com+sum1)+"i");
	}
}
public class complex {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		com comp=new com();
		int[] a=new int[5];
		int[] b=new int[5];
		for(int i=0;i<2;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<2;i++) {
			b[i]=scan.nextInt();
		}
	comp.add(a, b);
	comp.sub(a, b);
	comp.mul(a, b);
 }
}
