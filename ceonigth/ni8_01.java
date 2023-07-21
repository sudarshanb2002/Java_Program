package ceonigth;
import java.util.*;
public class ni8_01 {
	public static void main(String agrs[]) {
		ArrayList<String>list=new ArrayList<>();
		list.add("item 1");
		list.add("item 2");
		list.add("item 3");
		list.add("item 4");
		ArrayList<String>list1=new ArrayList<>();
		list1.add("item 1");
		list1.add("item 2");
		list1.add("item 3");
		list1.add("item 4");
		list1.add("item 5");
		Iterator<String> it=list.iterator();
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator<String> it1=list1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}*/
		if(list.containsAll(list1)==true) {
			System.out.print("Arrays are equal!");
		}
		else {
			System.out.print("Arrays are not equal");
		}
	}
}
