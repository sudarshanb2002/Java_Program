package Weektest;
import java.util.*;
public class finger_test {
public static void main(String agrs[]) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int res=n%8;
	if(res==1) {
		System.out.print("thumb");
	}
	else if(res==2) {
		System.out.print("fore finger");
	}
	else if(res==3) {
		System.out.print("middle");
	}
	else if(res==4) {
		System.out.print("ring");
	}
	else {
		System.out.print("little");
	}
}
}
