package pratice;

import java.util.Arrays;

public class q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char nuts[]= {'@','%','$','#','^'};
		char nuts[]= {'^','&','%','@','#','*','$','!'};
		char bolts[]= {'%','@','#','$','^'};
		Arrays.sort(nuts);
		Arrays.sort(bolts);
		for(int i=0;i<nuts.length;i++) {
			System.out.print(nuts[i]);
		}
		System.out.println();
		for(int i=0;i<bolts.length;i++) {
			System.out.print(bolts[i]);
		}
	}

}
