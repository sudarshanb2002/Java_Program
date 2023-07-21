package java_basics;

public class encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner (System.in);
		char[] str="aaaabbbccdefaa".toCharArray();
		int start=0;
		int count=0;
		int st=0;
			st=start;
			for(int i=st;i<str.length;i++) {
				 count=1;
				for(int j=i+1;j<str.length;j++) {
					if(str[i]==str[j]) {
						count++;
						start++;
					}
					else {
						System.out.print(str[i]+" "+count);
						i=j;
						break;
					}
				}
			}
		}
		
		
		
	}

