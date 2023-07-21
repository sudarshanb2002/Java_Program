package Leetcode;

import java.util.*;

public class Best_Time_to_Buy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		//7,6,4,3,1
		int max=0;
		int res;
		int ma;
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[i]<prices[j]) {
					res=prices[j]-prices[i];
					max=Math.max(res,max);
					//System.out.print(max);
				}
				else {
					break;
				}
			}
		}
		
		System.out.print(max);

	}

}
