package ceonigth;
abstract class shape{
	void printArea() {} 
}
class Rectangle extends shape{
	void printArea() {
		System.out.print("area of rectangle:"+(10*20));
	}
}
public class Ni824_03_02 extends Rectangle {
	public static void main(String[] args) {
		shape sh=new Rectangle();
		//Rectangle ret=new Rectangle();
		((Rectangle) sh).printArea();
	}
}
