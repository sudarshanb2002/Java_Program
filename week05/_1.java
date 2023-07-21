package week05;

public class _1 {

	public static void main(String[] args) {
		String str="dabAcCaCBAcCcaDA";
		int count=0;
		//char ch[]=str.toCharArray();
		if(str.contains("cC")){
			str.replaceFirst('c', 0);
		}
		System.out.print(str);
	}

}
