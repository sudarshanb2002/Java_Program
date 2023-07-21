package pattern;

import java.util.Scanner;
public class Hpattern {
public static void  Hpattern(char c) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n*2;i++) {
		for(int j=0;j<n;j++) {
			if(j==0||j==n-1) {
				System.out.print("*");
			}
			else if(i==n-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
