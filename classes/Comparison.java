package classes;
import java.util.*;
public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		String s=scan.next();
		int n=s.length();
		char[] ch=new char[s.length()];
		while(n!=0) {
		for(int i=0;i<k;i++) {
			ch[i]=s.charAt(i);
		}
		n--;
		}
		while(n!=0) {
		for(int i=0;i<k;i++) {
			System.out.print(ch[i]);
		}
		n--;
		}

	}

}
