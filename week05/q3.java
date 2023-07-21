package week05;

public class q3 {

	public static void main(String[] args) {
		int n=16;
		for(int i=0;i<(n/2)-1;i++) {
			for(int j=0;j<(n/2)-1;j++) {
				if(i==j) {
					System.out.print(i+1);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<(n/2)-1;i++) {
			for(int j=0;j<(n/2)-1;j++) {
				if(j==(n/2)-1) {
					System.out.print(i+1);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
