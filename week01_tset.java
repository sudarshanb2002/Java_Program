package Weektest;
import java.util.*;
public class week01_tset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedHashSet<Integer> link=new LinkedHashSet<>();
		  Scanner scan=new Scanner(System.in);
		  int n=scan.nextInt();
		  for(int i=0;i<n;i++) {
			  int num=scan.nextInt();
			  for(int j=0;j<num;j++) {
				  char ch=scan.next().charAt(0);
				  int value=0;
				  if(ch=='a') {
					  value=scan.nextInt();
					  link.add(value);
				  }
				  else if(ch=='c') {
					  value=scan.nextInt();
					  System.out.print(link.remove(value));
				  }
				  else if(ch=='d') {
					  value=scan.nextInt();
					  System.out.print(link.contains(value));
				  }
				  else if(ch=='e') {
					  System.out.print(link.size());
				  }
				  else if(ch=='b') {
					 
				  }
			  }
		  }
		 


	}
}
