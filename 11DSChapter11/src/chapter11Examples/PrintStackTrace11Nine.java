//This example illustrates the method printStackTrace.
//Note that the exception is generated in MethodC and it does not handle 
//the exception. Then the exception propagates to Method B and A which in
//turn do not handle the exception because they contain the throws exception 
//clause in their heading. 
//The exception is finally handled by main. 

package chapter11Examples;

public class PrintStackTrace11Nine {

	public static void main(String[] args) {
		try {
		MethodA();
		}
		
		catch(Exception e) {
			System.out.println(e.toString() + "Caught in Main");
			e.printStackTrace();
		}

	}

	public static void MethodA() throws Exception
	{
		MethodB();
	}
	
	public static void MethodB() throws Exception
	{
		MethodC();	
	}
	
	public static void MethodC() throws Exception
	{
		throw new Exception("Exception generated in Method C ");
	}
}
