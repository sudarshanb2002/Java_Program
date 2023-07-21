package mallow;
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geeksforgeeks";
		char ch[]=str.toCharArray();
		//char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int a[]=new int[26];
		//int i,j;
		/*for(i=0;i<ch.length;i++) {
			int sum=1;
			for(j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					sum++;
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ') {
				System.out.println(ch[i]+" "+sum);
			}
			//System.out.println(ch[i]+" "+sum);
		}*/
	
		for(int i=0;i<ch.length;i++) {
			int sum=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					sum++;
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ') {
				a[ch[i]-'a']=sum;
			}
			//a[ch[i]-'a']=sum;
			//System.out.println(a[ch[i]-'a']);
		}
		//Arrays.sort(a);
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}*/
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		int max=0;
		/*for(int i=0;i<a.length;i++) {
				if(a[i]>max) {
					char var=(char) ((char)'a'+i);
					System.out.println(var +" "+a[i]);	
					max=a[i];	
				}
			}*/
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]&&a[i]!=0) {
					char var=(char) ((char)'a'+i);
					System.out.println(var +" "+a[i]);
					max=a[j];
				}
				else if(a[i]<a[j]&&a[i]!=0) {
					char var=(char) ((char)'a'+i);
					System.out.println(var +" "+a[i]);
					//max=a[j];
					max=a[i];
				}
				break;
			}
		}
		}
	}


