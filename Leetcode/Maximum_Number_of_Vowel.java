package Leetcode;
public class Maximum_Number_of_Vowel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="aeiou";
		int l=2;
		int k=2;
		char ch[]=st.toCharArray();
		String vowel="aeiou";
		//int count=0;
		int ma=0;
		int count=0;
	for(int i=0;i<st.length();i++) {
	 count=0;
		if(k>st.length()) {
			break;
		}
		else {
			String str=st.substring(i,k);
			//System.out.println(st.substring(i,k));
			for(int a=0;a<l;a++) {
				if(str.charAt(a)=='a'||str.charAt(a)=='e'||str.charAt(a)=='i'||str.charAt(a)=='o'||str.charAt(a)=='u') {
					count++;
				}
			}
			ma=Math.max(ma, count);
		}
	k++;	
	}
		
	System.out.print(ma);	
	}
}
