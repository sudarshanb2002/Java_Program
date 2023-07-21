package maventic;
import java.util.*;

public class diagonalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,6,3,6,1};
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]!=a[j]) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.print(a[i]);
			}
			
		}
		
		
		}	
	}
