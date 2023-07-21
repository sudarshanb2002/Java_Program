package Leetcode;

public class Excel_Sheet_Column_Title {
public static String convertToTitle(int columnNumber) {
	char ch[]= "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	int first=0;
	int second=0;
	String res;
	if(columnNumber>26) {
		 first=(columnNumber/26)-1;
         second=(columnNumber%26)-1;
	     System.out.print(ch[first]+""+ch[second]);	
	     res=String.valueOf(ch[first]+""+ch[second]);
	}
	else {
		System.out.print(ch[columnNumber-1]);
		res=String.valueOf(ch[columnNumber-1]);
	}
	 
	return res;    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excel_Sheet_Column_Title ex=new Excel_Sheet_Column_Title();
		ex.convertToTitle(2147483647);
	}

}
