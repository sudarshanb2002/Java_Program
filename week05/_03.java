package week05;

public class _03 {

	public static void main(String[] args) {
		int a[]={0,1,1,0,1};
		//int a[]={1,0,0,0,0};
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++){
		    if(a[i]==0){
		        a[i]++;
		        for(int j=i+1;j<n;j++){
		            if(a[j]==0){
		                a[j]++;
		            }
		            else if(a[j]==1){
		                a[j]--;
		            }
		        }
		        count++;
		    }
		}
		System.out.println(count);
		for(int i=0;i<n;i++){
		   System.out.print(a[i]);
		}

	}

}
