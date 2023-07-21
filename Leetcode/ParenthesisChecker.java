package Leetcode;
import java.util.*;
public class ParenthesisChecker {
	static boolean isValid(String s) {
		Stack<Character> stk=new Stack<>();
		int num=s.length();
	for(int i=0;i<num;i++){
	    	char ch=s.charAt(i);
	    if(ch=='(' || ch=='{' || ch=='['||ch=='<'){
	        stk.push(ch);
	    }
	    
	    char temp;
	    switch(ch){
	        case ')':
	            temp=stk.pop();
	            if(ch==')'&&(temp=='{'&&temp=='['&&temp=='<')){
	                return false;
	            }
	            break;
	            case '}':
	                temp=stk.pop();
	            if(ch=='}'&&(temp=='('&&temp=='['&&temp=='<')){
	                return false;
	            }
	            break;
	            case ']':
	                temp=stk.pop();
	                if(ch==']'&&(temp=='('&&temp=='{'&&temp=='<')){
	                    return false;
	                }
	                break;
	            case '>':
	                temp=stk.pop();
	                if(ch=='>'&&(temp=='('&&temp=='{'&&temp=='[')){
	                    return false;
	                }
	                break;     
	    }
	        
	    }
	int count=0;
	for(int i=0;i<s.length();i++) {
		char chh=stk.pop();
		if(chh=='{') {
			count=count+1197;
		}
		else if(chh=='(') {
			count=count+3;
		}
		else if(chh=='[') {
			count=count+57;
		}
		else if(chh=='<') {
			count=count+25137;
		}
	}
	System.out.print(count);
	    return stk.isEmpty();
	    	        
	    	}
		public static void main(String[] args) {
		String str="[({(<(())[]>[[{[]{<()<>>";
		isValid(str);
		//String str="()[]{}";
		 System.out.print(isValid(str)
				 );
				
	}

}
