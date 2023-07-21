package Leetcode;

public class First_Unique_Character_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String	s = "loveleetcode";
	 char ch[]=s.toCharArray();
	 int n=s.length();
	String res=" ";
	 /*for(int i=0;i<s.length();i++) {
		 for(int j=i+1;j<s.length();j++) {
			 if(ch[i]==ch[j]) {
				 res+=ch[i];
				 System.out.println(res);
			 }
			 else {
				 System.out.println("no");
			 }
		 }
	 }*/
	String stt=" ";
	 for(int i=0;i<s.length();i++) {
		 //System.out.println(ch[i]);
		 //System.out.println(s.substring(i+1,s.length()));
		stt+=ch[i];
		System.out.println(stt);
		System.out.println(s.substring(i+1,s.length()));
		if(stt.contains(s.substring(i+1,s.length()))!=true) {
			System.out.print(stt);
			//break;
		}
		else {
			stt=" ";
		}
	 }
	}

}
