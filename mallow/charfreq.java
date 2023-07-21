package mallow;

import java.util.*;
import java.util.Map.Entry;

public class charfreq{
	public static void main(String args[])
	{
		String s1="geeks for geeks";
		char ch[]=s1.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ')
			{
				hm.put(ch[i],count);
			}
		}
		
		System.out.println(hm);
		for(Set<Entry<Character, Integer>> map=hm.entrySet();;) {
			System.out.println(((Object) map).getkey()+((Entry<Character, Integer>) map).getValue());
		}
	}
}
