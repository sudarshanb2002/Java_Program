package week05;
import java.util.*;
class bank{
	static void getbalance(int a){
		int r;
	}
	static void getbalance(long b){
		long  r=1500;
	}
	static void getbalance(double b){
		long  r=2000;
	}
}
public class test {
	public static void main(String[] args) {
		bank ba=new bank();
		System.out.print("bankA"+ba.getbalance(10));
	}

}
