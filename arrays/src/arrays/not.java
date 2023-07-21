package arrays;
import java.util.*;
public class not {
public static void main(String args[]) {
	ArrayList<Integer>ar=new ArrayList<Integer>();
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	Iterator it=ar.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	ArrayList<Integer>ar2=new ArrayList<Integer>();
	ar2.add(5);
	ar2.add(1);
	ar2.add(4);
	ar2.add(3);
	ar2.add(6);
	Iterator it2=ar2.iterator();
	while(it2.hasNext()) {
		System.out.println(it2.next());
	}	
	System.out.println();
	ar.retainAll(ar2);
	System.out.print(ar);
}
}
