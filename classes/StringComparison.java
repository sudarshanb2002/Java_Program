package classes;
import java.util.*;
public class StringComparison {
	static  String str(String s,int a) {
		for(int t=0;t<a;t++) {
			return s;
		}
		return s;
	}
public static void main(String[]agrs) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	int k=scan.nextInt();
	char[] ch=s.toCharArray();
	//int i=0;
	int var=ch.length;
	for(int i=0;i<s.length();i++){
		System.out.println(str(s,k));
	}
}
}
