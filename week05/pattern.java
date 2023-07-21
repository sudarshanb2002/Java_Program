package week05;
import java.util.*;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        int s=scan.nextInt();
	        int startr=0;
	        int endr=n-1;
	        int startc=0;
	        int endc=n-1;
	        while(n!=0){
	         for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(i==startr||i==endr||j==startc||j==endc){
	                    System.out.print(0);
	                }
	                else{
	                     System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	         startr++;
	         startc++;
	         endr+=-1;
	         endc+=-1;
	        n--;
	        //break;
	        }
	}

}
