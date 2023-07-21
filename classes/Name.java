package classes;

import java.util.Scanner;

public class Name {
String[] name(int x) {
	Scanner sc=new Scanner(System.in);
	String[] arr=new String[x];
	for(int i=0;i<x;i++) {
		arr[i]=sc.next();
	}
	for(int i=0;i<x;i++) {
		System.out.println(arr[i]);
	}
	return arr;	
}
}
