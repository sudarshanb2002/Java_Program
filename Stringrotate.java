package Weektest;

public class Stringrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="amazon";
		String st="azonam";
		//String temp=st+st;
		//System.out.println(temp);
		//System.out.println(str.substring(1,str.length()));
		//System.out.println(str.charAt(0));
		//System.out.print(str.substring(1,str.length())+str.charAt(0));
		int i=0;
		while(i<2) {
			str=str.substring(1,str.length())+str.charAt(0);
			//System.out.println(str);
			i++;
			
		}
		System.out.println(str);
		if(str==st) {
			System.out.println("true");
		}
		else {
			System.out.println("true");
		}
	}

}
