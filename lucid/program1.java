package lucid;
import java.util.*;
public class program1 {
	/*public static int Pow ( int a , int b ) {  
	    int power = 1  ;  
	    for (int  i = 1 ; i < = b ; + + i ) {  
	        power = power * a ;  
	    }  
	    return power ;  
	} */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int a=1;
		int ans1 = 0;
		int ans2=0;
		int pow[]=new int[N];
		for(int i=0;i<N;i++) {
			int res=(int)Math.pow(i,i);
			pow[i]=res;
			
		}
		int po=1;
		int an=1;
		int re=1;
			
		for(int i=0;i<N;i++) {
			int LHS=N-(i*i);
			if(LHS>0) {
			for(int j=0;j<N;j++) {
				if(LHS==pow[j]) {
					//System.out.print(pow[j]+" ");
					//System.out.print(i);
					 ans1=pow[j];
					 ans2=LHS;
				}
				else {
					
				}
			}	
			}
		}
		if(ans1==ans2&&ans1!=0) {
			//System.out.print(" "+"yes");
		}
		else {
			//System.out.print(" "+"no");
		}

	}

}
