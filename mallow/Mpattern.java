package mallow;

public class Mpattern {
public static void main(String args[]) {
	int n=5;
	 //int height = 5;
	// Number of character width in each line
	 int width = (2 * height) - 1;
	  
	/*for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(j==0||j==n-1) {
				System.out.print("*");
			}
			else if(i==j&&j<n-2) {
				System.out.print("*");
			}
			else if(i<0&&j<n-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}*/ int i, j, counter = 0;
    for (i = 0; i < height; i++)
    {
        System.out.printf("*");
        for (j = 0; j <= height; j++)
        {
            if (j == height)
                System.out.printf("*");
            else if (j == counter
                    || j == height - counter - 1)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        if (counter == height / 2)
        {
            counter = -99999;
        }
        else
            counter++;
        System.out.printf("\n");
    }
			
}
}
