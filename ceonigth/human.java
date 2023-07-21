package ceonigth;
class monkey{
	static void jump() {
		System.out.print("JUMPING");
	}
	static void bite() {
		System.out.print("BITE");
	}
}
interface animal{
	 void eat();
    void sleep();
}
class humann extends monkey implements animal{
	  public  void eat() {
		System.out.println("EAT");
	}
	 public void sleep() {
		System.out.println("SLEEP");
	}
}
public class human extends humann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//monkey mon=new humann();
		humann hum=new humann();
		hum.eat();
		hum.sleep();
		
	}

}
