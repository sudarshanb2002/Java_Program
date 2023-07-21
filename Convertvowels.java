package Weektest;
import java.util.*;
public class Convertvowels {
public static void main(String[] agrs) {
	String str="GeeksforGeeka";
	char ch[]=str.toCharArray();
	/*for(int i=0;i<str.length();i++) {
		if(ch[i]=='a') {
			ch[i]=Character.toUpperCase(ch[i]);
		}
		else if(ch[i]=='e') {
			ch[i]='E';
		}
		else if(ch[i]=='i') {
			ch[i]='I';
		}
		else if(ch[i]=='o') {
			ch[i]='O';
		}
		else if(ch[i]=='u') {
			ch[i]='U';
		}
		}*/
	for(int i=0;i<str.length();i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			ch[i]=Character.toUpperCase(ch[i]);
		}
	}
	for(int i=0;i<str.length();i++) {
		System.out.print(ch[i]);
	}
	}
}

