package monkTest;
import java.util.Scanner;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp;
		int a=7;
		String str="susa";
		//str.toCharArray()
		char[] ch=new char[n];
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			ch[i]=(char)a[i].toCharArray();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
		for(int i=0;i<n;i++) {
			//System.out.printf("%d",sizeof(a[i]));
		}
	}
}
