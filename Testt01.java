package Weektest;
import java.util.Stack;
public class Testt01 {
		public static void main(String[] args) {
		String str="[({(<(())[]>[[{[]{<()<>>";
		Stack<Character> stk=new Stack<>();
		int num=str.length();
		  int count1=0;
		  int count2=0;
		  int count3=0;
		  int count4=0;
		for(int i=0;i<num;i++){
	    	char ch=str.charAt(i);
	    if(ch=='(' || ch=='{' || ch=='['||ch=='<'){
	        stk.push(ch);
	    }
	    else if(stk.empty()){
	        
	    }
	    char temp;
	    switch(ch){
	        case ')':
	        	 temp=stk.pop();
	        	if(ch==')'&&(temp=='{'&&temp=='['&&temp=='<')){
	                count1=count1+3;
	            }
	        	System.out.print(count1);
	        	break;
	        case '}':
                temp=stk.pop();
            if(ch=='}'&&(temp=='('&&temp=='['&&temp=='<')){
            	count2=count2+1197;
            }
            System.out.print(count2);
            break;
	        case ']':
                temp=stk.pop();
                if(ch==']'&&(temp=='('&&temp=='{'&&temp=='<')){
                	count3=count3+57;
                }
                System.out.print(count3);
                break;
	        case '>':
                temp=stk.pop();
                if(ch=='>'&&(temp=='('&&temp=='{'&&temp=='[')){
                	count4=count4+25137;
                }
                System.out.print(count4);
                break;
		}
	}
		System.out.println();
for(int i=0;i<str.length();i++) {
	char chh=stk.pop();
	if(chh=='{') {
		count2=count2+1197;
	}
	else if(chh=='(') {
		count1=count1+3;
	}
	else if(chh=='[') {
		count3=count3+57;
	}
	else if(chh=='<') {
		count4=count4+25137;
	}
}
int total=count1+count2+count3+count4;
System.out.print(total);
}}