package Leetcode;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int res=0;
		int nums[]= {2,2,1};
		for(int i=0;i<nums.length;i++) {
			a=a^nums[i];
		}
		System.out.print(a);
		
	}

}
