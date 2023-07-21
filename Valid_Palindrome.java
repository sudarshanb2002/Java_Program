import java.util.*;
public class Valid_Palindrome {

	public static void main(String[] args) {
		//String s="A man, a plan, a canal: Panama";
		String s="a.";
		
		s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		String temp1=s.replaceAll("[:, ]","").toLowerCase();
		int start=s.length()-1;
		int end=s.length()-1;
		String temp="";
		for(int i=start;i>=0;i--) {
			for(int j=end;j>=0;j--) {
				if(s.charAt(end)!=' ') {
					//System.out.print(s.charAt(end));
					temp+=s.charAt(end);
					start=end-1;
					
				}
				end--;
				
			}
		}
		System.out.print(temp+" ");
		//System.out.print(temp1);	
		System.out.print(temp1.equals(temp));
		//return temp1.equals(temp);
				
}
}