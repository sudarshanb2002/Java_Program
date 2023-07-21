package Leetcode;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      char s[] = {'h','a','n','n','a','h'};
		      for(int i=0;i<s.length;i++){
		          System.out.print(s[i]);
		      }
		      System.out.println();
		      int start=0;
		      int last=s.length-1;
		      char[] temp= new char[s.length];
		      for(int i=0;i<Math.ceil(s.length/2+1);i++){
		          //if(i!=last){
		          char ch=s[i];
		          char ch1=s[last];
		          temp[i]=ch1;
		          temp[last]=ch;
		          last--;    
		         //}
		      }
		      for(int i=0;i<s.length;i++){
		          System.out.print(temp[i]);
		      }
		      
		    }
		
	}


