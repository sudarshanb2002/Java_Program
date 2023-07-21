package Weektest;

public class Removesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="maventicenti";
		String st="enti";
		char ch[]=str.toCharArray();
		char ch1[]=st.toCharArray();
		int a=0;
		for(int i=0;i<str.length();i++) {
			if(ch[i]==ch1[a]) {
				ch[i]=' ';
				int t=i+1;
				a++;
				while(a<st.length()) {
					if(ch[t]==ch1[a]) {
						ch[t]=' ';
						t++;
						a++;
					}
				}
				break;
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}
	}
}
