package arrays;
import java.util.*;
public class tree {

	public static void main(String[] args) {
		TreeSet <String> st=new TreeSet<String>();
		st.add("a");
		st.add("b");
		st.add("c");
		st.add("d");
		st.add("e");
		Iterator it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator itt=st.descendingIterator();
		while(itt.hasNext()) {
			System.out.print(itt.next());
		}
		System.out.println();
		System.out.print(st.headSet("c",true));
	System.out.println(st.pollFirst());	
	System.out.println(st.pollLast());
	System.out.println();
	System.out.print(st.descendingSet());
	System.out.println();
	

	}

}
