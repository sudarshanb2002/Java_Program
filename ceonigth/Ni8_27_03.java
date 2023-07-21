package ceonigth;
public class Ni8_27_03 {
	public static void main(String[]agrs) {
		 String[] str= {"cat","bt","hat","tree"};
	       String string="atach";
	       int res=0;
	 for(int i=0;i<str.length;i++) {
		 String st=str[i];
		 int count=0;
		 for(int j=0;j<st.length();j++) {
			 for(int k=0;k<string.length();k++) {
				 if(st.charAt(j)==string.charAt(k)){
					 count++;
					 if(count==st.length()) {
						 System.out.print(st);
						 res+=st.length();
					 }
				 }
			 }
		 }
	 }  
System.out.print(res);	 
	}
}

