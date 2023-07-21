package java_basics;

public class Longest__substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="babad";
		char c[]=str.toCharArray();
		char ch[]=new char[50];
		//System.out.print((c.length*2)+1);
		int a=0;
		for(int i=0;i<c.length*2;i=i+2) {
			ch[i]='#';
			ch[i+1]=c[a];
			a++;
		}
		ch[(c.length*2)]='#';
		for(int i=0;i<c.length*2+1;i++) {
			System.out.print(ch[i]);
		}
		int index[]=new int[c.length*2+1];
		for(int i=0;i<c.length*2+1;i++) {
			index[i]=0;
		}
		int n2=c.length*2+1;
		int k,j;
		
		for(int i=0;i<=n2;i++){
		    for(j=i+1,k=i-1;k<=n2;j<=n2;j++,k--){
		
	}

}
