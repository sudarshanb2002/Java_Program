package maventic;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> st=new TreeSet<String>();
	st.add("red");
	st.add("yellow");
	st.add("green");
	Iterator it=st.iterator();
	while(it.hasNext()) {
		System.out.print(it);
	}
	}

}
