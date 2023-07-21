package week05;
import java.util.*;
class info{
	public static void inpu() {
		Scanner scan=new Scanner(System.in);
		String[] st=new String[3];
		int[] year=new int[3];
		int[] salary=new int[3];
		String[] add=new String[3];
		for(int i=0;i<3;i++) {
			st[i]=scan.next();
			year[i]=scan.nextInt();
			salary[i]=scan.nextInt();
		add[i]=scan.next();
		}
		System.out.print("NAME"+"        ");
		System.out.print("YEAR OF JOIN"+"        ");
		System.out.print("ADDRESS"+"        ");
		for(int i=0;i<3;i++) {
			System.out.println();
			System.out.print(st[i]+"      ");
			System.out.print(year[i]+"        ");
			System.out.print(add[i]+"       ");
			System.out.println();
		}
	}
}
public class Test_05 {

	public static void main(String[] args) {
		info in=new info();
		in.inpu();
		
	}

}
