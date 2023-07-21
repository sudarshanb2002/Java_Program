package Leetcode;
class Solution {
    public int bulbSwitch(int n) {
    	int [] a= new int[n];
    	for(int i=0;i<n;i++) {
    		a[i]=0;
    	}
    	for(int i=1;i<n;i++) {
    		for(int j=1;j<n;j++) {
    			if(i%j==0) {
    				if(a[j]==0) {
    					a[j]=1;
    				}
    				else if(a[j]==1) {
    					a[j]=0;
    				}
    			}
    		}
    	}
    	for(int i=0;i<n;i++) {
    		System.out.print(a[i]);
    	}
    	
     return 0;   
    }
}
public class BulbSwitcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		sol.bulbSwitch(4);
	}

}
