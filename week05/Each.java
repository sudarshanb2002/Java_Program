package week05;
import java.util.*;
public class Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
        int[][] a=new int[3][3];
      for(int[] i:a){
            for(int j=0;j<a.length;j++){
               i[j]=scan.nextInt();
            }
        }
        //System.out.println(Arrays.deepEquals(a,b));
        for(int []i:a){
            for(int j:i){
               System.out.println(j);
            }
            System.out.println();
        }
	}

}
