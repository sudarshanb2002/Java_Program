package Weektest;
import java.util.*;
public class Empty {
	static String[] isValid(String s) {
		Stack<Character> stk=new Stack<>();
		String[] str=new String[s.length()];
		int num=s.length();
	for(int i=0;i<num;i++){
	    	char ch=s.charAt(i);
	    if(ch=='(' || ch=='{' || ch=='['){
	        stk.push(ch);
	    }
	    else if(stk.empty()){
	        System.out.print("");
	    }
	    char temp;
	    switch(ch){
	        case ')':
	            temp=stk.pop();
	            if(ch==')'&&(temp=='{'&&temp=='[')){
	            	System.out.print("");
	            }
	            break;
	            case '}':
	                temp=stk.pop();
	            if(ch=='}'&&(temp=='('&&temp=='[')){
	            	System.out.print("");
	            }
	            break;
	            case ']':
	                temp=stk.pop();
	                if(ch==']'&&(temp=='('&&temp=='{')){
	                	System.out.print("");
	                }
	                break;
	    }
	        
	    }
	    for(int i=0;i<s.length();i++) {
	    	System.out.print(stk.pop());
	    }
	    	  return str;      
	    	}
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str="()[]{}";
		isValid(str);
		//String str="()[]{}";
		 //System.out.print(output);
				
	}

}
