package square;


import java.util.*;
public class square {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==0||i==num-1||j==0||j==num-1) {
					System.out.print("*");
				}
				else{
				    System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
