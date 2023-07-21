package Leetcode;

public class Sign_of_the_Product_of_an_Array_1822_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-1,-2,-3,-4,3,2,1};
		int prod1=1;
		int count=0;
		int prod2=1;
		for(int i=0;i<nums.length;i++) {
			prod1=prod1*nums[i];
		}
		System.out.println(prod1);
		//System.out.print(-1*1);
	}

}
