package advent;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		int count2=0;
		int count3=0;
		int[][] a= {{0,1,0},{1,1,0},{1,1,1}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==0){
					if(a[i][j]==1){
						count1++;
					}
				}
				else if(i==1) {
					if(a[i][j]==1) {
						count2++;
					}
				}
				else if(i==2) {
					if(a[i][j]==1) {
						count3++;
					}
				}
			}
		}
		System.out.println(count3);
		
	}

}
