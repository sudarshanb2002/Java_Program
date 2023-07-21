package lucid;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=13;
		
		/*for(int i=1;i<=N;i++) {
		int temp=i;
		int pow=i;
		int ans=1;
		//System.out.print(pow);
		while(temp-->0) {
			ans=ans*pow;
		}
		//System.out.println((int)ans);
		
		}
		System.out.print((int)Math.pow(12,12));
		*/
		for(int i=1;i<=N;i++) {
		int base = i, power = i;
        int result = 1;
        while (power != 0){
            result =result * base;
            power--;
        }
        System.out.println((double)result);
	}

	}

}
