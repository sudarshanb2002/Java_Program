package HackerString;
import java.util.Scanner;
import java.util.*;
public class Anagram {

    static boolean isAnagram(String a, String b) {
    	ArrayList<String> al = new ArrayList<String>();
        // Complete the function
    	int count=0;
        char[] ch=a.toCharArray();
        char[] ch1=b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        Arrays.equals(ch,ch1);
        //java.util.Arrays.sort(ch);
        //java.util.Arrays.sort(ch1);
       /* for(int i=0;i<a.length();i++){
           if(ch[i]==ch1[i]){
               count++;
           }
        }
        if (count==a.length()){
           return true;
        }
        else{
        	return false;
        }*/
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
