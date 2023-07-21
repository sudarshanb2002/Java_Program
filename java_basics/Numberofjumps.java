package java_basics;

public class Numberofjumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int count=0;
		while(n>0) {
			if(n%2==0) {
				n=Math.round(n/2);
				count++;
			}
			else if(n%2!=0) {
				n=n-1;
				count++;
			}
		}
		System.out.print(count);
	}

}
