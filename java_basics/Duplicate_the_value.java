package java_basics;

public class Duplicate_the_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="RTC";
		char ch[]=str.toCharArray();
		char chh[]=new char[str.length()*2];
		int a=0;
		for(int i=0;i<chh.length;i=i+2) {
			chh[i]=ch[a];
			chh[i+1]=ch[a];
			a++;
		}
		for(int i=0;i<chh.length;i++) {
			System.out.print(chh[i]);
		}
	}

}
