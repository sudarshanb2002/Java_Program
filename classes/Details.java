package classes;

import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Name na=new Name();
		age agee=new age();
		System.out.print("ENTER NO. OF EMPLOYEE");
		int n=scan.nextInt();
		na.name(n);
		agee.age(n);

	}

}
