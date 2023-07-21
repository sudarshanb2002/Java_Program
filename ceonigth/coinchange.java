package ceonigth;
import java.util.*;
public class coinchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coins[] = {1,2,5,10,20,50,100,200,500,2000};
		
		int i=coins.length-1;
		System.out.print("Enter the target amount : ");
		int target = sc.nextInt();
		ArrayList arr = new ArrayList();
		
		while(i>-1)
		{
			if(coins[i]<=target)
			{
				target=target-coins[i];
				arr.add(coins[i]);
			}
			else
			{
				i--;
			}
		}
		for(int l=0;l<arr.size();l++)
		{
			System.out.println(" "+arr.get(l));
		}
	}

}
