package week05;

public class flames {

	public static void main(String[] args) {
		String str="sudarshan";
		String st="dhanu";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++){
			System.out.print(ch[i]);
		}
		char[]	ch1=st.toCharArray();
		for(int i=0;i<st.length();i++) {
			System.out.print(ch1[i]);
		}
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<st.length();j++) {
				if(ch[i]==ch1[j]) {
					System.out.print(ch[i]);
				}
			}
	}
	for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}
		System.out.println(str.length());
		System.out.println(st.length());
	}

}
