package Leetcode;
import java.util.*;
class Sol {
    public int longestConsecutive(int[] nums) {
 HashSet<Integer>hm=new HashSet<>();
 ArrayList<Integer> arr=new ArrayList<Integer>();
 for(int i=0;i<nums.length;i++) {
	 hm.add(nums[i]);
 }
System.out.print(hm);

int max=0;
for(int i=0;i<nums.length;i++) {
	int count=0;
	int num=nums[i];
	if(hm.contains(num-1)==true) {
		continue;
	}
	while(hm.contains(num)) {
		count++;
		num++;
	}
	max=Math.max(count,max);
}
System.out.print(max);
return 0;  
    }
}
public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,3,7,2,5,8,4,6,0,1};
		Sol s=new Sol();
		s.longestConsecutive(a);
	}

}
