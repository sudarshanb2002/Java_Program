package maventic;

public class starprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
