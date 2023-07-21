package java_basics;

import java.util.Scanner;
public class input {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner myobj=new Scanner(System.in);
		int a=myobj.nextInt();
	//	System.out.println(""+a);
		if(a%3==0) {
			System.out.println("divisible"+a);
			for(int i=0;i<3;i++) {
				sum+=a;
			}
			}
		else {
			System.out.println("not divisible"+a);
		}
		System.out.println(""+(sum%10));
		myobj.close();

	}

}
