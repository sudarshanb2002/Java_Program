package Weektest;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		int n=13;
		int count=0;
		while(n>0) {
			if(n%10==1) {
				count++;
			}
			if(n/10==1) {
				count++;
			}
			n--;
		}
		System.out.print(count);
		

	}

}
