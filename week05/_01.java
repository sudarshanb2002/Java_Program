package week05;
import java.util.*;
public class _01 {
public static void main(String[] agrs) {
	String str="dabAcCaCBAcCcaDA";
	int count=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(ch[i]=='c'&&ch[j]=='C') {
				ch[i]=0;
				ch[j]=0;
			}
			else if(ch[i]=='A'&&ch[j]=='a') {
				ch[i]=0;
				ch[j]=0;
			}
		}
	}
	System.out.println(str.length()-count+1);
	for(int i=0;i<str.length();i++) {
		System.out.print(ch[i]);
	}
	
}
}
