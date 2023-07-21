package advent;
import java.util.*;
public class day5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Stack<Character> stk1= new Stack<>();
		Stack<Character> stk2= new Stack<>();
		Stack<Character> stk3= new Stack<>();
		stk1.add('z');
		stk1.add('n');
		stk2.add('m');
		stk2.add('c');
		stk2.add('d');
		stk3.add('p');
		int n=scan.nextInt();
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		for(int i=0;i<n;i++) {
			if(n1==2&&n2==1) {
				char val=stk2.pop();
				stk1.push(val);
			}
			else if(n1==1&&n2==3) {
				char val=stk1.pop();
				stk3.push(val);
			}
		}
		Enumeration enu1= stk1.elements();
		Enumeration enu2 =stk2.elements();
		Enumeration enu3= stk3.elements();
		while (enu1.hasMoreElements()) {
            System.out.println("stack1:"+enu1.nextElement());
        }
		System.out.println();
		while (enu2.hasMoreElements()) {
            System.out.println("stack2"+enu2.nextElement());
        }
		System.out.println();
		while (enu3.hasMoreElements()) {
            System.out.println("stack3"+enu3.nextElement());
        }
	}

}
