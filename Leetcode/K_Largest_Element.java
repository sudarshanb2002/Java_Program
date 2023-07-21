package Leetcode;

import java.util.Arrays;

class Soll {
    public int findKthLargest(int[] nums, int k) {
    	/*int max=0;
    	while(k>0) {
    		 max=0;
        	int a=0;
    		for(int i=0;i<nums.length;i++) {
    			if(nums[i]>max) {
    				max=nums[i];
    				a=i;
    			}
    		}
    		nums[a]=0;
        	System.out.print(max);

    		k--;
    	}
    	//System.out.print(max);
    	*/
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length;i++) {
    		//System.out.print(nums[i]);
    	}
		System.out.print(nums[nums.length-k]);

    	
    	return 0;
    }
}
public class K_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soll f=new Soll();
		int n[]= {3,2,1,5,6,4};
		int a=2;
		f.findKthLargest(n,a);
	}

}
