package Weektest;

public class Week03_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="dabAcCaCBAcCcaDA";
		String str1="";
		if(str.contains("cC")||str.contains("Aa")){
			//System.out.print(str.indexOf("cC"));
			 str1=str.replace("cC","").replace("Aa","");
		}
		System.out.println(str1);
		System.out.println(str1.length());
		
	}

}
