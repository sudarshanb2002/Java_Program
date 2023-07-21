
public class Stringpalindrom {
	 static String reverse(String s){
	        String temp="";
	        for(int i=s.length()-1;i>=0;i--){
	            temp=temp+s.charAt(i);
	        }
	        return temp;
	    }
	    public static  String firstPalindrome(String[] words) {
	        String result="";
	         for(int i=0;i<words.length;i++){
	           if(words[i].equals(reverse(words[i]))){
	              result=words[i];
	              break;
	           }
	       }
	       return result;
	    }
	    public static void main(String[] args) {
	        String[] words = {"abc","car","ada","racecar","cool"};
	        System.out.print(firstPalindrome(words));
	    }

}
