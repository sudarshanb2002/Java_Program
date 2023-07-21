package arrays;
import java.util.*;
public class priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(11);
		pq.add(12);
		pq.add(13);
		pq.add(14);
		Iterator it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.print(pq.peek());
		System.out.print(pq.remove());
		System.out.println();
		System.out.print(pq);


}
}