package ceonigth;
import java.util.*;
class rectangle{
	int width=0;
	int height=0;
	public void display() {
		System.out.print(this.height*this.width);
	}
}
class  RectangleArea extends rectangle{
	public void read_input() { 
	Scanner sc=new Scanner(System.in);
	this.width=sc.nextInt();
	this.height=sc.nextInt();
	System.out.print(this.height+" ");
	System.out.print(this.width);
	}
}
public class Ni16_03_01 {

	public static void main(String[] args) {
		RectangleArea re=new RectangleArea();
		re.read_input();
		System.out.println();
		re.display();
		
	}

}
