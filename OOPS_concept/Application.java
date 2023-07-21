package OOPS_concept;
import java.util.*;
class info{
	 int num;
	 String name;
	 public info(String s) {
		 System.out.println(s);
		// String j=s;
		String[] ss= {"Mercedes","BMW"," Toyota"};
		System.out.print(ss.length+" ");
		int n=ss.length;
		for(int i=0;i<n;i++) {
			if(ss[i]==s) {
				System.out.println("yes");
			}
			else
				System.out.println("no");
		}
		//System.out.print(this.name);
	}
}
public class Application {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	//String a=scan.next();
	info app=new info("BMW");
	//String a=scan.next();
	//System.out.print(app.name);
	
}
}
