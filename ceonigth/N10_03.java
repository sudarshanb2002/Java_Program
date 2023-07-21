package ceonigth;

public class N10_03 {

	public static void main(String[] args) {
	String[] str= {"adc","wzy","abc"};
	char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int mid=str[0].length()/2;
	int mid1=(str[0].length()/2)-1;
	int mid2=(str[0].length()/2)+1;
	int n;
	char ch;
	char ch1;
	char ch3;
	char ch4;
	int jj=0;
	int kk=0;
	int[] first=new int[6];
	int[] second=new int[6];
	int[] ist=new int[3];
	int[] sst=new int[3];
	int [] finall=new int[6];
	for(int i=0;i<str.length;i++) {
		for(int j=0;j<str[i].length();j++) {
			for(int k=j+1;k<str[i].length();k++) {
			if(k==mid&&j==mid1) {
				//System.out.print(str[i].charAt(k));
				//System.out.print(str[i].charAt(j));
				ch=str[i].charAt(k);
				ch1=str[i].charAt(j);
				for(int l=0;l<a.length;l++) {
					if(a[l]==ch) {
						first[jj]=l;
					jj++;
					}
					else if(a[l]==ch1){
						first[jj]=l;
						jj++;
					}
				}
				
			}
			else if(k==mid2&&j==mid) {
				System.out.print(str[i].charAt(k));
				System.out.print(str[i].charAt(j));
				ch3=str[i].charAt(k);
				ch4=str[i].charAt(j);
				for(int l=0;l<a.length;l++) {
					if(a[l]==ch3) {
						second[kk]=l;
					kk++;
					}
					else if(a[l]==ch4){
						second[kk]=l;
						kk++;
					}
				}
			}
			}
		}
	}
	int max;
	int s=0;
	int f=0;
	for(int i=0;i<first.length;i++) {
		//System.out.print(first[i]+" ");
		for(int j=i+1;j<i+2;j++)
		{
			ist[s]=first[j]-first[i];
			s++;
		}
		i++;
	}
	System.out.println();
	for(int i=0;i<second.length;i++) {
		for(int j=i+1;j<i+2;j++) {
			sst[f]=second[i]-second[j];
			f++;
		}
		i++;
	}
	System.out.println();
	for(int i=0;i<ist.length;i++) {
		System.out.print(ist[i]);
	}
	System.out.println();
	for(int i=0;i<sst.length;i++) {
		System.out.print(sst[i]);
	}
	int suu=0;
	for(int i=0;i<ist.length;i++) {
		finall[suu]=ist[i];
		suu++;
		finall[suu]=sst[i];
		suu++;
		
	}
	System.out.println();
	for(int i=0;i<finall.length;i++) {
		System.out.print(finall[i]);
	}
	}
}
