package Leetcode;
import java.util.*;
class Soluti {
//{3, 1, 4, 4, 5, 2, 6, 1}, K = 2
public int[] topKFrequent(int[] nums, int k) {
        int ll[]=new int[k];
		int v=0;
		for(int i=0;i<nums.length;i++) {
			int count=1;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
					nums[j]=0;
				}
			}
			if(nums[i]!=0) {
				nums[i]=nums[i]*10+count;
			}
			
		}
		//System.out.println();
		
		
		int max1=0;
		int res1=0;
		while(k>0) {
			int max=0;
			int res=0;
			for(int i=0;i<nums.length;i++) {
				if((res1*10+max1)==nums[i]) {
					nums[i]=0;
				}
			}
		
			for(int i=0;i<nums.length;i++) {
				if(nums[i]!=0) {
					if(nums[i]%10>max) {
						max=nums[i]%10;
						res=nums[i]/10;
						max1=max;
						res1=res;
					}
				}
			}
			
			System.out.print(res+" ");
			ll[v]=res;
			v++;
		k--;	
		}
		
		
    return ll;
 
    }
}

public class k_frequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soluti sol=new Soluti();
		int[] n={3, 1, 4, 4, 5, 2, 6, 1};
		//int[] n= {-1,-1};
		int a=2;
		sol.topKFrequent(n,a);
	}

}
