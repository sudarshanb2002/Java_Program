package arrays;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> link=new LinkedList<Integer>();
		link.add(1);
		link.add(3);
		link.add(6);
		Iterator<Integer> it=link.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		link.addFirst(2);
		System.out.println();
		it=link.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		//System.out.print(link);
	}

}
