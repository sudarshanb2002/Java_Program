package ceonigth;
import java.util.*;
/*class MyException extends Exception
{
MyException(String s)
{
super();
}

public char[] getMessage() {
	// TODO Auto-generated method stub
	return null;
}
}
class excep
{
public static void main(String[] args)
{
	if(args.length>0 && args[0].equals("Hello")) {
		System.out.println("String is right");	
	}
else {
	try
{
throw new MyException("Invalid string.");
}
catch(MyException ex)
{
System.out.println(ex.getMessage());
}
}}
}*/
class MyException extends Exception {
    MyException(String message) {
        super();
    }

    public String getMessage() {
        return super.getMessage();
    }
}

class excep {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("Hello")) {
            System.out.println("String is right");
        } else {
            try {
                throw new MyException("Invalid string.");
            } catch (MyException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
