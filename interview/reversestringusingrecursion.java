package interview;
import java.util.Scanner;
public class reversestringusingrecursion {
	static String stringreverse(String s,String r,int i) {
		if(i<0) {
			return r;
		}
		return stringreverse(s,r+s.charAt(i),i-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		//stringreverse(s,"",s.length());
		System.out.print(stringreverse(s,"",s.length()-1));
		
	}

}
