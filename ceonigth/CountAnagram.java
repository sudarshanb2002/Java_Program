package ceonigth;
import java.util.*;
public class CountAnagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char [] ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
				System.out.println(str.substring(i,i+1));
				System.out.println(str.substring(i+1,str.length()));
		}
	}

}
