package Leetcode;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[]= {1,8,6,2,5,4,8,3,7};
		int left=0;
		int right=height.length-1;
		int maxarea =0;
		while(left<right) {
			int length=right-left;
			int heights=Math.min(height[left],height[right]);
			int area=length*heights;
			maxarea=Math.max(maxarea, area);
			if(height[left]<height[right]) {
				left++;
			}
			else {
				right--;
			}
			
			
			
		}
		System.out.print(maxarea);
		

	}

}
