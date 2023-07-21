package arrays;

import java.util.*;
public class arrr {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				if(j==0||j==num-2) {
				System.out.print("##");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				if(i==0) {
				System.out.print("$");
			}
		}
		}	
		System.out.println();
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				if(j==0||j==num-1) {
				System.out.print("##");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
		

}
}
