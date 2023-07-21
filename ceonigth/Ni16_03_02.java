package ceonigth;
import java.util.*;
class BATSMAN{
	public static void quality() {
		System.out.println("I am BATSMAN");
	}
}
class  BOWLER extends BATSMAN{
	public static void quality() {
		//BATSMAN batsman = new BATSMAN();
		BATSMAN.quality();
		System.out.print("I am BOWLER too");
	}
}
public class Ni16_03_02 {

	public static void main(String[] args) {
		BOWLER bow =new BOWLER();
		//BATSMAN bat=new BATSMAN();
		bow.quality();
		//bat.quality();
	}

}
