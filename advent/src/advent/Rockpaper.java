package advent;
import java.util.*;
import java.util.Scanner;
public class Rockpaper {

	public static void main(String[] args){
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
int n=scan.nextInt();
char n1;
char n2;
//int i=0;
//int countn1=0;
int count=0;
int rock=1;
int paper=2;
int scissor=3;
int win=6;
int loss=0;
int draw=3;
for(int i=0;i<n;i++){
n1=scan.next().charAt(0);
n2=scan.next().charAt(0);
if(n1=='a'&&n2=='z'||n1=='c'&&n2=='x') {
	if(n2=='z'){
		count+=rock+win;
}
	else if(n2=='x') {
		count+=loss+rock;
	}
	System.out.println(count);
}
else if(n1=='c'&&n2=='y'||n1=='b'&&n2=='z'){
	if(n2=='y') {
		count+=win+scissor;
	}
	else{
		count+=loss+scissor;
	}
	System.out.println(count);
}
else if(n1=='b'&&n2=='x'||n1=='a'&&n2=='y') {
	if(n2=='y') {
		count+=win+paper;
	}
	else if(n2=='x'){
		count+=rock+loss;
	}
	System.out.println(count);
}
else if(n1=='a'&&n2=='x'||n1=='b'&&n2=='y'||n1=='c'&&n2=='z'){
if(n2=='x') {
	count+=draw+rock;
}	
else if(n2=='y'){
	count+=draw+paper;
}
else if(n2=='z') {
	count+=draw+scissor;
}
System.out.println(count);
}
}
System.out.println(count);
//System.out.println(countn2);
}
}
