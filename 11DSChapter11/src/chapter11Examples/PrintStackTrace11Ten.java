package chapter11Examples;

public class PrintStackTrace11Ten {

	public static void main(String[] args) {
		
		MethodA();
	}

	//MethodA catches exception propagated from C through B. 
	//Note that MethodA does not rethrow the exception. That is why there 
	//is no "throws Exception" clause in the heading of MethodA
	
	public static void MethodA() 
	{
	try 
	{
	MethodB();	
	}
	
	catch(Exception ex)
	{
		System.out.println(ex.toString() + " caught in MethodA.");
		ex.printStackTrace();
	}
	
	}
	//MethodB actually rethrows exception from C.
	public static void MethodB() throws Exception
	{
		MethodC();
	}
	
	public static void MethodC() throws Exception
	{
	 throw new Exception("Exception Generated in MethodC");	
	}
}
