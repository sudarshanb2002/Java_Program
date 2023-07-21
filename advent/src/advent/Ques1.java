package advent;
import java.util.*;
public class Ques1 {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		Stack<Integer> stk1=new Stack<Integer>();
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			stk.push(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			stk1.push(stk.pop());
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(stk1.pop());
		}
		
	}

}
