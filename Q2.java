package Weektest;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="catsandog";
		String st[]= {"cats","dog","sand","and","cat"};
		//String str="leetcode";
		//String st[]= {"leet","code"};
	
		//System.out.println(str.contains(st[1]));
		
		//System.out.println(str.replace(st[1]," "));
		//System.out.println();
		String stt=" ";
		int count=0;
		for(int i=0;i<st.length;i++) {
			//System.out.println(str.contains(st[i]));
			if(str.contains(st[i])==true)
			{
				stt=str.replace(st[i]," ");
				count++;
			}
			//System.out.println(stt);
		}
		if(count==st.length) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}

	}

}
