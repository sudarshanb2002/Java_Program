package week05;
import java.util.*;
public class q1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]= {10,20,20,10,10,30,50,10,20};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}*/
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					sum++;
					i++;j++;
				}
				//break;
			}
		}
		System.out.println(sum);
	}

}
