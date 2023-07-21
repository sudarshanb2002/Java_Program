package pattern;
import java.util.Scanner;
public class PatternDesign {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Hpattern h=new Hpattern();
		char ch= scan.next().charAt(0); 
		switch(ch){
		case 'h':h.Hpattern(ch);
		break;
		}

}
}
