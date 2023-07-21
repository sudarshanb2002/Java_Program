package week05;
import java.util.*;
class Employee{
	public static int[]   getinfo() {
		Scanner scan=new Scanner(System.in);
		int[] salary=new int[3];
		int [] no=new int[3];
		for(int i=0;i<1;i++) {
			salary[i]=scan.nextInt();
			no[i]=scan.nextInt();
		}
		return salary;
		
	}
	public static  addsal(int[] a) {
		Employee emp=new Employee();
		int sum=0;
		emp.getinfo();
		for(int i=0;i<1;i++) {
			if(a[i]<500) {
				sum+=10;
			}
		}
		System.out.print(sum);
		return sum;
		
	}
}
public class Test06 {
public static void main(String[]agrs) {
	Employee emp=new Employee();
	emp.addsal();
	
}
}
