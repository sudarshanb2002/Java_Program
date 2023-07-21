package classes;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class home{
public static int[][] zero(int[][] b[m][n]){
     for(m=0;m<3;m++){
         for(n=0;n<3;n++){
            if(m==0&&n==0){
                b[m][n]=b[0][0]+b[0][1]+b[0][2];
            }
         }
         //System.out.println();
     }
     return b[m][n];
 }
}
class HelloWorld {
 public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     home op=new home();
     int a[][]={{1,2,3},{4,5,6},{7,8,9}};
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             System.out.print(a[i][j]);
         }
         System.out.println();
     }
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            if(i==0&&j==0){
                 op.zero(a[i][j]);
            }
         }
         //System.out.println();
     }
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             System.out.print(a[i][j]);
         }
         System.out.println();
     }
 }
}
