package ceonigth;
class BATS{
	public static void bat() {
		System.out.println("I am Batsman");
	}
}
class  BOWL extends BATS {
	public static void bowl() {
		System.out.println("I am Bowler");
	}
}
class  ALLROUNDER extends BOWL{
	public static void both() {
		//BATS.bat();
		System.out.println(": I am Batsman and Bowler");
	}
}
public class Ni16_03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ALLROUNDER all=new ALLROUNDER();
		all.bat();
		all.bowl();
		all.both();
	}

}
