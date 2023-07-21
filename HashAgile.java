package Weektest;

public class HashAgile {

	public static void main(String[] args) {
		//String st="Breaking Bad";
		String st="TICTAC";
		int c=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(0)==st.charAt(i)) {
				c=i;
			}	
		}	
String q="";
String r="";
int x=0,y=c;
for(int i=0;i<c;i++) {
	if(x<c) {
		q=q+st.charAt(i);
		x++;
	}
	if(y<st.length()) {
		r=r+st.charAt(y);
		y++;
	}
	System.out.print(q+r);
	System.out.println();
}
}
}


