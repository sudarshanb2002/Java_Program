package Leetcode;
import java.util.*;
class Solut {
    public void topKFrequent(int[] nums, int k) {
    	int a[]=new int[k];
    	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>(); 
    	for(int i=0;i<nums.length;i++) {
			int count=1;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
					nums[j]=0;
				}
			}
			if(nums[i]!=0) {
				//System.out.println(nums[i]+" "+count);
				hm.put(nums[i], count);
			}
			
		}
    	//System.out.print(hm);
    	List<Map.Entry<Integer, Integer> > list
        = new ArrayList<Map.Entry<Integer, Integer> >(
            hm.entrySet());
			Collections.sort(
		            list,
		            new Comparator<Map.Entry<Integer, Integer> >() {
		                public int compare(
		                    Map.Entry<Integer, Integer> o1,
		                    Map.Entry<Integer, Integer> o2)
		                {
		                    if (o1.getValue() == o2.getValue())
		                        return o2.getKey() - o1.getKey();
		                    else
		                        return o2.getValue()
		                            - o1.getValue();
		                }
		            });
			System.out.print(list);
        for (int i = 0; i <k; i++) {
            System.out.print(list.get(i).getKey() + " ");
            a[i]=list.get(i).getKey();
    }
       

    	}}
    
public class kfrequent_answer {
	public static void main(String []agrs) {
		int n[]= {3, 1, 4, 4, 5, 2, 6, 1};
		int k=2;
		Solut sol=new Solut();
		sol.topKFrequent(n, k);
		
	}
}
