package string;
import java.util.*;
public class comparet {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        String str=scan.nextLine();
	        int n=scan.nextInt();
	         char[] ch = str.toCharArray();
	         char temp[]=new char[str.length()];
	         for(int i=0;i<str.length();i++){
	             for(int j=0;j<n;j++){
	                 temp[j]=ch[j];
	             }
	         }
	          for(int i=0;i<str.length();i++){
	            System.out.print(temp[i]);
	        }
	       
	    }
}
