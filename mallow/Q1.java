package mallow;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geeks for geeks";
		//String str="ahjsjsaaajfgt";
		
		ArrayList<Character> a=new ArrayList<Character>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int sum=1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]&&ch[i]!=' '){
					sum++;
					//map.put(ch[i],sum);
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ')
			{
				a.add(ch[i]);
				b.add(sum);
			}
		}
		
		//int ans[]=new int[a.size()];
		for(int j=0;j<b.size();j++) {
			int max = b.get(j);
		for(int i=0;i<b.size();i++)
		{
			if(b.get(i)>max)
			{
				System.out.println(a.get(i)+" "+b.get(i));
				b.set(i, 0);
			}
		}
		}
	}

}
