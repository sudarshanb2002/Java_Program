package maventic;

public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5670157;
		int ma=0;
		while(n>0) {
			int a=n%1000;
			n=n/100;
			ma=Math.max(ma, a);
		}
		System.out.print(ma);
	}

}
