package Weektest;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=8;
	        int fi=0;
	        int las=1;
	        while(n-1>0){
	        	//System.out.print(fi);
	            for(int i=0;i<fi;i++){
	                System.out.print(fi);
	            }
	            int temp=fi;
	            fi=fi+las;
	            //System.out.print(fi);
	            las=temp;
	            System.out.println();
	            n--;
	        }
	}

}
