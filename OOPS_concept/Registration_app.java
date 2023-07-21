package OOPS_concept;
import java.util.*;
public class Registration_app {
	Registration_app(){
		Scanner sc=new Scanner(System.in);
		//Registration_app res=new Registration_app();
		//printt();
		System.out.println("ENTER YOUR NAME:");
		String name=sc.next();
		System.out.println("ENTER YOUR RES NO:");
		int number=sc.nextInt();
		System.out.println("ENTER YOUR PHNUM");
		int phnum=sc.nextInt();
		System.out.println("ENTER YOUR ADDRES:");
		String address=sc.next();
		printt();
		sc.close();
	}
	static void printt() {
		System.out.println("------------");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new  Scanner(System.in);
		//Registration_app re=new Registration_app();
		printt();
		System.out.println("ARE YOU WANT TO REGISTER, YES/NO?");
		printt();
		String s=scan.next();
		String ss="yes";
		if(s.equals(ss)) {
			Registration_app re=new Registration_app();
		}
		else {
			System.out.println("THANKS");
		}
		
	}

}
