package monkTest;

import java.util.Scanner;

public class Cpattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n/2-2;i++) {
			for(int j=0;j<n/2+1;j++){
				if(i==0&&j>2&&j<5) {
					System.out.print("##");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2+1;j++) {
			 if(i==n/2&&j==0) {
					System.out.print("##");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
