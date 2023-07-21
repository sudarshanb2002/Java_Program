package week;
import java.lang.reflect.Array;
import java.util.*;
class bag{
	public static void add(String s) {
		Scanner sc=new Scanner(System.in);
		coin co=new coin();
		note no=new note();
		if(s=="coin") {
			System.out.print("enter coin");
			int coin=sc.nextInt();
			co.setvalue(coin);
		}
		else if(s=="note") {
			System.out.print("enter note");
			int note=sc.nextInt();
			no.Setvalue(note);
		}
	}
}
class coin extends bag{
	public static void  setvalue(int val) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(val);
	System.out.print("coin set");
	}
	
}
class note extends bag{
	public static void  Setvalue(int val) {
		int [] a=new int[20];
		int i=0;
		a[i]=val;
}
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		bag bg=new bag();
		int n=scan.nextInt();
		String st=scan.next();
		System.out.print(st);
		bg.add(st);
		for(int i=0;i<n;i++) {
			st=scan.next();
			if(st=="coin") {
				bg.add("coin");
			}
			else if(st=="note") {
				bg.add("note");
			}
		}
	}

}
