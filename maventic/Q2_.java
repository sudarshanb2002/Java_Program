package maventic;

public class Q2_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int a=5;
		int sum=0;
		int half=n/2;
		if(n%2==0) {
			System.out.print(0+" "+n);
			half--;
		}
		else {
			System.out.print(n);
		}
			for(int i=1;i<=half;i++) {
				System.out.print((-1)*i+" "+i);
			}
		
			
		//System.out.print(" "+n);
		//System.out.print(sum);
	}
}
//}
