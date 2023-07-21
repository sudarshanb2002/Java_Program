// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class TwoSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int x=-121;
       int sum=0;
       while(x!=0){
           sum=(sum*10)+(x%10);
           //System.out.println(sum);
           x=x/10;
           
       }
       System.out.print(sum);
    }
}