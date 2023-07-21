package interview;
import java.util.*;
public class Stringpermutaionrecursion {
	static void permutation(char ch[],int fi) {
		if(fi==ch.length-1) {
			System.out.println(ch);
			return;
		}
		else {
		for(int i=fi;i<ch.length;i++) {
			swap(ch,i,fi);
			permutation(ch,fi+1);
			swap(ch,i,fi);
			
		}	
		}
		
	}
	static char[] swap(char ch[],int i,int fi) {
		char temp=ch[i];
		ch[i]=ch[fi];
		ch[fi]=temp;
		return ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String str=scan.next();
		char ch[]=str.toCharArray();
		permutation(ch,0);
	}

}
