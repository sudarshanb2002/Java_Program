package Weektest;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int num=1;
		char ch=98;
		int flag=0;
		/*for(int i=0;i<num;i++) {
			for(int j=1;j<i+1;j++) {
				if(flag==0){
					System.out.print(i);
					flag=1;
				}
				else {
					System.out.print(ch);
					flag=0;
				}
			}
			System.out.println();
			ch++;
			num++;
		}
	for(int i=0;i<n;i++) {
		for(int j=0;j<i+1;j++) {
			if(flag==0) {
				num++;
				System.out.print(num);
				flag=1;
			}
			else if(flag==1) {
				ch++;
				System.out.print(ch);
				flag=0;
			}
			/*else if(flag==1&&j%2!=0) {
				num++;
				System.out.print(num);
				flag=1;
			}
		}
		System.out.println();
	}
int a=0;
for(int i=0;i<n;i++) {
	int temp=i+1;
	if(flag==0) {
		num++;
		while(temp-1>0) {
			System.out.print(num);
			temp--;
		}
		a++;
		flag=1;
	}
	else if(flag==1) {
		ch++;
		num++;
		while(temp-1>0) {
			System.out.print(ch);
			System.out.print(num);
			temp--;
		}
	a++;
	}
	System.out.println();
}
	for(int i=0;i<n;i++) {
		for(int j=0;j<i+1;j++) {
			if(i%2==0)
			if(flag==0) {
				System.out.print(num);
				flag=1;
				num++;
			}
			else if(flag==1&&i%2!=0) {
				System.out.print(ch);
				System.out.print(num);
				flag=0;
				ch++;
				num++;
			}
		}
		System.out.println();
	}*/
		int flag1=0;
		int flag2=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				if(i%2==0) {
					if(flag==0) {
						if(flag1==0) {
							System.out.print(num);
							num++;
							flag1=1;
						}
						else if(flag==1) {
							System.out.print(ch);
							ch++;
							flag1=0;
						}
						
					}
				}
				else if(i%2!=0) {
					if(flag2==0){
						System.out.print(ch);
						ch++;
						flag2=1;
					}
					else if(flag2==1) {
						System.out.print(num);
						num++;
						flag2=0;
					}
					
				}
			}
			System.out.println();
		}
	}

}
